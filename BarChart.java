import java.util.Random;

/**
 * This program generates 3 random numbers and the print the amount of stars for each hundred. Part of Lab 4.
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 3/4/25
 */
public class BarChart
{
    public static void main(String[] args){
        int first, second, third;

        //generate three random numbers
        Random generator = new Random();
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);
        System.out.println("Number 1 is " + first);
        System.out.println("Number 2 is " + second);
        System.out.println("Number 3 is " + third + '\n');

        //create chart of stars
        System.out.println("NUMBER BAR CHART");
        System.out.print("Number 1: ");
        if (first<100){
            System.out.print("Number is less than 100 so no stars printed.");
        }
        else
            for (int i = 1; i<=first/100; i++){
                System.out.print("*");
            }
        System.out.println("");
        
        System.out.print("Number 2: ");
        if (second<100){
            System.out.print("Number is less than 100 so no stars printed.");
        }
        else
            for (int i = 1; i<=second/100; i++){
                System.out.print("*");
            }
        System.out.println("");
        
        System.out.print("Number 3: ");
        if (third<100){
            System.out.print("Number is less than 100 so no stars printed.");
        }
        else
            for (int i = 1; i<=third/100; i++){
                System.out.print("*");
            }
        System.out.println("");
    }
}
