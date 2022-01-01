package Arrays;

import java.util.Arrays;

public class Shuangseqiu {
    /*
    * 双色球规则
    * 前六位 红球 1-33 不能重复 升序
    * 最后一位 蓝球 1-16 可与前六位重复
    * */
    public static void main(String[] args) {
        int [] lottrry=getLottery();
        System.out.println(Arrays.toString(lottrry));
    }

    public static int[] getLottery(){
        int [] lottery=new int[6];
        /*生成随机数*/
        for (int i = 0; i < 6; i++) {
            int num=(int)(Math.random()*33+1);
            while (inContain(lottery,num)){
                num=(int)(Math.random()*33+1);
            }
            /*放入数组*/
            lottery[i]=num;
        }
        Arrays.sort(lottery);
        //数组复制
        int [] lottery2=new int[7];
        System.arraycopy(lottery,0,lottery2,0,6);
        lottery2[6]=(int)(Math.random()*16+1);
        return lottery2;
    }
    public static boolean inContain(int [] arr,int b){
        //用于判断给定数组中是否包含给定元素
        boolean flag=false;
        for (int x:arr){
            if(x==b){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
