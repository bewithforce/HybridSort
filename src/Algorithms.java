class Algorithms {
    void hybridSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    void mergeSort(int[] list) {
        merge(list, 0, list.length - 1);
    }

    void quickSort(int[] list, int first, int last) {
        int size = (last + 1) - first;
        if (first < last) {
            if (size <= Variables.SIZE_OF_PIECE) {
                insertionSort(list, first, last);
            } else {
                int pivotIndex = (first + last) / 2;
                quickSort(list, first, pivotIndex);
                quickSort(list, pivotIndex + 1, last);
            }
        }
    }

    void insertionSort(int[] list, int first, int last) {
        for (int i = first + 1; i <= last; i++) {
            int currentElement = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > currentElement) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = currentElement;
        }
    }

    void merge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void merge(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            merge(arr, l, m);
            merge(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}



