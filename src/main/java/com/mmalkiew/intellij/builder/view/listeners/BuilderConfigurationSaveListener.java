package com.mmalkiew.intellij.builder.view.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BuilderConfigurationSaveListener extends AbstractAction {

    private final JDialog configurationView;

    public BuilderConfigurationSaveListener(JDialog configurationView) {
        this.configurationView = configurationView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        configurationView.setVisible(false);
        configurationView.dispose();
    }
}
