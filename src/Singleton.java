//pas d'heritage depuis singleton

public class Singleton {
    private static Singleton instance;
    //Singleton contient une instance de type Singleton

    protected Singleton()
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
