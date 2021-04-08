package org.codenarc.idea.inspections.exceptions;

import javax.annotation.Generated;

import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.exceptions.CatchRuntimeExceptionRule;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class CatchRuntimeExceptionInspectionTool extends CodeNarcInspectionTool<CatchRuntimeExceptionRule> {

    // this code has been generated from org.codenarc.rule.exceptions.CatchRuntimeExceptionRule

    public static final String GROUP = "Exceptions";

    public CatchRuntimeExceptionInspectionTool() {
        super(new CatchRuntimeExceptionRule());
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