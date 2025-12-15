import java.util.Random;

public class Dice
{
    private int value = 0;


    public void roll()
    {
        this.value = (int) ((Math.random() * 5) + 1);
    }

    public int getValue() {
        return this.value;
    }

    public void printValue(String text, int diceNum) {
        System.out.println(this.value + " " + text + " " + diceNum);
    }

    public void printValues() {
        System.out.println(this.value);
    }

    public void setValue(int value2) {
        this.value = value2;
    }
}