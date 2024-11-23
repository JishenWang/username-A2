public class Employee extends Person {
    private String position;
    private double salary;
    private String employeeID;

    // Default constructor
    public Employee() {
        super();
        this.position = "";
        this.salary = 0.0;
        this.employeeID = "";
    }

    // Constructor with parameters
    public Employee(String name, int age, String gender, String phoneNumber, String position, double salary, String employeeID) {
        super(name, age, gender, phoneNumber); // Calling the superclass constructor
        this.position = position;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}

