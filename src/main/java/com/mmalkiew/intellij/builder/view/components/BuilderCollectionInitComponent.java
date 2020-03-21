package com.mmalkiew.intellij.builder.view.components;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class BuilderCollectionInitComponent {

    private JCheckBox activateCheckBox;
    private JComboBox comboBox2;

    public BuilderCollectionInitComponent() {
    }

    public void build(final JPanel rootPanel) {
        final JLabel label3 = new JLabel();
        label3.setText("Collection initlzr");
        rootPanel.add(label3, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                  GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                                                  false));
        final JSeparator separator9 = new JSeparator();
        rootPanel.add(separator9, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                      null, null, 0, false));
        final JSeparator separator10 = new JSeparator();
        rootPanel.add(separator10, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator11 = new JSeparator();
        rootPanel.add(separator11, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator12 = new JSeparator();
        rootPanel.add(separator12, new GridConstraints(6, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator13 = new JSeparator();
        rootPanel.add(separator13, new GridConstraints(6, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator14 = new JSeparator();
        rootPanel.add(separator14, new GridConstraints(6, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator15 = new JSeparator();
        rootPanel.add(separator15, new GridConstraints(6, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        final JSeparator separator16 = new JSeparator();
        rootPanel.add(separator16, new GridConstraints(6, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                       GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null,
                                                       null, null, 0, false));
        activateCheckBox = new JCheckBox();
        activateCheckBox.setText("Activate");
        rootPanel.add(activateCheckBox, new GridConstraints(7, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                                                            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                                            GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        rootPanel.add(spacer8, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Template");
        rootPanel.add(label4, new GridConstraints(7, 4, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE,
                                                  GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
                                                  false));
        final Spacer spacer9 = new Spacer();
        rootPanel.add(spacer9, new GridConstraints(7, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                                   GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        comboBox2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("bbbb");
        defaultComboBoxModel2.addElement("bbb");
        defaultComboBoxModel2.addElement("bbb");
        comboBox2.setModel(defaultComboBoxModel2);
        rootPanel.add(comboBox2, new GridConstraints(7, 6, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                                                     GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null,
                                                     null, 0, false));
        final Spacer spacer10 = new Spacer();
        rootPanel.add(spacer10, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1,
                                                    GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 5), null, null, 0, false));
    }
}
