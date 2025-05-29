package chp8;
class SelectionException extends Exception{
	SelectionException(String s){
		super();
	}
}
class Ques5
{
    void average (double average) throws SelectionException{
		if (average < 45)
		{
		 throw new SelectionException("You cannot play for the team");

		}else{
			System.out.println("You are selected");
		}
}
	public static void main(String[] args) 
	{
		Ques5 t = new Ques5();
		try{
			t.average(6.7);
		}
		catch (Exception e)
		{
		System.out.println(e);
	}
}
}

