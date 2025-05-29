package Q2;

public class Main {
	int a = 10;
	int b = 20;
	int c = 30;

	void cal(int a) {
		System.out.println(a);
	}

	void cal(int a, int b) {
		System.out.println(a + b);

	}
	void cal(String x,String y) {
		System.out.println(x+y);
	}

	void cal(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.cal(main.a);
		main.cal(main.a, main.b);
		main.cal("Shravan ", "Gupta");
	}

}
