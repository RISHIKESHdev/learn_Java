import java.util.Scanner;

public class stringNormalize {
    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", " ");
        // String lowercased = s.toLowerCase();
        // String trimmed = lowercased.trim();
        // String normalized = trimmed.replace(","," ");
        // String normalized = trimmed.replace(target:",",replacement:"");
    }
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter a String to check case");
    String s = in.next();
    System.out.println(normalizeString(s));
    in.close();
}
}
