package com.mmalkiew.intellij.builder.view.components;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuilderConfigurationView extends JDialog {

    private JPanel rootPanel;



    private JButton saveButton;
    private JButton cancelButton;


    public BuilderConfigurationView(BuilderConfiguration model) {
        setLocationRelativeTo(model.getMemberChooser());
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

        BuilderNotationComponent notationComponent = new BuilderNotationComponent();
        notationComponent.build(rootPanel);

        BuilderCollectionInitComponent collectionInitComponent = new BuilderCollectionInitComponent();
        collectionInitComponent.build(rootPanel);

        BuilderMoreSettingsComponent moreSettingsComponent = new BuilderMoreSettingsComponent();
        moreSettingsComponent.build(rootPanel);



        saveButton = new JButton();
        saveButton.setText("Save");
        rootPanel.add(saveButton, new GridConstraints(16, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                                                      GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                                                      GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cancelButton = new JButton();
        cancelButton.setText("Cancel");
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
