package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 誕生日クラス
 * @author pollseed
 *
 */
@JavaStandardVersion
public class BirthdayHelper extends DateUtils {

    /**
     * 現在年月日から年齢を取得します.
     * @param birthday
     * @return
     */
    public static Integer getAge(final Date birthday) {
        if (birthday == null) {
            return null;
        }
        return compare(now(), birthday);
    }

}
