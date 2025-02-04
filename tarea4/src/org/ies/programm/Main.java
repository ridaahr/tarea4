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
        Reader<TextFile> textFileReader = new ScannerTextFileReader(scanner);
        Reader<Program<TextFile>> programReader = new ScannerProgramTextFileReader(scanner, textFileReader);
        var program = programReader.read();
        System.out.println("Introduce un path de salida:");
        var outputPath = scanner.nextLine();
        program.execute(outputPath);
    }
}