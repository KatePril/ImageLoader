package app;

import app.formats.Format;

public class Image {
    private String name;
    private Format format;

    public Image(String name, Format format) {
        this.name = name;
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return name + "." + format.getName();
    }
}
