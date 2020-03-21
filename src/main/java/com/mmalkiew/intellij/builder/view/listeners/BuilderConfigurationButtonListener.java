package com.mmalkiew.intellij.builder.view.listeners;

import com.mmalkiew.intellij.builder.view.BuilderConfigurationView;
import com.mmalkiew.intellij.builder.model.BuilderConfiguration;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class BuilderConfigurationButtonListener extends AbstractAction {

    private final BuilderConfiguration configuration;
    private BuilderConfigurationView view;

    public BuilderConfigurationButtonListener(BuilderConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view = new BuilderConfigurationView(configuration);
    }

    public BuilderConfigurationView getView() {
        return view;
    }
}
