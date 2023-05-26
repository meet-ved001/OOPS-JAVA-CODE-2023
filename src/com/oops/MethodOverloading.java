package com.oops;

class Addition{
    public void add(){
        int x=5;
        int y=10;
        System.out.println("Sum is "+(x+y));
    }
    public void add(int x){;
        System.out.println("Sum is "+(x+x));
    }
    public void add(int x,int y){
        System.out.println("Sum is "+(x+y));
    }
}

public class MethodOverloading {
    public static void main(String[] args){
        Addition sum = new Addition();
        sum.add();
        sum.add(3);
        sum.add(3,5);
    }
}
