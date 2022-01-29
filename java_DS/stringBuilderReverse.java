import java.util.Scanner;

public class stringBuilderReverse {
    public static String reverse(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        StringBuilder reversed =new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a String to reverse");
        String s = in.next();
        System.out.println(reverse(s));
        in.close();
    }
}
