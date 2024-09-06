package org.codenarc.idea.inspections.formatting;

import com.intellij.codeInsight.daemon.impl.quickfix.DeleteElementFix;
import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.psi.PsiElement;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.Violation;
import org.codenarc.rule.formatting.BlockStartsWithBlankLineRule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.codeInspection.fixes.RemoveElementQuickFix;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class BlockStartsWithBlankLineInspectionTool extends CodeNarcInspectionTool<BlockStartsWithBlankLineRule> {

    // this code has been generated from org.codenarc.rule.formatting.BlockStartsWithBlankLineRule

    public static final String GROUP = "Formatting";

    public BlockStartsWithBlankLineInspectionTool() {
        super(new BlockStartsWithBlankLineRule());
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
