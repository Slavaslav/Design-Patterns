package com.patterns.proxy.virtual_proxy;

import java.awt.*;

public class ImageComponent extends Component {
    private final Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }
}