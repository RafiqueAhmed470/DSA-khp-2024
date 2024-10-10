public class Task02 {
    int[] noDup(int arr[][]) {
        int a[] = new int[20];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                boolean isDuplicate = false;

               
                for (int k = 0; k < index; k++) {
                    if (a[k] == arr[i][j]) {
                        isDuplicate = true;
                        break;
                    }
                }

               
                if (!isDuplicate) {
                    a[index] = arr[i][j];
                    index++;
                }
            }
        }

        
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }

        return result;
    }

    public static void main(String args[]) {
        Task02 t = new Task02();
        int arr[][] = {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}, {9, 10, 11, 12, 13}, {1, 14, 15, 16, 17}};
        int noDup[];

        noDup = t.noDup(arr);

        for (int i = 0; i < noDup.length; i++) {
            System.out.println(noDup[i] + "  ");
        }
    }
}
