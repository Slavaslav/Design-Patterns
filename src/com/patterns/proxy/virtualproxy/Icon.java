package com.patterns.proxy.virtualproxy;

import java.awt.*;

public interface Icon {
    int getIconWidth();

    int getIconHeight();

    void paintIcon(Component component, Graphics graphics, int x, int y);
}