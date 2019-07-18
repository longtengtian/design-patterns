package com.design.patterns.iterator.iterator.abstraction;

/**
 * Title: 抽象迭代<br>
 * Description: AbstractIterator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 9:54
 *
 * @author jackie.scl
 */
public interface AbstractIterator {
  Object first();

  Object next();

  boolean hasNext();
}
