package javapractice;

public class Wordscount {

	public static void main(String[] args) {
		    
		String sentence="jave is very simple";
		{
			String[] result=sentence.split(" ");
			{
				for(String v:result)
			    System.out.println(v);
				{
				  System.out.println("The word count="+result.length);
				}
		}

		}
	}
}


  