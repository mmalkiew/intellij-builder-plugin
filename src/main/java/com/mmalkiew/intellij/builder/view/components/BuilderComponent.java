package com.mmalkiew.intellij.builder.view.components;

import javax.swing.*;

public interface BuilderComponent {

    BuilderOptionType getOptionType();

    BuilderComponentType getComponentType();

    JComponent getComponent();
}
