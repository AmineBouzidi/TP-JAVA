public class Banque {

    private String nom;
    private List<Compte> listCompte;

    public Banque() {
        this.nom = "";
        this.listCompte = new ArrayList<>();
    }

    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
    }

  
}
