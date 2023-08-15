package app;

public class Adapter {
    public static void getOutput(Image image) {
        String output = "Format of the image: %s%nName of the image: %s%n%n";
        System.out.printf(output, image.getFormat().getName(), image);
    }
}
