package edu.roboproworld;

public class rpSort {
    public int[] bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
        return arr;
	}

    public long[] bubble(long arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
        return arr;
	}

    public int[] selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public long[] selection(long arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            long temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] primeNum(int arr[]) {
        int P[] = new int[arr.length], C[] = new int[arr.length], i = 0, j = 0, k = 0, c;
        for (; i < 10; i++) {
            c = 0;
            for (int f = 2; f < arr[i]; f++)
                if (arr[i] % f == 0)
                    c++;
            if (c > 0)
                C[k++] = arr[i];
            else
                P[j++] = arr[i];
        }
        return P;
    }
}
