package conditionalstatements;

public class Nestedif {

	public static void main(String[] args) {
		int age =25, weight= 50;
		
		if(age>=18)  
		{
			if(weight>=50)
			{
				System.out.println("you are eligible"); // it will execute when two conditions are true
			}
			else 
			{
				System.out.println("under weight"); // it will execute when second conditions false
			}
		}
		else
		{
			System.out.println("not eligible"); //if first condition is false then  this statement will execute
		}
	}

}
