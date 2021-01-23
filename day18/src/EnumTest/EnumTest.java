package EnumTest;



import org.junit.Test;

/**
 * @Auther: Alex
 * @Date: 2020/11/24 - 11 - 24 -16:47
 * @Description: EnumTest
 * @Verxion: 1.0
 */
//4、其他诉求1 ： 获取枚举类的对象
//自定义枚举类


public class EnumTest {
    @Test
    public void test(){
        Season spring = Season.SUMMER;
    }
}
interface Info{
    void show();
}

enum Season implements Info{
    //1、提供枚举类的多个对象,多个对象之间用”,“可开,末尾用”;“结束
    SPRING("春","春"){
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER("夏","夏"){
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUME("秋","秋"){
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER("冬","冬"){
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    //2、声明对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3 、私有化类的构造器,并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //其他诉求2： 提供toString()方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}