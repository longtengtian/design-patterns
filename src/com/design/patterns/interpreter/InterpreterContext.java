package com.design.patterns.interpreter;

import com.design.patterns.interpreter.expression.AbstractExpression;
import com.design.patterns.interpreter.expression.AndExpression;
import com.design.patterns.interpreter.expression.TerminalExpression;

/**
 * Title: 解释器环境<br>
 * Description: InterpreterContext<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:58
 *
 * @author jackie.scl
 */
public class InterpreterContext {
  private String[] citys = { "韶关", "广州" };
  private String[] persons = { "老人", "妇女", "儿童" };
  private AbstractExpression cityPerson;

  public InterpreterContext() {
    AbstractExpression city = new TerminalExpression(citys);
    AbstractExpression person = new TerminalExpression(persons);
    cityPerson = new AndExpression(city, person);
  }

  public void freeRide(String info) {
    boolean ok = cityPerson.interpret(info);
    if (ok) {
      System.out.println("您是" + info + "，您本次乘车免费！");
      return;
    }
    System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
  }
}
