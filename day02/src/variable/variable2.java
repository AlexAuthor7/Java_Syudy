package variable;

public class variable2 {
    public static void main(String[] args){
      //编码情况1
        long l1 = 1212;
        System.out.println(l1);
      //没加L也可以，但会被默认为是int，超过范围就编译失败

      //编码情况2
      //整形常量,默认int
      //浮点型,默认double
        byte b1 = 12;
      //  byte b2 = b1 + 1;  //编译失败
      //  float f1 = b1 + 12.3  //编译失败
    }

}
