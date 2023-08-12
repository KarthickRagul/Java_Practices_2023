package org.example;

class Car{
    String model;
    int price;
    String brand;

    public Car(){  // default Constructor
       model = "2nd Gen";
       price = 2000000;
       brand = "Mahendra";

    }
    public Car(String m, int p, String b){ // Parameterized Constructon
        model = m;
        price = p;
        brand = b;
    }
}

public class Constructor_Examples {

    public static void main(String args[]){
        Car cr = new Car(); //Obj 1 to call default constructor
        System.out.println(cr.model+" : "+cr.price+" : "+cr.brand);

        Car cr1 = new Car("3rd Gen", 2500000, "Honda");//Obj 2 to call parameterized constructor
        System.out.println(cr1.model+" : "+cr1.price+" : "+cr1.brand);

    }
}
