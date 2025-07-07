//Lacie Hartford

//The Person class is the base class for everyone.
class Person {
    //Basic information
    String name;
    String address;
    String phonenumber;
    String email;

    //Use a Constructor to create a new person with basic details
    public Person(String name, String address, String phonenumber, String email) {
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.email=email;
    }

    //To return a simple description of the person
    @Override
    public String toString() {
        return "Person: " + this.name;
    }
}

//The Student class extends Person
class Student extends Person {
    //Constants for each class (e.g., freshman, sophomore)
    static final int FRESHMAN=1;
    static final int SOPHOMORE=2;
    static final int JUNIOR=3;
    static final int SENIOR=4;

    //The student's school year
    int classStatus;

    //Use a Constructor to create a student
    public Student(String name, String address, String phonenumber, String email, int classStatus) {
        super(name, address, phonenumber, email);  //Use the Person constructor to set up basic info
        this.classStatus =classStatus; //Set the student's class status
    }

    //Override the toString method for more details about the student
    @Override
    public String toString() {
        return "Student: " + this.name + ", Class Status: " + this.classStatus;
    }
}

//The Employee class also extends Person and adds work-related details.
class Employee extends Person {
    //Additional employee information (office, salary, and hire date)
    String office;
    double salary;
    String hireDate;

    //Use a Constructor to create an employee's office, salary, and hire date
    public Employee(String name, String address, String phonenumber, String email, String office, double salary, String hireDate) {
        super(name, address, phonenumber, email);  //basic person details
        this.office=office;
        this.salary=salary;
        this.hireDate=hireDate;
    }

    //Override toString to show the employee's information
    @Override
    public String toString() {
        return "Employee: " + this.name + ", Office: " + this.office + ", Hire Date: " + this.hireDate;
    }
}

//The Faculty class extends Employee and adds the office hours and rank.
class Faculty extends Employee {
    //Faculty details
    String officeHours;
    String rank;

    //Use a constructor to set up faculty info
    public Faculty(String name, String address, String phonenumber, String email, String office, double salary, String hireDate, String officeHours, String rank) {
        super(name, address, phonenumber, email, office, salary, hireDate);  //Get details for employees
        this.officeHours=officeHours;  //Add office hours
        this.rank =rank;  //Add rank
    }

    //Override toString to show faculty details
    @Override
    public String toString() {
        return "Faculty: " + this.name + ", Rank: " + this.rank + ", Office Hours: " + this.officeHours;
    }
}

//Use the staff class to extend Employee and adds a title.
class Staff extends Employee {
    //Staff-specific title
    String title;

    //Use a constructor to create a staff member
    public Staff(String name, String address, String phonenumber, String email, String office, double salary, String hireDate, String title) {
        super(name, address, phonenumber, email, office, salary, hireDate);  // Use Employee's constructor
        this.title=title;  //To Set the staff member's title
    }

    //Override toString to show staff details
    @Override
    public String toString() {
        return "Staff: " + this.name + ", Title: " + this.title;
    }
}

//Main class where we test the code
public class Main {
    public static void main(String[] args) {
        //Create a person, student, employee, faculty, and staff to test the classes
        Person person=new Person ("Peter","123 Main St","555-1234","peter@email.com");
        Student student=new Student ("Smith","456 Oak St","555-5678","smith@email.com", Student.SOPHOMORE);
        Employee employee=new Employee ("John","789 Pine St","555-9876","john@email.com","Office A",50000.0,"5/5/2025");
        Faculty faculty=new Faculty ("Dr. Frank","101 Maple St","555-1111","frank@email.com","Office B",70000.0,"5/5/2025","MWF 9-12","Professor");
        Staff staff=new Staff ("Lucy","202 Birch St","555-2222","lucy@email.com","Office C",40000.0,"5/5/2025","Secretary");

        //Print out the details for each object
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}