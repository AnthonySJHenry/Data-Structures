public class BinarySearch {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
//        int target = 22;
//
//        BinarySearch bs = new BinarySearch();
//        bs.search(arr, target);
//    }

    public void search(int[] array, int elem){
        int mid = array.length/2;
        int first = 0;
        int last = array.length;
        boolean found = false;

        while(!found){
            if(elem > array[mid]){
                first = mid;
                mid = (mid+last)/2;
            }
            else if(elem < array[mid]){
                last = mid;
                mid = (first+mid)/2;
            }
            else if(elem == array[mid]){
                System.out.println(elem+" has been found at index "+mid);
                found = true;
            }
        }

    }

}
