package exception_programs;

class TypeException extends Exception{
	   
	   TypeException() {
	   }
	   public String toString(){
	     return "Vehicle Type Not Set";
	  }
}

class Vehicles
{
	String type, model_no, model_name, owner_name, owner_details;
	public Vehicles(){}
	public Vehicles(String model_no, String model_name, String owner_name, String owner_details) {
		super();
		this.model_no = model_no;
		this.model_name = model_name;
		this.owner_name = owner_name;
		this.owner_details = owner_details;
	}
	String get_type()
	{
		return type;
	}
	String retrieve()
	{
		return null;
	}
}

class Car extends Vehicles
{

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
		// TODO Auto-generated constructor stub
	}
	String get_type()
	{
		return type;
	}
	void set_type(String type)
	{
		this.type=type;
	}
	String retrieve()
	{
		try
		{
			
		if(type==null)
			throw new TypeException();
		}
		catch(TypeException t)
		{
			System.out.println(t);
		}
	
	return model_no+model_name+owner_details+owner_name;
	}
}

public class Custom_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("jk","gh","fg","df");
		//c.set_type("");
		c.retrieve();
		
	}

}
