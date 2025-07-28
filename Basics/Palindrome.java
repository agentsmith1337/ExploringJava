import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Please enter a String:");
        String InputString = io.nextLine();
        char[] CharInputString = InputString.toCharArray();
        boolean IsPalindrome = true;
        System.out.println();
        for (int i=0; i<=InputString.length()/2; i++) {
            if (CharInputString[i]!=CharInputString[InputString.length()-i-1]) {
                IsPalindrome=false;
            }
        }
        if(IsPalindrome) System.out.println("The String is a palindrome.");
        else System.out.println("The String is not a palindrome.");
        io.close();
    }
}
