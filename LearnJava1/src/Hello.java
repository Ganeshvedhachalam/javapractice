import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
Sample obj1=new Sample(); 
Sample obj2=new Sample(); 
System.out.println("enter the numbers");
obj1.a=s.nextInt();
obj1.b=s.nextInt();
//obj2.a=5;
//obj2.b=10;


//System.out.println(obj1.a);
//System.out.println(obj1.b);
//System.out.println(obj2.a);
//System.out.println(obj2.b);
//obj1.sum();c

obj1.display( );
//obj2.display();
s.close();
	}

}
