package com.oops;

class FirstClass {
    public void Display(){
        System.out.println("Hello World");
    }
}
class Secondlass extends FirstClass {
    public void Display(){
        System.out.println("Naah!! HOW YOU DOIN?");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Secondlass m =new Secondlass();
        m.Display();
    }
}
