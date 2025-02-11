package TVA;

public class main {
    public static void main(String[] args) {
        Produit livre = new Livre(100);
        Produit dvd = new DVD(100);

        System.out.println("Prix du livre TTC: " + livre.calculerPrix());
        System.out.println("Prix du DVD TTC: " + dvd.calculerPrix());
    }
}
