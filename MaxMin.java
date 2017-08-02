package Lee;

/**
 * Created by Administrator on 2017/7/13.
 */
public class MaxMin {
    public static void BubbleSort(int[] a)
    {
        int i;
        int j;
        int temp=0;
        for(i=0;i<a.length;i++) {
            for (j=a.length-1;j>i;j--)
            {
                if (a[j-1]>a[j])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int i=0;
        int a[]={1,2,5,9};
        BubbleSort(a);
        for (i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}

