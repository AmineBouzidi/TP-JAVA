public class CompteEpargne extends Compte {

    private double benefice;

    public CompteEpargne() {
        super();
        this.benefice = 0.0;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "titulaire='" + getTitulaire() + '\'' +
                ", solde=" + getSolde() +
                ", benefice=" + benefice +
                '}';
    }
}
