package TVA;

class Produit {
    protected double prixHT;

    public Produit(double prixHT) {
        this.prixHT = prixHT;
    }

    public double calculerPrix() {
        return prixHT; // Par défaut, retourne le prix hors taxes
    }
}

class Livre extends Produit {
    private static final double TVA = 0.05;

    public Livre(double prixHT) {
        super(prixHT);
    }

    @Override
    public double calculerPrix() {
        return prixHT * (1 + TVA);
    }
}

class DVD extends Produit {
    private static final double TVA = 0.20;

    public DVD(double prixHT) {
        super(prixHT);
    }

    @Override
    public double calculerPrix() {
        return prixHT * (1 + TVA);
    }
}