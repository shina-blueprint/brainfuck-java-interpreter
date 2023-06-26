package ga.blueprint.brainfuck;

public class Brainfuck {
    static final char INCREMENT = '+';
    static final char DECREMENT = '-';
    static final char RIGHT = '>';
    static final char LEFT = '<';
    static final char LOOP_START = '[';
    static final char LOOP_END = ']';
    static final char OUTPUT = '.';
    static final char INPUT = ',';

    static final int MEMORY_SIZE = 1024;

    public static void main(String[] args) {
        int[] memory = new int[MEMORY_SIZE];
        int ptr = 0;
        String code = "";
        int codePtr = 0;
    }
}
