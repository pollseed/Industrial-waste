package hoge;

public abstract class AbstractAccessStudy {
    final int superVariable = 100;

    final int var = 100;

    abstract protected AccessStudy accessSame();

    abstract protected void accessAnother();

    final protected void ln(final Number var) {
        if (var instanceof Integer) {
            System.out.println(var.intValue());
        } else if (var instanceof Long) {
            System.out.println(var.longValue());
        } else if (var instanceof Float) {
            System.out.println(var.floatValue());
        } else if (var instanceof Double) {
            System.out.println(var.doubleValue());
        } else if (var instanceof Short) {
            System.out.println(var.shortValue());
        } else if (var instanceof Byte) {
            System.out.println(var.byteValue());
        } else {
            throw new ClassCastException();
        }
    }

    final protected void ln(final Object var) {
        try {
            System.out.println((String) var);
        } catch (Exception e) {
            throw new ClassCastException();
        }
    }

    protected AbstractAccessStudy() {}
}
