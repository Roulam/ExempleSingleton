//Terre peut etre un singleton
//passer terre en singleton
public class Terre extends Planet implements IOrbitable{
    private static Planet instanceTerre;
    private Terre()
    {
        super("terre");
       // Planet.getListeDeSat().add(new Satellite("Lune"));

    }
    public static Planet getInstance()
    {
        if(instanceTerre == null)
        {
            instanceTerre = new Terre();
        }
        return instanceTerre;
    }

    @Override
    public void Orbiter(Astre a) {

    }
}
