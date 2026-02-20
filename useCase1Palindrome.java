import java.util.Scanner;

public class useCase1Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome To the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System Initialised Successfully");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check for Palindrome string or not");
        String WorD= sc.next();
        int start =0;
        int end = WorD.length()-1;
        Boolean isPalindrome= true;
        while(start<end){
            if(WorD.charAt(start)!= WorD.charAt(end)) isPalindrome=false;
            start++;
            end--;
        }
        if(isPalindrome)System.out.println("Palindrome");
        else System.out.println("not a palindrome");
            sc.close();
    }
}