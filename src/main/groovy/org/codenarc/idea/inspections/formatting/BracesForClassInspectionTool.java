package org.codenarc.idea.inspections.formatting;

import javax.annotation.Generated;

import org.codenarc.idea.CodeNarcInspectionTool;
import org.codenarc.rule.formatting.BracesForClassRule;

@Generated("You can customize this class at the end of the file or remove this annotation to skip regeneration completely")
public class BracesForClassInspectionTool extends CodeNarcInspectionTool<BracesForClassRule> {

    // this code has been generated from org.codenarc.rule.formatting.BracesForClassRule

    public static final String GROUP = "Formatting";

    public BracesForClassInspectionTool() {
        super(new BracesForClassRule());
    }

    @Override
    public String getRuleset() {
        return GROUP;
    }


    public void setSameLine(boolean value) {
        getRule().setSameLine(value);
    }

    public boolean getSameLine() {
        return getRule().getSameLine();
    }

    // custom code can be written after this line and it will be preserved during the regeneration

}