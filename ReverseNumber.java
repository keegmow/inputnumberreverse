import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {

    Scanner userIn = new Scanner(System.in);

    //The following accepts the users integer input.
    System.out.println("Please type a number to be reversed:  ");
    int userNumber = userIn.nextInt();
    int newNumber = 0;

    while (userNumber > 0) {
      newNumber = newNumber * 10;  //After this loops, this makes room for the next digit to be added.
      int digit = userNumber % 10; //This take the last digit of our number.
      userNumber = userNumber / 10; //This removes the last digit from our number.
      newNumber = newNumber + digit; //This adds our digit to the new reversed number.
    }
    System.out.println("Here is your reversed number:  ");
    System.out.println(newNumber);
  }
}
