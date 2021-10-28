package employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public abstract class Person {

    // To implement an attribute means that you provide a backing field and
    // getter or optionally setter for read-write properties/attributes
    //
    // NO BACKING FIELDS SHOULD BE PROVIDED FOR DERIVED ATTRIBUTES
    // THOSE SHOULD BE COMPUTED ON-LINE
    //
    // attributes:
    // * first name (read-only)
    // * surname (read-only)
    // * birth date (read-only) --- date MUST BE represented by an instance of
    // the type designed for date representation (either Date or LocalDate)
    //
    // * age (derived --- computed based on birth date) --- implemented as a
    // getter calculating the difference between the current date and birth date

    private final String firstName; // backing field
    private final String surname;
    private final LocalDate age;


    protected Person(String firstName, String age, String surname ) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = LocalDate.parse(age);
    }

    public LocalDate getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }


    public short getAgeOfPerson() {
        int i = LocalDate.now().getYear() - age.getYear();
        short ages = Short.parseShort(String.valueOf(i));
        return ages;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}