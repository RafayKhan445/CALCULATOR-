import java.util.Scanner;
public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj=new calculator();
		Scanner input =new Scanner(System.in);
		  
		   System.out.println("Which Type You Want");
		   System.out.println("Press 1 for Int");
		   System.out.println("Press 2 for double");
		   int choice=input.nextInt();
		   if(choice==1){
			
			   System.out.println("Enter Two Numbers");
			   int a=input.nextInt();
			   int b=input.nextInt();
			 
			  
		   System.out.println("Answer is "+obj.add(a,b));
		   System.out.println("Answer is "+obj.sub(a,b));
		   System.out.println("Answer is "+obj.mul(a,b));
		   System.out.println("Answer is "+obj.div(a,b));
			}
		   
		   if(choice==2){
			  
			   System.out.println("Enter Two Numbers");
			   double a=input.nextDouble();
			   double b=input.nextDouble();
			  
		   System.out.println("Answer is "+obj.add(a,b));
		   System.out.println("Answer is "+obj.sub(a,b));
		   System.out.println("Answer is "+obj.mul(a,b));
		   System.out.println("Answer is "+obj.div(a,b));
			}
			}
	}
