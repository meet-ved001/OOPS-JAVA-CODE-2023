//Abstract in class is used to hide unessential user details
//Abstract is used in a model only when the specific method is to be used in the inheritance class and none of the others
package com.key;

//import com.cls.First;
//import com.cls.Second;

abstract class First {
    public void display() {
        System.out.println("HEllO");
    }

    public abstract void add();
}

class Second extends First{
    public void add(){
        int x=5;
        int y=100;
        System.out.println("Addition is "+(x+y));

    }
}

public class AbstractDemo {
    public static void main(String[] args){
        Second element = new Second();
        element.add();

        First newelement = new Second();
        newelement.add();
    }
}
