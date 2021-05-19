//for calculator functionality
package application;

public class Model {
  public float calculate(float n1, float n2, String op) {
	  switch(op) {
	  case "+":
		   return (n1+n2);
	  case "-":
		   return (n1-n2);
	  case "X":
		   return (n1*n2);
	  case "/":
		   if(n2!=0)
			 return (n1/n2);
		   else
			 return 0;
	  default:
		   return 0;
	  }
  }
	
}
