package constructorpackage;

public class Parameterizedconstruc {
	
	int age;
    String name;
    // access modifier  classname(parameters){
//                             }   - Syntax for parameterized constructor
    
    public Parameterizedconstruc (int age,String name)
    {
    	this.age=age; //this refers to the instance variable
    	this.name=name; //this refers to instance variable
    	
    	
    }
    
    public void dispaly()
    {
     System.out.println("age : " +age);
     System.out.println("Name :" +name);
     
   
    }
    
    public static void main(String[] args) {
    
    	Parameterizedconstruc obj = new Parameterizedconstruc(10, "Norah"); // 10 assign to age and Norah assign to name
    	obj.dispaly();
		

	}

}
