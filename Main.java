import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);
    System.out.println("enter postive intgers ONLY (enter -1 to stop inputting)");
    int x = 0;
    int sum = 0;
    while (x != -1){
      x = sc.nextInt();
        sum += x;
      }
      sum++;
    
    System.out.println("Sum is: " + sum);
    
    System.out.println("how many numbers lil bro?");
    x = sc.nextInt();
    System.out.println("enter " + x + " scores:");
    int max = Integer.MIN_VALUE;
    int counter = 0;
    int currInt;
    while (counter != x){
      currInt = sc.nextInt();
      if (currInt > max){
        max = currInt;
      }
      counter++;
    }
    System.out.println("the largest score is " + max);
    
    sc.nextLine();
    System.out.println("enter a word: ");
    String word = sc.nextLine();
    String newWord = "";
    counter = 0;
    while (counter < word.length()){
      if(counter < word.length() - 1){
        newWord += word.substring(counter, counter + 2);
      }
      if (counter == word.length()-1){
        newWord += word.substring(counter);
      }
      counter += 3;
    }
    System.out.println(newWord);
    sc.close();
  }
}

