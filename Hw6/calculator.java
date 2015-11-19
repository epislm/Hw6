import java.util.*;
public class calculator{

public static void main(String [] args){
Scanner my_sc = new Scanner(System.in);
double num1;
String input;
String part2;
double num2 = 0;
double result = 0;
boolean cont = true;


try{ num1 = Double.parseDouble(args[0]);}

catch(NumberFormatException e){
		System.out.println("Not a number. Enter a new number : ");
		args[0] = my_sc.next();
		num1 = Double.parseDouble(args[0]);
	
}
try{ num2 = Double.parseDouble(args[2]); }

catch(NumberFormatException e){
		System.out.println("Not a number. Enter a new number : ");
		args[2] = my_sc.next();
		num1 = Double.parseDouble(args[0]);
	
}
catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Not enough Numbers. Enter equation again :");
		input = my_sc.next();
		args = input.split("");
		num1 = Double.parseDouble(args[0]);
		part2 = args[1];
		num2 = Double.parseDouble(args[2]);
		
	
}
 part2 = args[1];


while(cont){

try{
if(part2.matches("[+]")){  
System.out.println(add(num1,num2));
cont = false; }
if(part2.matches("[-]")) { 
System.out.println(subtract(num1,num2));
cont = false; }
if(part2.matches("[*]")){  
System.out.println(multiply(num1,num2));
cont = false; }
if(part2.matches("[/]")) { 
System.out.println(divide(num1,num2));
cont = false; }
if(part2.matches("[%]"))  {
System.out.println(modulus(num1,num2));
cont = false; }
if(!part2.matches("[+,-,*,/,%]"))
	throw new IllegalOperationException();
}


catch(IllegalOperationException e){
	System.out.println("Wrong operator.\n Enter a new Operator: ");
	args[1] = my_sc.next();
	 part2 = args[1];

	}
catch(ArithmeticException ae){
	ae.printStackTrace();
	}



}





 }

private static double add(double a, double b)
       {
              return (a+b);
       }


private static double subtract(double a, double b)
       {
              return (a-b);
       }

	   
private static double multiply(double a, double b)
       {
              return (a*b);
       }

	   
private static double divide(double a, double b)
       {
              return (a/b);
       }
private static double modulus(double a, double b)
       {
              return (a%b);
       }
}