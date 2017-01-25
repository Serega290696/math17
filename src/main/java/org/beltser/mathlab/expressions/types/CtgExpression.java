package org.beltser.mathlab.expressions.types;

import org.beltser.mathlab.expressions.Expression;
import org.beltser.mathlab.expressions.UnaryExpression;

import java.util.Map;

public class CtgExpression extends UnaryExpression {

    public CtgExpression(Expression subExpression) {
        super(subExpression);
    }

    @Override
    public double value(double... vars) {
        return 1d / Math.tan(super.subExpression.value(vars));
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new CtgExpression(super.subExpression.replaceVariableBy(vars));
    }

    @Override
    public LexemType getLexemType() {
        return LexemType.CTG;
    }
}
