package edu.ren.design.patterns.proxy;

public class ImageProxy implements Image {
    String imageFilePath;
    Image proxyImage;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void showImage() {
        proxyImage = new HighResolutionImage(imageFilePath);
        proxyImage.showImage();
    }
}
