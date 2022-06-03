package io.github.trashoflevillage.brainfuck;

import java.lang.reflect.Array;

public class Brainfuck {
    public static void read(ArrayInfo info) {
        int i = 0;
        try {
            while (i < info.code.length()) {
                char character = info.code.charAt(i);
                switch (character) {
                    case '>' -> info.movePointer(Direction.RIGHT);
                    case '<' -> info.movePointer(Direction.LEFT);
                    case '+' -> info.operation(Operation.ADD);
                    case '-' -> info.operation(Operation.SUBTRACT);
                    case '.' -> Communicator.print((char) info.getValue()); // Output
                    case ',' -> info.array[info.pointer] = (int) Communicator.prompt("Give Input: ").charAt(0); // Input
                    case '[' -> {if (info.getValue() == 0) i = info.jump(Direction.RIGHT, i);}
                    case ']' -> {if (info.getValue() != 0) i = info.jump(Direction.LEFT, i);}
                }
                i++;
            }
        } catch(IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
