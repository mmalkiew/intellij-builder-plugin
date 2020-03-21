package com.mmalkiew.intellij.builder.view.components;

import javax.swing.*;

public class BuilderConfigurationButton extends JButton {

    private static final String TITLE = "Configuration";

    private final BuilderConfigurationButtonListener listener;

    public BuilderConfigurationButton(BuilderConfiguration configuration) {
        this.listener = new BuilderConfigurationButtonListener(configuration);
        setText(TITLE);

        addActionListener(this.listener);
    }

    public BuilderConfigurationButtonListener getListener() {
        return this.listener;
    }

}
