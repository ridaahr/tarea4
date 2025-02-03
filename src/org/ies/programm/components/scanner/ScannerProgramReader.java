package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.File;
import org.ies.programm.model.Program;
import org.ies.programm.model.TextFile;

import java.util.Scanner;

public class ScannerProgramReader implements Reader<Program<TextFile>> {
    private final Scanner scanner;
    private final Reader<TextFile> textFileReader;

    public ScannerProgramReader(Scanner scanner, Reader<File> fileReader) {
        this.scanner = scanner;
        this.fileReader = fileReader;
    }

    @Override
    public Program read() {
        System.out.println("Introduce el nombre del programa");
        var name = scanner.nextLine();
        System.out.println("Introduce cuántos archivos va a tener");
        var size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ahora introduce los ficheros");
        File[] files = new File[size];
        for (int i = 0; i < size; i++) {
            files[i] = textFileReader.read();
        }
        return new Program(
                name,
                files
        );
    }
}
