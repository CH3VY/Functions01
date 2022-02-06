public class Functions {

    public static void main(String[] args){
        int[] array = {12, 45, 87, 89, 75, 45, 32, 21, 11, 46, 54, 41 ,73, 46};
        printMaxElement(array);

    }

    static void printMaxElement(int[] array) {

        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements =0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }

        System.out.println("Max element is: " + max);
        System.out.println("Max element's index is: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}
