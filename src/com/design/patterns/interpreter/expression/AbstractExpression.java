package com.design.patterns.interpreter.expression;

/**
 * Title: 抽象表达式<br>
 * Description: AbstractExpression<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:50
 *
 * @author jackie.scl
 */
public interface AbstractExpression {
  public boolean interpret(String info);
}
