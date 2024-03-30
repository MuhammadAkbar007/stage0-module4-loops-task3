package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String text = t + "";
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            sum += text.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
