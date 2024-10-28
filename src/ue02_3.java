import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        int r =4;
        double x, y;
        double length;
        
        System.out.println("chose a X coordinate:");
        x = In.readDouble();

        System.out.println("chose a Y coordinate:");
        y = In.readDouble();

        length = Math.sqrt((x*x)+(y*y));

        if (x>0 && y>0 && length > 4) {
            System.out.println("the coordinants are in the green area");
            }
            else{
                System.out.println("The coordinates aren't in the green area");
            }
        } 
        
    }

/*
 * 
 */
