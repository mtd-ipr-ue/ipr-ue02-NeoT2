import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        System.out.println("Please choese 3 whole numbers:");


        int a = In.readInt();
        int b = In.readInt();
        int c = In.readInt();

        if (a>b && a>c) {
            System.out.println(a + " ist die größte Zahl");
        }   
            else if (b>a && b>c) {
                System.out.println(b + " ist die größte Zahl");
                
            }
            else 
            System.out.println(c + " ist die größte Zahl");
        }
    }

