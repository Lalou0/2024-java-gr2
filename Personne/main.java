package Personne;
public class main {
    public static void main(String[] args) {
        Person personne1 = new Person();
        personne1.sePresenter();
    
        Person personne2 = new Person("Charles", 21);
        personne2.sePresenter();
    }
}