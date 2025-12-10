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
            player.clearTurn();
            player.addTurn();
            newCup.rollAllDice();
            while(newCup.getPlayerCup().size() > 0)
            {
                System.out.println(newCup.getPlayerCup().size());
                if (newCup.getPlayerCup().size() < 5)
                {
                    System.out.println("Rerolling your cup!");
                    newCup.otherDiceRoll();
                }
                
                
                Scanner ScannerDiceHolder = new Scanner(System.in);
                newCup.printDice();
                System.out.println("How many dice would you like to keep? ");
                int heldDice = ScannerDiceHolder.nextInt();
                while(heldDice > newCup.getPlayerCup().size())
                {
                    
                    Scanner ScannerDiceHolder2 = new Scanner(System.in);
                    System.out.println("How many dice would you like to keep? ");
                    int heldDice2 = ScannerDiceHolder.nextInt();
                    heldDice = heldDice2;
                    
                }
      
                for(int x = 0; x <= heldDice-1; x++)
                {

                    Scanner ScannerDiceListPlacement = new Scanner(System.in);
                    System.out.println("Which dice would you like to keep? [1,2,3,4,5]");
                    int diceBeingHeld = ScannerDiceHolder.nextInt();

            
                    newCup.hold(diceBeingHeld);
                    newCup.getHeldDice();
                                          // figure out how to remove held dice from player cup without adjusting placement in the list
                                          // use 0s as placement? and take them out before reroll?
                }
                player.addTurn();
                newCup.printPlayerCup();
                newCup.removeHeldInPlayer();
                newCup.printPlayerCup();


                
                

            }
        }
            newCup.getPlayerCup().clear();
        }

    

        // Score scoreObject = new Score();
        // scoreObject.printScoreSheet();

    }
