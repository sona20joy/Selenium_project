package task;

public class AreaShapes {

 // Area of square
	
	    public void area(int side) 
	    {
	        System.out.println("Area of Square: " + (side * side));
	    }
	    
	    
// Area of rectangle
	    
	    public void area(int length, int breadth) 
	    {
	        System.out.println("Area of Rectangle: " + (length * breadth));
	    }

	   
// Area of triangle using int and double
	    
	    public void area(int base, double height) 
	    {
	        System.out.println("Area of Triangle: " + (0.5 * base * height));
	    }

	    
	
	
	public static void main(String[] args) {
		
		AreaShapes obj = new AreaShapes();

        obj.area(5);          
        obj.area(10, 5);      
        obj.area(8, 4.5);    
        
    }

		
	}


