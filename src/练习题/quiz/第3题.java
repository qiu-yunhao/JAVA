package 练习题.quiz;

public class 第3题 {
    public static void main(String[] args) {
        int[] v = {2, 5, 6, 8, 10, 1, 4, 7, 9, 3};
        int a = v.length-1;
        System.out.println(a);
        ks(v, 0, a);
        for (int i = 0; i <= a; i++) {
            System.out.print(v[i] + " ");
        }
    }

    /*快速排序*/
    public static void ks(int v[], int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int key = v[low];
            if (i >= j)
                return;
            while (i < j) {
                while (key <=v[j] && i < j) {
                    j--;
                }
                if(i<j)
                    v[i++] = v[j];
                while (key > v[i] && i < j) {
                    i++;
                }
                if(i<j)
                v[j--] = v[i];
                v[i] = key;
                ks(v, low, i - 1);
                ks(v, i + 1, high);
            }
        }
    }

    /*归并排序*/
    public void gb(int v[])
    {

    }

    /*堆排序*/
    public void d(int v[]) {

    }
}


