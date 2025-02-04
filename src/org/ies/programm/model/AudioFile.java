package org.ies.programm.model;

import java.util.Objects;

public class AudioFile extends File{
    private double duration;

    public AudioFile(int size, String path, double duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {
        System.out.println("Archivo de audio. Tamaño: " + getSize() + ". Directorio: " + getPath() + ". Duración: " + duration);
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudioFile audioFile = (AudioFile) o;
        return Double.compare(duration, audioFile.duration) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "duration=" + duration +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
