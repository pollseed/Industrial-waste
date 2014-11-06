package hoge;

final class AccessStudy extends AbstractAccessStudy {
    final int fieldVariable = 1000;

    final int var = 1000;

    @Override
    protected AccessStudy accessSame() {
        final int var = 3000;
        ln(var);
        ln(this.var);
        ln(super.var);
        ln("==========");
        return this;
    }

    @Override
    protected void accessAnother() {
        final int localVariable = 3000;
        ln(localVariable);
        ln(fieldVariable);
        ln(superVariable);
    }

    protected AccessStudy() {
        super();
    }
}
