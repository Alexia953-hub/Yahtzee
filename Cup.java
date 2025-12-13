import java.util.ArrayList;

public class Cup
    {
        private ArrayList<Dice> playerCup = new ArrayList<Dice>();
        private ArrayList<Dice> heldDice = new ArrayList<Dice>();
        private Dice placeHolder = new Dice();
        
        // use one single cup for all players?
        private Dice Dice1 = new Dice();
        private Dice Dice2 = new Dice();
        private Dice Dice3 = new Dice();
        private Dice Dice4 = new Dice();
        private Dice Dice5 = new Dice();

        public Cup()
        {
           

            Dice DicePlacement = new Dice();
            DicePlacement.setValue(0);

            
        }

        public void foreachDice(int x) // removing after 3 turns the non held die and putting them in held without any inputs
        {
            Dice dice = playerCup.get(x);
            heldDice.add(dice);

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
            int i = playerCup.size() - 1;
            while(0 < i)
            {
             Dice dices = playerCup.get(i);
             dices.roll();
             i--;
            }
        }
        public void rollAllDice() // first cup made (rolls 6 dice)
        {    
            playerCup.clear();
            System.out.println("hi");
            heldDice.clear();
            playerCup.add(Dice1);
            playerCup.add(Dice2);
            playerCup.add(Dice3);
            playerCup.add(Dice4);
            playerCup.add(Dice5);
            for(int i = 0; i < 5; i++)  
                {
                    Dice dices = playerCup.get(i);
                    dices.roll();
                }    
        }


        // public void clearLists()
        // {
        //     playerCup.clear();
        //     heldDice.clear();
        // }
        
        
        public ArrayList getHeldCup()
        {
            return heldDice;
        }
        
        
        public ArrayList getPlayerCup()
        {
            return playerCup;
        }


    }