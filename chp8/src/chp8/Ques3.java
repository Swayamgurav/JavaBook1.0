package chp8;

public class Ques3 {
 public static void main(String[] args) {
	try {
		int a = 40/0;
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally");
	}
	System.out.println("code outside exception");
}
}
