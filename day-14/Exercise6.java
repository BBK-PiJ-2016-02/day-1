import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();

        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(3);
        unsorted.add(7);
        unsorted.add(2);
        unsorted.add(9);
        unsorted.add(1);
        List<Integer> sorted = obj.mergeSort(unsorted);

        System.out.print("\nUnsorted: ");
        for(int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }
        System.out.print("\nSorted:   ");
        for(int i = 0; i < sorted.size(); i++) {
            System.out.print(sorted.get(i) + " ");
        }
    }

    private List<Integer> mergeSort(List<Integer> list) {
        // if(list.size() > 1) {
        //     List<Integer> a = this.mergeSort(list.subList(0, list.size() / 2));
        //     List<Integer> b = this.mergeSort(list.subList(list.size() / 2, list.size()));

        //     if(a.get(0) > b.get(0)) {
        //         b.addAll(0, a);
        //         list = b;
        //     } else {
        //         a.addAll(0, b);
        //         list = a;
        //     }
        // }

        return list;
    }
}