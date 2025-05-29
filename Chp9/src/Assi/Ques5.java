package Assi;

class Viper{
	

	public void viperMeth() {
		class Inner {
			void innerMeth() {
				System.out.println("local inner class");
			}
		}
			Inner inner = new Inner();
			inner.innerMeth();
		
	}
	
	}

public class Ques5 {
  public static void main(String[] args) {
	Viper outer = new Viper();
	outer.viperMeth();
	
}
}

