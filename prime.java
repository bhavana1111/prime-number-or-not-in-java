import java.util.*;//importing required packages you can even code as import java.util.scanner; 
class prime
{
	 public static void main(String[] args) {

	 	int n,i,count=0;//Declaring required variables
	 	Scanner s =new Scanner(System.in);//creating object for user input
	 	n=s.nextInt();//initialization of user input to declared variable
        //loop that checks given number is prime or not
	 	for (i=1;i<=n;i++) {

	 		if (n%i==0) {
	 			count++;
	 		}
	 		
	 	}//loop ends
	 	if (count>2) {//checking count value as it was modified in above loop
	 		System.out.println("The given number is not prime" +n);
	 		
	 	}
	 	else
	 	{
	 	   System.out.println("The given number is  prime " +n);	
	 	}
		
	}
}
