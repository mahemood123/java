package day1;

public class Product {
	String name;
	int price;
	int gst;
	double discount;
	String quality;
	public static void main(String [] args) {
		Product honey= new Product();
		honey.name="lion";
		honey.price=250;
		honey.gst=15;
		honey.quality="best";
		System.out.println("honey name:"+honey.name);
		System.out.println("honey price:"+honey.price);
		System.out.println("honey gst:"+honey.gst);
		System.out.println("honey quality:"+honey.quality);
		Product pen= new Product();
		pen.name="blue";
		pen.price=5;
		pen.gst=1;
		pen.discount=0.2;
		pen.quality="good";
		System.out.println("pen name:"+pen.name);
		System.out.println("pen price:"+pen.price);
		System.out.println("pen gst:"+pen.discount);
		System.out.println("pen quality:"+pen.quality);
		Product book=new Product();
		book.name="long";
		book.price=50;
		book.gst=2;
		book.quality="good";
		System.out.println("book name:"+book.name);
		System.out.println("book price :"+book.price);
		System.out.println("book gst:"+book.gst);
		System.out.println("book quality:"+book.quality);
		
		
	}

}
