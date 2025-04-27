public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person p = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + p.getFirstName());
        System.out.println("Lastname: " + p.getLastName());
        System.out.println("Age: " + p.getAge());
        Wall w = new Wall(5, 4);
        System.out.println("area=" + w.getArea());
        w.setHeight(-1.5);
        System.out.println("width=" + w.getWidth());
        System.out.println("height=" + w.getHeight());
        System.out.println("area=" + w.getArea());
    }
}
