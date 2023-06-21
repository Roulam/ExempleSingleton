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
        //creer une instance de la planet
        //planet est class abstrait, qui ne cree pas des instances, faire heritage

       // Planet p0= new Planet(); on peut pas creer une planete
       // Planet p1= new Terre(); // but : faire du polymorphisme // si planet herite de singleton l'heritage ne sert a rien
      //  Planet p11= new Terre();
        Planet terre=Terre.getInstance();

        Planet mars = new Mars();
      //  Soleil.listeDePlanet.add(p1);
       // Soleil.listeDePlanet.add(p2);
        //Soleil S1= new Soleil(); le constructeur private dans un singleton ne permet [as


        //Soleil soit un singleton
        Soleil sol1 = Soleil.getInstance();
        sol1.add(terre);

        Soleil sol2 = Soleil.getInstance();
        sol2.add(mars);

        terre.getListeDeSat().add(new Satellite("Lune"));
        terre.getListeDeSat().add(new Satellite("Stationinternationale"));
        System.out.println("........");

    }
}