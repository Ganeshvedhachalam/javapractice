package oops;
//constructor method creation 
public class Sample {
	int a =100,b =200;//global variable 
	Sample (int a, int b ){  //local variable 
  this .a = a; //assign local value to glob var
//  this .b = b; 
  b=this.b;//assign global val to local 
  System.out.println(a+" "+b);
  // we are assingning the value of local to global 
  // so that we can use the a, b any where with the value of local ab
	}
 
}
