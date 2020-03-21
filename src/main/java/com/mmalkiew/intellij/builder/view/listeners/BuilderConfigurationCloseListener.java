package com.mmalkiew.intellij.builder.view.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BuilderConfigurationCloseListener extends AbstractAction {

    private final JDialog configurationView;

    public BuilderConfigurationCloseListener(JDialog configurationView) {
        this.configurationView = configurationView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        configurationView.setVisible(false);
        configurationView.dispose();
    }
}
