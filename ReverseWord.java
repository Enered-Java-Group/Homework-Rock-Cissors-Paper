import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduce a phrase:");
        String s = scanner.nextLine();
        System.out.println(reverseWord(s));
        System.out.println(censoreWord(s));

    }

    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = word.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() >= 5) {
                StringBuilder sb2 = new StringBuilder(stringArray[i]);
                sb.append(sb2.reverse());
            } else{
                sb.append(stringArray[i]);
            }
            sb.append(" ");

        }
        return sb.toString();
    }

    public static String reverseChar( String word2) {
        StringBuilder sb2=new StringBuilder();
        char[] tempChar = word2.toCharArray();
        for (char c:tempChar) {
            c='*';
            sb2.append(c);
        }
        return sb2.toString();
    }
    public static String censoreWord(String word){
        StringBuilder sb=new StringBuilder();
        String[] stringArray=word.split(" ");
        for(String w:stringArray){
            if(w.length()>4){
               sb.append(reverseChar(w));
            } else{
                sb.append(w);
            }
            sb.append(" ");
        }
        return sb.toString();
    }

}
