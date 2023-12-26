package ua.edu.ucu;
import ua.edu.ucu.Task3.ProxyImage;
import ua.edu.ucu.Task3.MyImage;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("my_image.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}