package chp8;

public class Ques1 {
	public static void main(String[] args) {
		System.out.println("Helloworld");
		System.out.println("Helloworld");
        System.out.println("Helloworld");
        System.out.println("Helloworld");
        try {
        	int a = 10/0;
		} 
        catch ( Exception e) {
			System.out.println(e);
		}
        
       try {
		 String s = "swayam";
		 System.out.println(s.length());
        
	} catch (Exception e) {
		System.out.println(e);
	}
       try {
		int b = 20/0;
	} finally {
		System.out.println("Exception handled");
		System.out.println("Exception handled");
		System.out.println("Exception handled");
		System.out.println("Exception handled");
	}
       {
		
	}

	}

}
