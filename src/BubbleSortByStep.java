public class BubbleSortByStep {
    public static void main(String[] args) {
        int[] list = {1,5,6,4,7,8,2,3,9,7,1};
        bubbleSort(list);

    }
    public static void bubbleSort(int[] arr) {
        Boolean needNextPass = true;
        int i;
        for (i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swap " + arr[j] + " with " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Arr have been sorted!");
                break;
            }
        }
        System.out.print("List after the  " + i + "' sort: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
}
