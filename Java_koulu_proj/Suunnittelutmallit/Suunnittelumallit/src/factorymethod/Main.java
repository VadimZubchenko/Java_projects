package factorymethod;
//Use the Factory(AterioivaOtus) to get object of concrete class

public class Main {

    public static void main(String[] args) {

        System.out.println("Opettaja sanoo: ");

        //luodaan opettaja-olion, mikä luo vesi-, ja pullo-oliot
        AterioivaOtus opettaja = new Opettaja();

        //luodut vesi- ja pullo-oliot käytetään yläluokan AterioivaOtus metodissa aterioi()         
        opettaja.aterioi();
        System.out.println("");

        System.out.println("Opiskelija sanoo: ");
        //create opiskelija-olion, mikä luo CocaCola-, ja Pulla-oliot        
        AterioivaOtus opiskelija = new Opiskelija();
        //luodut CocaCola- ja pullo-oliot käytetään yläluokan AterioivaOtus metodissa aterioi()                 
        opiskelija.aterioi();
        System.out.println("");

        System.out.println("Vahtimestari sanoo: ");
        AterioivaOtus vahtimestari = new Vahtimestari();
        vahtimestari.aterioi();
        System.out.println("");
    }
}
