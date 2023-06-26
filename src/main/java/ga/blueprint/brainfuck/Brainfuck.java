package ga.blueprint.brainfuck;

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
        int[] memory = new int[MEMORY_SIZE];
        int ptr = 0;
        String code = "";
        int codePtr = 0;

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

        int codeLen = code.length();

        while (codePtr < codeLen) {
            switch (code.charAt(codePtr)) {
                case INCREMENT -> {
                }

                case DECREMENT -> {
                }

                case RIGHT -> {
                }

                case LEFT -> {
                }

                case LOOP_START -> {
                }

                case LOOP_END -> {
                }

                case OUTPUT -> {
                }

                case INPUT -> {
                }

                default -> {
                }
            }

            codePtr++;
        }
    }
}
