package app;

import app.formats.JPG;
import app.formats.PNG;

public class Main {
    public static void main(String[] args) {
        PNG png = new PNG();
        JPG jpg = new JPG();

        Image image_one = new Image("flowers", png);
        Adapter.getOutput(image_one);

        Image image_two = new Image("mountains", jpg);
        Adapter.getOutput(image_two);
    }
}
