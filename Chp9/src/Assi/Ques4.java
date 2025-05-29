package Assi;

import Assi.Out.Inner;

class Out{
	private static int a = 20;
  static class Inner{
	  static void innerMeth() {
		  System.out.println(a);
	  }
  }
}
public class Ques4 {
public static void main(String[] args) {
	Out.Inner.innerMeth();
	Inner.innerMeth();
}
}
