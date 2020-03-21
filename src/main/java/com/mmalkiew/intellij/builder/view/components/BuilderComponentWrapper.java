package com.mmalkiew.intellij.builder.view.components;

import javax.swing.*;

public class BuilderComponentWrapper implements BuilderComponent {

    private final BuilderOptionType optionType;
    private final BuilderComponentType componentType;
    private final JComponent component;

    public BuilderComponentWrapper(BuilderOptionType optionType, BuilderComponentType componentType, JComponent component) {
        this.optionType = optionType;
        this.componentType = componentType;
        this.component = component;
    }

    @Override
    public BuilderOptionType getOptionType() {
        return optionType;
    }

    @Override
    public BuilderComponentType getComponentType() {
        return componentType;
    }

    @Override
    public JComponent getComponent() {
        return component;
    }
}
