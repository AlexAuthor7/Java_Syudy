package CommonClass.String;

import org.junit.Test;
import java.util.Arrays;
//1、 模拟一个trim方法，去除字符串两端的空格。
public class Arithmetic {
    @Test
    public void test1(){
        String str1 = "  hello  ";
        String str2 = str1.trim();
        System.out.println(str2);
    }

//2、将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
    @Test
    public void test2(){
        String str1 = "abcdefg";
        char arr[] = str1.toCharArray();
        //数组的反转(3~6位)
        for (int i = 2; i < 4; i++) {
            char temp = arr[i];
            arr[i] = arr[7-i];
            arr[7-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
//3、获取一个字符串在另一个字符串中出现的次数。
    @Test
    public void test3(){
        String str1 = "abaabbcabab";
        String str2 = "ab";
        int count = 0;

        for (int i = 0; i < str1.length();) {
            int sort = str1.indexOf(str2,i);
            i = sort + str2.length();
            if(sort >= 0){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
// 4、.获取两个字符串中最大相同子串。比如：
//    str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//hello
//    提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    @Test
    public void test4(){
        //equals\charAt
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        boolean isFlag = false;//设置标记
        for (int i = str2.length(); i >= 1; i--) {
            char[] arr = new char[i];
            if(isFlag){//跳出循环
                break;
            }
            for (int k = 0; k <= str2.length() - i; k++) {
                for (int j = 0,l = k ; j <= i-1 ; j++,l++) {//转换为数组
                    arr[j] = str2.charAt(l);
                }
                String str3 = new String(arr);//转回字符串
                int ret = str1.indexOf(str3);//对比
                if(ret >= 0){
                    System.out.println(str3);
                    isFlag = true;//标记
                    break;
                }
            }
        }
    }

//5.对字符串中字符进行自然顺序排序。
//  提示：
//  1）字符串变成字符数组。
//  2）对数组排序，选择，冒泡， Arrays.sort();
//  3）将排序后的数组变成字符串。
    @Test
    public void test5(){
        String str = "qwertyuiomQWERTYUIXCVBNM";
        char[] arr1 = str.toCharArray();
        Arrays.sort(arr1);

        String str2 = new String(arr1);
        System.out.println(str2);

    }


}
