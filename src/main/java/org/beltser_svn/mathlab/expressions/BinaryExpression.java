package org.beltser_svn.mathlab.expressions;

import org.beltser_svn.mathlab.expressions.types.NumericExpression;
import org.beltser_svn.mathlab.expressions.types.VariableExpression;
import org.beltser_svn.mathlab.utils.ExpressionUtil;

import java.util.Set;

public abstract class BinaryExpression implements Expression {

    protected Expression leftSubExpression;
    protected Expression rightSubExpression;

    public BinaryExpression(Expression leftSubExpression, Expression rightSubExpression) {
        this.leftSubExpression = leftSubExpression;
        this.rightSubExpression = rightSubExpression;
    }

    public Set<Integer> variables() {
        return ExpressionUtil.extractVarsFromExpression(leftSubExpression, rightSubExpression);
    }

    public abstract double value(double... vars);

    @Override
    public String toString() {
        String leftExpression = "";
        if (!(leftSubExpression instanceof NumericExpression)
                && !(leftSubExpression instanceof VariableExpression)
                ) {
            leftExpression = "(" + leftSubExpression.toString() + ")";
        } else {
            leftExpression = leftSubExpression.toString();
        }
        String rightExpression = "";
        if (!(rightSubExpression instanceof NumericExpression)
                && !(rightSubExpression instanceof VariableExpression)
                ) {
            rightExpression = "(" + rightSubExpression.toString() + ")";
        } else {
            rightExpression = rightSubExpression.toString();
        }
        return leftExpression
                + " "
                + getOperationSymbol()
                + " "
                + rightExpression;
    }
}
