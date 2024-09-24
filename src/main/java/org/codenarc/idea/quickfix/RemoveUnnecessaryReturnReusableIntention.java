package org.codenarc.idea.quickfix;

import com.intellij.codeInsight.intention.FileModifier;
import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInsight.intention.preview.IntentionPreviewInfo;
import com.intellij.codeInspection.util.IntentionName;
import com.intellij.modcommand.ActionContext;
import com.intellij.modcommand.ModCommandAction;
import com.intellij.modcommand.Presentation;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.plugins.groovy.intentions.base.PsiElementPredicate;
import org.jetbrains.plugins.groovy.intentions.style.RemoveUnnecessaryReturnIntention;

import java.util.function.UnaryOperator;

public class RemoveUnnecessaryReturnReusableIntention extends RemoveUnnecessaryReturnIntention implements ReusableIntention {

    @Override
    public void processIntention(@NotNull PsiElement element, @NotNull Project project, Editor editor) throws IncorrectOperationException {
        // needs to be implemented
    }

    @NotNull
    @Override
    public PsiElementPredicate getElementPredicate() {
        return super.getElementPredicate();
    }

    @Override
    public @IntentionName @NotNull String getText() {
        return "RemoveUnnecessaryReturnReusableIntention";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile psiFile) {
        return false;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile psiFile) throws IncorrectOperationException {
        // TODO document why this method is empty
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }

    @Override
    public @NotNull IntentionPreviewInfo generatePreview(@NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
        return ReusableIntention.super.generatePreview(project, editor, file);
    }

    @Override
    public @Nullable PsiElement getElementToMakeWritable(@NotNull PsiFile currentFile) {
        return ReusableIntention.super.getElementToMakeWritable(currentFile);
    }

    @Override
    public @Nullable FileModifier getFileModifierForPreview(@NotNull PsiFile target) {
        return ReusableIntention.super.getFileModifierForPreview(target);
    }

    @Override
    public @NotNull IntentionPreviewInfo generatePreview(@NotNull ActionContext context) {
        return super.generatePreview(context);
    }

    @Override
    public @NotNull ModCommandAction withPresentation(@NotNull UnaryOperator<Presentation> presentationModifier) {
        return super.withPresentation(presentationModifier);
    }

    @Override
    public @NotNull IntentionAction asIntention() {
        return super.asIntention();
    }

    @Override
    public @NotNull ModCommandAction asModCommandAction() {
        return super.asModCommandAction();
    }
}
