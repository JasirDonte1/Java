import java.util.Scanner;
import java.lang.*; 

public class Square{

    //vars to hold square data. x2 and y2 hold the other two points of the square 

    double x;
    double y;
    double x2;
    double y2; 
    double len; 
    

    //constructor 
    Square(double x, double y, double len){
        this.x = x;
        this.y = y;
        this.len = len;
        this.x2 = x + len; 
        this.y2 = y - len; 
    }
    

    //returns the area of the square 
    double area(){
        return len*len;
    }
    //returns the perimeter of the square 
    double perimeter(){
        return len*4;
    }
    //returns true if the two squres intersect 
    boolean intersects(Square b)
    {
        if (b.x > x && b.x < x2){
            return true; 
        }else if (b.y > y2 && b.y < y){
            return true; 
        }else{
            return false;
        }
    }
    //returns true if squre b is completely contained by square a
    boolean contains (Square b){
        if (b.x > x && b.x < x2)
        {
            if (b.y > y2 && b.y < y)
            {
                return true;
            }
            
        }
        return false; 
    }


    //draws square. parameters account for function centering the shape. 
    void draw(Square b){
        StdDraw.square(x + length / 2, y - length / 2, length / 2);
    }
    
    
    
    public static void main(String[] args) {
        
        //scanner is created to accept user input 
        Scanner scanr = new Scanner(System.in);

        //user input from command line is saved into temporary vars 
        int p1 = Integer.parseInt(args[0]);
        int p2 = Integer.parseInt(args[1]);
        int length = Integer.parseInt(args[2]);
        
        //square is created 
        Square a = new Square(p1, p2, length);
        
        //prints area and perimeter 
        System.out.println("perimeter: " + a.perimeter());
        System.out.println("area: " + a.area());
        
        //prompts user for new square values 
        System.out.println("Enter the values for another square.");
        System.out.println("Enter the x");
        
        p1 = scanr.nextInt();

        System.out.println("Enter the y");
        
        p2 = scanr.nextInt();

        System.out.println("Enter the length");
        
        length = scanr.nextInt();
        

        //creates square b 
        Square b = new Square(p1, p2, length);


        //checks if intersects and contains. returns bool for both. Corresponding  statment will print to console;
        boolean check_intersects = a.intersects(b);
        if(check_intersects == true){
            System.out.println("squares intersect");
        }else{
            System.out.println("squares do not intersect");
        }
        boolean check_contains = a.contains(b);
        if(check_contains == true){
            System.out.println("square 1 contains square 2");
        }else{
            System.out.println("square 1 does not contain square 2");
        }
        
        //draws square 
        a.draw();
        b.draw();
	}
    
}