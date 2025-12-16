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

    private Cup cup = new Cup();

    private ArrayList<Integer> things = new ArrayList<Integer>();
    
    public void addtothing()
    {
        things.add(aces);
        things.add(twos);
        things.add(threes);
        things.add(fours);
        things.add(fives);
        things.add(sixes);

    }
    public void resettothing()
    {
        things.remove(aces);
        things.remove(twos);
        things.remove(threes);
        things.remove(fives);
        things.remove(sixes);
    }



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
            if(threeOfAKind() == true)
            {
                return true;
            }
            
        }
        else if(x.equals("four of a kind"))
        {
            if(fourOfAKind() == true)
            {
                return true;
            }
        }    
        else if(x.equals("full house"))
        {
            if(FullHouse() == true)
            {
                return true;
            }
            

        }
    else if(x.equals("small straight"))
    {
        boolean y = smallStraight();
        if(y = true)
        {
            return true;
        }
    }
    else if(x.equals("large straight"))
    {
        boolean y = largeStraight();
        if(y = true)
        {
            return true;
        }
    }
    else if(x.equals("yahtzee"))
    {
        boolean y = Yahtzee();
        if(y = true)
        {
            return true;
        }
    }
    else if(x.equals("yahtzee bonus"))
    {
        if(scoreSheet.getYahtzee()== true)
        {
        boolean y = Yahtzee();
        if(y = true)
        {
            return true;
        }
        }
        
    }
    
            return false;      
                }

    
    public boolean FullHouse()
    {
        addtothing();
        boolean twoOfAKind2 = false;
        boolean threeOfAKind2 = false;
        for(int i = 0; i < things.size(); i++)
        {
            if(things.get(i) == 2)
            {
                twoOfAKind2 = true;
            }
            else if(things.get(i) == 3)
            {
                threeOfAKind2 = true;
            }
            if(twoOfAKind2 && threeOfAKind2)
            {
                scoreSheet.setFullHouse();
                resettothing();
                return true;
            }
            
        }
        return false;
    }

    public boolean fourOfAKind()
    {
        addtothing();
        for(int i = 0;i < things.size(); i++)
        {
            int y = things.get(i);
            if(y >= 4)
            {
                scoreSheet.setFourOfAKind(i + 1);
                resettothing();
                return true;
            }

        }
        return false;
        
    }

    public boolean threeOfAKind()
    {
        addtothing();
        for(int i = 0;i < things.size(); i++)
        {
            int y = things.get(i);
            if(y >= 3)
            {
                scoreSheet.setThreeOfAKind(i + 1);
                resettothing();
                return true;
            }

        }
        return false;
        
    }

     

    public boolean Yahtzee()
    {
        addtothing();
       for(int i = 0;i < things.size(); i++)
       {
        int y = things.get(i);
        if(y >= 5)
        {
            scoreSheet.setYahtzee();
            resettothing();
            return true;
        }
       }
       return false;
    }

    public boolean largeStraight()
    {
        if(aces >= 1 && twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1)
        {
            scoreSheet.setLargeStraight();
            return true;
            
                }
            
        if(twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1)
        {
            scoreSheet.setLargeStraight();
            return true;
            
        }
        return false;
    }
    public boolean smallStraight()
    {
       if(aces >= 1 && twos >= 1 && threes >= 1 && fours >= 1)
        {
            scoreSheet.setLargeStraight();
            return true;
            
                }
        if(twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1)
        {
            scoreSheet.setLargeStraight();
            return true;
            
                }
       if(threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1)
        {
            scoreSheet.setLargeStraight();
            return true;
            
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
