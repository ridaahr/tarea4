package org.ies.programm.components;


import org.ies.programm.model.File;
import org.ies.programm.model.TextFile;

public interface ProgramReader<T extends File> {
    TextFile read();
}
