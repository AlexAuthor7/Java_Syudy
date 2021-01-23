package GenericTest;

import org.junit.Test;

import java.util.List;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -17:35
 * @Description: GenericTest
 * @Verxion: 1.0
 */
public class GenericTest2 {
    @Test
    public void test(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        Order order1 = new Order();
        order1.setOrderT(123);
        order1.setOrderT("ABC");

        //要求：如果大家定义的类是带泛型的，建议在实例化的时候要指明类的泛型
        Order<String> order2 = new Order<>("A",12,"order:A");
        order2.setOrderT("A:hello");
    }
    @Test
    public void test2(){
        //SubOrder已经不是泛型类了
        SubOrder sub1 = new SubOrder();
        //由于子类在继承来泛型的父类时，指明了泛型的类型。则实例化子类的对象时，不再需要指明泛型
        sub1.setOrderT(111);
        //SubOrder2<T>仍是泛型类，在声明时指明器泛型类型
        SubOrder2<String> sub2 = new SubOrder2<>();
        sub2.setOrderT("AAA");
    }
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;

        list = list1;
        list = list2;

        //添加：对于list<?>就不能向其内部添加数据，除了添加null之外
//        list.add();

        //获取（读取）:允许读取数据，读取数据的类型为Object
        Object o = list.get(0);
        System.out.println(o);
    }

    @Test
    public void test4(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;//通过
        list1 = list4;//通过
//        list1 = list5;//编译不通过

//        list2 = list3;//编译不通过
        list2 = list4;//通过
        list2 = list5;//通过

        //写入数据
//        list1.add(new Person());//编译不通过
//        list1.add(new Student());//编译不通过
//        list1.add(new Object());//编译不通过

        list2.add(new Person());//通过
        list2.add(new Student());//通过
//        list2.add(new Object());//编译不通过

    }
}
