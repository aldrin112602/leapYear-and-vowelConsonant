import java.util.*;
public class vowelConsonant {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter letter: ");
        char letter = in.next().charAt(0);
        switch(letter) {
         case 'A':
         case 'a':
         case 'E':
         case 'e':
         case 'I':
         case 'i':
         case 'O':
         case 'o':
         case 'U':
         case 'u':
           System.out.println("Letter " + letter + " is a Vowel.");
           break;
         default:
           System.out.println("Letter " + letter + " is a Consonant.");
           break;
        }
        in.close();
    }
    
}
