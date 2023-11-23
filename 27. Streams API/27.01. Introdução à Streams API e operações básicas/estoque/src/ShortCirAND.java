// Java code to demonstrate the 
// short circuiting using && 

import java.io.*;

public class ShortCirAND {
    public static void main(String arg[])
    {

        // Since first operand is false 
        // and operator is &&, 
        // Evaluation stops and 
        // false is returned. 
        if (false && true && true) {
            System.out.println("This output "
                    + "will not "
                    + "be printed");
        }
        else {

            System.out.println("This output "
                    + "got printed actually, "
                    + " due to short circuit");
        }

        // Whole expression will be evaluated, 
        // as no false is encountered 
        // before last condition 
        // Therefore no Short circuit 
        if (true && true && true) {
            System.out.println("This output "
                    + "gets print"
                    + " as there will be"
                    + " no Short circuit");
        }
        else {

            System.out.println("This output "
                    + "will not "
                    + "be printed");
        }
    }
}