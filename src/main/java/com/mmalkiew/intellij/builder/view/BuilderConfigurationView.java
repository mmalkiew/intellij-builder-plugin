package com.mmalkiew.intellij.builder.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.mmalkiew.intellij.builder.view.components.BuilderCollectionInitComponent;
import com.mmalkiew.intellij.builder.model.BuilderConfiguration;
import com.mmalkiew.intellij.builder.view.components.BuilderMoreSettingsComponent;
import com.mmalkiew.intellij.builder.view.components.BuilderNotationComponent;
import com.mmalkiew.intellij.builder.view.listeners.BuilderConfigurationCloseListener;
import com.mmalkiew.intellij.builder.view.listeners.BuilderConfigurationSaveListener;

import javax.swing.*;
import java.awt.*;

public class BuilderConfigurationView extends JDialog {

    private JPanel rootPanel;
    private JButton saveButton;
    private JButton cancelButton;


    public BuilderConfigurationView(BuilderConfiguration configuration) {
        setLocationRelativeTo(configuration.getMemberChooser());
        // create a panel
        setPreferredSize(new Dimension(410, 310));
        setResizable( false );
        setModal(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Builder Configuration");
//        JButton bClose = new JButton("Close");
//        bClose.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent evt) {
//                setVisible(false);
//            }
//        });
//        add(bClose, BorderLayout.SOUTH);
//        pack();
//        setVisible(true);
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(18, 9, new Insets(0, 10, 10, 10), 0, 0));

        BuilderNotationComponent notationComponent = new BuilderNotationComponent(configuration);
        notationComponent.build(rootPanel);

        BuilderCollectionInitComponent collectionInitComponent = new BuilderCollectionInitComponent();
        collectionInitComponent.build(rootPanel);

        BuilderMoreSettingsComponent moreSettingsComponent = new BuilderMoreSettingsComponent();
        moreSettingsComponent.build(rootPanel);



        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.addActionListener(new BuilderConfigurationSaveListener(this));
        rootPanel.add(saveButton, new GridConstraints(16, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                                      GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new BuilderConfigurationCloseListener(this));
        rootPanel.add(cancelButton, new GridConstraints(16, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                        GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                                        GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer14 = new Spacer();
        rootPanel.add(spacer14, new GridConstraints(16, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                                                    GridConstraints.SIZEPOLICY_WANT_GROW, 1, new Dimension(-1, 15), null, null, 1, false));

        add(rootPanel);
        pack();
        setVisible(true);
    }

}
