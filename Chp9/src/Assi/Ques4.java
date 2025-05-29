package Assi;

class Outer{
	private static int a = 20;
	
	static class Inner {
		static void innerMeth() {
			System.out.println(a);
		}
	}
}
public class Ques4 {
      public static void main(String[] args) {
		Outer.Inner.innerMeth();
		Assi.Outer.Inner.innerMeth();
	}
}


