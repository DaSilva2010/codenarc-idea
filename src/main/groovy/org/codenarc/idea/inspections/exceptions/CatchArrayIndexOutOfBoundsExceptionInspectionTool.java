package org.codenarc.idea.inspections.exceptions;

import javax.annotation.Generated;

import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.exceptions.CatchArrayIndexOutOfBoundsExceptionRule;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class CatchArrayIndexOutOfBoundsExceptionInspectionTool extends CodeNarcInspectionTool<CatchArrayIndexOutOfBoundsExceptionRule> {

    // this code has been generated from org.codenarc.rule.exceptions.CatchArrayIndexOutOfBoundsExceptionRule

    public static final String GROUP = "Exceptions";

    public CatchArrayIndexOutOfBoundsExceptionInspectionTool() {
        super(new CatchArrayIndexOutOfBoundsExceptionRule());
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