package com.design.patterns;

import com.design.patterns.simplefactory.OperationFactory;
import com.design.patterns.simplefactory.service.OperationService;
import com.design.patterns.strategy.StrategyFactory;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyA;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyB;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 start -----------------");
    simplefactoryPatternsTest();
    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 end -----------------");

    System.out.println("----------------- 策略模式实现样例 start -----------------");
    strategyPatternsTest();
    System.out.println("----------------- 策略模式实现样例 end -----------------");
  }

  /**
   * Title: 策略模式测试<br>
   * Description: strategyPatternsTest<br>
   * CreateDate: 2019/6/26 19:15<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void strategyPatternsTest() {
    StrategyFactory strategyFactory = new StrategyFactory();
    // 初始化策略
    strategyFactory.put("concreteStrategyA", new ConcreteStrategyA());
    strategyFactory.put("concreteStrategyB", new ConcreteStrategyB());
    // 调用策略A实现
    strategyFactory.strategyMethod("concreteStrategyA");
    // 调用策略B实现
    strategyFactory.strategyMethod("concreteStrategyB");
    // 调用不存在策略
    // strategyFactory.strategyMethod("concreteStrategy");
  }

  /**
   * Title: 简单工厂模式测试<br>
   * Description: simplefactoryPatternsTest<br>
   * CreateDate: 2019/6/17 18:43<br>
   *
   * @return void
   * @throws Exception
   * @category 简单工厂模式测试
   * @author jackie.scl
   */
  public static void simplefactoryPatternsTest() {
    System.out.println("请输入第一个数字:");
    Scanner scanner = new Scanner(System.in);
    String num1 = scanner.nextLine();
    System.out.println("请输入运算符(+-*/):");
    String oper = scanner.nextLine();
    System.out.println("请输入第二个数字:");
    String num2 = scanner.nextLine();
    // 通过工厂获取运算类
    OperationService operationService = OperationFactory.getOperationService(oper);
    if (operationService != null) {
      if (isDouble(num1) && isDouble(num2)) {
        double result = operationService.getResult(Double.parseDouble(num1), Double.parseDouble(
            num2));
        System.out.println("结果是:" + result);
      } else {
        System.out.println("请输入正确的运算符!");
      }
    }
  }

  // 判断浮点数（double和float）
  private static boolean isDouble(String str) {
    if (null == str || "".equals(str)) {
      return false;
    }
    Pattern pattern = Pattern.compile("^[0-9]+(.[0-9]+)?$");// 数字,包括整数和浮点
    return pattern.matcher(str).matches();
  }
}
