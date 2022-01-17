package myCode;

public class Linear {
    public static int LinearSearch(int[] data, int key) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == key) {
                return index;
            }
        }
        return -1;
    }
}
