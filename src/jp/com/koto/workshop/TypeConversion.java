package hoge;

/**
 * 計測したいものは{@link AbstractTimer#measure(Measure)}を使う
 */
public class TypeConversion extends AbstractTimer {
    @Override
    protected void convert() {
        measure(new Measure() {
            @Override
            public void action() {
                String _var = "1111111111";
                int var = Integer.parseInt(_var);
            }
        });
        measure(new Measure() {
            @Override
            public void action() {
                String _var = "1111111111";
                int var = new Integer(_var).intValue();
            }
        });
    }
}
