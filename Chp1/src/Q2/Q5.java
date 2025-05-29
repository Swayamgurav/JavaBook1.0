package Q2;
class Emp {
	void sal(double income, double incen) {
		System.out.println(income + incen);
	}
}

class Mgr extends Emp {
	@Override
	void sal(double income, double incen) {
		System.out.println(income + (2 * incen));
	}
}

public class Q5 {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.sal(120000, 200);
	Mgr m1 = new Mgr();
	m1.sal(150000, 300);
}
}
