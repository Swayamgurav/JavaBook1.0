package chp8;
public class Ques4 {
	public static void main(String[] args) {
		
		try {
			int i[] = new int [5];
			i [5] = 30/0;
			int a = 40/0;
        } catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
			System.out.println("Hello world");
		}
}
