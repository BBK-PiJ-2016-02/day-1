public class Exercise3 {
    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        obj.run();
    }

    public void run() {
    	DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
    	list.add(1);
    	list.add(3);
    	System.out.println(list.size());
    	list.add(4);
    	list.add(2);
    	System.out.println(list.size());

    	Company company = new Company();
    	Integer id1 = company.addEmployee("Moby", 32599);
    	Integer id2 = company.addEmployee("Bob", 56533);
    	System.out.println(company.getEmployeeDetail(id1));
    	System.out.println(company.getEmployeeDetail(id2));
    }

    public class Company {
 		DoublyLinkedList<String> employeeNames = new DoublyLinkedList<>();
 		DoublyLinkedList<Integer> employeeNationalInsuranceNumbers = new DoublyLinkedList<>();

 		public Integer addEmployee(String name, Integer nationalInsuranceNumber) {
 			this.employeeNames.add(name);
 			this.employeeNationalInsuranceNumbers.add(nationalInsuranceNumber);

 			return this.employeeNames.size(); // Identifier
 		}

 		public String getEmployeeDetail(Integer id) {
 			return this.employeeNames.get(id) + ": " +
 				this.employeeNationalInsuranceNumbers.get(id);
 		}
    }
}