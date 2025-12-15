import java.util.ArrayList;

import javax.smartcardio.Card;

public class Players
{
    private String name;
    private int turn;
    private Score scoreSheet = new Score();



    private int aces;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;

    private boolean ifTrue;

    public void addAces(int x)
    {
        this.aces += 1;
    }
    public void addTwos(int x)
    {
        this.twos += 1;
    }
    public void addThrees(int x)
    {
        this.threes += 1;
    }
    public void addfours(int x)
    {
        this.fours += 1;
    }
    public void addfives(int x)
    {
        this.fives += 1;
    }
    public void addsixes(int x)
    {
        this.fives += 1;
    }


    
    public void resetAll()
    {
        this.aces = 0;
        this.twos = 0;
        this.threes = 0;
        this.fours = 0;
        this.fives = 0;
        this.sixes = 0;
    }
    public boolean checkLower(String x)
    {
        if(x.equals("three of a kind"))
        {
            if(this.aces >= 3)
            {
                scoreSheet.setThreeOfAKind(1);
                return true;
            }
            if(this.twos >= 3)
            {
                scoreSheet.setThreeOfAKind(2);
                return true;
            }
            if(this.threes >= 3)
            {
                scoreSheet.setThreeOfAKind(3);
                return true;
            }
            if(this.fours >= 3)
            {
                scoreSheet.setThreeOfAKind(4);
                return true;
            }
             if(this.fives >= 3)
            {
                scoreSheet.setThreeOfAKind(5);
                return true;
            }
            if(this.sixes >= 3)
            {
                scoreSheet.setThreeOfAKind(6);
                return true;
            }
            else
            {
                return false;
            }
        }
        if(x.equals("four of a kind"))
        {
            if(this.aces >= 4)
            {
                scoreSheet.setFourOfAKind(1);
                return true;
            }
            if(this.twos >= 4)
            {
                scoreSheet.setFourOfAKind(2);
                return true;
            }
            if(this.threes >= 4)
            {
                scoreSheet.setFourOfAKind(3);
                return true;
            }
            if(this.fours >= 4)
            {
                scoreSheet.setFourOfAKind(4);
                return true;
            }
             if(this.fives >= 4)
            {
                scoreSheet.setFourOfAKind(5);
                return true;
            }
            if(this.sixes >= 4)
            {
                scoreSheet.setFourOfAKind(6);
                return true;
            }
            
            if(x.equals("full house"))
        {
            
            for(int b = 1; b <= 5; b++)
            {
                if(b == 1);
                {
                    if(this.aces == 3)
                    {
                        
                        Checking(b);
                    }
                }
                if(b == 2)
                {
                    if(this.twos == 3)
                    {
                        Checking(b);
                    }
                }
                if(b == 3)
                {
                    if(this.threes == 3)
                    {
                        Checking(b);
                    }
                }
                if(b == 4)
                {
                    if(this.fours == 3)
                    {
                        Checking(b);
                    }
                }
                if(b == 5)
                {
                    if(this.fives == 3)
                    {
                        Checking(b);
                    }
                }
                if(b == 6)
                {
                    if(this.sixes == 3)
                    {
                        Checking(b);
                    }
                }
            }    
        }
        else
            {
                return false;
            }

        }
    if(x.equals("small straight"))
    {
        boolean y = smallStraight();
        if(y = true)
        {
            return true;
        }
    }
    if(x.equals("large straight"))
    {
        boolean y = largeStraight();
        if(y = true)
        {
            return true;
        }
    }
    if(x.equals("yahtzee"))
    {
        boolean y = Yahtzee();
        if(y = true)
        {
            return true;
        }
    }
    return false;


    }


    public boolean Yahtzee()
    {
       if(this.aces == 5)
       {
        scoreSheet.setYahtzee();
        return true;
       }
       if(this.twos == 5)
       {
        scoreSheet.setYahtzee();
        return true;
       }
       if(this.threes == 5)
       {
        scoreSheet.setYahtzee();
        return true;
       }
       if(this.fives == 5)
       {
        scoreSheet.setYahtzee();
        return true;
       }
       if(this.sixes == 5)
       {
        scoreSheet.setYahtzee();
        return true;
       }
       return false;
        }

