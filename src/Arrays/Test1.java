package Arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int [] arr={1,5,6,3,7,55,62,4,89};
        System.out.println("原数组：");
        for (int i:arr){
            System.out.print(i+"\t");
        }
        Arrays.sort(arr);
        System.out.println("排序后数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        int index=Arrays.binarySearch(arr,7);//找到返回索引，否则返回负数。要求是必须是升序的
        System.out.println(index);

        String str=Arrays.toString(arr);//快速遍历,即生成字符串
        System.out.println(str);

        int [] arr1={1,2,3,4,5,6};
        int [] arr2=Arrays.copyOf(arr1,arr1.length);//获得元素副本
        System.out.println(Arrays.toString(arr2));

    }
}