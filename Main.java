import java.util.Scanner;
/**
 * prints 2 numbers in ascending order
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //creates array to store users numbers
    int array[] = new int[2];

    //gets users number and puts it in array
    System.out.println("Please enter the 2 values for the array");
    for(int i = 0; i < array.length; i++){
      array[i] = input.nextInt();
    }
    
    //prins numbers in ascending order
    if(array[0] > array[1]){
     System.out.println("Your numbers in ascending order are " + array[1] + " and " + array[0]);
    }else System.out.println("Your numbers in ascending order are " + array[0] + " and " + array[1]);
    
  }
}
