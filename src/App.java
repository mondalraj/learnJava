import ooprogramming.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person p = new Person(18, "Rajib Mondal");
        System.out.println(p.name + " " + p.age);
    }
}
