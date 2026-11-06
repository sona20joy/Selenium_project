    package stringpackage;

    public class Reversesentencepgm {

	public static void main(String[] args) {
		String sentence="Testing Training Center";
		{
		String[] result= sentence.split(" ");
		
		for (int i = result.length - 1; i >= 0; i--)  //reult.length = to find the last index position
		{
		    System.out.print(result[i] + " "); 
		}
		

	}

}
}


// another method:
// int index=result.length-1
// string rev=""
// for(int i=index;i>=0;i--)  
// {   
//  rev=rev+result[i]+" ";
//  System.out.println();
//  System.out.println("reversed sentence");
//	System.out.println(rev);
// }  