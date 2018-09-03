public class LinearSearch implements Practice2Search {

    @Override
    public String searchName() {
        return "Linear Search";
    }

    @Override
    public int search(int[] arr, int target) {
        for(int x = 0; x < arr.length;){
            if (arr[x] == target){
                return x;
            }
            x++;
        }
        return -1;
    }
}
