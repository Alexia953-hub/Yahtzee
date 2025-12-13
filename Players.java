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

    public void Turn()
    {
        this.turn += 1;
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

    public int getTurn()
    {
        return this.turn;
    }
}