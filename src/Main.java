import com.design.patterns.simplefactory.OperationFactory;
import com.design.patterns.simplefactory.service.OperationService;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 start -----------------");
        simplefactoryTest();
        System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 end -----------------");
    }

    /**
     * Title: 简单工厂模式测试<br>
     * Description: simplefactoryTest<br>
     * CreateDate: 2019/6/17 18:43<br>
     *
     * @category 简单工厂模式测试
     * @author jackie.scl
     * @return void
     * @exception Exception
     */
    public static void simplefactoryTest() {
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
