package iterativestatements;

public class Whilesum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10)
		{
			System.out.println(i);
			sum=sum+i; // in first iteration value of sum =1,then sum =1+2=3
			i++;
		}

     System.out.println("sum is="+sum);
	}

}
