package com.isprint.jslx.dateutils;

import com.isprint.jslx.string.StrKit;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 日期工具类
 *
 * @author HYL
 * @create 2017-11-07 下午5:56
 **/
public class DateUtil {
    // 当年
    public static String getThisYear(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat(Constants.DEFAULT_YEAR_DATETIME_FORMAT).format(date);
        }
    }

    // 当月
    public static String getThisMonth(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat(Constants.DEFAULT_FULL_DATETIME_FORMAT1).format(date);
        }
    }

    // 标准时间格式
    public static String getBzDate(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat(Constants.DEFAULT_FULL_DATETIME_FORMAT).format(date);
        }
    }

    // 月份
    public static String getMonth(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat(Constants.DEFAULT_MONTH_DATETIME_FORMAT).format(date);
        }
    }

    private static SimpleDateFormat formater = null;

    public static String getNowDateStr() {
        return getDateStr(new Date());
    }

    public static String getNowDatetimeStr() {
        return getDateStr(new Date(), Constants.DEFAULT_FULL_DATETIME_FORMAT);
    }

    public static String getDateStr(Date date) {
        if (date != null) {
            formater = new SimpleDateFormat(Constants.DEFAULT_SIMPLE_DATE_FORMATJAVA);
            return formater.format(date);
        }
        return Constants.DEFAULT_ERROR_DATETIME;
    }

    public static String getDateStr(Date date, String format) {
        if (date != null) {
            if (format != null && format.trim().length() > 0) {
                formater = new SimpleDateFormat(format);
                return formater.format(date);
            } else {
                formater = new SimpleDateFormat(Constants.DEFAULT_SIMPLE_DATE_FORMATJAVA);
                return formater.format(date);
            }
        }
        return Constants.DEFAULT_ERROR_DATETIME;
    }

    public static Date getDate(String dateStr, String format) {
        if (StringUtils.isNotEmpty(dateStr)) {
            try {
                return DateUtils.parseDate(dateStr, format);
            } catch (ParseException e) {
                e.printStackTrace();
                return new Date();
            }
        }
        return new Date();
    }

    // 年-月-日 时-分-秒格式
    public static String getNormalDate(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
        }
    }

    // 年-月-日 时-分-秒格式
    public static String getNormalDate11(Date date) {
        if (date == null) {
            return "";
        } else {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        }
    }

    // 年-月-日格式
    public static String getNewDateStr(Date date) {
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }

    // 年-月-日格式
    public static String getNewDateStr() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    public static String getNewDateStrMonthAndDate(Date date) {
        return new SimpleDateFormat("M.d").format(date)+"日";
    }

    public static long string2time(String date, String format) {
        if (date == null) {
            return 0;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dt = null;

        try {
            dt = dateFormat.parse(date);
        } catch (ParseException excpt) {
            return 0;
        }
        return date2time(dt);
    }

    public static String time2string(long time, String format) {
        if (time == 0)
            return "";
        Date date = new Date(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static Date string2date(String date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dt = null;

        try {
            dt = dateFormat.parse(date);
        } catch (ParseException excpt) {
            return null;
        }
        return dt;
    }

    public static String date2string(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static long date2time(Date date) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        return cld.getTimeInMillis();
    }

    /**
     *
     * 获得当前时间的相差时间(天数) @Title: getDifferenceNowdate @param @param
     * num @param @param format @param @return @author zyfine @date 2013-6-5
     * 下午04:05:21 @return String @throws
     */
    public static String getDifferenceNowdate(int num, String format) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, num);
        return (new SimpleDateFormat(format)).format(cal.getTime());
    }

    /**
     *
     * 获得指定时间的相差时间(天数) @Title: getDifferenceNowdate @param @param
     * num @param @param format @param @return @author zyfine @date 2013-6-5
     * 下午04:05:55 @return String @throws
     */
    public static String getDifferenceDateStr(String dateStr, int num, String format) {
        Date date = getDate(dateStr, format);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, num);
        return (new SimpleDateFormat(format)).format(cal.getTime());
    }

    public static void main(String[] args) {
        String lastSaturday = getLastSaturday();
        System.out.println(lastSaturday);
    }


    /**
     * 获取昨日日期
     * @author ruany
     * @return
     */
    public static String getYesterdayDateToString() throws Exception {
        Date dNow = new Date();   //当前时间

        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        return sdf.format(calendar.getTime());
    }

    /**
     * 获取昨天的数据
     * @return
     * @throws Exception
     */
    public static String getNewYesterdayDateToString() throws Exception {
        Date dNow = new Date();   //当前时间

        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天

        SimpleDateFormat sdf=new SimpleDateFormat("M.d日"); //设置时间格式
        return sdf.format(calendar.getTime());
    }

    public static Date getYesterdayDate() throws Exception {
        Date dNow = new Date();   //当前时间

        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        return sdf.parse(sdf.format(calendar.getTime()));
    }

    /**
     * 获取前7天的时间
     * @return
     * @throws Exception
     */
    public static String getLastWeekDate() throws Exception {
        Date dNow = new Date();   //当前时间

        Calendar calendar = Calendar.getInstance(); //得到日历
        calendar.setTime(dNow);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH, -7);  //设置为前一天

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        return sdf.format(calendar.getTime());
    }



    /**
     * 获取上月第一天
     * @return
     */
    public static String getLastMonthForFirstDay(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取前月的第一天
        //获取当前日期
        Calendar cal_1=Calendar.getInstance();
        cal_1.add(Calendar.MONTH, -1);
        //设置为1号,当前日期既为本月第一天
        cal_1.set(Calendar.DAY_OF_MONTH,1);
        return format.format(cal_1.getTime());
    }

    /**
     * 获取上月最后一天
     * @return
     */
    public static String getLastMonthForLastDay(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        return sdf.format(cale.getTime());
    }

    /**
     * 获取当月日期
     * @return
     */
    public static String getThisMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        now.set(Calendar.DATE, now.get(Calendar.DATE));
        return sdf.format(now.getTime());
    }

    /**
     * 获取当月日期
     * @return
     */
    public static String getLastMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        now.set(Calendar.MONTH, now.get(Calendar.MONTH) - 1);
        return sdf.format(now.getTime());
    }

    /**
     * 获取上月日期
     * @param day
     * @return
     */
    public static String getLastMonth(int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
        return sdf.format(now.getTime());
    }

    /**
     * 获取上周日日期
     * @return
     */
    public static String getLastWeekSunday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.add(Calendar.WEEK_OF_MONTH,-1);//周数减一，即上周
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);//日子设为星期天
        return sdf.format(cal.getTime());
    }

    /**
     * 获取上周一日期
     * @return
     */
    public static String getLastWeekMonday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.add(Calendar.WEEK_OF_MONTH,-1);//周数减一，即上周
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);//日子设为星期天
        return sdf.format(cal.getTime());
    }

    public static Date getWeekMonday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);//日子设为星期天
        return cal.getTime();
    }
    /**
     * 获取指定日期为周几
     * @param date
     * @return
     */
    public static int getAssignDateWeek(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week < 0){
            week = 0;
        }
        return week;
    }

    // 年-月-日 时-分-秒格式
    public static String getNowDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /**
     * 获取上周六日期
     * @return
     */
    public static String getLastSaturday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        //设置为本周的星期六
        cal.set(Calendar.DAY_OF_WEEK, 7);
        //设置为上星期的星期六
        cal.add(Calendar.WEEK_OF_MONTH, -1);
        return sdf.format(cal.getTime());
    }


    /**
     * 获取本周五日期
     * @return
     */
    public static String getFriday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);//日子设为星期天
        return sdf.format(cal.getTime());
    }
    /**
     * 获取本周六的日期
     */
    public static Date getThisSaturday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        //设置为本周的星期六
        cal.set(Calendar.DAY_OF_WEEK, 7);
        Date time = cal.getTime();
        return time;
    }

    /**
     * 获取制定date所在周的周一和周日
     * @param date
     * @author chenjia
     */
    public static List<String> getStartDayAndEndDayBydate(Date date){

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        if(1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        System.out.println("要计算日期为:"+sdf.format(cal.getTime())); //输出要计算日期
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        String imptimeBegin = sdf.format(cal.getTime());
        System.out.println("所在周星期一的日期："+imptimeBegin);
        cal.add(Calendar.DATE, 6);
        String imptimeEnd = sdf.format(cal.getTime());
        System.out.println("所在周星期日的日期："+imptimeEnd);

        List<String> list = new ArrayList<>();
        list.add(imptimeBegin);
        list.add(imptimeEnd);
        return list;
    }


    //判断选择的日期是否是本周
    public static boolean isThisWeek(long time)
    {
        Calendar calendar = Calendar.getInstance();
        int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        calendar.setTime(new Date(time));
        int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);
        if(paramWeek==currentWeek){
            return true;
        }
        return false;
    }



    /**
     *	获取当前时间与本周六的比较值,小于本周六返回true
     *	大于或者等于返回false
     *@Author mingy
     *@Date 2017/8/19 17:53
     */
    public static boolean getSaturdayTwoHours() {
        boolean flag = true ;
        //获取本周六两点的时间
        Calendar calendar = Calendar.getInstance();
        //将每周第一天设置为星期一,默认是星期日
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
        calendar.set(Calendar.HOUR_OF_DAY,2);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date bzDate = calendar.getTime();
        Date nowDate = new Date();
        if(nowDate.after(bzDate)||nowDate.equals(bzDate)) {
            //当前时间大于或者等于周六2点
            flag = false;
        }
        return flag;
    }

    /**
     *	获取指定时间上周六的时间
     *@Author mingy
     *@Date 2017/10/14 19:27
     */
    public static String getLastSaturdayTwoHours(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        if(1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        cal.add(Calendar.DAY_OF_YEAR,-dayWeek);
        Date date1 = cal.getTime();
        String time = sdf.format(date1);
        return time;
    }

    /**
     *	返回本周六日期
     *@Author mingy
     *@Date 2017/8/19 18:05
     */
    public static String getThisWeekSaturday() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);//日子设为星期六
        return simpleDateFormat.format(cal.getTime());
    }

    public static String getTime() {
        boolean flag = getSaturdayTwoHours();
        String time = "";
        if (flag) {
            //小于周六两点,则获取上个星期周六推送的每周一练
            time = getLastSaturday();
        } else {
            //大于本周六,则获取本周六推送的每周一练
            time = getThisWeekSaturday();
        }
        return time;
    }
    /**
     * 获取下周五日期
     * @return
     */
    public static String getNextFriday(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
        cal.add(Calendar.WEEK_OF_MONTH, 1);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);//日子设为星期天
        return sdf.format(cal.getTime());
    }

    /**
     * 获取周六时间
     * 如果 当前时间为 周六，则获取当前时间
     * 如果 当前时间为 周日，则获取昨天周六时间
     * 否则 获取 上周六时间
     * @return
     * @throws Exception
     */
    public static String getSaturdayNew() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        //判断今天是否是周六
        if(dayForWeek(new Date()) == 6){
            return sdf.format(new Date().getTime());
        }else if(dayForWeek(new Date()) == 7){
            cal.setFirstDayOfWeek(Calendar.MONDAY);//将每周第一天设为星期一，默认是星期天
            cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);//日子设为星期天
            return sdf.format(cal.getTime());
        }else{
            return getLastSaturday();
        }
    }

    /**
     * 获取周五时间
     * 如果 当前时间为 周六，则获取当前时间
     * 如果 当前时间为 周日，则获取昨天周六时间
     * 否则 获取 上周六时间
     * @return
     * @throws Exception
     */
    public static String getFridayNew() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        //判断今天是否是周五
        if(dayForWeek(new Date()) == 5){
            return sdf.format(new Date().getTime());
        }else if(dayForWeek(new Date()) == 6 || dayForWeek(new Date()) == 7){//获取下周五
            return getNextFriday();
        }else{
            return getFriday();
        }
    }

    /**
     * 判断当前日期是星期几
     *
     * @param date 需要判断的时间
     * @return dayForWeek 判断结果
     * @Exception 发生异常
     */
    public static int dayForWeek(Date date) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayForWeek = 0;
        if(c.get(Calendar.DAY_OF_WEEK) == 1){
            dayForWeek = 7;
        }else{
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    //获取指定日期的明天日期
    public static Date getTomorrow(Date date) {
        if(date==null) {
            date=new Date();
        }
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        return  date;
    }

    //比较两个时间的年月日是否相等
    public static boolean sameDate(Date d1, Date d2) {
        if(null == d1 || null == d2)
            return false;
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(d1);
        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MILLISECOND, 0);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);
        cal2.set(Calendar.HOUR_OF_DAY, 0);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        return  cal1.getTime().equals(cal2.getTime());
    }

    public static List<String> printfWeeks(String date) {
        List<String> list = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        try {
            Date date1 = dateFormat.parse(date);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date1);
            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("days:" + days);
            int count = 0;
            DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            for (int i = 1; i <= days; i++) {
                String monday = "";
                String sunday = "";
                Date date2 = dateFormat1.parse(date + "-" + i);
                calendar.clear();
                calendar.setTime(date2);
                int k = new Integer(calendar.get(Calendar.DAY_OF_WEEK));
                if (k == 1) {// 若当天是周日
                    count++;
                    if (i - 6 <= 1) {
                        monday = date + "-" + 1;
                    } else {
                        monday = date + "-" + (i - 6);
                    }
                    sunday = date + "-" + i;
                    if(count == 1){
                        if(!isMonday(dateFormat1.parse(sunday))){
                            sunday = getMonday(dateFormat1.parse(sunday));
                        }
                    }
                }
                if (k != 1 && i == days) {// 若是本月最好一天，且不是周日
                    count++;
                    monday = date + "-" + (i - k + 2);
                    sunday = date + "-" + i;
                    if(!isSunday(dateFormat1.parse(sunday))){
                        sunday = getSunday(dateFormat1.parse(sunday));
                    }
                }
                if (StrKit.notBlank(monday) && StrKit.notBlank(sunday)) {
                    list.add(monday+","+sunday);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 判断日期是否是周一
     * @param date
     * @return
     */
    public static boolean isMonday(Date date){
        boolean flag = false;
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        if(week == 1){
            flag = true;
        }
        return flag;
    }

    /**
     * 判断日期是否是周日
     * @param date
     * @return
     */
    public static boolean isSunday(Date date){
        boolean flag = false;
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        int week=cal.get(Calendar.DAY_OF_WEEK)-1;
        if(week == 0){
            flag = true;
        }
        return flag;
    }

    /**
     * 获取指定日期周一时间
     * @param date
     * @return
     */
    public static String getMonday(Date date) {
        String monday = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        if(1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        return sdf.format(cal.getTime());
    }

    /**
     * 获取指定时间周日
     * @param date
     */
    public static String getSunday(Date date){
        String sunday = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        if(1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, 6);
        return sdf.format(cal.getTime());
    }

    //获取指定月份的天数
    public static int getDaysByYearMonth(int year, int month) {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 获取某月的每一天
     * @param date
     */
    public static List<String> dayReport(String date) {
        List<String> list = new ArrayList<>();
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
            Date month = dateFormat.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(month);//month 为指定月份任意日期
            int year = cal.get(Calendar.YEAR);
            int m = cal.get(Calendar.MONTH);
            int dayNumOfMonth = getDaysByYearMonth(year, m);
            cal.set(Calendar.DAY_OF_MONTH, 1);// 从一号开始

            for (int i = 0; i < dayNumOfMonth; i++, cal.add(Calendar.DATE, 1)) {
                Date d = cal.getTime();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                list.add(simpleDateFormat.format(d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    /**
     *	获取指定日期周六的时间
     *@Author mingy
     *@Date 2017/10/14 20:37
     */
    public static Date getSaturday(Date date) {
        String saturday = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        if(1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, 5);
        return cal.getTime();
    }
}
