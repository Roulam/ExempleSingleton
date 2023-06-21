public class Singleton {
    private static Singleton instance;
    //Singleton contient une instance de type Singleton

    private Singleton()
    {
        System.out.println("Initialisation de l'instance");
    }

    public static Singleton getInstance() {
        if ( instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }
}
