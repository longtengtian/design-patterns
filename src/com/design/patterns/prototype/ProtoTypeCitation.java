package com.design.patterns.prototype;

/**
 * Title: ProtoTypeCitation<br>
 * Description: ProtoTypeCitation<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 15:41
 *
 * @author jackie.scl
 */
public class ProtoTypeCitation implements Cloneable {
  private String name;
  private String info;
  private String college;

  public ProtoTypeCitation(String name, String info, String college) {
    this.name = name;
    this.info = info;
    this.college = college;
    System.out.println("奖状创建成功！");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public void display() {
    System.out.println("学生：" + name + ";颁发奖状原因：" + info + ";颁发单位：" + college);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    System.out.println("奖状拷贝成功！");
    return (ProtoTypeCitation) super.clone();
  }
}
