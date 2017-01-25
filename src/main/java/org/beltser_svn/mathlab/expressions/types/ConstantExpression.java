package org.beltser_svn.mathlab.expressions.types;

import org.beltser_svn.mathlab.expressions.Expression;
import org.beltser_svn.mathlab.expressions.NullaryExpression;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConstantExpression extends NullaryExpression {

    public Double value;

    public ConstantExpression(double value) {
        super(value);
    }

    public Set<Integer> variables() {
        return new HashSet<>();
    }

    @Override
    public double value(double... vars) {
        return value;
    }

    @Override
    public Expression replaceVariableBy(Map<Integer, NumericExpression> vars) {
        return new ConstantExpression(value);
    }

    @Override
    public double value() {
        return value;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public void setValue(Number number) {
        value = number.doubleValue();
    }

    @Override
    public LexemType getLexemType() {
        return LexemType.CONSTANT;
    }

}
