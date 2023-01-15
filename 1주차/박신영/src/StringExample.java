public class StringExample {
    public static void main(String[] args) {
        String chicken = "우히히";
        String me = "운동 넘 재밌다";
        System.out.println(chicken + me);
        System.out.println((me+chicken).length());
        
        // replaceAll
        System.out.println(me.replaceAll("운동", "매우매우"));
    }
}
