package org.beltser_svn.mathlab.expressions.types;

import org.beltser_svn.mathlab.expressions.Expression;
import org.beltser_svn.mathlab.expressions.UnaryExpression;

import java.util.Map;

public class SqrExpression extends UnaryExpression {

    public SqrExpression(Expression subExpression) {
        super(subExpression);
    }

    @Override
    public double value(double... vars) {
        return Math.sqrt(super.subExpression.value(vars));
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new SqrExpression(super.subExpression.replaceVariableBy(vars));
    }

    @Override
    public LexemType getLexemType() {
        return LexemType.SQR;
    }
}
