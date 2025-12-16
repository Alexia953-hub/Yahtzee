import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee
{
    
    public static void main (String[] args)
    {
        Cup newCup = new Cup();
        Scanner playerNumber = new Scanner(System.in);
        System.out.println("How many players? ");           // figuring out the number of players
        int playerNum = playerNumber.nextInt();

        ArrayList<Players> playerList = new ArrayList<>();

        for(int i = 1; i <= playerNum; i++ )
        {
            Scanner ScannerName = new Scanner(System.in);
            System.out.println("What is " + i + "player name? ");           // asking player names
            String playerName = ScannerName.nextLine();
            Score scoreSheet = new Score();  
            Players player = new Players(playerName);          // create new player object for each player in the list           
            playerList.add(player);
        }
        
        
    boolean gameOnGoing = true;
        // the for loop in another while loop until score board is filled up for each player
    while(gameOnGoing == true)
    {
        for(Players player : playerList)                      // for player in playerlist
        {
            player.printScoreSheet();
            player.startTurn();
            newCup.rollAllDice();
            
            while(player.getTurn() <= 3 && newCup.getPlayerCup().size() != 0)
            {

                if (newCup.getPlayerCup().size() <= 5)
                {
                    System.out.println("Rolling " + player.getName() + " cup");
                    newCup.otherDiceRoll();
                }
                boolean inSizeList = false;
                boolean tooManyDice = true;
                while(inSizeList == false) // if the dice input is less than the size of the list
                {
                    
                    System.out.println("These are the dice " + player.getName() + " can pick from: ");
                    newCup.printPlayerCup();
                    Scanner ScannerDiceHolder = new Scanner(System.in);
                    System.out.println("How many dice would you like to keep? ");
                    int heldDice = ScannerDiceHolder.nextInt();
                    if(heldDice <= newCup.getPlayerCup().size() && heldDice > 0)
                    {
                        inSizeList = true;
                       
                                
                        for(int x = 0; x <= heldDice-1; x++)
                            {

                                Scanner ScannerDiceListPlacement = new Scanner(System.in);
                                
                                newCup.printPlayerCup();
    
                                System.out.println("Which dice would you like to keep? [1,2,3,4,5]");
                                
                                int diceBeingHeld = ScannerDiceHolder.nextInt();
                                if (diceBeingHeld > newCup.getPlayerCup().size())
                                {
                                    x--;
                                    System.out.println("Put a number that is within 0 - " + newCup.getPlayerCup().size());

                                }
                                else
                                {
                      
                                    newCup.hold(diceBeingHeld);
                                    // newCup.removeHeldInPlayer(); 
                                    System.out.println("These are the dice you currently have held");
                                    newCup.printHeldDice();
                                }
                                
                                
                                }
                    }
                    if(heldDice == 0)
                    {
                        inSizeList = true;
                    }
                    else
                        {
                            System.out.println("Put a number that is within 1 - " + newCup.getPlayerCup().size()); 
                        }
                        
                }
                
                    
                        
                player.Turn();
                    
                    
            }
                if(newCup.getPlayerCup().size() > 0)
            {
                for(int i = newCup.getPlayerCup().size(); i > 0; i--)
                {

                    newCup.hold(i);

                }
                System.out.println("These are the dice you currently have held");
                newCup.printHeldDice();
            }
                
                boolean finishedScore = false;
                player.resetAll();
                for(int i = newCup.getHeldCup().size() - 1; i >= 0; i--)
                {
                    Dice diceObject = newCup.getHeldCup().get(i);
                    if(diceObject.getValue() == 1)
                    {
                        player.addAces(1);
                    }
                    if(diceObject.getValue() == 2)
                    {
                        player.addTwos(1);
                    }
                    if(diceObject.getValue() == 3)
                    {
                        player.addThrees(1);
                    }
                    if(diceObject.getValue() == 4)
                    {
                        player.addfours(1);
                    }
                    if(diceObject.getValue() == 5)
                    {
                        player.addfives(1);
                    }
                    if(diceObject.getValue() == 6)
                    {
                        player.addsixes(1);
                    }
                }
                Score ScoreBoard = player.getPlayerScore();
                    while(finishedScore == false)
                    {
                    // if(ScoreBoard))
                        player.printScoreSheet();
                        Scanner ScannerScoring = new Scanner(System.in);
                        System.out.println("Upper or lower section? ");
                        String upOrLow = ScannerScoring.nextLine();
                        if (upOrLow.equals("upper"))
                        {
                            Scanner ScannerScorePlace = new Scanner(System.in);
                            System.out.println("Aces, twos, threes, fours, fives, sixes?");
                            String upperSectionPlacement = ScannerScorePlace.nextLine();
                            if(player.getPlayerScore().ifTrueUp(upperSectionPlacement) == true) // if already filled already
                                {
                            
                            
                            player.upper(upperSectionPlacement);
                            if(player.getIfTrue() == true)
                            {   
                                System.out.println("You dont have any " + upperSectionPlacement);
                            }
                            if(player.getIfTrue() == false)
                                {
                                
                                System.out.println("You have added to " + upperSectionPlacement);
                                player.printScoreSheet();
                                finishedScore = true;
                                }
                            }
                
                        else
                        {
                            System.out.println("You already have something there or don't meet the requirements for " + upperSectionPlacement);
                        }

                    }
                    if (upOrLow.equals("lower"))
                    {
                        Scanner ScannerScorePlace = new Scanner(System.in);
                        System.out.println("three of a kind, four of a kind, full house, small straight, large straight, yahtzee, yahtzee bonus");
                        String lowerSectionPlacement = ScannerScorePlace.nextLine();
                        if (player.checkLower(lowerSectionPlacement) == true)
                        {
                            System.out.println("You used " + lowerSectionPlacement);
                            player.printScoreSheet();
                            finishedScore = true;
                        }
                        if (player.checkLower(lowerSectionPlacement) == false)
                        {
                            System.out.println("Not eligible");
                        }
                        
                    }
                    // if where they want to go in scorecard not possible keep repeating till it is
                    // and check if they can go anywhere
                    
                }  


                
                

            }
            
            

                
            }

        }
    }
        
        

    

        // Score scoreObject = new Score();
        // scoreObject.printScoreSheet();

    
