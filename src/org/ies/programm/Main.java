package org.ies.programm;

import org.ies.programm.components.Reader;
import org.ies.programm.components.scanner.*;
import org.ies.programm.model.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Reader<TextFile> textReader = new ScannerTextFileReader(scanner);
        Reader<ImageFile> imageReader = new ScannerImageFileReader(scanner);
        Reader<AudioFile> audioReader = new ScannerAudioFileReader(scanner);
        Reader<File> fileReader = new ScannerFileReader(scanner, textReader, imageReader, audioReader);
        Reader<Program> program = new ScannerProgramReader(scanner, fileReader);
        program.read();

    }
}