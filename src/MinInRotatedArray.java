public class MinInRotatedArray {

        public int findMin(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[(mid + 1) % arr.length] > arr[mid] && arr[(mid - 1 + arr.length) % arr.length] > arr[mid]) {
                    return arr[mid];
                } else {
                    if (arr[mid] > arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            // If the loop completes without finding the minimum element, return arr[start].
            return arr[start];
        }
    }


