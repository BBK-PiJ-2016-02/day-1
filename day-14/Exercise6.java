import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();

        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(3);
        unsorted.add(7);
        unsorted.add(3454);
        unsorted.add(23);
        unsorted.add(221);
        unsorted.add(14);
        unsorted.add(22);
        unsorted.add(9);
        unsorted.add(1);
        List<Integer> sorted = obj.mergeSort(unsorted);

        System.out.print("\nUnsorted: ");
        for(int i = 0; i < unsorted.size(); i++) {
            System.out.print(unsorted.get(i) + " ");
        }
        System.out.print("\nSorted:   ");
        for(int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }
    }

    private List<Integer> mergeSort(List<Integer> list) {
        int listSize = list.size();
        if(listSize < 2) return list;

        int midPoint = listSize / 2;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for(int i = 0; i < listSize; i++) {
            if(i < midPoint) {
                listA.add(list.get(i));
            } else {
                listB.add(list.get(i));
            }
        }

        listA = this.mergeSort(listA);
        listB = this.mergeSort(listB);

        return this.merge(listA, listB);
    }

    private List<Integer> merge(List<Integer> listA, List<Integer> listB) {
        List<Integer> list = new ArrayList<>();

        while(listA.size() > 0 && listB.size() > 0) {
            if(listA.get(0) < listB.get(0)) {
                list.add(listA.remove(0));
            } else {
                list.add(listB.remove(0));
            }
        }

        while(listA.size() > 0) list.add(listA.remove(0));
        while(listB.size() > 0) list.add(listB.remove(0));

        return list;
    }
}