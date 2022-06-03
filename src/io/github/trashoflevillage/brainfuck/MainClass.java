package io.github.trashoflevillage.brainfuck;

public class MainClass {
    public static void main(String[] args) {
        ArrayInfo info = new ArrayInfo(Communicator.prompt("Brainfuck: "));
        Brainfuck.read(info);
    }
}
