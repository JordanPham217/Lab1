class Solution {
    static void zeroDuplicator(int[] arr) {
        int possibleDuplication = 0;
        int length = arr.length - 1;

        for (int left = 0; left < length - possibleDuplication; left++) {
            if (arr[left] == 0) {
                if (left == length - possibleDuplication) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDuplication++;
            }
        }
        int last = length - possibleDuplication;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDuplication] = 0;
                possibleDuplication--;
                arr[i + possibleDuplication] = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int [] arr =  new int[] {1,0,2,3,0,4,5,0};
        zeroDuplicator(arr);
        System.out.println(arr[2]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
    }
}
