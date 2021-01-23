package GenericTest;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -17:29
 * @Description: GenericTest
 * @Verxion: 1.0
 */
//自定义的泛型类
public class Order<T> {
    private String name;
    private int id;

    //如果类名是 Xxx<T>,类的内部结构就可以使用泛型
    //其实是c++的模板
    T orderT;
    //构造器
    public Order() {}

    public Order(String name,int id,T orderT){
        this.name = name;
        this.id = id;
        this.orderT = orderT;
    }


    public T getOrderT(){
        return orderT;
    }
    public void setOrderT(T orderT){
        this.orderT = orderT;
    }
}
