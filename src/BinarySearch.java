public class BinarySearch {

    public static void main(String[] args){
        int[] SortedArray = {12, 24, 26, 34, 35, 42, 50, 65, 68, 78, 82, 86, 89};
        int key = 42;
        int position = binarySearch(SortedArray, key);
        System.out.println(key + "'s position is "+ position + ".");

    }

    static int binarySearch(int[] array, int key) {
        int position = 0;
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int middle = (left + right)/2;

            if(array[middle] == key){
                System.out.println("Key found!\n");
                return middle;
            }

            if(array[middle] < key){
                System.out.println("Cut the left half...\n");
                left = middle + 1;
            }

            if(array[middle] > key){
                System.out.println("Cut the right half...\n");
                right = middle - 1;
            }
        }

        return -1;
    }
}
