package org.beltser_svn.mathlab.expressions.types;

import org.beltser_svn.mathlab.expressions.Expression;
import org.beltser_svn.mathlab.expressions.UnaryExpression;

import java.util.Map;

public class SinExpression extends UnaryExpression {

    public SinExpression(Expression subExpression) {
        super(subExpression);
    }

    @Override
    public double value(double... vars) {
        return Math.sin(super.subExpression.value(vars));
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new SinExpression(super.subExpression.replaceVariableBy(vars));
    }

    @Override
    public LexemType getLexemType() {
        return LexemType.SIN;
    }
}
