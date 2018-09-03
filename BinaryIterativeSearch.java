import java.util.Arrays;

public class BinaryIterativeSearch implements Practice2Search {
    @Override
    public String searchName() {
        return "Binary Iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0;
        int upper = arr.length;

        while(low < upper){
            int mid = (upper + low)/2;

            if (arr[mid] == target){
                return(mid);
            } else if (target < arr[mid]){
                upper = mid -1;
            } else {
                low = mid + 1;
            }
        }

        return -1;

        }



    public static void main(String args[]){
        BinaryIterativeSearch n = new BinaryIterativeSearch();
        int[] a = {1,2,3,5,6,7,8};
        System.out.println(n.search(a,8));
    }
}
