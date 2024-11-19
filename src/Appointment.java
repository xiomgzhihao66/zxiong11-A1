/**
 * Appointment class for managing patient bookings with a health professional.
 * Author: zxiong11  24274562
 */
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * Default constructor initializing default values for an appointment.
     */
    public Appointment() {
        this.patientName = "undefined";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    /**
     * Constructor for creating an appointment with specific details.
     *
     * @param patientName  The name of the patient
     * @param mobilePhone  The phone number of the patient
     * @param timeSlot     The time slot for the appointment
     * @param doctor       The health professional assigned to the appointment
     */
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Gets the mobile phone number of the patient.
     * @return The mobile phone number
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Prints the details of the appointment.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor was found in the current patient record.");
        }
    }
}
