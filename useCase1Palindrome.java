import java.util.Scanner;

public class useCase1Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome To the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System Initialised Successfully");
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check for Palindrome string or not");
        String Word = sc.nextLine();
        String str = "";
        for (int i = Word.length()-1; i>=0; i--) {
            str+= Word.charAt(i);
            System.out.println(str);
        }
        if (str.equals(Word))
            System.out.println("Yess It is A Palindrome Number");
        else
            System.out.println("No it Is Not A Palindrome Number");
            sc.close();
    }
}