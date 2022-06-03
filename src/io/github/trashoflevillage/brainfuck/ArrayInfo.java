package io.github.trashoflevillage.brainfuck;

public class ArrayInfo {
        final int[] array = new int[30000];
        int pointer = 0;
        final String code;
        public ArrayInfo(String code) { // no return type (including void) means it's a constructor
                this.code = code;
        }
        public void movePointer(Direction direction) throws IndexOutOfBoundsException {
                this.pointer += direction.getValue();
                if (this.pointer<-1 || this.pointer>this.array.length) throw new IndexOutOfBoundsException();
        }
        public void operation(Operation operation) {
                this.array[this.pointer] += operation.getValue();
                this.array[this.pointer] %= 256;
        }
        public int jump(Direction direction, int location) {
                int depth = 1;
                while (depth > 0) {
                        if (location > code.length());
                        location += direction.getValue();
                        if (code.charAt(location) == ']') depth -= direction.getValue();
                        if (code.charAt(location) == '[') depth += direction.getValue();
                }
                return location;
        }
        public int getValue() {
                return array[pointer];
        }
}
enum Operation {
        ADD(1), SUBTRACT(-1);
        final int value;
        Operation(int value) {
                this.value = value;
        }
        public int getValue() {
                return value;
        }
}
enum Direction {
        RIGHT(1), LEFT(-1);
        final int value;
        Direction(int value) {
                this.value = value;
        }
        public int getValue() {
                return value;
        }
}