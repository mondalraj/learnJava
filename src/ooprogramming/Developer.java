package ooprogramming;

// Inheritance -> Parent-child relationship
//Developer is child class of Person
public class Developer extends Person {
    public Developer(int age, String name){
        super(age, name);
        //super keyword is use to call a constructor of its parent class
    }
 
    //run-time Polymorphism
    //If Developer class do not contain any walk() then it will move to parent class and execute their walk()
    void walk() {
        System.out.println("Developer "+name + " is walking");
    }
}