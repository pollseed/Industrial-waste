package jp.com.koto.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * UTIL for checking the array
 * 
 * @author pollSeed
 */
public class ArrayCheckUtils {

    /**
     * <p>
     * Checks if an array of Object Array is empty or {@code null}.
     * </p>
     * 
     * @param objs
     * @param isContentsCheck
     * @return {@code true} if the Object Array is empty or {@code null}
     */
    public static boolean isEmpty(final Object[] objs, Boolean isContentsCheck) {
        if (objs == null || objs.length < 1) {
            return true;
        }
        if (isContentsCheck) {
            for (Object obj : objs) {
                if (isEmpty(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * <p>
     * Checks if an array of Object is empty or {@code null}.<br>
     * Each Object element is a String class will call if {@link #isEmptyStr (String)}
     * </p>
     * 
     * @param obj
     * @return {@code true} if the Object is blank or {@code null}
     */
    public static boolean isEmpty(final Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return isEmptyStr((String) obj);
        }
        return false;
    }

    /**
     * <p>
     * Checks if an array of String is empty or {@code null}.
     * </p>
     * 
     * @deprecated
     * @param str
     * @return {@code true} if the String is empty or {@code null}
     */
    @Deprecated
    private static boolean isEmptyStr(final String str) {
        return str == null || str.length() < 1;
    }

    /**
     * Returns stripped value from the specified array of stuff
     * 
     * @param objs
     * @param str
     *            Values you want to remove
     * @return
     */
    public static Object[] replaceAll(final Object[] objs, final String str) {
        if (isEmpty(objs, false)) {
            return null;
        }
        List<Object> list = new ArrayList<Object>(Arrays.asList(trimArray(objs)));
        list.removeAll(Collections.singletonList(str));
        return list.toArray(new Object[list.size()]);
    }

    /**
     * @deprecated
     * @param objs
     * @return
     */
    @Deprecated
    private static Object[] trimArray(Object[] objs) {
        if (isEmpty(objs)) {
            return null;
        }
        int i = 0;
        Object[] cpObjs = new Object[objs.length];
        for (Object obj : objs) {
            try {
                cpObjs[i] = obj.toString().trim();
            } catch (Exception e) {
                cpObjs[i] = obj;
            } finally {
                i++;
            }
        }
        return cpObjs;
    }
}
