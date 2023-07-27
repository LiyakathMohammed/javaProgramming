package javaIntroduction;
import java.util.*;
public class PrimeIdentification {
	
	public static void main(String[] args) {
		int a;
		a = 0;
		while(a==1) {
			Scanner sc = new Scanner(System.in); 	
			System.out.println("Enter a number:");
			int n; 
			n = sc.nextInt();
			  int i,m=0,flag=0;    
			  m=n/2;    
			  if(n==0||n==1){
			   System.out.println(n+" is not composite number");    
			  }
			  else{
			   for(i=2;i<=m;i++){    
			    if(n%i==0){    
			     System.out.println(n+" is a composite number");    
			     flag=1;    
			     break;    
			    }    
			   }    
			   if(flag==0)  { System.out.println(n+" is a prime number"); }
			  }
			
		}

		}  
		 

	}

