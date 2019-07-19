package com.design.patterns.interpreter.expression;

/**
 * Title: 非终结符表达式<br>
 * Description: AndExpression<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:55
 *
 * @author jackie.scl
 */
public class AndExpression implements AbstractExpression {
  private AbstractExpression city = null;
  private AbstractExpression person = null;

  public AndExpression(AbstractExpression city, AbstractExpression person) {
    this.city = city;
    this.person = person;
  }

  @Override
  public boolean interpret(String info) {
    String s[] = info.split("的");
    return city.interpret(s[0]) && person.interpret(s[1]);
  }
}
