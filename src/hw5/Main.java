package hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee ("Tim", "Android developer", "nsrv.tim@gmail.com", "+79213588819", 150000, 21);
        employeeArray[1] = new Employee("Mil", "Developer", "mil@gmail.com", "+79991111111", 120000, 20);
        employeeArray[2] = new Employee("Jack", "Manager", "jack@gmail.com", "+79991122222", 100000, 45);
        employeeArray[3] = new Employee("Rose", "Accountant", "rose@gmail.com", "+79892233333", 130000, 41);
        employeeArray[4] = new Employee("Lin", "Java Developer", "lin@gmail.com", "+79314455555", 150000, 21);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                Employee.printEmployee(employeeArray[i]);
            }
        }
    }
}
