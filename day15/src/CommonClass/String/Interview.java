package CommonClass.String;
//面试题
public class Interview {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        Interview ex = new Interview();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//good,引用类型(String)传地址值（会变）,但是String有不可变性
        System.out.println(ex.ch);//best,引用类型(数组)传地址值（会变）
    }
}
