public class Sorter {
    private SortingStrategy ss;
    public Sorter(SortingStrategy ss){
        this.ss=ss;
    }
    public void doSort(int[] arr){
        ss.sort(arr);
    }
    
}
