package org.ies.programm.components.scanner;

import org.ies.programm.components.Reader;
import org.ies.programm.model.AudioFile;
import org.ies.programm.model.File;
import org.ies.programm.model.ImageFile;
import org.ies.programm.model.TextFile;

import java.util.Scanner;

public class ScannerFileReader implements Reader<File> {
    private final Scanner scanner;
    private final Reader<TextFile> textReader;
    private final Reader<ImageFile> imageReader;
    private final Reader<AudioFile> audioReader;

    public ScannerFileReader(Scanner scanner, Reader<TextFile> textReader, Reader<ImageFile> imageReader, Reader<AudioFile> audioReader) {
        this.scanner = scanner;
        this.textReader = textReader;
        this.imageReader = imageReader;
        this.audioReader = audioReader;
    }

    @Override
    public File read() {
        int option;
        do {
            System.out.println("Elige el tipo de archivo:");
            System.out.println("Texto");
            System.out.println("Imágen");
            System.out.println("Audio");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option != 1 && option != 2 && option != 3);
        if (option == 1) {
            return textReader.read();
        } else if (option == 2) {
            return imageReader.read();
        } else {
            return audioReader.read();
        }
    }
}
