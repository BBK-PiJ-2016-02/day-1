public class HospitalManagerCircular {
    private Patient firstPatient = null;

    // this is a member method of class HospitalManager
    public void addPatient(Patient newPatient) {
        if (firstPatient == null) {
            firstPatient = newPatient;
            firstPatient.setNextPatient(firstPatient);
            return;
        }

        Patient current = this.firstPatient;

        while(current.getNextPatient() != firstPatient) {
            current = current.getNextPatient();
        }
        current.setNextPatient(newPatient);

        newPatient.setNextPatient(firstPatient);
    }

    // this is a member method of class HospitalManager
    // returns true if the patient was found and removed, false otherwise
    public boolean deletePatient(String name) {
        if (firstPatient == null) {
            // list is empty, nothing to remove
            return false;
        }
        
        if (firstPatient.getName().equals(name)) {
            // first patient in the list must be removed
            firstPatient = firstPatient.getNextPatient();
            return true;
        }

        Patient current = firstPatient;
        
        while (current.getNextPatient() != firstPatient) {
            if (current.getNextPatient().getName().equals(name)) {
                // We found it! It is the next one!
                // Now link this patient to the one after the next
                Patient next = current.getNextPatient().getNextPatient();
                current.setNextPatient(next);
                return true;
            }

            current = current.getNextPatient();
        }

        return false;
    }

    public void printPatientList() {
        Patient current = this.firstPatient;

        do {

            System.out.println(
                "\nName: " + current.getName() +
                " Age: " + current.getAge() +
                " Illness: " + current.getIllness() +
                " Next: " + current.getNextPatient().getName()
            );

            current = current.getNextPatient();
        } while (current != firstPatient);
        System.out.println("=======\n");
    }

    public int getPatientCount() {
        int count = 0;
        Patient current = this.firstPatient;

        do {
            count++;
            current = current.getNextPatient();
        } while (current != firstPatient);

        return count;
    }

}