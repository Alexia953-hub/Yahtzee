import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee
{
    
    public static void main (String[] args)
    {
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

        
        // Score scoreObject = new Score();
        // scoreObject.printScoreSheet();

    }
}