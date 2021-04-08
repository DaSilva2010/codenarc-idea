package org.codenarc.idea.inspections.unnecessary;

import javax.annotation.Generated;

import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.unnecessary.UnnecessaryOverridingMethodRule;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class UnnecessaryOverridingMethodInspectionTool extends CodeNarcInspectionTool<UnnecessaryOverridingMethodRule> {

    // this code has been generated from org.codenarc.rule.unnecessary.UnnecessaryOverridingMethodRule

    public static final String GROUP = "Unnecessary";

    public UnnecessaryOverridingMethodInspectionTool() {
        super(new UnnecessaryOverridingMethodRule());
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

}