package com.patterns.proxy.virtualproxy;

import java.awt.*;

public class ImageComponent extends Component {
    private final Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }
}