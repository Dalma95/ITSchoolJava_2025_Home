package session16;

public class Hospital {
    public static void main(String[] args) {
        Person staff = new Person("staffName","P1");
        Doctor doctor = new Doctor("docName","D1");
        Nurse nurse= new Nurse("nurseName","N1");
        Patient patient = new Patient("patientName", "1","cough");

        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();

        InsuranceBilling billing=new InsuranceBilling();
        billing.generateBilling(patient);
    }
}
