import javax.swing.JOptionPane;

/**
 * This program has user enter a string and a character and the output is how many times that character appears in the string. Part of Lab 4.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 3/6/25
 */
public class ProChal5
{
    public static void main(String[]args){
        String input, temp, output;
        char letter;
        int letterAmount = 0;
        
        //collect input
        temp = JOptionPane.showInputDialog("Enter a string: ");
        input = temp.toUpperCase();
        temp = JOptionPane.showInputDialog("Enter a character: ");
        letter = temp.toUpperCase().charAt(0);
        
        //test of character values
        for(int i=0; i<=input.length()-1; i++){
            if(input.charAt(i)==letter){
            letterAmount++;
        }
        }
        
        //display output
        JOptionPane.showMessageDialog(null, String.format("In the phrase: %s \n There are %d %c 's ", input, letterAmount, letter));
    }//end main
}//end class
