package com.company;

interface Sounds{
    void sounds();
}
abstract class Animal{
    int weight;
    void run(){
        System.out.println("In Animal Class");
    }
    abstract void done();
}

class Dog extends Animal implements Sounds{//inheritances
    private String breed;

    Dog(){
        this.breed="labrador";
    }

    public void run(){
        System.out.println("In Dog class");
    }//method overriding

    public  void sounds(){
        System.out.println("Barking");
    }
    void done(){
        System.out.println("abstract method");
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public void say(String says){//method overloading
        System.out.println(says);
    }
    public void say(){
        System.out.println("Hi");
    }
}
public class Main {
    public static void main(String args[]) {
        Dog a=new Dog();
        a.sounds();
        a.run();
        a.say();
        a.say("Hello");
    }
}