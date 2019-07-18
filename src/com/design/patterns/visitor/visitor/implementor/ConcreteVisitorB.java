package com.design.patterns.visitor.visitor.implementor;

import com.design.patterns.visitor.element.implementor.ConcreteElementA;
import com.design.patterns.visitor.element.implementor.ConcreteElementB;
import com.design.patterns.visitor.visitor.abstraction.AbstractVisitor;

/**
 * Title: 具体访问者B<br>
 * Description: ConcreteVisitorB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 18:58
 *
 * @author jackie.scl
 */
public class ConcreteVisitorB implements AbstractVisitor {
  @Override
  public void visit(ConcreteElementA element) {
    System.out.println("具体访问者B访问-->" + element.operationA());
  }

  @Override
  public void visit(ConcreteElementB element) {
    System.out.println("具体访问者B访问-->" + element.operationB());
  }
}
