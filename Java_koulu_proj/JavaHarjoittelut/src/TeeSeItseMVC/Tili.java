package TeeSeItseMVC;

/**
 *
 * @author vadimzubchenko
 */
class Tili {

    private double saldo;

    // konstruktori, joka vaatii alkusaldon

    protected Tili(double saldo) {
        this.saldo = saldo;
    }

    protected double naytaSaldo() {
        return saldo;
    }

    protected boolean nostaRaha(double summa) {
        // tarkista onko riittää rahaa nostamiseen ja palauttaa true tai false kontrollerille
        if (saldo >= summa) {
            this.saldo -= summa;// saldo vähenetään 
            return true;
        } else {
            return false;
        }
    }

    protected void lisaRaha(double summa) {
        this.saldo += summa;
    }

}
