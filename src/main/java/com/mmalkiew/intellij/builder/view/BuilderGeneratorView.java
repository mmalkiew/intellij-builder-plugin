package com.mmalkiew.intellij.builder.view;

import com.intellij.codeInsight.generation.PsiFieldMember;
import com.intellij.ide.util.MemberChooser;
import com.intellij.openapi.application.ApplicationManager;
import com.mmalkiew.intellij.builder.model.BuilderGeneratorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

public class BuilderGeneratorView implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderGeneratorView.class);

    private static final String TITLE = "Builder options";

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
        final JCheckBox[] optionCheckBoxes = new JCheckBox[0];

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
