package stringpackage;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String s4="world";
		String s3=new String("Hello");
		String s5=" hai ";
		String s6="Hello everyone good morning";
//        if(s2==s3)  //the output will be false because == always comparing the reference number not the values we entered
//        {
//        	System.out.println("The values are equal");
//        	}
//        else
//        {
//        	System.out.println("The values are not equal");
//        }
		
//      //equals()
		
        if(s2.equals(s3))
        {
        	System.out.println("The values are equal");
	     }
      else
     {
	    System.out.println("The values are not equal");
      }
        //equalsIgnorecase()
        if(s1.equalsIgnoreCase(s2)) 
        {
        System.out.println("The values are equals");
        }
        
        
        //concat()
        System.out.println(s1.concat(s4)); //Hello world        
	
	    //contains()
        System.out.println(s4.contains("world"));
        
        //touppercase
        System.out.println(s1.toUpperCase()); //HELLO
        
        //tolowercase
        
        System.out.println(s1.toLowerCase());
        
        //length()
        System.out.println(s1.length()); //5
        
         //trim()  remove whitespace from starting and ending 
        
         System.out.println("before trim:"+s5);
         System.out.println("after trim :"+s5.trim());
       
         System.out.println(s6.startsWith("Hello"));
	     
	     String s7=" Hello everyone good morning";
	     System.out.println(s6.endsWith("Hello"));
	     
	     
	    //charAt(index position)
	     
	     System.out.println(s6.charAt(2)); //to retrieve the letter at a specific position
	     
	     
	     //substring(start index,end index)
	     
	     System.out.println(s6.substring(0, 12));
	     
	     
	     //split -based on a condition split the sentence
	     
	     String[] result= s6.split(" ");
	     for(String v:result)
	     {
	       System.out.println(v);
	     }
	     
	     System.out.println("The number of words= " +result.length); //  to find the number of words in a sentence
	     
	     
	     //toCharArray()-to retrieve as single character from a string
	     
	     String s8="Sona Joy";
	     char [] ar= s8.toCharArray();
	     System.out.println("result of char array");
	     for(char c: ar)
	     {
	    	 System.out.println(c);
	     }
	     
	     //replace() - specific word replace from a sentence if hello in 2 times on this sentence then methods replace those 2  hello
	       
	     System.out.println(s6.replace("Hello", "Hai"));
	     
	

}
}