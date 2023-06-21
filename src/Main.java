public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // on verifie s1 et s2 sont les memes
        if (s1.equals(s2))
        {
            System.out.println("Meme objet");
        }else{
            System.out.println("Different objet");
        }

    }
}