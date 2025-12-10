public class Players
{
    private String name;
    private int turn;

    public Players(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setTurn(int number)
    {
        this.turn = number;
    }
    public void addTurn()
    {
        this.turn += 1;
    }

    public void clearTurn()
    {
        this.turn = 0;
    }

    public void playTurn()
    {
        this.turn += 1;
        System.out.println("rolling for " + this.name);
    }

    public int getTurn()
    {
        return this.turn;
    }
}