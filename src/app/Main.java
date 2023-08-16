package app;

public class Main {
    public static void main(String[] args) {

        Image imageOne = Adapter.createImage("flowers", "png");
        getOutput(imageOne);

        Image imageTwo = Adapter.createImage("mountains", "jpg");
        getOutput(imageTwo);

        Image imageThree = Adapter.createImage("sky", "jpeg");
    }

    public static void getOutput(Image image) {
        String output = "Format of the image: %s%nName of the image: %s%n%n";
        System.out.printf(output, image.getFormat().getName(), image);
    }
}
