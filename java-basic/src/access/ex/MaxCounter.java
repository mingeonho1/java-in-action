package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isMaxValid()) System.out.println("최대값을 초과할 수 없습니다,");
        else count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isMaxValid() {
        return count >= max;
    }
}
