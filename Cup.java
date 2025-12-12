import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Dice> playerCup = new ArrayList<Dice>();
        private ArrayList<Dice> heldDice = new ArrayList<Dice>();
        private Dice placeHolder = new Dice();
        
        // use one single cup for all players?
        

        public Cup()
        {
            Dice Dice1 = new Dice();
            Dice Dice2 = new Dice();
            Dice Dice3 = new Dice();
            Dice Dice4 = new Dice();
            Dice Dice5 = new Dice();

            Dice DicePlacement = new Dice();
            DicePlacement.setValue(0);

            playerCup.add(Dice1);
            playerCup.add(Dice2);
            playerCup.add(Dice3);
            playerCup.add(Dice4);
            playerCup.add(Dice5);
        }

        public void printPlayerCup()
        {
            DiePrinter.print(playerCup);
            
        }
        public void printHeldDice()
        {
            DiePrinter.print(heldDice);
        }
        public void hold(int diceToHold)  //moves the dice wanting to be held into held dice
        {
            // take away held dice from playercup
            // put it in heldDice
            placeHolder.setValue(0);
            diceToHold -= 1;
            Dice diceheld = playerCup.get(diceToHold);
            heldDice.add(diceheld);
            playerCup.set(diceToHold, placeHolder);
        }
        public void removeHeldInPlayer()    // removes the placeholders
        {
            while(playerCup.contains(placeHolder))
            {
            int zeroIndex = playerCup.indexOf(placeHolder);
            playerCup.remove(zeroIndex);
            }
        }
        
        // public void printDice()
        // {
        //     for(int i = 0; i <= playerCup.size()-1; i++ )
        //         {
        //             int diceNum = i + 1;
        //             Dice dice = playerCup.get(i);
        //             dice.printValue("is your dice value ", diceNum);
                    
        //         }
        // }
        
        public void otherDiceRoll() // rolls non held dice but keeping 6 or less dice based on rollAllDice()
        {
            // rerolls the non held dice
            int i = playerCup.size();
            while(0 < i)
            {
             Dice dices = playerCup.get(i);
             dices.roll();
             i--;
            }
        }
        public void rollAllDice() // first cup made (rolls 6 dice)
        {    
            for(int i = 0; i < 5; i++)  
                {
                    Dice dices = playerCup.get(i);
                    dices.roll();
                }    
        }
        public void clearHeldDice()
        {
            heldDice.clear();
        }

        
        
        
        
        public ArrayList<Dice> getHeldDice()
        {
            for(int i = 0; i < heldDice.size(); i++)
            {
            Dice dice = heldDice.get(i);
            System.out.println(dice.getValue());
            
            }
            return heldDice;
        }
        public ArrayList getPlayerCup()
        {
            return playerCup;
        }
    }