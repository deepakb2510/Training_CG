package exception_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Exception_Check
{
	public ArrayList<String> numberCheck(String str)
	{
		ArrayList<String> res=new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			try {
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
				res.add(Character.toString(str.charAt(i)));
			else
			{
				//res.add("For input string: A");
				throw new NumberFormatException("For input string: ");
			}
			}
			catch(NumberFormatException e)
			{
				//System.out.println(e.getMessage());
				res.add(e.getMessage()+Character.toString(str.charAt(i)));
			}
		}
		return res;
	}
	public String fileCheck(String filename)
	{
		/*File f = new File(filename);
		System.out.println(filename);
		System.out.println(f);
		try {
        if (f.exists())
             return "File Found";
        else
             throw new FileNotFoundException("File not found");
		}
		catch(FileNotFoundException fi)
		{
			return fi.getMessage();
		}*/
		File temp;
		String r="";
		try {
			temp= new File(filename);
			boolean exist=temp.exists();
			System.out.println("Temp file exists: "+exist);
			if(!exist)
			{
				r="File not Found";
				throw new NullPointerException("File not found");
			}
			else
				r="File Found";
			}
		catch(NullPointerException e)
		{
			//System.out.println(e.getMessage());
			r= e.getMessage();
		}
		return r;
	}
}
public class File_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Check ec=new Exception_Check();
		System.out.println(ec.numberCheck("10ASD"));
		System.out.println(ec.fileCheck("src\\exception_programs\\Find_Age.java"));
		//System.out.println(ec.fileCheck("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\JAVA PROG ECLIPSE\\JAVA LAB PROGRAMS\\src\\lab2\\ques1.java"));

		//ec.fileCheck("Find_Age2.java");
	}

}
