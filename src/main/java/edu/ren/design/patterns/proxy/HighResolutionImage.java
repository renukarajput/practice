package edu.ren.design.patterns.proxy;

public class HighResolutionImage implements Image{
    public HighResolutionImage(String imageFilePath) {
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {
        System.out.println("Heavy operation being executed - "+imageFilePath);
    }

    @Override
    public void showImage() {

    }
}
