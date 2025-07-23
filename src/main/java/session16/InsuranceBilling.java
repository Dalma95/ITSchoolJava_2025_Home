package session16;

public class InsuranceBilling implements Billing{

    @Override
    public void generateBilling(Patient patient) {
        System.out.println("A bill was generated for patient "+patient.getName());
    }
}
