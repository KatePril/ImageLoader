package app;
import app.formats.JPG;
import app.formats.PNG;

public class Adapter {
    public static Image createImage(String name, String format) {
        try {
            switch (format) {
                case "png" -> {
                    return createPNGImage(name);
                }
                case "jpg" -> {
                    return createJPGImage(name);
                }
                default -> throw new IllegalStateException("Unexpected value: " + format);
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Image createPNGImage(String name) {
        PNG png = new PNG();
        return new Image(name, png);
    }

    private static Image createJPGImage(String name) {
        JPG jpg = new JPG();
        return new Image(name, jpg);
    }
}
