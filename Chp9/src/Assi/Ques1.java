package Assi;

interface A{
	void A();
}
abstract class B{
	abstract void B();
}
class C{
	void C(){
		
	}
}
public class Ques1 {
	

	public static void main(String[] args) {
		A a = new A() {
			
			@Override
			public void A() {
				System.out.println("Anonymous inner class : Interface");
			}
		};
		  B b = new B() {
			
		@Override
			void B() {
				System.out.println("Anonymous inner class : abstract method");
              C c = new C() {
		     void C () {
		    	 System.out.println("Anonymous inner class : default");
		     }
	};
			}
			};
}
       
}