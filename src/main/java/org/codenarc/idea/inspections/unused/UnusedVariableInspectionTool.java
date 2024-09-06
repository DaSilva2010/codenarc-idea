package org.codenarc.idea.inspections.unused;

import com.intellij.codeInsight.daemon.impl.quickfix.DeleteElementFix;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.psi.PsiElement;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.Violation;
import org.codenarc.rule.unused.UnusedVariableRule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.codeInspection.fixes.RemoveElementQuickFix;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class UnusedVariableInspectionTool extends CodeNarcInspectionTool<UnusedVariableRule> {

    // this code has been generated from org.codenarc.rule.unused.UnusedVariableRule

    public static final String GROUP = "Unused";

    public UnusedVariableInspectionTool() {
        super(new UnusedVariableRule());
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


    public void setIgnoreVariableNames(String value) {
        getRule().setIgnoreVariableNames(value);
    }

    public String getIgnoreVariableNames() {
        return getRule().getIgnoreVariableNames();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

    @Override
    protected @NotNull Collection<LocalQuickFix> getQuickFixesFor(Violation violation, PsiElement violatingElement) {
        return Collections.singleton(new RemoveElementQuickFix(violatingElement.getText()));
    }

}
