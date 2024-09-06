package org.codenarc.idea.inspections.basic;

import com.intellij.codeInsight.daemon.impl.quickfix.DeleteElementFix;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.psi.PsiElement;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;

import com.intellij.util.xml.highlighting.RemoveDomElementQuickFix;
import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.Violation;
import org.codenarc.rule.basic.DeadCodeRule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.codeInspection.fixes.RemoveElementQuickFix;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class DeadCodeInspectionTool extends CodeNarcInspectionTool<DeadCodeRule> {

    // this code has been generated from org.codenarc.rule.basic.DeadCodeRule

    public static final String GROUP = "Basic";

    public DeadCodeInspectionTool() {
        super(new DeadCodeRule());
        applyDefaultConfiguration(getRule());
    }

    @Override
    public String getRuleset() {
        return GROUP;
    }


    public void setApplyToClassNames(String value) {
        getRule().setApplyToClassNames(value);
    }

    public String getApplyToClassNames() {
        return getRule().getApplyToClassNames();
    }


    public void setDoNotApplyToClassNames(String value) {
        getRule().setDoNotApplyToClassNames(value);
    }

    public String getDoNotApplyToClassNames() {
        return getRule().getDoNotApplyToClassNames();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

    @Override
    protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
        return Collections.singleton(new RemoveElementQuickFix(violatingElement.getText()));
    }

}
