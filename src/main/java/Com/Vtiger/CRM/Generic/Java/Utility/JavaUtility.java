package Com.Vtiger.CRM.Generic.Java.Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

        public String getSystemDateInFormOf_YYYY_MM_DD(){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String actualDate=simpleDateFormat.format(date);
            return actualDate;
        }
        public String getPreviousDateOrFutureDateInFormOf_YYYY_MM_DD(int Difference){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String actualDate=simpleDateFormat.format(date);
            Calendar calendar=simpleDateFormat.getCalendar();
            calendar.add(Calendar.DATE,Difference);
            String requireDate=simpleDateFormat.format(calendar.getTime());
            return requireDate;
        }
        public String getPreviousYearOrFutureYearInFormOf_YYYY_MM_DD(int Difference){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String actualDate=simpleDateFormat.format(date);
            Calendar calendar=simpleDateFormat.getCalendar();
            calendar.add(Calendar.YEAR,Difference);
            String requireDate=simpleDateFormat.format(calendar.getTime());
            return requireDate;
        }
        public String getPreviousMonthOrFutureMonthInFormOf_YYYY_MM_DD(int Difference){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            String actualDate=simpleDateFormat.format(date);
            Calendar calendar=simpleDateFormat.getCalendar();
            calendar.add(Calendar.MONTH,Difference);
            String requireDate=simpleDateFormat.format(calendar.getTime());
            return requireDate;
        }
        public String getRandomAlphaNumericNumber(int num){
            String AlphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqestuvwxyz";
            StringBuilder stringBuilder=new StringBuilder(num);
            for(int i=0;i<num;i++){
                int index=(int) (AlphaNumericString.length()*Math.random());
                stringBuilder.append(AlphaNumericString.charAt(index));
            }
            return stringBuilder.toString();
        }
        public int getRandomNumber(){
            int range =5000;
            Random random=new Random();
            int randomData=random.nextInt(range);
            return randomData;
        }

//    public long getRandomNumber(long range){
//        Random random=new Random();
//        long randomData=random.nextLong(range);
//        return randomData;
//    }
}
