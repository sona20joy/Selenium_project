package javapackage;

public class Operatorspgm {

	public static void main(String[] args) {
		System.out.println("Arithmetic operators");
		
		int a=5;
		int b=3;
		System.out.println("a+b= "+(a+b));  //
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 5/3=1 is quotient
	    System.out.println(a%b); // 5%3=2 is remainder
	    
		System.out.println();
		System.out.println("assignmnent operators");
		//a=b; the value of 'b' store into 'a'
        System.out.println(a+=b);  // it means a =a+b; a= 5+3 = 8 The value of 'a' updated as 8
        System.out.println(a-=b);  // it means a= a-b; a= 8-3 = 5 The updated value of a is 5
        
        System.out.println();
        System.out.println("Relational operators");
        System.out.println("The value of a ="+a);
        System.out.println("The value of b ="+b);
        
        
        System.out.println(a==b);  //result is false = value will be boolean value
        System.out.println(a>b);   // 5>3  = true
        System.out.println(a>=b);  // 5>=3 = true
        System.out.println(a<b);   // 5<3  = false
        System.out.println(a<=b);  // 5<=3 = false
        System.out.println(a!=b);
        System.out.println();
        
        System.out.println("Logical operators");
        String userName="abc";
        String password ="1234";
        //AND (&&) - Verify whether both conditions are true
        System.out.println(userName=="xyz" && password =="789");  // abc == xyz   && 1234 == 789, both conditions are false so result is false
        System.out.println(userName=="abc" && password == "1234");
        
        System.out.println();
        System.out.println("Result of OR operators");  // it returns true either one conditions is true
        System.out.println(userName=="abc" || password =="000"); 
        System.out.println(userName =="pqr" || password =="111");  
        
        System.out.println();
        System.out.println("result of Not operators");
        System.out.println(!(userName=="uvw"));
        
        System.out.println();
        System.out.println("unary operators");  //++ the value will incremented by 1 and -- the value will be decremented by 1
        // post increment/decrement i++,i-- the value will updated after printing
        int i =1;
        System.out.println("Value of i="+i);
        System.out.println("The value of i++="+(i++));  // value will be updated  after this line
        System.out.println("The updated value of i="+i);
        
        //pre-increment /pre-decrement ++i,--i the value increment/decrement first , then value is printed
        System.out.println("pre-increment");
        System.out.println("The value of i="+i);
        System.out.println(" the value of i after ++1"+(++i));
        
        System.out.println(++i); //the value i incremented by 1, then the value will be displayed
        
        
        
        
        
        
        
	}

}
