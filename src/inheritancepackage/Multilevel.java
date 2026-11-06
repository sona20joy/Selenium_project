package inheritancepackage;

class Animal
{
	int a=5;
	public void animalmethod()
	{
		System.out.println("Animal class method");
	}
}



class Dog extends Animal
{
	public void dogmethod()
	{
		System.out.println("Dog class method");
	}
}



class Puppy  extends Dog

  {
    public void puppymethod()
     {
	   System.out.println("puppy class method");
      }
  }



public class Multilevel 
{

	public static void main(String[] args) 
	{
	Puppy obj=new Puppy();
	System.out.println("Value of a:"+obj.a); //calling parent class variable using child class object
	obj.animalmethod(); //calling parent class method(animal)using child class object
	obj.dogmethod(); //calling parent class method(dog)using class object
	obj.puppymethod(); // calling child class method(puppy) using child class object
    }

}
