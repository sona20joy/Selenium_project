package accessmodifierpkg;

public class Accessmodifierprgm {
	
private int a =10;      //private variable
int b=5;                //default variable
protected int c= 20;    //protected variable
public int d=24;        //public variable
	
	
public static void main(String[] args) {
	
Accessmodifierprgm obj =new Accessmodifierprgm();

System.out.println("Private variable : "+obj.a);

System.out.println("Default variable : "+obj.b);

System.out.println("Protected variable :"+obj.c);

System.out.println("Public variable :"+obj.d);


	}

}
