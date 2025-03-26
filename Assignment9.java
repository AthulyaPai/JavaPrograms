package package1;
public class Assignment9 {
	public static void main(String[] args) {
		int a = 21;
		int b= 26;
		int c = 18;
		
		if (a >=18 && a>25)
		{		
			System.out.println(" A is eligible for voting and loksabha nomination");
		}
		if (a>=25 || a>=30)
		{		
			System.out.println("A is eligible for  loksabha or Rajyasabha nomination");
		}
		if (!(a>=25 && a>=30))
		{
			System.out.println("A is NOT ELIGIBLE for any nomination");
		}
		if (c>=18 || b >=18)
		{
			System.out.println("A & B ARE ELIGIBLE for VOTING");
		}
		if(!(c>=18 || b >=18))
		{
			System.out.println("A & B bOTH ARE NOT ELIGIBLE for VOTING");
		}
	}
}
