package com.design.patterns.interpreter.expression;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: 终结符表达式<br>
 * Description: TerminalExpression<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:52
 *
 * @author jackie.scl
 */
public class TerminalExpression implements AbstractExpression {
  private Set<String> set = new HashSet<String>();

  public TerminalExpression(String[] data) {
    for (int i = 0; i < data.length; i++) {
      set.add(data[i]);
    }
  }

  @Override
  public boolean interpret(String info) {
    if (set.contains(info)) {
      return true;
    }
    return false;
  }
}
