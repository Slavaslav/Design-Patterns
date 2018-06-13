package com.patterns.proxy.virtual_proxy;

import java.awt.*;
import java.net.URL;
import java.util.Objects;

public class ImageProxy implements Icon {
    private final URL imageURL;
    private ImageIcon imageIcon;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (Objects.nonNull(imageIcon)) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (Objects.nonNull(imageIcon)) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (Objects.nonNull(imageIcon)) {
            imageIcon.paintIcon(component, graphics, x, y);
        } else {
            graphics.drawString("Loading CD cover, please wait...", x, y);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    imageIcon = new ImageIcon(imageURL, "CD Cover");
                    component.repaint();
                });
                retrievalThread.start();
            }
        }
    }
}