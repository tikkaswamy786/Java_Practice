import java.util.Arrays;
class index_number
{
    private static int[] insert(int[] a, int key, int index)
    {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
        result[index] = key;
        for (int i = index + 1; i <= a.length; i++) {
            result[i] = a[i - 1];
        } 
        return result;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 4, 5 };
        int key =  10;
        int index = 3;
        a = insert(a, key, index);
        System.out.println(Arrays.toString(a));
    }
}