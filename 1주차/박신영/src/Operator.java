public class Operator {
    public static void main(String[] args) {
        System.out.println(7/2); // 정수와 정수의 연산은 정수다 // 3
        System.out.println(7/2.0); // 정수와 실수의 연산은 실수!! // 3.5 싱기하군
        // 형 변환
        int number = 5;
        number = (int) 4.7;
        System.out.println(number);
        // 정수에서 실수를 뺄 수 일을까? 옹 되네??
        System.out.println(number - 1.2);
    }
}
