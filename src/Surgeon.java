/**
 * Surgeon class for the assignment.
 * Author: zxiong11  24274562
 */
public class Surgeon extends HealthProfessional {
    private String hospital;

    // Default constructor
    public Surgeon() {
        super();
        this.hospital = "Wuxi Hospital";
    }

    // Constructor with specified values
    public Surgeon(int id, String name, String specialization, String hospital) {
        super(id, name, specialization);
        this.hospital = hospital;
    }

    // Print the details of the Surgeon
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Surgeon");
        System.out.println("Hospital: " + hospital);
    }

    // Get the surgical specialty of the Surgeon
    public String getSurgicalSpecialty() {
        return "Specialty: Cardiac Surgery";
    }
}
