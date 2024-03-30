package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0) {
            long sum = 0;
            long current = 9;
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += current;
                current = current * 10 + 9;
            }
            System.out.println(sum);
        }
    }
}
