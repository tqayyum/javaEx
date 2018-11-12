package Fig8_7;

public class Employee {
    private String firstName, lastName;
    private Date birthDate, hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }
}
