package lab5;

import java.util.Scanner;

class myException extends Exception{
	@Override
    public String toString(){
        
        return "First name and last name should not be empty";
    }
}

public class Excercise_2 {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        String fname = sc.nextLine();
	        String lname = sc.nextLine();
	        
	        try{
	            if(fname.isEmpty()&& lname.isEmpty()){
	                throw new myException();
	            }
	            else
	                System.out.println("Validated");
	        }
	        catch(myException e){
	            System.out.println(e);
	        }
	    }
	}


