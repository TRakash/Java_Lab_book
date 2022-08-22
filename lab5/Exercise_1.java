package lab5;

import java.util.Scanner;

class myException extends Exception{
    
    public String toString(){
        return "Your age should be above 15";
    }
}

public class Exercise_1 {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        try{
            if(num>15)
                System.out.println("Validated");
            else
                throw new myException();
            
        }
        catch(myException e){
            System.out.println(e);
        }
}
}
