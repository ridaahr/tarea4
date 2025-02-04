package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.TextFile;

import java.util.Scanner;

public class ScannerTextFileReader implements Reader<TextFile> {
    private final Scanner scanner;

    public ScannerTextFileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public TextFile read() {
        System.out.println("Datos del archivo de texto:");
        System.out.println("Tamaño del archivo:");
        var size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Dónde lo vas a guardar?");
        var path = scanner.nextLine();
        System.out.println("Introduce el texto que va a contener:");
        var text = scanner.nextLine();
        return new TextFile(
                size,
                path,
                text
        );
    }
}
