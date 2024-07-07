package oops;
//constructor used to perform task before
// or while creating the objects 
public class Constructor {
	public static void main(String hai[]) {
		
		
		
	     Constructor s = new Constructor();// same  class constructor 
	    Sample b = new Sample(5,3);// constuctor from another smple class

 System.out.println(b.a+" "+b.b);
	}
	
	 Constructor(){ //creating constructor 
	 		System.out.println("this is constructor ");
	 	}
}
