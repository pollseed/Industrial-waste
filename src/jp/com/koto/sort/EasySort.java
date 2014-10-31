package jp.com.koto.sort;

/**
 * Simple sort class <br>
 * TODO If you sort itself to increase in the future, and in the form to be implemented in each sorting to create the
 * interface. <br>
 * <code>cf.) class BubbleSort extends AbstractSort implements Sort </code> <br>
 * Be implemented in the above form.
 * 
 * @author pollseed
 */
public class EasySort extends AbstractSort {

    /* constructor */

    /**
     * Give the specified array
     * 
     * @param args
     */
    public EasySort(int[] args) {
        super(args);
    }

    /**
     * use the random sequences
     * 
     * @param maxArray
     *            Number of arrays
     * @param maxValue
     *            1～any value
     */
    public EasySort(int maxArray, int maxValue) {
        super(maxArray, maxValue);
    }

    /* public method */

    /**
     * Bubble sort
     */
    public void bubble() {
        measure(new Measure() {
            @Override
            public int[] sort() {
                int i = 0;
                while (i < searchArray.length - 1) {
                    for (int j = searchArray.length - 1; i < j; j--) {
                        if (searchArray[j] < searchArray[j - 1]) {
                            int _arg = searchArray[j - 1];
                            searchArray[j - 1] = searchArray[j];
                            searchArray[j] = _arg;
                        }
                    }
                    i++;
                }
                return searchArray;
            }
        });
    }

    /**
     * Selection sort
     */
    public void selection() {
        measure(new Measure() {
            @Override
            public int[] sort() {
                int swap[] = new int[searchArray.length];
                int i = 0;
                while (i < searchArray.length) {
                    int element = DEFAULT, suffix = DEFAULT;
                    int j = 0;
                    for (int arg : searchArray) {
                        if (arg == SENTINEL) {
                            j++;
                            continue;
                        }
                        if (element == DEFAULT) {
                            element = arg;
                            suffix = j;
                            j++;
                            continue;
                        }
                        if (arg < element) {
                            element = arg;
                            suffix = j;
                        }
                        j++;
                    }
                    swap[i] = element;
                    searchArray[suffix] = SENTINEL;
                    i++;
                }
                return swap;
            }
        });
    }

    /**
     * return the sorted array
     * 
     * @return
     */
    public int[] getSorted() {
        return super.sorted;
    }

    /* private method */

    private final void measure(Measure m) {
        final long startTime = System.nanoTime();
        super.sorted = m.sort();
        final long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime + "ms");
    }

    private interface Measure {
        int[] sort();
    }
}
