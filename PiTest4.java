import java.util.*;
import java.math.*;
public class PiTest4 {
    public static void main(String[] args){
        System.out.println("说明：循环次数是割圆的次数，精度是过程中小数精度,");
        System.out.println("推荐精度不要超过保留位数太多，防止浪费算力.");
        System.out.println("循环次数");
        Scanner enterN = new Scanner(System.in);
        int n = enterN.nextInt();
        System.out.println("求解精度");
        Scanner enterPr = new Scanner(System.in);
        MathContext pr = new MathContext(enterPr.nextInt());//直接定义精度，只在BigDecimal用到
        System.out.println("需要保留小数的位数，0则全部输出");
        Scanner enterPr1 = new Scanner(System.in);
        int pr1 = enterPr1.nextInt();
        long ori = System.currentTimeMillis();//计时起点
        BigDecimal[] cons = {
                BigDecimal.valueOf(0.5),//常数0.5
                BigDecimal.valueOf(1),//常数1
                BigDecimal.valueOf(2),//常数2
                BigDecimal.valueOf(3),//常数3
                BigDecimal.valueOf(2).pow(n-2)//指数部分
        };
        BigDecimal pi;
        BigDecimal a = BigDecimal.valueOf(3).sqrt(pr);
        int times = 1;
        while (times < n){
            a = (cons[2].subtract(cons[2].multiply((cons[1].subtract((cons[0].multiply(a)).pow(2))).sqrt(pr)))).sqrt(pr);//割圆公式
            times++;
        }
        pi = cons[4].multiply(cons[3].multiply(a));
        long las = System.currentTimeMillis();//计时终点
        System.out.println("Pi的值为");
        if (pr1 == 0) {
            System.out.println(pi);
        }else {
            BigDecimal pi1 = pi.setScale(pr1,RoundingMode.DOWN);
            System.out.println(pi1);
        }
        System.out.printf("运行时间：%d ms",las-ori);
    }
}

