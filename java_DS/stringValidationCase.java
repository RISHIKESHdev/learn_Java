import java.util.Scanner;
public class stringValidationCase{
    public static boolean isUppercase(String s){
        //using java stream API
        //If all the char in string is uppercase this returns true
        return s.chars().allMatch(Character::isUpperCase);

    }
    public static boolean isLowercase(String s){
        //using java stream API
        //alternate method : s.chars().nonMatch(Character::isUpperCase);
        //If all the char in string is lowercase this returns true
        return s.chars().allMatch(Character::isLowerCase);

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a String to check case");
        String s = in.next();
        System.out.println(isUppercase(s));
        System.out.println(isUppercase(s));
        in.close();
    }
}