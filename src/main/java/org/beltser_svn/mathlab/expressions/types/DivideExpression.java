package org.beltser_svn.mathlab.expressions.types;

import org.beltser_svn.mathlab.expressions.BinaryExpression;
import org.beltser_svn.mathlab.expressions.Expression;

import java.util.Map;

public class DivideExpression extends BinaryExpression {

    public DivideExpression(Expression leftSubExpression, Expression rightSubExpression) {
        super(leftSubExpression, rightSubExpression);
    }

    @Override
    public double value(double... vars) {
        return leftSubExpression.value(vars) / rightSubExpression.value(vars);
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new DivideExpression(
                leftSubExpression.replaceVariableBy(vars),
                rightSubExpression.replaceVariableBy(vars));
    }

    @Override
    public LexemType getLexemType() {
        return LexemType.DIVIDE;
    }

}
