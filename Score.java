import java.util.ArrayList;
import java.util.List;


public class Score
{
    private int aces= 0;
    private int twos = 0;
    private int threes = 0;
    private int fours = 0;
    private int fives = 0;
    private int sixes = 0;
    private int totals = aces + twos + threes + fours + fives + sixes;
    // private String[] firstColumTop = {"Upper Section", "Aces = 1", "Twos = 2", "Threes = 3", "Fours = 4", "Fives = 5", "Sixes = 6", "Total Score","Bonus (if total score is 63 or over)", "Total"};
    // private String[] SecondColumTop = {"How to Score", "Count and add only aces", "Count and add only twos", "Count and add only threes", "Count and add only fours", "Count and add only fives", "Count and add only sixes", "-->","score 35", "-->"};
    // private String[] thirdColumTop = {"Game #1", " ", " ", " ", " ", " ", " ", " "," ", " "};
    
//     public void makeScoreSheetList()
//     {
//         System.out.println(scoreSheet);
//          for (int i = 0; i <= firstColumTop.length; i++)
//         {
//                 scoreSheet.get(i).add(0, firstColumTop[i]);
//         }
//         for (int X = 0; X <= firstColumTop.length; X++)
//         {
//                 scoreSheet.get(X).add(1, SecondColumTop[X]);
//         }
//         for (int y = 0; y <= firstColumTop.length; y++)
//         {
//                 scoreSheet.get(y).add(2, thirdColumTop[y]);
//         }
//     } 
//     // 2d arrayList for scoreSheet
    
    public void printScoreSheet()
    {
        System.out.println("Upper section |" + "game 1");
        System.out.println("aces = 1"+ "| " + aces);
        System.out.println("twos = 2"+ "| " + twos);
        System.out.println("threes = 3"+ "| " + threes);
        System.out.println("fours = 4"+ "| " + fours);
        System.out.println("fives =  5"+ "| " + fives);
        System.out.println("sixes = 6" + "| " + sixes);
        System.out.println("Total Score" + "| " + totals);
        System.out.println("Bonus ( if score above 63)" + "| ");
         System.out.println("total" + "| ");
    }
     

    public void setAces(int aceNum)
    {
        this.aces = aceNum * 1;
    }
    public void setTwos(int twoNum)
    {
        this.twos = twoNum * 2;
    }
    public void setThrees(int threesNum)
    {
        this.twos = threesNum * 3;
    }
    public void setFours(int foursNum)
    {
        this.twos = foursNum * 4;
    }
    public void setfives(int fivesNum)
    {
        this.twos = fivesNum * 5;
    }
    public void setsixes(int sixesNum)
    {
        this.twos = sixesNum * 3;
    }
}
