package ooprogramming;

//running java File on This pc
// 1. javac <fileName.extension>
// This will create the class file of java file and now you can run this java File
// 2. java <className>

//=> Creating custom packages
// javac -d . *.java
// This automatically creates packages and relate/sort them with package names.

public class Ooprogramming {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Person p1 = new Person();
        p1.age = 19;
        p1.name = "Rajib";
        System.out.println(p1.name + " " + p1.age);

        Person p2 = new Person();
        p2.age = 1000;
        p2.name = "Krishna";
        System.out.println(p2.name + " " + p2.age);

        p1.walk();
        p2.eat();
        p2.walk(10);
        // walk() and walk(10) are examples of polymorphism.

        Person p3 = new Person(40, "Rupa Mondal");
        System.out.println(p3.name + " " + p3.age);

        Developer d1 = new Developer(20, "Raju");
        d1.walk();
        System.out.println(Person.count);
    }
}






// Data Encapsulation
// packages and access-modifiers -> public, private, protected