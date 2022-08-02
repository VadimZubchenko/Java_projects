package factorymethod;
//Use the Factory(AterioivaOtus) to get object of concrete class
public class Main {

    public static void main(String[] args) {
        System.out.println("Opettaja sanoo: ");
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        System.out.println("");
        
        System.out.println("Opiskelija sanoo: ");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        System.out.println("");
        
        System.out.println("Vahtimestari sanoo: ");
        AterioivaOtus vahtimestari = new Vahtimestari();
        vahtimestari.aterioi();
        System.out.println("");
    }
}
