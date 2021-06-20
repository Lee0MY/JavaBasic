import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo{

    public static void main(String[] args){
        System.out.println("完整显示日期时间：");
        // 字符串转换日期格式
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = fdate.format(new Date());
        System.out.println(str);

        //创建Calendar 对象
        Calendar calendar = Calendar.getInstance();
        //初始化Calendar 对象，但并不必要，除非需要重置时间
        calendar.setTime(new Date());

        //显示年份
        System.out.println("年：" + calendar.get(Calendar.YEAR));

        //显示月份（从0开始，实际显示要加一）
        System.out.println("月：" + calendar.get(Calendar.MONTH));

        //当前分钟数
        System.out.println("分钟：" + calendar.get(Calendar.MINUTE));

        //今年的第 N 天
        System.out.println("今年的第：" + calendar.get(Calendar.DAY_OF_YEAR));

        //今年的第 N 天
        System.out.println()
        
    }


}