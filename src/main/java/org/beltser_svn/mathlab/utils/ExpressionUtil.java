package org.beltser_svn.mathlab.utils;

import org.beltser_svn.mathlab.expressions.Expression;

import java.util.HashSet;
import java.util.Set;

public class ExpressionUtil {
    public static Set<Integer> extractVarsFromExpression(Expression... expression) {
        Set<Integer> vars = new HashSet<>();
        for (Expression curExpression : expression) {
            if (curExpression != null && curExpression.variables() != null) {
                for (Integer varNumber : curExpression.variables()) {
                    if (!vars.contains(varNumber)) {
                        vars.add(varNumber);
                    }
                }
            }
        }
        return vars;
    }
}
