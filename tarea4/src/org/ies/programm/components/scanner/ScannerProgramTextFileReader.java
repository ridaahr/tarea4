package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.Program;
import org.ies.programm.model.TextFile;

import java.util.Scanner;

public class ScannerProgramTextFileReader implements Reader<Program<TextFile>> {
    private final Scanner scanner;
    private final Reader<TextFile> textFileReader;

    public ScannerProgramTextFileReader(Scanner scanner, Reader<TextFile> textFileReader) {
        this.scanner = scanner;
        this.textFileReader = textFileReader;
    }

    @Override
    public Program<TextFile> read() {
        System.out.println("Introduce el nombre del programa");
        var name = scanner.nextLine();
        System.out.println("Introduce cuántos archivos va a tener");
        var size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ahora introduce los ficheros");
        TextFile[] files = new TextFile[size];
        for (int i = 0; i < size; i++) {
            files[i] = textFileReader.read();
        }
        return new Program<>(
                name,
                files
        );
    }
}
