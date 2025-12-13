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
            
            Players player = new Players(playerName);          // create new player object for each player in the list           
            playerList.add(player);
        }
        
        
        
        // the for loop in another while loop until score board is filled up for each player
        
        for(Players player : playerList)                      // for player in playerlist
        {
            player.startTurn();
            newCup.rollAllDice();
            while(player.getTurn() <= 3 && newCup.getPlayerCup().size() != 0)
            {

                System.out.println(newCup.getPlayerCup().size());
                if (newCup.getPlayerCup().size() < 5)
                {
                    System.out.println("Rerolling " + player.getName() + " cup");
                    newCup.otherDiceRoll();
                }
                
                
                int b = 1;
                int y = 2;
                while(b != y) // if the dice input is less than the size of the list
                {
                    
                    newCup.printPlayerCup();
                    Scanner ScannerDiceHolder = new Scanner(System.in);
                    System.out.println("How many dice would you like to keep? ");
                    int heldDice = ScannerDiceHolder.nextInt();
                    if(heldDice <= newCup.getPlayerCup().size())
                    {
                        b = 2;
                        for(int x = 0; x <= heldDice-1; x++)
                {

                        Scanner ScannerDiceListPlacement = new Scanner(System.in);
                        System.out.println("Which dice would you like to keep? [1,2,3,4,5]");
                        int diceBeingHeld = ScannerDiceHolder.nextInt();

            
                        newCup.hold(diceBeingHeld);
                        newCup.printHeldDice();
                                          // figure out how to remove held dice from player cup without adjusting placement in the list
                                          // use 0s as placement? and take them out before reroll?
                }
                        
                    }
                    else
                    {
                        System.out.println("Put a number that is within 1 - " + newCup.getPlayerCup().size());
                    }
                    
                }
      
                
                player.Turn();
                newCup.removeHeldInPlayer();


                
                

            }
            
            if(newCup.getPlayerCup().size() > 0)
            {
                for(int i = newCup.getPlayerCup().size(); i > 0; i--)
                {
                    newCup.hold(i + 1);
                    newCup.removeHeldInPlayer();

                }
            }

                int x = 1;
                int y = 2;
                while(x != y)
                {
                    System.out.println(player.getName() + " currently have this set of 5 dice");
                    newCup.printHeldDice();
                    Scanner ScannerDiceHolder = new Scanner(System.in);
                    System.out.println("Where in your scorecard do you want to go?");
                    String heldDice = ScannerDiceHolder.nextLine();
                    // if where they want to go in scorecard not possible keep repeating till it is
                    // and check if they can go anywhere
                    
                }
            }

        }
        }

        

    

        // Score scoreObject = new Score();
        // scoreObject.printScoreSheet();

    
