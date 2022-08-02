/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsibility;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Palkankorotus_abstract {
    
    protected static final double BASE = 5;
    protected Palkankorotus_abstract successor;
    
    
    // saadaan konkretisesta luokasta käsiteltava max palkankorotusta  
    abstract protected double getAllowable();
    
    // saadaan konkretisesta luokasta päälikön roolen nimi
    abstract protected String getRole();
    // luodaan handle, jota käytetään Main-ssa(asiakas)
    public void setSuccessor(Palkankorotus_abstract successor) {// first successor -> director, kun manager.setSuccessor(director);
        this.successor = successor;
    }
    // ensimmäinen kerta Asiakas(Main) käynistää sen manager.processRequest(new KorotusRequest(d));
    public void processRequest(KorotusRequest request){ // manager.processRequest
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " pystyy hyväksymään % " + request.getAmount());
        } else if (successor != null) {
            // siirretaan suraavalle Konkreettiselle handleriille, esim director.setSuccessor(president);
            successor.processRequest(request);
        } else {
            // successor = null, kuin manager jälkeenei ole president.setSuccessor(?????);
            System.out.println(this.getRole() + ": Ei missään nimissä hyväksyisin % " + request.getAmount());
        }
    }
}
