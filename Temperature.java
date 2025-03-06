import java.util.Scanner;

/**
 * This program collects a number in Fahrenheit or Celsius and converts that number to the other unit. Part of Lab 4.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 3/6/25
 */
public class Temperature
{
   public static void main (String[]args){
       int inputTemp;
       double output;
       char inputUnit;
       
       Scanner keyboard = new Scanner(System.in);
       
       do
       //collect data from the user
       {System.out.print("Enter a whole number, followed by a space, and then a C or F: ");
       inputTemp = Integer.parseInt(keyboard.next());
       inputUnit = keyboard.next().toUpperCase().charAt(0);
       
       //ensure either a f or c is entered
       while(!(inputUnit == 'C' || inputUnit == 'F')){
            System.out.print("Please enter a C or F: ");   
            inputUnit = keyboard.next().toUpperCase().charAt(0);  
       }
       
       //case f to c
       if (inputUnit == 'F'){
           output = (inputTemp - 32) * 5.0/9.0;
           System.out.printf("The temperature converted to Celsius is %.1fC", output);
       }
       //case c to f
       else{
           output = inputTemp * 9.0/5.0 + 32;
           System.out.printf("The temperature converted to Fahrenheit is %.1fF", output);
       }
       System.out.print("\nEnter yes if you would like to convert another temperature: ");
       
    }while(keyboard.next().equalsIgnoreCase("yes"));
   }//end main
}//end class
