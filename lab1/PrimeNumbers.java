package lab1;

public class PrimeNumbers {

	public static boolean main(String[] args) {
		
		int n,i;
	          
	          if(n==1||n==0)return false;
	   
	         
	          for(int i=2; i<n; i++){
	            
	                if(n%i==0)return false;
	          }
	        
	          return true;
	}

}
