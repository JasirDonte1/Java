
import java.util.Scanner;


public class TriangularTest {
   public static void main(String[] args){
       
       int first, second, third;  // vars to store the 3 input digits 

       first = Integer.parseInt(args[0]);   //converting sting digits to integers 
       second = Integer.parseInt(args[1]);
       third = Integer.parseInt(args[2]);
       
      
       System.out.println(isTriangle(first,second,third)); //prints output of isTringale function 
     
   }
   
   public static boolean isTriangle(int first, int second, int third){
       boolean answer = true;
       if (first >= second + third){      //coded version of the triangle ineqiality theorem 
           answer = false; 
           
       }else if (second >= first + third){ //each statement tests to make sure that the sum of two sides is grater than the third
           answer = false; 
           
       }else if (third >= second + first){
           answer = false; 
       }
       
       return answer;
   }
   
}