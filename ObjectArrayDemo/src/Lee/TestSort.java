package Lee;

/**
 * Created by Administrator on 2017/7/13.
 */
public class TestSort {
    public static void selectSort(int[] a)
    {
        int i;
        int j;
        int temp=0;
        int flag=0;
        for(i=0;i<a.length;i++)
        {
            temp=a[i];
            flag=i;
            for (j=i+1;j<a.length;j++)
            {
                if(a[j]<temp)
                {
                    temp=a[j];
                    flag=j;
                }
            }
            if (flag!=i) {
                a[flag] = a[i];
                a[i] = temp;
            }

    }

        }
    public static void main(String[] args){
        int i=0;
        int a[]={1,2,5,9};
        selectSort(a);
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }

    }
}

