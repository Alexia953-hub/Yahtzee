import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Dice> playerCup = new ArrayList<Dice>();
        private ArrayList<Dice> heldDice = new ArrayList<Dice>();
        // use one single cup for all players?
        

        public Cup()
        {
            Dice Dice1 = new Dice();
            Dice Dice2 = new Dice();
            Dice Dice3 = new Dice();
            Dice Dice4 = new Dice();
            Dice Dice5 = new Dice();
        }

        
        public void hold(int diceToHold)
        {
            // take away held dice from playercup
            // put it in heldDice
            diceToHold -= 1;
            Dice diceheld = playerCup.get(diceToHold);
            heldDice.add(diceheld);
            playerCup.set(diceToHold, 0);
        }
        public void removeHeldInPlayer()
        {
            System.out.println(playerCup);
            while(playerCup.contains(0))
            {
            int zeroIndex = playerCup.indexOf(0);
            playerCup.remove(zeroIndex);
            }
        }
        
        public void printDice()
        {
            for(int i = 0; i <= playerCup.size()-1; i++ )
                {
                    int diceNum = i + 1;
                    System.out.println(playerCup.get(i) + " is the dice number " + diceNum);
                }
        }
        
        public void otherDiceRoll() // rolls non held dice but keeping 6 or less dice based on rollAllDice()
        {
            // rerolls the non held dice
            int i = playerCup.size();
            playerCup.clear();
            while(0 < i)
            {
             roll();
             playerCup.add(this.value);
             i--;
            }
        }
        public void rollAllDice() // first cup made (creates only 6 dice)
        {
            playerCup.clear();
            for(int i = 0; i < 5; i++)  
                {
                    roll();
                    playerCup.add(this.value);
                }    
        }
        
        
        
        
        public ArrayList getHeldDice()
        {
            System.out.println(heldDice);
            return heldDice;
        }
        public ArrayList getPlayerCup()
        {
            return playerCup;
        }
        public void printPlayerCup()
        {
            System.out.println(playerCup);
        }
    }