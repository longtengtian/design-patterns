package com.design.patterns.visitor.element.implementor;

import com.design.patterns.visitor.element.abstraction.AbstractElement;
import com.design.patterns.visitor.visitor.abstraction.AbstractVisitor;

/**
 * Title: 具体元素A<br>
 * Description: ConcreteElementA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 18:50
 *
 * @author jackie.scl
 */
public class ConcreteElementA implements AbstractElement {
  @Override
  public void accept(AbstractVisitor visitor) {
    visitor.visit(this);
  }

  public String operationA() {
    return "具体元素A的操作";
  }
}
