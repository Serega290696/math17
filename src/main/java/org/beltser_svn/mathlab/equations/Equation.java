package org.beltser_svn.mathlab.equations;

import org.beltser_svn.mathlab.expressions.Expression;
import org.beltser_svn.mathlab.expressions.types.NumericExpression;

import java.util.Map;
import java.util.Set;

public interface Equation {

    Map<Integer, NumericExpression> solve();

    Equation simplify();

    Set<Integer> variables();


    void setLeftExpression(Expression leftExpression);

    void setRightExpression(Expression rightExpression);

    Expression getLeftExpression();

    Expression getRightExpression();

    Equation replaceVar(Map<Integer, NumericExpression> vars);

}
