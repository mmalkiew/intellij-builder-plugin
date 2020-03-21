package com.mmalkiew.intellij.builder.view.components;

import javax.swing.*;
import java.awt.*;

public class BuilderConfiguration {

    private Component memberChooser;
    private boolean visible;

    public Component getMemberChooser() {
        return memberChooser;
    }

    public void setMemberChooser(Component memberChooser) {
        this.memberChooser = memberChooser;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
