package com.patterns.proxy.virtualproxy;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
    private final URL imageURL;
    private final String coverName;

    public ImageIcon(URL imageURL, String coverName) {
        this.imageURL = imageURL;
        this.coverName = coverName;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {

    }
}