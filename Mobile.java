package day1;

public class Mobile {
    String color = "black";
    double price = 10000;
    String brand = "iphone";
    int capacity = 1200;
    int batttery=1400;
    

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        System.out.println("color of mobile: " + m1.color);
        Mobile m2=new Mobile();
        System.out.println("price of mobile: " + m2.price);
        Mobile m3=new Mobile();
        System.out.println("brand of mobile: " + m3.brand);
        Mobile m4=new Mobile();
        System.out.println("capacity of mobile: " + m4.capacity);
        Mobile m5=new Mobile();
        System.out.println(" battery of mobile: " + m5.batttery);
    }
    
}
