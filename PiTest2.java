import java.math.*;
import java.util.*;
public class PiTest2 {
    public static void main(String[] args){
        double i,j=1,a = 2;
        long n = 1;
        System.out.println("输入迭代次数：");
        Scanner cp = new Scanner(System.in);
        long cp1 = cp.nextInt();
        System.out.println("计算过程小数精度：");
        Scanner pr = new Scanner(System.in);
        int pr1 = pr.nextInt();
        BigDecimal pi = new BigDecimal("0");
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("6");
        MathContext num3 = new MathContext(pr1);
        while(n<cp1){
            i = Math.pow(j,a);
            BigDecimal i1 = new BigDecimal(i);
            BigDecimal i2 = num1.divide(i1,pr1,RoundingMode.HALF_DOWN);
            pi = pi.add(i2);
            j++;
            n++;
        }
        BigDecimal pi1 = pi.multiply(num2);
        BigDecimal pi2 = pi1.sqrt(num3);
        System.out.println("pi的值为："+pi2);
    }
}
