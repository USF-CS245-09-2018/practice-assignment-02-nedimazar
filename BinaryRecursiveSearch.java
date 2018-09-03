public class BinaryRecursiveSearch implements Practice2Search {


    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    @Override
    public int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length -1 );
    }

    public  int search(int[] a, int target, int low, int upper){
        if( low > upper){
            return(-1);
        }

        int mid = (upper + low) / 2;
        if(a[mid] == target){
            return(mid);
        } else if (a[mid] < target){
            return(search(a, target, mid+1, upper));
        } else {
            return (search(a, target, low, mid - 1));
        }
    }

    public static void main(String args[]){
        BinaryRecursiveSearch n = new BinaryRecursiveSearch();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(n.search(a,1));
    }
}
