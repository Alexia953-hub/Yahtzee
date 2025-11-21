import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Integer> playerCup = new ArrayList<Integer>();
        private ArrayList<Integer> heldDice = new ArrayList<Integer>();
        private int value = 0;
        
        public void makeCup(int playerNum)
        {
            
        }
        public int roll()
        {
            // rolls the dice
            this.value = (int) (Math.random() * 5 + 1);
            return value;
        }
        
        public void hold(int diceToHold)
        {
            // take away held dice from playercup
            // put it in heldDice
            diceToHold -= 1;
            heldDice.add(diceToHold);

        }
        public void OtherDiceRoll()
        {
            // rerolls the non held dice
            for(int i = playerCup.size(); i > 0; i--)
            {
             roll();
             playerCup.add(this.value);
            }
        }
    }