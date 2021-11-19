import java.util.*;
import java.math.*;
public class PiCal {
    long time;
    int n;
    int enterPr = 0;
    int enterPr1 = 0;
    int times = 1;
    BigDecimal pi;
    public BigDecimal getPi(){
        MathContext pr = new MathContext(enterPr);//直接定义精度，只在BigDecimal用到
        long ori = System.currentTimeMillis();//计时起点
        BigDecimal[] cons = {
                BigDecimal.valueOf(0.5),//常数0.5
                BigDecimal.valueOf(1),//常数1
                BigDecimal.valueOf(2),//常数2
                BigDecimal.valueOf(3),//常数3
                BigDecimal.valueOf(2).pow(n-2)//指数部分
        };
        BigDecimal a = BigDecimal.valueOf(3).sqrt(pr);
        while (times < n){
            a = (cons[2].subtract(cons[2].multiply((cons[1].subtract((cons[0].multiply(a)).pow(2))).sqrt(pr)))).sqrt(pr);//割圆公式
            times++;
        }
        pi = cons[4].multiply(cons[3].multiply(a));
        long las = System.currentTimeMillis();//计时终点
        time = las - ori;
        if (enterPr1 == 0) {
            return pi;
        }else {
            BigDecimal pi1 = pi.setScale(enterPr1,RoundingMode.DOWN);
            return pi1;
        }
    }
    public long getTime(){
        return this.time;
    }
    public void setN(int k){
        n = k;
    }
    public void setEnterPr(int k){
        enterPr = k;
    }
    public void setEnterPr1(int k){
        enterPr1 = k;
    }
}

