package com.mmalkiew.intellij.builder.view;

import com.intellij.codeInsight.generation.PsiFieldMember;
import com.intellij.ide.util.MemberChooser;
import com.intellij.openapi.application.ApplicationManager;
import com.mmalkiew.intellij.builder.model.BuilderGeneratorModel;
import com.mmalkiew.intellij.builder.model.BuilderConfiguration;
import com.mmalkiew.intellij.builder.view.components.BuilderConfigurationButton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class BuilderGeneratorView implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderGeneratorView.class);

    private static final String TITLE = "Select Fields To Generate Builder";

    private final BuilderGeneratorModel model;

    public BuilderGeneratorView(BuilderGeneratorModel model) {
        this.model = model;
    }

    public void showView() {
        ApplicationManager.getApplication()
                          .runWriteAction(this);
    }

    @Override
    public void run() {
        BuilderConfiguration configuration = new BuilderConfiguration();
        JComponent[] optionCheckBoxes = new JComponent[1];
        BuilderConfigurationButton configurationButton = new BuilderConfigurationButton(configuration);
        optionCheckBoxes[0] = configurationButton;

        final PsiFieldMember[] memberArray = new PsiFieldMember[0];

        final MemberChooser<PsiFieldMember> chooser = new MemberChooser<PsiFieldMember>(memberArray,
                                                                                        false, // allowEmptySelection
                                                                                        true,  // allowMultiSelection
                                                                                        model.getProject(), null, optionCheckBoxes);

        chooser.setTitle(TITLE);
        chooser.selectElements(memberArray);
        if (chooser.showAndGet()) {
            chooser.getSelectedElements();
        }
    }
}
