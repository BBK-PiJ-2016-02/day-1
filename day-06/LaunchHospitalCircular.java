public class LaunchHospitalCircular {
    public static void main(String[] args) {
        String name, illness;
        int age;

        HospitalManagerCircular hm = new HospitalManagerCircular();

        Patient patientOne = new Patient("John", 76, "old age");
        Patient patientTwo = new Patient("Mary", 67, "old age");
        Patient patientThree = new Patient("Eddie", 50, "too much wine");
        Patient patientFour = new Patient("Brian", 33, "insomnia");
        Patient patientFive = new Patient("Florence", 29, "hay fever");
        Patient patientSix = new Patient("Jenny Lee", 28, "self-consciousness");
        Patient patientSeven = new Patient("McReady", 53, "tendinitis");
        Patient patientEight = new Patient("Robert", 24, "tiredness");

        hm.addPatient(patientOne);
        hm.addPatient(patientTwo);
        hm.addPatient(patientThree);
        hm.addPatient(patientFour);
        hm.addPatient(patientFive);
        hm.addPatient(patientSix);
        hm.addPatient(patientSeven);
        hm.addPatient(patientEight);

        System.out.println("Patient Count: " + hm.getPatientCount());
        hm.printPatientList();

        hm.deletePatient("Florence");
        hm.deletePatient("Robert");

        System.out.println("Patient Count: " + hm.getPatientCount());
        hm.printPatientList();

        System.out.println("Delete John: "+ hm.deletePatient("John"));
        System.out.println("Delete Peter: "+ hm.deletePatient("Peter"));

        System.out.println("Patient Count: " + hm.getPatientCount());
        hm.printPatientList();
    }
}