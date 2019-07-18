package com.design.patterns.visitor.visitor.abstraction;

import com.design.patterns.visitor.element.implementor.ConcreteElementA;
import com.design.patterns.visitor.element.implementor.ConcreteElementB;

/**
 * Title: 抽象访问者<br>
 * Description: AbstractVisitor<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 18:48
 *
 * @author jackie.scl
 */
public interface AbstractVisitor {
  void visit(ConcreteElementA element);

  void visit(ConcreteElementB element);
}
