package org.beltser.mathlab.expressions.types;

import org.beltser.mathlab.expressions.BinaryExpression;
import org.beltser.mathlab.expressions.Expression;

import java.util.Map;

public class PowerExpression extends BinaryExpression {

    public PowerExpression(Expression leftSubExpression, Expression rightSubExpression) {
        super(leftSubExpression, rightSubExpression);
    }

    @Override
    public double value(double... vars) {
        return Math.pow(super.leftSubExpression.value(vars), super.rightSubExpression.value(vars));
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new PowerExpression(
                leftSubExpression.replaceVariableBy(vars),
                rightSubExpression.replaceVariableBy(vars));
    }
    @Override
    public LexemType getLexemType() {
        return LexemType.POWER;
    }

}
