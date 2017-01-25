public class HospitalManager {
    private Patient firstPatient = null;
    private Patient lastPatient = null;

    // this is a member method of class HospitalManager
    public void addPatient(Patient newPatient) {
        if (firstPatient == null) {
            firstPatient = newPatient;
            lastPatient = newPatient;
            return;
        }

        Patient previous = null;
        Patient current = this.firstPatient;

        while(current.getNextPatient() != null) {
            current = current.getNextPatient();
        }
        current.setNextPatient(newPatient);
        newPatient.setPrevPatient(current);
        lastPatient = newPatient;
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
            firstPatient.setPrevPatient(null);
            return true;
        }

        Patient current = firstPatient;
        
        while (current.getNextPatient() != null) {
            if (current.getNextPatient().getName().equals(name)) {
                // We found it! It is the next one!
                // Now link this patient to the one after the next
                Patient next = current.getNextPatient().getNextPatient();
                current.setNextPatient(next);
                if(next != null) {
                    next.setPrevPatient(current);
                } else {
                    lastPatient = current;
                }
                return true;
            }

            current = current.getNextPatient();
        }

        return false;
    }

    public void printPatientList(boolean goBackwards) {
        Patient current = this.firstPatient;
        if(goBackwards) {
            current = this.lastPatient;
        }

        System.out.println("goBackwards: " + goBackwards);

        do {
            String prevName = "null";
            String nextName = "null";
            Patient prev = current.getPrevPatient();
            Patient next = current.getNextPatient();

            if(goBackwards) {
                prev = current.getNextPatient();
                next = current.getPrevPatient();
            }
            
            if(prev != null) {
                prevName = prev.getName();
            }

            if(next != null) {
                nextName = next.getName();
            }

            System.out.println(
                "\nName: " + current.getName() +
                " Age: " + current.getAge() +
                " Illness: " + current.getIllness() +
                " | Prev: " + prevName +
                " Next: " + nextName
            );

            if(goBackwards) {
                current = current.getPrevPatient();
            } else {
                current = current.getNextPatient();
            }
        } while (current != null);
        System.out.println("=======\n");
    }

    public int getPatientCount() {
        int count = 0;
        Patient current = this.firstPatient;

        do {
            count++;
            current = current.getNextPatient();
        } while (current != null);

        return count;
    }

}