package com.mmalkiew.intellij.builder.handler;

import com.intellij.lang.LanguageCodeInsightActionHandler;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiJavaFile;
import com.mmalkiew.intellij.builder.model.BuilderGeneratorModel;
import com.mmalkiew.intellij.builder.view.BuilderGeneratorView;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderGeneratorHandler implements LanguageCodeInsightActionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuilderGeneratorHandler.class);

    private final BuilderGeneratorModel model;
    private final BuilderGeneratorView view;

    public BuilderGeneratorHandler(BuilderGeneratorModel model, BuilderGeneratorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public boolean isValidFor(Editor editor, PsiFile file) {
        if (file instanceof PsiJavaFile) {
            return true;
        }

        return false;
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }

    @Override
    public void invoke(@NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
        model.updateModel(project, editor, file);
        view.showView();
    }


}
