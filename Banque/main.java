package Banque;
public class main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Charles", 2000.0);
        
        compte.deposer(600.0);

        compte.retirer(100.0);

        compte.retirer(1500.0); 

        compte.retirer(-200.0);
    }
}