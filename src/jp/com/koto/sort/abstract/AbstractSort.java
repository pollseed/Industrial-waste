package jp.com.koto.sort;

public abstract class AbstractSort {

    /* Constant */

    /** Initial value **/
    protected final int DEFAULT = Integer.MIN_VALUE;

    /** Sentinel **/
    protected final int SENTINEL = Integer.MAX_VALUE;

    /* Member variable */

    /** Array to be sorted **/
    protected final int[] searchArray;

    /** Sorted array **/
    protected int[] sorted;

    /* constructor */

    protected AbstractSort(int[] args) {
        this.searchArray = args;
    }

    /**
     * use the random sequences
     * 
     * @param maxArray
     *            Number of arrays
     * @param maxValue
     *            1～any value
     */
    protected AbstractSort(int maxArray, int maxValue) {
        searchArray = new int[maxArray];
        for (int i = 0; i < maxArray; i++) {
            searchArray[i] = (int) (Math.random() * maxValue + 1);
        }
    }
}
