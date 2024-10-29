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


        if ((x>0 && y>0) && (x<=4 && y<=4)) {
            length = Math.sqrt((x*x)+(y*y));
            if (length>r) {
                System.out.println("the coordinants are in the green area");
            }
            else{
                System.out.println("The coordinates aren't in the green area");
            }
        }
        else{
            System.out.println("The coordinates aren't in the green area");
            }
    } 
        
}

/*erklärung für bool'sche operatoren in diesem bsp. ((x>0 && y>0) && (x<=4 && y<=4)) 
 * diese zeile besagt das x größer als null und y größer als null sein muss und x kleiner gleich 4 und y kleiner gleich 4 sein muss.
 * && bedeuted und.
 */
