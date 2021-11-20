class CompositePatternExample {
        /**Principal is on top of college.
        *HOD -Maths and Comp. Sc directly reports to him
        *Teachers of Computer Sc. directly reports to HOD-CSE
        *Teachers of Mathematics directly reports to HOD-Maths
        */
        public static void main(String[] args) {
            System.out.println("***Composite Pattern ***");
            // 2 developers work in Development roles other than managers
            Employee developer1 = new Employee("Developer - 1","Development");
            Employee developer2 = new Employee("Developer - 2","Development");
            // 2 hrs works in HR roles other than managers
            Employee hr1 = new Employee("HR - 1", "HR");
            Employee hr2 = new Employee("HR - 2", "HR");
            Employee hr3 = new Employee("HR - 3", "HR");
            // Company has two managers
            CompositeEmployee devManager = new CompositeEmployee("Manager - 1","Development");
            CompositeEmployee hrManager = new CompositeEmployee("Manager - 2 ", "HR");
            // CEO of the company
            CompositeEmployee ceo = new CompositeEmployee("CEO","Company");
            // Employees of development reports to development manager
            devManager.addEmployee(developer1);
            devManager.addEmployee(developer2);
            // Employees of HR report to HR manager
            hrManager.addEmployee(hr1);
            hrManager.addEmployee(hr2);
            hrManager.addEmployee(hr3);
            /*CEO is on top of company. All HRs reports to him*/
            ceo.addEmployee(hrManager);
            ceo.addEmployee(devManager);
            /*Printing the leaf-nodes and branches in the same way i.e.
            in each case, we are calling PrintStructures() method
            */
            System.out.println("\n Testing the structure of a CEO object");
            //Prints the complete structure
            ceo.printStructures();
            System.out.println("At present Ceo has control over "+ceo.getEmployeeCount()+ " number of employees.");
            System.out.println("\n Testing the structure of a Developmen manager object:");
            devManager.printStructures();
            System.out.println("At present development manager has control over "+ devManager.getEmployeeCount()+ " number of employees.");
            System.out.println("\n Testing the structure of a HR manager object:");
            //Prints the details of HR department
            hrManager.printStructures();
            System.out.println("At present HR Manager has control over "+ hrManager.getEmployeeCount()+ " number of employees.");
            //Leaf node
            System.out.println("\n Testing the structure of a leaf node:");
            developer1.printStructures();
            System.out.println("At present developer-1 has control over "+ developer1.getEmployeeCount()+ " number of employees.");
            /*Suppose, one developer is leaving now
            from the organization*/
            devManager.removeEmployee(developer1);
            System.out.println("\n After developer-1 resigned, the organization has following members:");
            ceo.printStructures();
            System.out.println("At present Ceo has control over "+ ceo.getEmployeeCount()+ " number of employees");
            System.out.println("At present developer manager has control over "+ devManager.getEmployeeCount()+ " number of employees");
            System.out.println("At present HR manager has control over "+ hrManager.getEmployeeCount()+ " number of employees");
    }
}