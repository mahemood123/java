package day1;

public class Narrowing {
	public static void main(String [] args) {
		double d=125.78;
		int i=99;
		System.out.println("d"+d);
		System.out.println("i"+i);
		i=(int)d;
		System.out.println("d"+d);
		System.out.println("i"+i);
	}

}
