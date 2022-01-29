import java.util.Scanner;

public class stringValidationPassword {
    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase)&&
            s.chars().anyMatch(Character::isUpperCase)&&
            s.chars().anyMatch(Character::isUpperCase);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a Password to check");
        String s = in.next();
        System.out.println(isPasswordComplex(s));
        in.close();
    }
}
