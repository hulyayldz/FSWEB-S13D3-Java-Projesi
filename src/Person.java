public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastname){
        this(firstName, lastname, 0);
    }

    public Person(String firstName, String lastname, int age){
        this.firstName = firstName;
        this.lastName = lastname;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
}
