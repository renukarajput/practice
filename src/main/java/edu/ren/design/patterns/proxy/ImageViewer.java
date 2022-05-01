package edu.ren.design.patterns.proxy;

import java.util.Objects;

public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("a.jpeg");
        Image image2 = new ImageProxy("b.jpeg");
        Image image3 = new ImageProxy("c.jpeg");
        image1.showImage();

        Image highResolutionImageNoProxy1 = new HighResolutionImage("x.jpeg");
        Image highResolutionImageNoProxy2 = new HighResolutionImage("y.jpeg");
        Image highResolutionImageNoProxy3 = new HighResolutionImage("z.jpeg");
        highResolutionImageNoProxy2.showImage();
        /* ^ all images have been loaded into memory and not all have been actually displayed
        , this is a waste of memory resources*/

    }
}
