package MergeSortThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> arrayTosort;
    Sorter(List<Integer> arrayTosort) {
        this.arrayTosort = arrayTosort;
    }

    public List<Integer> call() throws Exception{
        if(arrayTosort.size() <= 1) {
            return arrayTosort;
        }
        int mid = arrayTosort.size() / 2;
        Sorter leftSorter = new Sorter(arrayTosort.subList(0, mid));
        Sorter rightSorter = new Sorter(arrayTosort.subList(mid, arrayTosort.size()));

        ExecutorService es=Executors.newCachedThreadPool();
        Future<List<Integer>> leftFuture = es.submit(leftSorter);
        Future<List<Integer>> rightFuture = es.submit(rightSorter);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();
        es.shutdown();
        return merge(leftSorted, rightSorted);

    }
    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        int i = 0, j = 0;
        List<Integer> merged = new ArrayList<>();

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}
