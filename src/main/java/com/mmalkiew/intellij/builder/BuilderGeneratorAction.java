package com.mmalkiew.intellij.builder;

import com.intellij.codeInsight.CodeInsightActionHandler;
import com.intellij.codeInsight.actions.BaseCodeInsightAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.mmalkiew.intellij.builder.handler.BuilderGeneratorHandler;
import com.mmalkiew.intellij.builder.model.BuilderGeneratorModel;
import com.mmalkiew.intellij.builder.view.BuilderGeneratorView;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderGeneratorAction extends BaseCodeInsightAction {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderGeneratorAction.class);

    private final BuilderGeneratorHandler actionHandler;

    public BuilderGeneratorAction() {
        BuilderGeneratorModel model = new BuilderGeneratorModel();
        BuilderGeneratorView view = new BuilderGeneratorView(model);

        this.actionHandler = new BuilderGeneratorHandler(model, view);
    }

    @NotNull
    @Override
    protected CodeInsightActionHandler getHandler() {
        LOGGER.info("test");
        return actionHandler;
    }

    @Override
    protected boolean isValidForFile(@NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
        return actionHandler.isValidFor(editor, file);
    }
}
