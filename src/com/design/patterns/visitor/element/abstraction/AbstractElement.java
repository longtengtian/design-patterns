package com.design.patterns.visitor.element.abstraction;

import com.design.patterns.visitor.visitor.abstraction.AbstractVisitor;

/**
 * Title: 抽象元素<br>
 * Description: AbstractElement<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 15:49
 *
 * @author jackie.scl
 */
public interface AbstractElement {
  public void accept(AbstractVisitor visitor);
}
