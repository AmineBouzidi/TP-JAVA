public class TestGestionBanque {

    public static void main(String[] args) {

       
        Compte compte1 = new Compte("John Doe", 1000.0);
        CompteEpargne compteEpargne1 = new CompteEpargne();
        compteEpargne1.setTitulaire("Jane Doe");
        compteEpargne1.setSolde(500.0);
        compteEpargne1.setBenefice(0.05);

        try {
            compte1.debiter(500.0);
            compteEpargne1.crediter(100.0);
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println(compte1);
        System.out.println(compteEpargne1);
    }
}
