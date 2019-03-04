package edu.ren.datastructure.interviewBit.queue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;

public abstract class MaximumInSlidingWindowAbstractTest {
    MaximumInSlidingWindow maximumInSlidingWindow= getMaximumInSlidingWindow();

    protected abstract MaximumInSlidingWindow getMaximumInSlidingWindow();

    @Test
    public void getMax() {
        Integer[] arr={1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 3);
        assertThat(max,contains(3, 3, 4, 5, 5, 5, 6));
    }

    @Test
    public void getMax_1() {
        Integer[] arr={1, 2, 3, 1};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 3);
        assertThat(max,contains(3,3));
    }

    @Test
    public void getMax_WindowLargerThanArray() {
        Integer[] arr={1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 19);
        assertThat(max,contains(6));
    }


    @Test
    public void getMax_WindowSizeOfArray() {
        Integer[] arr={1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 9);
        assertThat(max,contains(6));
    }

    @Test
    public void getMax_11() {
        Integer[] arr={1};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 1);
        assertThat(max,contains(1));
    }

    @Test
    public void getMax_12() {
        Integer[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 1);
        assertThat(max,contains(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
    }
  @Test
    public void getMax_122() {
        Integer[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 2);
        assertThat(max,contains(10, 9, 8, 7, 6, 5, 4, 3, 2));
    }

       @Test
    public void getMax_13() {
      //     A : [ 90, 767, 90, 777, 463, 196, 984, 277, 451, 643, 403, 316, 451, 967, 683, 786, 167, 372, 758, 402, 325, 431, 351, 351, 158, 663, 244, 559, 345, 759, 924, 585, 509, 397, 540, 869, 997, 670, 375, 180, 48, 936, 203, 8, 598, 703, 733, 333, 414, 377, 496, 351, 910, 685, 612, 773, 571, 24, 679, 174, 644, 639, 544, 1, 884, 982, 447, 670, 251, 868, 815, 467, 386, 932, 178, 295, 957, 757, 124, 932, 342, 301, 406, 259, 943, 79, 313, 218 ]
       //B 7
        Integer[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> max = maximumInSlidingWindow.getMax(arr, 1);
        assertThat(max,contains(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        // 984 984 984 984 984 984 984 967 967 967 967 967 967 967 786 786 758 758 758 663 663 663 663 759 924 924 924 924 924 924 997 997 997 997 997 997 997 936 936 936 936 936 733 733 733 733 910 910 910 910 910 910 910 773 773 773 679 679 884 982 982 982 982 982 982 982 868 932 932 932 957 957 957 957 957 957 957 932 943 943 943 943
    }

}
