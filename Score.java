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
    private boolean bonusUpper = false;
    private int totalUpper = aces + twos + threes + fours + fives + sixes;
    private int CompleteUpper = aces + twos + threes + fours + fives + sixes;
    
    
    private int totals;

    private int threeKind= 0;
    private int fourKind = 0;
    private boolean fullHouse = false;
    private boolean smallStraight = false;
    private boolean largeStraight = false;
    private boolean yahtzee = false;
    private int bonusyahtzee = 0;
    private int totalLower = 0;
    
    public void setFullHouse()
    {
        fullHouse = true;
    }
    public void setSmallStraight()
    {
        smallStraight = true;
    }
    public void setLargeStraight()
    {
        largeStraight = true;
    }
    public void setYahtzee()
    {
        yahtzee = true;
    }
    public void printUpperSheet()
    {
        System.out.println("Upper section |" + "game 1");
        System.out.println("aces = 1"+ "| " + aces);
        System.out.println("twos = 2"+ "| " + twos);
        System.out.println("threes = 3"+ "| " + threes);
        System.out.println("fours = 4"+ "| " + fours);
        System.out.println("fives =  5"+ "| " + fives);
        System.out.println("sixes = 6" + "| " + sixes);
        System.out.println("Total Score" + "| " + totalUpper);
        System.out.println("Bonus ( if score above 63)" + "| " + bonusUpper);
         System.out.println("total" + "| " + calculateTotalUpper());
    }

    public void printLowerSheet()
    {
        System.out.println("Lower section |" + "game 1");
        System.out.println("3 of a Kind "+ "| " + threeKind);
        System.out.println("4 of a Kind "+ "| " + fourKind);
        System.out.println("Full House "+ "| " + fullHouse);
        System.out.println("Small Straight "+ "| " + smallStraight);
        System.out.println("Large Straight "+ "| " + largeStraight);
        System.out.println("YAHTZEE " + "| " + yahtzee);
        System.out.println("Yahtzee Bonus x 100" + "| " + bonusyahtzee);
        System.out.println("Total of lower section" + "| " + calculateTotalLower() );
        System.out.println("total" + "| " + totalTotals());
    }
    public int totalTotals()
    {
        this.totals = calculateTotalLower() + calculateTotalUpper();
        return this.totals;
    }

    
    public int calculateTotalUpper()
    {
        int x = aces + twos + threes + fours + fives + sixes;
        if(x > 65)
        {
            bonusUpper = true;
        }
        return x;
    }

    public boolean getYahtzee()
    {
        return yahtzee;
    }
    public void setThreeOfAKind(int x)
    {
        if(threeKind == 0)
        {
            threeKind =  x * 3;
        }
    }
    public int getThreeOfAKind()
    {
        return this.threeKind;
    }
    
    public void setFourOfAKind(int x)
    {
        if(fourKind == 0)
        {
            fourKind = x * 4;
        }
        
    }
    public boolean ifTrueUp(String x)
    { 
        if(x.equals("aces"))
        {
            if(this.aces > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         if(x.equals("twos"))
        {
            if(this.twos > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         if(x.equals("threes"))
        {
            if(this.threes > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         if(x.equals("fours"))
        {
            if(this.fours > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         if(x.equals("fives"))
        {
            if(this.fives > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
         if(x.equals("sixes"))
        {
            if(this.sixes > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return false;
    }

    public int calculateTotalLower()
    {
        int x = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        if(fullHouse == true)
        {
            x = 25;
        }
        if(smallStraight == true)
        {
            y = 30;
        }
        if(largeStraight == true)
        {
            a = 40;
        }
        if(yahtzee == true)
        {
            b = 50;
        }
        if(bonusyahtzee > 0)
        {
            for (int i = 0; i < bonusyahtzee; i++)
            {
              c+= 100;  
            }
        }
        totalLower = x + y + a + b + c;
        return totalLower;
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
        this.threes = threesNum * 3;
    }
    public void setFours(int foursNum)
    {
        this.fours = foursNum * 4;
    }
    public void setfives(int fivesNum)
    {
        this.fives = fivesNum * 5;
    }
    public void setsixes(int sixesNum)
    {
        this.sixes = sixesNum * 3;
    }
}
