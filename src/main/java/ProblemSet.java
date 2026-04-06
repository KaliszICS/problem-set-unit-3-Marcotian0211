import java.util.Scanner;


public class ProblemSet {

	public static void main(String args[]) {
	String email;

      Scanner scanner=new Scanner(System.in);
	  System.out.print("Input two email: "); 
	 //ask user to input.
	  email=scanner.nextLine(); 
	 //get value of input
	   String email1=email.substring(0,email.indexOf(',')+1);
	   //declare "email1" for distinguish two email and store first email.
	   String email2=email.substring(email.indexOf(',')+2);
	    //declear"email2" for distinguish two email and store second email.
	   if (email1.indexOf("@")!=-1){      
		//make sure'@'is in the value of input.
        String after = email1.substring(email1.lastIndexOf('.') + 1);  
		//declare String call "after" to conveniently make 'if' method that after ".". 
	     String before=email1.substring(0,email1.indexOf('@'));   
		 //declare String call "after" to conveniently make 'if' method that before "@".               
		 if (email1.substring(email1.indexOf('@')+1).contains(".")){   
			//make sure "." have at least one in email after'@'.
            if (after.length()>=2&&after.length()<=6){   
				// make sure char amount more than or equal 2 and less than or equal 6 after last '.' in input.
			  if(before.length()>=0 && before.length()<=64){  
			  //make sure char amount more than or equal 0 and less than or equal 64 before first'.' in input.
		         if (email1.indexOf('.')!=0 && email1.indexOf('.')!=email1.length()-1){ 
					//"."can't be start of email and end of email
					if(email1.substring(email1.indexOf('@')+1,email1.lastIndexOf(',')).equals("gmail.com")){ 
						//make sure suffix is "gmail.com" will print "valid(gmail normalized)".
					  if (email1.contains(" ")){     
						//“email" have space inside will print.
						System.out.println("invalid:email don't have space");
                             }else{
							 System.out.print("");
					  }System.out.println(email1.substring(0,email1.indexOf(','))+": "+"valid(gmail normalized) | local: "+ email1.substring(0, email1.indexOf('@')) 
                   + " | domain: " + email1.substring(email1.indexOf('@') )) ;
	}else{
					System.out.println(email1.substring(0,email1.indexOf(','))+": "+"valid | local: "+ email1.substring(0, email1.indexOf('@')) 
                   + " | domain: " + email1.substring(email1.indexOf('@'))) ;
	}}else{
					System.out.println("Invalid:Your email is too long or too short before the '@'");
	}}else{
					System.out.println("Invalid:Your email is too long or too shor after the last '.' ");
	}}else{
					System.out.println("Invalid;Your email is don't have '.' after '@'");
	}}else{
				System.out.println("Invalid:Your don't add '@' in your email");}
 
	   if (email2.indexOf("@")!=-1){     
		 //make sure '@'is in the input.
		 if (email2.substring(email2.indexOf('@')+1).contains(".")){   
		 //make sure "." have at least one in email after'@'.
            if (after.length()>=2&&after.length()<=6){   
			// The char amount more than or equal 2 and less than or equal 6 after last '.' in input.
			  if(before.length()>=0 && before.length()<=64){  
				//The char amount more than or equal 0 and less than or equal 64 before first'.' in input.
		         if (email2.indexOf('.')!=0 && email2.indexOf('.')!=email2.length()-1){ 
					//"."can't be start of email and end of email
					if(email2.substring(email2.indexOf('@')+1).equals("gmail.com")){
						//make sure suffix is "gmail.com" will print "valid(gmail normalized)".
					  if (email2.contains(" ")){     
						//“email" have space inside.
						System.out.println("invalid:email can't have space");
                             }else{
								System.out.print("");
							 
							}System.out.println(email2 +": " +"valid(gmail normalized) | local: " + email2.substring(0, email2.indexOf('@')) 
                   + " | domain: " + email2.substring(email2.indexOf('@') + 1));
				}else{
					System.out.println(email2+": "+"valid | local:"+email2.substring(0,email2.indexOf('@'))+" | domain: "+email2.indexOf('@'));
				}}else{
					System.out.println("Invalid:Your email start or end with'.'");
	}}else{
					System.out.println("Invalid:Your email is too long or too short before the '@'");
	}}else{
					System.out.println("Invalid:Your email is too long or too shor after the last '.' ");
	}}else{
					System.out.println("Invalid;Your email is don't have '.' after '@'");
	}}else{
				System.out.println("Invalid:Your don't add '@' in your email");}

}
	
}}	
       
			




