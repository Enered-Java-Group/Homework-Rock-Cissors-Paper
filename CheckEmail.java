import java.util.Scanner;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduce a email:");
//        String s = scanner.nextLine();
//        System.out.println(checkEmail(s));
        System.out.println(checkEmail("@gmail.com"));
        System.out.println(checkEmail("hello.gmail@com"));
        System.out.println(checkEmail("gmail"));
        System.out.println(checkEmail("hello@gmail"));
        System.out.println(checkEmail("hello@edabit.com"));

    }

    public static boolean checkEmail(String word) {
        boolean flag = false;
        char[] charArray = word.toCharArray();
        if ((word.contains("@")) && (word.contains(".")) && (!word.contains(" "))) {
            if (word.indexOf('@') > 0) {
                int templaceA = 0;
                int templaceB = 0;
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == '.') {
                        templaceB = i;
                    } else if (charArray[i] == '@') {
                        templaceA = i;
                    }
                }

                if (templaceB > templaceA) {
                    flag = true;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
