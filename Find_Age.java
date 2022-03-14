package exception_programs;
@SuppressWarnings("serial")
class IllegalAgeException extends Exception{
	   //String a;
	   public IllegalAgeException(String b) {
	    // a=b;
		   super(b);
	   }
	  /* public String toString(){
	     return ("Exception =  "+a) ;
	  }*/
}
class Age
{
	String drink,vote,movie;
	
}
class ExceptionCheck
{
	public String drinkingCheck(Age a,int age)
	{
		try 
		{
		if(age<21)
		{
			a.drink="illegal";
			throw new IllegalAgeException("Illegal drinking age");
		}
		
		else
		{
			a.drink="legal";
		}
		}
	catch(IllegalAgeException ae)
	{
		return "Illegal drinking age";
	}
		return a.drink;
		
	}
	public String votingCheck(Age a,int age)
	{
		try 
		{
		if(age<18)
		{
			a.vote="illegal";
			throw new IllegalAgeException("Illegal voting age");
		}
		
		else if(age>=21)
		{
			a.vote="legal";
		}
		}
	catch(IllegalAgeException ae)
	{
		return "Illegal voting age";
	}
		return a.vote;
		
	}
	public String movieCheck(Age a,int age)
	{
		try 
		{
		if(age<14)
		{
			a.movie="illegal";
			throw new IllegalAgeException("Illegal movie age");
		}
		
		else if(age>=21)
		{
			a.movie="legal";
		}
		}
	catch(IllegalAgeException ae)
	{
		return "Illegal movie age";
	}
		return a.movie;
		
	}
}


public class Find_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age a=new Age();
		ExceptionCheck e=new ExceptionCheck();
		System.out.println(e.drinkingCheck(a, 12));
		System.out.println(e.votingCheck(a, 10));
		System.out.println(e.movieCheck(a,13));
	}

}
