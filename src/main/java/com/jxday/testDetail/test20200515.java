package com.jxday.testDetail;


import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200515
 * @create 2020-05-15 13:33
 * @Version 1.0.0
 */
public class test20200515 {
    public static void main(String[] args) {
        DateFormat format1 = DateFormat.getDateInstance();
        DateFormat format2 = DateFormat.getTimeInstance();
        DateFormat format3 = DateFormat.getDateTimeInstance();
        DateFormat format4 = SimpleDateFormat.getDateInstance();
        DateFormat format5 = SimpleDateFormat.getTimeInstance();
        DateFormat format6 = SimpleDateFormat.getDateTimeInstance();
//        DateFormat.getDateTimeInstance()


        double random = Math.random();

        Random random1 = new Random();
        double v = random1.nextDouble();
        System.out.println(random);
        System.out.println(v);

    }
    
    //最大值是平均值的2倍，最少不低于0.01
    public class RandomRedPacket{
        
        private Integer number;
        private BigDecimal totalMoney;
        private BigDecimal[] result;
        private Double[] gailv;
        private Random random;

        public RandomRedPacket(Integer number, BigDecimal totalMoney) throws Exception {
            checkMoney(number,totalMoney);
            this.random = new Random();
            this.number = number;
            this.totalMoney = totalMoney;
            this.result = new BigDecimal[number];
            this.gailv = new Double[number];
        }

        private void checkMoney(Integer number, BigDecimal totalMoney) throws Exception {
            BigDecimal least = new BigDecimal(0.01).multiply(new BigDecimal(number.doubleValue()));
            if (totalMoney.compareTo(least) <= 0){
                throw new Exception("每个红包最低不低于0.01元");
            }
        }

        private synchronized void 分发红包(){
            BigDecimal avg = totalMoney.divide(new BigDecimal(number.doubleValue())).setScale(2,BigDecimal.ROUND_HALF_EVEN);
            BigDecimal mostMoney = avg.multiply(new BigDecimal(2));
            BigDecimal least = new BigDecimal(0.01).multiply(new BigDecimal(number.doubleValue()));
            Double total = 0D;
            for (int i = 0; i < gailv.length; i++) {
                
                
                
                
            }


        }
    }
}
