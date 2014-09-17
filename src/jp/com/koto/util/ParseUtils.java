package jp.com.koto.util;

/**
 * 文字や数字をパースするためのクラスです.<br>
 * 失敗してもエラーにならずにnullをただ返却します.<br>
 * ※返却値をオブジェクト型にして、オートボクシングをさせています(失敗時にnullを返却したいからです.)
 * 
 * @author PollSeed
 *
 */
public class ParseUtils {

	private static final int BINARY_VALUE = 2;
	private static final int OCTAL_VALUE = 8;
	private static final int HEX_VALUE = 16;

	public static Integer parseInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static Integer parseInteger(String str) {
		try {
			return Integer.decode(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static Boolean parseBoolean(String str) {
		try {
			return Boolean.parseBoolean(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static String parseString(Integer value) {
		try {
			return Integer.toString(value);
		} catch (Exception e) {
			return null;
		}
	}

	public static String parseString(Integer value, Integer n) {
		try {
			switch (n) {
			case BINARY_VALUE:
				return parseBinaryString(value);
			case OCTAL_VALUE:
				return parseOctalString(value);
			case HEX_VALUE:
				return parseHexString(value);
			}
			return Integer.toString(value, n);
		} catch (Exception e) {
			return null;
		}
	}

	public static String parseBinaryString(Integer value) {
		try {
			return Integer.toBinaryString(value);
		} catch (Exception e) {
			return null;
		}
	}

	public static String parseOctalString(Integer value) {
		try {
			return Integer.toOctalString(value);
		} catch (Exception e) {
			return null;
		}
	}

	public static String parseHexString(Integer value) {
		try {
			return Integer.toHexString(value);
		} catch (Exception e) {
			return null;
		}
	}

	/* TODO 1 date型のparseについてはどうするか */

	/* TODO 2 primitive(Numberクラス)についてはどうするか */

}
