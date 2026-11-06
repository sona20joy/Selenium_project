package conditionalstatements;

public class Elseifladder {

	public static void main(String[] args) {
		int a=9,b=10,c=7;
		if(a>b && a>c)
		{
 
		System.out.println("a is greater");
	    }
		
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		
		else
		{
			System.out.println( "c is greater");
		}
		
	}
}
