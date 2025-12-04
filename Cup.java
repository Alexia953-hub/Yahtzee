import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Integer> playerCup = new ArrayList<Integer>();
        private ArrayList<Integer> heldDice = new ArrayList<Integer>();
        private int value = 0;
        // use one single cup for all players?
        
        public int roll()
        {
            // rolls the dice
            this.value = (int) ((Math.random() * 5) + 1);
            return value;
        }
        
        public void hold(int diceToHold)
        {
            // take away held dice from playercup
            // put it in heldDice
            diceToHold -= 1;
            int diceheld = playerCup.get(diceToHold);
            heldDice.add(diceheld);
            playerCup.set(diceToHold, 0);
        }
        public void removeHeldInPlayer()
        {
            while(playerCup.indexOf(0) > -1)
            {
            int zeroIndex = playerCup.indexOf(0);
            playerCup.remove(zeroIndex);
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