public class App {
    public static void main(String[] args) throws Exception
    {
        Giocatore g1 = new Giocatore("seppe");
        Giocatore g2 = new Giocatore("mario");
        String vincitore = "";


        System.out.println("----- PARTITA INIZIATA -----");
        g1.start();
        g2.start();

        g1.setPriority(Thread.MAX_PRIORITY);

        g1.join();
        g2.join();

        System.out.println("----- PARTITA TERMINATA -----");

        if (g1.getNumero() > g2.getNumero())
        {
            vincitore = g1.getName();
        }
        else if (g2.getNumero() > g1.getNumero())
        {
            vincitore = g2.getName();
        }
        else
        {
            System.out.println("Non c'è alcun vincitore, la partita è terminata con un pareggio");
            return;
        }

        System.out.println("Il vincitore è " + vincitore);
    }
}
