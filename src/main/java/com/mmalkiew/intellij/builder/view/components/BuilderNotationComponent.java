package com.mmalkiew.intellij.builder.view.components;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.Spacer;
import com.mmalkiew.intellij.builder.model.BuilderConfiguration;
import com.mmalkiew.intellij.builder.view.listeners.BuilderConfigurationItemListener;

import javax.swing.*;
import java.awt.*;

public class BuilderNotationComponent  {

    private static final String PANEL_TITLE = "Builder notation  ";

    private final BuilderConfiguration configuration;

    private JRadioButton useWithNotationRadioButton;
    private JRadioButton useSetNotationRadioButton;
    private JRadioButton useCustomNotationRadioButton;
    private JTextField customNotationTextField;

    public BuilderNotationComponent(BuilderConfiguration configuration) {
        this.configuration = configuration;
    }

    public void build(final JPanel rootPanel) {

        ButtonGroup buttonGroup = new ButtonGroup();

        final JLabel label1 = new JLabel();
        label1.setText(PANEL_TITLE);
        rootPanel.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                  GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                                                  false));
        final Spacer spacer1 = new Spacer();
        rootPanel.add(spacer1, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JSeparator separator1 = new JSeparator();
        rootPanel.add(separator1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator2 = new JSeparator();
        rootPanel.add(separator2, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator3 = new JSeparator();
        rootPanel.add(separator3, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator4 = new JSeparator();
        rootPanel.add(separator4, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator5 = new JSeparator();
        rootPanel.add(separator5, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator6 = new JSeparator();
        rootPanel.add(separator6, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator7 = new JSeparator();
        rootPanel.add(separator7, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator8 = new JSeparator();
        rootPanel.add(separator8, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        rootPanel.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 3), null, null, 0, false));
        useWithNotationRadioButton = new JRadioButton();
        useWithNotationRadioButton.setText("use with notation");
        useWithNotationRadioButton.setSelected(configuration.isTrueValue(BuilderComponentType.NOTATION_WITH));
        useWithNotationRadioButton.addItemListener(createItemListener(configuration,
                                                                      BuilderComponentType.NOTATION_WITH,
                                                                      useWithNotationRadioButton));

        buttonGroup.add(useWithNotationRadioButton);
        rootPanel.add(useWithNotationRadioButton, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                                      GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                             GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                      GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        useSetNotationRadioButton = new JRadioButton();
        useSetNotationRadioButton.setText("use set notation");
        useSetNotationRadioButton.setSelected(configuration.isTrueValue(BuilderComponentType.NOTATION_SET));
        useSetNotationRadioButton.addItemListener(createItemListener(configuration,
                                                                     BuilderComponentType.NOTATION_SET,
                                                                     useSetNotationRadioButton));
        buttonGroup.add(useSetNotationRadioButton);
        rootPanel.add(useSetNotationRadioButton, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                                     GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                              GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                     GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        useCustomNotationRadioButton = new JRadioButton();
        useCustomNotationRadioButton.setText("use custom notation");
        useSetNotationRadioButton.setSelected(configuration.isTrueValue(BuilderComponentType.NOTATION_CUSTOM));
        useSetNotationRadioButton.addItemListener(createItemListener(configuration,
                                                                     BuilderComponentType.NOTATION_CUSTOM,
                                                                     useSetNotationRadioButton));
        buttonGroup.add(useCustomNotationRadioButton);
        rootPanel.add(useCustomNotationRadioButton, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                                        GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        rootPanel.add(spacer3, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        rootPanel.add(spacer4, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        rootPanel.add(spacer5, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Template");
        rootPanel.add(label2, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                                                  GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                                                  false));
        final Spacer spacer6 = new Spacer();
        rootPanel.add(spacer6, new GridConstraints(4, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, new Dimension(10, -1), null, null, 0, false));
        customNotationTextField =  new JTextField();
        rootPanel.add(customNotationTextField, new GridConstraints(4, 6, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                                                                   GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null,
                                                                   null, 0, false));
        final Spacer spacer7 = new Spacer();
        rootPanel.add(spacer7, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 5), null, null, 0, false));
    }

    private BuilderConfigurationItemListener createItemListener(BuilderConfiguration configuration, BuilderComponentType componentType, JComponent component) {
        return new BuilderConfigurationItemListener(configuration.getPropertiesComponent(), componentType, component);
    }

}
