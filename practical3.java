import java.util.*; 
public class practical3 
{ 
 	public static void main(String args[]) 
 	{ 
 	 	char c; 
 	 	Scanner s=new Scanner(System.in);  	 	System.out.println("Enter a Letter:"); 
 	 	c=s.next().charAt(0); 
 	 	if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') 
 	 	{ 
 	 	 	System.out.println("Letter is Vowel"); 
 	 	} 
 	 	else{ 
 	 	 	System.out.println("Letter is Constant"); 
 	 	} 
 	} 
} 
