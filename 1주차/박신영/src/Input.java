import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        String input = scanner.nextLine();   //nextline은 문자열들이 한번에 다 나오는거
//        System.out.println(input);

//        Scanner scanner = new Scanner(System.in);
//        String input =scanner.next();
//        String input2 =scanner.next();
//        System.out.println(input);
//        System.out.println(input2);   // 공백 !!!!

        System.out.println("숫자 입력해봐라");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
//        System.out.println(intInput + 1);  /// 문자열이다!!!!
        int intValue = Integer.parseInt(intInput);
        System.out.println(intValue+1);
    }
}
  