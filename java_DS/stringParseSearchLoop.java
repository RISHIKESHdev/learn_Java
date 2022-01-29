public class stringParseSearchLoop {
    public static void parseContents(String s){
        char toFind='L';
        System.out.println("Option 1");
        for (char c: s.toCharArray()){
            if(toFind==c){
            System.out.println("Char found");
            break;
        }
        }
        System.out.println();
        System.out.println("Option 2");
        for (int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(toFind==c){
                System.out.println(String.format("Char "+c+" found"));
                break;
            }
        }
    }
    public static void main(String[] args){
        String s ="HeLLo";
        parseContents(s);
    }
}
