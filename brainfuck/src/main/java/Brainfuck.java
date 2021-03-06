import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
        int[] memory;
        int ptr = 0;
        String code = "";
        int codePtr = 0;
        int codeLen = 0;

        memory = new int[MEMORY_SIZE];

        if (args.length == 0) {
            System.err.println("Error: A Brainfuck code is not passed as a command-line argument.");
            System.err.println("Please pass an argument as the form, $ java -jar brainfuck.jar [FILENAME].");
            System.exit(1);
        }

        try {
            code = Files.readString(Path.of(args[0]));
        } catch (IOException e) {
            System.err.println("Error: The file, " + args[0] + ", cannot be opened.");
            System.exit(1);
        }

        codeLen = code.length();

        while (codePtr < codeLen) {
            switch (code.charAt(codePtr)) {
                case INCREMENT:
                    memory[ptr] = (memory[ptr] >= 255) ? 0 : memory[ptr] + 1;
                    break;

                case DECREMENT:
                    memory[ptr] = (memory[ptr] <= 0) ? 255 : memory[ptr] - 1;
                    break;

                case RIGHT:
                    ptr = (ptr >= MEMORY_SIZE - 1) ? 0 : ptr + 1;
                    break;

                case LEFT:
                    ptr = (ptr <= 0) ? MEMORY_SIZE - 1 : ptr - 1;
                    break;

                case LOOP_START:
                    break;

                case LOOP_END:
                    break;

                case OUTPUT:
                    System.out.print((char) memory[ptr]);
                    break;

                case INPUT:
                    try {
                        memory[ptr] = System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                    break;

                default:
                    break;
            }

            codePtr++;
        }
    }

}
