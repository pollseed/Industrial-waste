package jp.com.koto.helper;

import java.util.Date;

import jp.com.koto.common.JavaStandardVersion;
import jp.com.koto.util.DateUtils;

/**
 * 誕生日クラス
 * 
 * @author pollseed
 *
 */
@JavaStandardVersion
public class BirthdayHelper extends DateUtils {

    /**
     * 現在年月日から年齢を取得します.
     * 
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
