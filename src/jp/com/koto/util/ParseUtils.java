package jp.com.koto.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 文字や数字をパースするためのクラスです.<br>
 * 失敗してもエラーにならずに{@code null}をただ返却します.<br>
 * ※返却値をオブジェクト型にして、オートボクシングをさせています(失敗時にnullを返却したいからです.)
 * 
 * @author PollSeed
 *
 */
public class ParseUtils {

	private static final int BINARY_VALUE = 2;
	private static final int OCTAL_VALUE = 8;
	private static final int HEX_VALUE = 16;

	public static Byte parseByte(String str) {
		try {
			return Byte.parseByte(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static Float parseFloat(String str) {
		try {
			return Float.parseFloat(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static Double parseDouble(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

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

	public static Short parseShort(String str) {
		try {
			return Short.parseShort(str);
		} catch (NullPointerException | NumberFormatException e) {
			return null;
		}
	}

	public static Long parseLong(String str) {
		try {
			return Long.parseLong(str);
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

	public static String parseString(Character str) {
		try {
			return Character.toString(str);
		} catch (Exception e) {
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

	/**
	 * {@link Serializable}な型クラスを返します.<br>
	 * {@link NullPointerException}を発した場合はただ{@code null}を返却します.
	 * 
	 * @author PollSeed
	 */
	public static class AtmicUtils implements Serializable {

		private static final long serialVersionUID = 1L;

		public static AtomicBoolean parseBoolean(String str) {
			try {
				return new AtomicBoolean(ParseUtils.parseBoolean(str));
			} catch (NullPointerException e) {
				return null;
			}
		}

		public static AtomicInteger parseInteger(String str) {
			try {
				return new AtomicInteger(ParseUtils.parseInteger(str));
			} catch (NullPointerException e) {
				return null;
			}
		}

		public static AtomicLong parseLong(String str) {
			try {
				return new AtomicLong(ParseUtils.parseLong(str));
			} catch (NullPointerException e) {
				return null;
			}
		}
	}

	/* TODO 1 date型のparseについてはどうするか */

	/* TODO 2 primitive(Numberクラス)についてはどうするか */

}
