package exception_programs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Header
{
	String from,to;

	public Header(String from, String to) {
		this.from = from;
		this.to = to;
	}
}
class Email
{
	Header header;
	String body,greetings;
	public Email(Header header, String body, String greetings) {
		this.header = header;
		this.body = body;
		this.greetings = greetings;
	}
	public int emailVerify(Email e)
	{
		Pattern pattern = Pattern.compile("_?[a-zA-Z]*@[a-zA-Z]+\\.[a-z]+", Pattern.CASE_INSENSITIVE);
	    Matcher matcher1 = pattern.matcher(e.header.from);
	    boolean vfrom = matcher1.matches();
	    Matcher matcher2 = pattern.matcher(e.header.to);
	    boolean vto = matcher2.matches();
	    if(vfrom && vto)
	    	return 2;
	    else if((vfrom==true && vto==false)||(vfrom==false && vto==true))
	    	return 1;
	    else
	    	return 0;
	}
	public String  bodyEncryption(Email e)
	{
		String encryptedMessage = "";
		int key=3;
		char ch;
		 
		for(int i = 0; i < e.body.length(); ++i){
		ch = e.body.charAt(i);
		if(ch >= 'a' && ch <= 'z'){
		            ch = (char)(ch + key);
		            
		            if(ch > 'z'){
		                ch = (char)(ch - 'z' + 'a' - 1);
		            }
		            
		            encryptedMessage += ch;
		        }
		        else if(ch >= 'A' && ch <= 'Z'){
		            ch = (char)(ch + key);
		            
		            if(ch > 'Z'){
		                ch = (char)(ch - 'Z' + 'A' - 1);
		            }
		            
		            encryptedMessage += ch;
		        }
		        else {
		         encryptedMessage += ch;
		        }
		}
		return encryptedMessage;
	}
	public String greetingMessage(Email e)
	{
		String[] arr = e.header.from.split("@");
		String name=arr[0];
		return greetings+name;
	}
}



public class EmailOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Header h=new Header("df@gmail.com","hj@gmail.com");
		Email e= new Email(h,"Hi I am anu","Regards");
		System.out.println(e.greetingMessage(e));
		System.out.println(e.bodyEncryption(e));
	}

}
