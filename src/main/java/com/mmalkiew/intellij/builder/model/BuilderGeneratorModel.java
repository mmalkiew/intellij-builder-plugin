package com.mmalkiew.intellij.builder.model;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

public class BuilderGeneratorModel {

    private Project project;
    private Editor editor;
    private PsiFile file;

    public BuilderGeneratorModel() {
        /**
         * should be emptty
         */
    }

    public void updateModel(Project project, Editor editor, PsiFile file) {
        this.project = project;
        this.editor = editor;
        this.file = file;
    }

    public Project getProject() {
        return project;
    }

    public Editor getEditor() {
        return editor;
    }

    public PsiFile getFile() {
        return file;
    }
}
