public class BubbleSort {

    public static void main(String[] args) {
        int[] Array1 = {8, 5, 7, 3, 2};
        bubbleSearch(Array1);
    }

    static void bubbleSearch(int[] array){
        int comparisons = 0;
        int swaps = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for(int i = 0; i < array.length-1; i++){
                printArray(array);
                if (array[i] > array[i+1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swaps++;
                    sorted = false;
                }
                else {
                    System.out.println("No need to change elements " + i + " and " + (i+1));
                }
                comparisons++;
            }
        }
        System.out.println("Array size: " + array.length);
        System.out.println("Comparisons done: " + comparisons);
        System.out.println("Swaps done: " + swaps);
    }

    static void printArray(int[] array) {
        for (int j : array) System.out.println(j + "\n");
        System.out.println();
    }
}





