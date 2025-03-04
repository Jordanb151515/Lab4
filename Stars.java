import javax.swing.JOptionPane;

/**
 * Uses user for width of the diamond, then displays diamond with that width.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 3/4/25
 */
public class Stars
{
    public static void main(String []args){
        int width;
        String temp;

        //get input of width from user
        temp = JOptionPane.showInputDialog("Enter the width of the dimond you would like.");
        width = Integer.parseInt(temp);

        //ensure width amount is even
        if (width%2 == 0){
            width++;
        }
        
        //generate top half of the diamond
        for(int line = 1, spaces = width/2; line <= width/2 + 1; line++, spaces--){
            for(int i = 1; i<=spaces; i++){
                System.out.print(" ");
            }
            for(int i=1; i<= line*2-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //generate the bottom half of diamond
        for(int line = width/2, spaces = 1; line > 0; line--, spaces++){
            for(int i = 1; i<=spaces; i++){
                System.out.print(" ");
            }
            for(int i=1; i<= line*2-1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
