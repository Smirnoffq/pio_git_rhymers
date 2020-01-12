package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int NUMBERS_COUNT = 12;
    public static final int BUFFER_IS_EMPTY = -1;
    private int[] numbers = new int[NUMBERS_COUNT];

    private int total = BUFFER_IS_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == BUFFER_IS_EMPTY;
    }

    public boolean isFull() {
        return total == NUMBERS_COUNT - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return BUFFER_IS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return BUFFER_IS_EMPTY;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
