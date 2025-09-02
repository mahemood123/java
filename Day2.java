package day1;

public class Day2 {
String stdname;
int regnum;
String branch;
double percentage;
public static void main (String [] args) {
	Day2 s1= new Day2();
	s1.stdname="mahemood";
	s1.regnum=1001;
	s1.branch="csbs";
	s1.percentage=89.8;
	System.out.println("student name:"+s1.stdname);
	System.out.println("student regnum:"+s1.regnum);
	System.out.println("student branch:"+s1.branch);
	System.out.println("student percentage:"+s1.percentage);
	Day2 s2=new Day2();
	s2.stdname="eesub";
	s2.regnum=1002;
	s2.branch="cse";
	s2.percentage=78.8;
	System.out.println("student name:"+s2.stdname);
	System.out.println("student regnum:"+s2.regnum);
	System.out.println("student branch:"+s2.branch);
	System.out.println("student percentage:"+s2.percentage);
	
	Day2 s3= new Day2();
	s3.stdname="sameer";
	s3.regnum=1003;
	s3.branch="ece";
	s3.percentage=87.9;
	System.out.println("student name:"+s3.stdname);
	System.out.println("student regnum:"+s3.regnum);
	System.out.println("student branch:"+s3.branch);
	System.out.println("student percentage:"+s3.percentage);
}
}
