package com.aaa.action.corn;

import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class CronUtils {
    /**
     * 返回一个布尔值代表一个给定的Cron表达式的有效性
     *
     * @param cronExpression Cron表达式
     * @return boolean 表达式是否有效
     */
    public static boolean isValid(String cronExpression) {
        return CronExpression.isValidExpression(cronExpression);
    }

    /**
     * 返回一个字符串值,表示该消息无效Cron表达式给出有效性
     *
     * @param cronExpression Cron表达式
     * @return String 无效时返回表达式错误描述,如果有效返回null
     */
    public static String getInvalidMessage(String cronExpression) {
        try {
            new CronExpression(cronExpression);
            return null;
        } catch (ParseException pe) {
            return pe.getMessage();
        }
    }

    /**
     * 返回下一个执行时间根据给定的Cron表达式
     *
     * @param cronExpression Cron表达式
     * @return Date 下次Cron表达式执行时间
     */
    public static Date getNextExecution(String cronExpression,Date date) {
        try {
            if(date==null){
                date = new Date();
            }
            CronExpression cron = new CronExpression(cronExpression);
            cron.setTimeZone(TimeZone.getTimeZone(ZoneOffset.of("zoned")));
            return cron.getNextValidTimeAfter(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static List<Date> getNextNExecution(String cronExpression, int num){
        Date date = null;
        var list = new ArrayList<Date>(num);
        for(int i=0;i<num;i++){
            date = getNextExecution(cronExpression,date);
            list.add(date);
        }
        return list;
    }
}
