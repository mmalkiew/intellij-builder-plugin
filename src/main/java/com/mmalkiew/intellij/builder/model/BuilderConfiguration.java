package com.mmalkiew.intellij.builder.model;


import com.intellij.ide.util.PropertiesComponent;
import com.mmalkiew.intellij.builder.view.components.BuilderComponentType;

import java.awt.*;

public class BuilderConfiguration {

    private final PropertiesComponent propertiesComponent;

    private Component memberChooser;
    private boolean visible;

    public BuilderConfiguration() {
        this.propertiesComponent = PropertiesComponent.getInstance();
    }

    public PropertiesComponent getPropertiesComponent() {
        return propertiesComponent;
    }

    public boolean isTrueValue(BuilderComponentType componentType) {
        return propertiesComponent.isTrueValue(componentType.getKey());
    }

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
