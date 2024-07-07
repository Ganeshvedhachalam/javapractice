import java.util.Scanner;


public class LearnJava1 {
	public static void main(String arg[]) {
		System.out.println("enter the numbers");
	Scanner s = new Scanner(System.in);
	
int a=s.nextInt();
int b=s.nextInt();
		//System.out.println(a+b);
 
//		int num = s.nextInt();
//		int sum=0;
//		for(int i=0;i<num;i++) {
//			sum+=i;
//			
//			
//		}
//		System.out.println(sum);
	int result = sum(a,b);
	System.out.println(result );
	}
	static int sum(int a,int b ) {
		int ans=a+b;
		return ans;
	}
}
