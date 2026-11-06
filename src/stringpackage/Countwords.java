
package stringpackage;

public class Countwords {

	public static void main(String[] args) {
		String sentence="Java is simple and esay to learn";
		{
		String[] result= sentence.split(" ");
	     for(String v:result)
	     {
	       System.out.println(v);
	     }
	     
	     System.out.println("The number of words= " +result.length); 

	}

}
}

  