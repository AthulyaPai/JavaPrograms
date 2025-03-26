package package1;

public class Assignment12 {


void add () {
	int a = 10;
	int b= 20;
	int sum = a+b;
	System.out.println(sum);
}

void sub () {
	int a = 100;
	int b= 50;
	int sub = a-b;
	System.out.println(sub);
}
void div () {
	int a = 80;
	int b= 5;
	int div = a/b;
	System.out.println(div);
}
	
	public static void main(String[] args) {
		Assignment12 x = new Assignment12();
		x.add();
		x.sub();
		x.div();
	}
}