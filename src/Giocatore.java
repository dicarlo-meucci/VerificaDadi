public class Giocatore extends Thread
{
    private int numero;

    public Giocatore(String nome)
    {
        super(nome);
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " è entrato in partita");
        try {
            Thread.sleep(1000);
        } catch (Exception e)
        {
            
        }

        int numeroUscito = (int)(Math.random()*6) + 1;
        int secondoNumeroUscito;
        System.out.println(Thread.currentThread().getName() + " ha tirato il dado ed ottenuto " + numeroUscito);

        this.numero += numeroUscito;
        secondoNumeroUscito = (int)(Math.random()*6) + 1;
        this.numero += numeroUscito;
        System.out.println(Thread.currentThread().getName() + " ha tirato il dado ed ottenuto " + secondoNumeroUscito);

        if (numeroUscito == secondoNumeroUscito)
        {
            int lancioBonus = (int)(Math.random()*6) + 1;
            System.out.println(Thread.currentThread().getName() + " ha diritto ad un LANCIO BONUS");
            System.out.println(Thread.currentThread().getName() + " ha tirato il dado BONUS ed ha ottenuto " + lancioBonus);
            this.numero += lancioBonus;
        }

        System.out.println(Thread.currentThread().getName() + " ha terminato con " + this.numero + " punti");
    }

    public int getNumero()
    {
        return this.numero;
    }
}
