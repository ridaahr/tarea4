package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.AudioFile;

import java.util.Scanner;

public class ScannerAudioFileReader implements Reader<AudioFile> {
    private final Scanner scanner;

    public ScannerAudioFileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public AudioFile read() {
        System.out.println("Datos del archivo de texto:");
        System.out.println("Tamaño del archivo:");
        var size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Dónde lo vas a guardar?");
        var path = scanner.nextLine();
        System.out.println("Introduce la duración del audio");
        var duration = scanner.nextDouble();
        scanner.nextLine();
        return new AudioFile(
                size,
                path,
                duration
        );
    }
}
