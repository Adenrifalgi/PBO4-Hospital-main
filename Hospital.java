class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

public class Hospital {
    // Overloaded method to display details of a single doctor
    public void displayDoctorDetails(Doctor doctor) {
        System.out.println("Doctor Name: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
    }

    // Overloaded method to display details of an array of doctors
    public void displayDoctorDetails(Doctor[] doctors) {
        for (Doctor doctor : doctors) {
            System.out.println("Doctor Name: " + doctor.getName());
            System.out.println("Specialization: " + doctor.getSpecialization());
        }
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. John Doe", "Cardiology");
        Doctor[] doctors = {new Doctor("Dr. Jane Smith", "Pediatrics"), new Doctor("Dr. Bob Johnson", "Neurology")};

        Hospital hospital = new Hospital();
        hospital.displayDoctorDetails(doctor1);
        hospital.displayDoctorDetails(doctors);
    }
}
