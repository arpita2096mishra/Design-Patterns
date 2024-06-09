public class Main {
    public static void main(String[] args) {
        int[] arr={2,6,7,9};
        Sorter ss=new MergeSorter();
        ss.doSort(arr);
        ss=new QuickSorter();
        ss.doSort(arr);
    }
    
}
