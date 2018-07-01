package com.patterns.proxy.virtualproxy;

import com.sun.webkit.network.URLs;

import java.awt.*;
import java.net.MalformedURLException;

public class ImageProxyTestDrive {
    private final Frame frame = new Frame();
    private ImageComponent imageComponent;

    public ImageProxyTestDrive() throws MalformedURLException {
        Icon icon = new ImageProxy(URLs.newURL("imageURL"));
        imageComponent = new ImageComponent(icon);
        frame.add(imageComponent);
    }

    public static void main(String[] args) throws MalformedURLException {
        new ImageProxyTestDrive();
    }
}