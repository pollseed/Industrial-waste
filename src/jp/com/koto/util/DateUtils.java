package jp.com.koto.util;

import java.util.Calendar;
import java.util.Date;

import jp.com.koto.common.JavaStandardVersion;

/**
 * 日付のUtilクラス<br>
 * only Java STD class.
 * 
 * @author pollseed
 * 
 */
@JavaStandardVersion
public class DateUtils {

    /**
     * 現在年月日を返却します.
     * 
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 明日を返却します.
     * 
     * @return
     */
    public static Date yesterday() {
        return add(now(), -1);
    }

    /**
     * 昨日を返却します.
     * 
     * @return
     */
    public static Date tomorrow() {
        return add(now(), +1);
    }

    /**
     * 指定した日付から指定した数値を加算します.
     * 
     * @param date
     * @param value
     * @return
     */
    protected static Date add(final Date date, final int value) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, value);
        return cal.getTime();
    }

    /**
     * 指定した日付を比較し、その差分を返却します.
     * 
     * @param one
     * @param another
     * @return
     */
    protected static Integer compare(final Date one, final Date another) {
        if (one == null || another == null) {
            return null;
        }
        final Calendar cal1 = Calendar.getInstance();
        final Calendar cal2 = Calendar.getInstance();
        cal1.setTime(one);
        cal2.setTime(another);
        int age = Math.abs(cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR));
        return cal1.getTime().before(cal2.getTime()) ? age-- : age;
    }

}
