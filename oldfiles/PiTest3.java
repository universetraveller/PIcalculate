import java.util.*;
import java.math.*;
public class PiTest3 {
    public static void main(String[] args){
        System.out.println("循环次数：");
        Scanner enterN = new Scanner(System.in);
        int n = enterN.nextInt();
        System.out.println("精度设置：");
        Scanner enterPr = new Scanner(System.in);
        int pr = enterPr.nextInt();
        MathContext Spr = new MathContext(pr);
        BigDecimal sqrt3f = new BigDecimal("3");
        BigDecimal l = new BigDecimal("0");
        BigDecimal num2 = new BigDecimal("2");
        BigDecimal num0o5 = new BigDecimal("0.5");
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num3 = new BigDecimal("3");
        BigDecimal a = sqrt3f.sqrt(Spr);
        BigDecimal zs = num2.pow(n);
        int times = 1;
        while(times < n){
            a=num0o5.multiply(a);
            a=a.multiply(a);
            a=num1.subtract(a);
            a=a.sqrt(Spr);
            a=num2.multiply(a);
            a=num2.subtract(a);
            a=a.sqrt(Spr);
            l=num3.multiply(a);
            times++;
        }
        l = zs.multiply(l);
        BigDecimal l1 = num0o5.multiply(l);
        BigDecimal pi=num0o5.multiply(l1);
        System.out.println(pi);
    }
}
