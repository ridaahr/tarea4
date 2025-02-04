package org.ies.programm.model;

import java.util.Objects;

public class TextFile extends File{
    private String text;

    public TextFile(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open() {
        System.out.println("Archivo de texto. Tamaño: " + getSize() + ". Directorio: " + getPath() + ". Texto: " + text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile text1 = (TextFile) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
