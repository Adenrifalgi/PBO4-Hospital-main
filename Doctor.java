
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    public void treatPatient(Patient patient) {
        System.out.println("Treating patient: " + patient.getName());
    }

    public void treatPatients(Patient[] patients) {
        for (Patient patient : patients) {
            System.out.println("Treating patient: " + patient.getName());
        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Smith");
        Patient[] patients = {new Patient("Bob Johnson"), new Patient("Alice Davis")};

        doctor.treatPatient(patient1);
        doctor.treatPatients(patients);

        SpecialistDoctor specialistDoctor = new SpecialistDoctor();
        specialistDoctor.treatPatient(patient2);
        specialistDoctor.treatPatients(patients);
    }
}

class SpecialistDoctor extends Doctor {
    @Override
    public void treatPatient(Patient patient) {
        super.treatPatient(patient);
        System.out.println("Performing specialized treatment for patient: " + patient.getName());
    }

    @Override
    public void treatPatients(Patient[] patients) {
        for (Patient patient : patients) {
            super.treatPatient(patient);
            System.out.println("Performing specialized treatment for patient: " + patient.getName());
        }
    }
}