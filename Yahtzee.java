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
        for(Players players : playerList)                      // for player in playerlist
        {
            int turns = 0;
            newCup.rollAllDice();
            ArrayList nonHeldDice = newCup.getPlayerCup();
            while(nonHeldDice.size() > 0 || turns == 0)
            {

                for(int i = 0; i <= nonHeldDice.size(); i++ )
                {
                    int diceNum = i + 1;
                    System.out.println(nonHeldDice.get(i) + " is the dice number " + diceNum);
                }
                                                                    // asking if want to keep any dice
                Scanner ScannerDiceHolder = new Scanner(System.in);
                System.out.println("How many dice would you like to keep? ");
                int heldDice = ScannerDiceHolder.nextInt();
                for(int x = 0; x <= heldDice)

            }
        }

    

        // Score scoreObject = new Score();
        // scoreObject.printScoreSheet();

    }
}