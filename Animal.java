package baitapvenha10;

public abstract class Animal {
   abstract public void eat();
   abstract public void makeSound();
}
class Cat extends Animal{
     public void eat(){
         System.out.println("Cat eat");
    }
    public void makeSound(){
        System.out.println("Cat makeSound");
    }
    public void run(){
        System.out.println("run");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("Bird eat");
    }
    public void makeSound(){
        System.out.println("Bird makeSound");
    }
    public void fly(){
        System.out.println("fly");
    }
}
