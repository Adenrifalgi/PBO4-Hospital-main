class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Patient extends Person {
    private int medicalRecordNumber;

    public Patient(String name, int medicalRecordNumber) {
        super(name);
        this.medicalRecordNumber = medicalRecordNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " (Medical Record Number: " + medicalRecordNumber + ")";
    }
}

class PersonTest {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", 123456);
        System.out.println(patient);
    }
}
