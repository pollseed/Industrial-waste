package hoge;

import javax.tools.ToolProvider;

/**
 * 勉強会用テストクラス(超入門編)
 *
 */
final public class IntegratedTrigger {

    public static void main(String[] args) {
        new IntegratedTrigger();
    }

    private IntegratedTrigger() {
        // コンパイラーチェック
        this.compilerCheck();
        // アクセステスト
        new AccessStudy().accessSame().accessAnother();
        // 測定テスト
        new TypeConversion().convert();
    }

    private void compilerCheck() {
        System.out.println(ToolProvider.getSystemJavaCompiler().run(null, null, null, "-version"));
    }
}
