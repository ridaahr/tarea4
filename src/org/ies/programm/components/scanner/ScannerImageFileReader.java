package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.ImageFile;

import java.util.Scanner;

public class ScannerImageFileReader implements Reader<ImageFile> {
    private final Scanner scanner;

    public ScannerImageFileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public ImageFile read() {
        System.out.println("Datos del archivo de imágen:");
        System.out.println("Tamaño del archivo:");
        var size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Dónde lo vas a guardar?");
        var path = scanner.nextLine();
        System.out.println("Introduce la altura de la imágen");
        var height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la anchura de la imágen");
        var width = scanner.nextInt();
        scanner.nextLine();
        return new ImageFile(
                size,
                path,
                height,
                width
        );
    }
}
