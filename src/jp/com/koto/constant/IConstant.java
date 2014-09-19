package jp.com.koto.constant;

/**
 * 定数のinterface
 * 
 * @author PollSeed
 *
 * @param <V>
 */
public interface IConstant<V> {

    V get();

    String getName();

    void set(V value);

    V getDefault();

}
