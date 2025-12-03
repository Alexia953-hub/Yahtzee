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

    public int getTurn()
    {
        return this.turn;
    }
}