    public boolean largeStraight()
    {
        if(aces >= 1)
        {
            if(twos >= 1)
            {
                if(threes >= 1)
                {
                    if(fours >= 1)
                    {
                         if(fives >= 1)
                            {
                            scoreSheet.setLargeStraight();
                            return true;
                            }
                    }
                }
            }
        }
        if(twos >= 1)
        {
            if(threes >= 1)
            {
                if(fours >= 1)
                {
                    if(fives >= 1)
                    {
                         if(sixes >= 1)
                            {
                            scoreSheet.setLargeStraight();
                            return true;
                            }
                    }
                }
            }
        }
        return false;
    }
    public boolean smallStraight()
    {
        if(aces >= 1)
        {
            if(twos >= 1)
            {
                if(threes >= 1)
                {
                    if(fours >= 1)
                    {
                        scoreSheet.setSmallStraight();
                        return true;
                    }
                }
            }
        }
        if(twos >= 1)
        {
            if(threes >= 1)
            {
                if(fours >= 1)
                {
                    if(fives >= 1)
                    {
                        scoreSheet.setSmallStraight();
                        return true;
                    }
                }
            }
        }
       if(threes >= 1)
        {
            if(fours >= 1)
            {
                if(fives >= 1)
                {
                    if(sixes >= 1)
                    {
                        scoreSheet.setSmallStraight();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void upper(String x)
    {
        ifTrue = false;
        if(x.equals("aces"))
        {
            scoreSheet.setAces(this.aces);
            if(this.aces == 0)
            {
                ifTrue = true;
            }
        }
        if(x.equals("twos"))
        {
            scoreSheet.setTwos(this.twos);
            if(this.twos == 0)
            {
                ifTrue = true;
            }
        }
        if(x.equals("threes"))
        {
            scoreSheet.setThrees(this.threes);
            if(this.threes == 0)
            {
                ifTrue = true;
            }
        }
        if(x.equals("fours"))
        {
            scoreSheet.setFours(this.fours);
            if(this.fours == 0)
            {
                ifTrue = true;
            }
        }
        if(x.equals("fives"))
        {
            scoreSheet.setfives(this.fives);
            if(this.fives == 0)
            {
                ifTrue = true;
            }
        }
        if(x.equals("sixes"))
        {
            scoreSheet.setsixes(this.sixes);
            if(this.sixes == 0)
            {
                ifTrue = true;
            }
        }
        
    }

    public boolean getIfTrue()
    {
        return this.ifTrue;
    }
    

    
    

    public void printScoreSheet()
    {
        System.out.println("Player " + this.name + " Score Sheet");
        scoreSheet.printUpperSheet();
        System.out.println("--------------------------");
        scoreSheet.printLowerSheet();
    }



    public boolean Checking(int b)
    {
        for(int y = 1; y <= 6; y++)
                        {
                            if(y != b)
                            {
                            if(y == 1)
                            {
                                if(this.aces == 2)
                                {
                                    scoreSheet.setFullHouse();
                                    return true;
                                }
                            }
                            if(y == 2)
                            {
                                if(this.twos == 2)
                                {
                                    scoreSheet.setFullHouse();
                                    return true;
                                }
                            }
                            if(y == 3)
                            {
                                if(this.threes == 2){
                                    scoreSheet.setFullHouse();
                                    return true;
                                }
                            }
                            if(y == 4)
                            {
                                if(this.fours == 2){
                                    scoreSheet.setFullHouse();
                                    return true;
                                }
                            }
                            if(y == 5)
                            {
                                if(this.fives == 2)
                                {
                                    scoreSheet.setFullHouse();
                                    return true;
                                }

                            }
                            if(y == 6)
                            {
                                if(this.sixes == 2)
                                {
                                    scoreSheet.setFullHouse();
                                    return true;
                                }
                            }
        
                        }
                        }
        return false;                
        
                        }
                
    


    
    
    public Players(String name)
    {
        this.name = name;
    }

    public Score getPlayerScore()
    {
        return this.scoreSheet;
    }

    public String getName()
    {
        return this.name;
    }

    public void Turn()
    {
        this.turn += 1;
    }

    public int getTurn()
    {
        return this.turn;
    }
    public void startTurn()
    {
        this.turn = 0;
        this.turn += 1;
    }

    public void playTurn()
    {
        this.turn += 1;
        System.out.println("rolling for " + this.name);
    }

    
}
