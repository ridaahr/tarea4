package org.ies.programm.model;

public class AudioFile extends File{
    private double duration;

    public AudioFile(int size, String path, double duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {

    }
}
