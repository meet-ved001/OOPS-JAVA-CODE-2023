//A Final class cannot be inherited
//A Final variable cannot be modified after its initialization
//A final method cannot be over-ridden
package com.key;

final class FDemo{
    final int i=37;
    public void display(){
        System.out.println("HELL YEAH!");
    }
    final void set_value(){
        System.out.println("Name : "+"Meet");
    }
}

//class hello extends FDemo{
//
//}
public class FinalDemo {
    public static void main(String[] args){
        FDemo ele = new FDemo();
        ele.display();
        ele.set_value();
//        ele.i=100;
    }
}
