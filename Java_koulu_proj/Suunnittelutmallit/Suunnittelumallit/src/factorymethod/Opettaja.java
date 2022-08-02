package factorymethod;
//Tehdasmetodi voi luoda eri olioita(esi. tässä olio: Vesi ja Pulla; 
//haluttu tyyppi (esim. tässä Juoma) ilmoitetaan parametrina:
public class Opettaja extends AterioivaOtus {

    @Override
    public Juoma createJuoma(){
        return new Vesi();
    };

    @Override
    public Ruoka createRuoka() {
        return new Pulla();
    }

    @Override
    public Tuote luodaanUusi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
