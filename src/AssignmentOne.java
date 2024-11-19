import java.util.ArrayList;

/**
 * Main class for the assignment.
 * Author: zxiong11  24274562
 */
public class AssignmentOne {
    // ArrayList for appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * Creates a new appointment and adds it to the appointments list.
     */
    public static void createAppointment(String patientName, String timeSlot, String mobilePhone, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || timeSlot == null || doctor == null) {
            System.out.println("Some information is missing. Phone number is required.");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    /**
     * Prints the details of all existing appointments.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        appointments.forEach(appointment -> {
            System.out.println("------------------------------");
            appointment.printDetails();
        });
    }

    /**
     * Cancels a booking by the phone number.
     */
    public static void cancelBooking(String mobilePhone) {
        boolean removed = appointments.removeIf(appointment -> appointment.getMobilePhone().equals(mobilePhone));

        if (removed) {
            System.out.println("Appointment canceled for mobile: " + mobilePhone);
        } else {
            System.out.println("No related record with: " + mobilePhone);
        }
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // Creating instances of health professionals
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Zhang Wei", "Pediatrics", "Beijing Health Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Li Na", "General Medicine", "Shanghai Family Clinic");
        Surgeon sg1 = new Surgeon(3, "Dr. Wang Qiang", "Orthopedics", "Guangzhou Surgery Center");
        Surgeon sg2 = new Surgeon(4, "Dr. Zhao Mei", "Neurosurgery", "Chengdu Brain Clinic");

        // Printing health professional details
        gp1.printDetails();
        gp2.printDetails();
        sg1.printDetails();
        sg2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // Creating appointments for patients
        createAppointment("Liu Xin", "10:30", "1234567890", gp1);
        createAppointment("Chen Bo", "12:00", "9876543210", gp2);
        createAppointment("Zhang Zhi", "14:15", "5555555555", sg1);
        createAppointment("Wang Fang", "16:00", "5556667778", sg2);

        // Print existing appointments
        System.out.println("Existing Appointments:");
        printExistingAppointments();

        // Canceling appointments
        cancelBooking("1234567890");
        cancelBooking("0000");

        // Print updated appointments
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }
}
