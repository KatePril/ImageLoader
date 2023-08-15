package app;

import app.formats.Format;

public class Image {
    private String name;
    private Format format;

    public Image(String name, Format format) {
        this.name = name;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return name + "." + format.getName();
    }
}
