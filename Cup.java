import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Object> playerCup = new ArrayList<Object>();
        private ArrayList<Object> heldDice = new ArrayList<Object>();
        

        public void hold(int diceToHold)
        {
            // take away diceToHold in playerCup
            // put it in heldDice

            diceToHold -= 1;
            heldDice.add(1, playerCup[diceToHold]));


        }
    }