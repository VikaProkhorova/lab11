package ua.edu.ucu.Task3;

import lombok.Getter;

public class ProxyImage implements MyImage {
    @Getter
    private RealImage image;
    private final String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null)
            image = new RealImage(fileName);
        image.display();
    }
}
