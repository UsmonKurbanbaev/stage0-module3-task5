package lang.print.gaps.task5;

public class TimeConvertor {
    public static void convert(float minutes) {
        float seconds = 60 * minutes;
        System.out.println(seconds);
    }
    public static void main(String[] args) {
        convert(11.5F);
    }
}
