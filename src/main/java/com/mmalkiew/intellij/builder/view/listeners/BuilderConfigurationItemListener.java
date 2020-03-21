package com.mmalkiew.intellij.builder.view.listeners;

import com.intellij.ide.util.PropertiesComponent;
import com.mmalkiew.intellij.builder.view.components.BuilderComponentType;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BuilderConfigurationItemListener implements ItemListener {

    private final PropertiesComponent propertiesComponent;
    private final BuilderComponentType componentType;
    private final JComponent component;

    public BuilderConfigurationItemListener(PropertiesComponent propertiesComponent,
                                            BuilderComponentType componentType,
                                            JComponent component) {
        this.propertiesComponent = propertiesComponent;
        this.componentType = componentType;
        this.component = component;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        propertiesComponent.setValue(componentType.getKey(), getComponentValue(component));
    }

    private String getComponentValue(JComponent component) {
        if (component instanceof JRadioButton) {
            JRadioButton radioButton = (JRadioButton) component;
            return Boolean.toString(radioButton.isSelected());
        }

        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            return textField.getText();
        }

        return "";
    }
}
