package factorymethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;
    Ruoka ruoka = null;

    // rakennetaan alaluokkien (Ope, Opisk ja vahti..) riippuvuuden (dependency) 
    // Juoma-rajapinnan alla olevista luokista.     
    public abstract Juoma createJuoma();

    public abstract Ruoka createRuoka();

    public abstract Tuote luodaanUusi();

    public void aterioi() {
        juo();
        syö();
    }

    public void juo() {
        if (juoma == null) {
            //AterioivaOtus- alaluokissa luodaan juoman rajapinnan alla oleva olion      
            juoma = createJuoma();
        }
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }

    public void syö() {
        if (ruoka == null) {
            //AterioivaOtus- alaluokissa luodaan juoman rajapinnan alla oleva olion      
            ruoka = createRuoka();
        }
        System.out.println("Kylläpä " + ruoka + " maistuukin hyvältä");
    }

}
