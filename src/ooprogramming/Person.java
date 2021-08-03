package ooprogramming;

public class Person {
    public String name;
    public int age;
    static int count; // Static keyword shows that count is now a property of class only, it is not
                      // needed to access by objects of that class.

    public Person() {
        System.out.println("Creating a Constructor");
        count++;
    } // Constructor function is automatically executed whenever the object of that
      // class is created.

    // Constructor Overloading
    public Person(int newAge, String newName) {
        this(); // Calling the constructor of this class to update the count value.
        age = newAge;
        name = newName;
    }

    // Another use of this keyword
    // public Person(int age, String name) {
    // this.age = age;
    // this.name = name;
    // }

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }

    void doWork() {
        System.out.println("Person is working");
    }
}
