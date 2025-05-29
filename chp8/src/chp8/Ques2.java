package chp8;

public class Ques2 {
	public void a(){
		int a = 20/0;
		
	}
public void b(){
		a();
		
	}
public void c(){
	try {
		b();
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
   public static void main(String[] args) {
	Ques2 ques2 = new Ques2();
	ques2.c();
	System.out.println("Exception handled");
}

}
