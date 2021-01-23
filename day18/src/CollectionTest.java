import org.junit.Test;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/11/26 - 11 - 26 -12:41
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class CollectionTest {
    @Test
    public void test1(){
        //add(Object e):将元素e添加到集合coll中
        Collection coll = new ArrayList();
        coll.add("aa");
        coll.add("bb");
        coll.add(123);//自动装箱
        coll.add(new Date());


        //size():获取添加元素的个数
        System.out.println(coll.size());//4

        //addAll():将集合coll2添加到coll中
        Collection coll2 = new ArrayList();
        coll2.add(456);
        coll.addAll(coll2);

        System.out.println(coll);//4

        //clear():清空集合元素
        coll.clear();
        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());//true->为空
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);//自动装箱
        Person p = new Person(14,"Lucy");
        coll.add(new Person(12,"Tom"));
        coll.add(p);
        //contains(Object obj):判断当前集合中是否包含obj
        //判断时会调用obj对象所在类的equals()
        System.out.println(coll.contains(123));//true
        System.out.println(coll.contains(true));//false
        System.out.println(coll.contains(new String("Tom")));//true
        //判断的是内容，不是地址,因为String类已经重写了equals()方法
        System.out.println(coll.contains(p));//true
        System.out.println(coll.contains(new Person(12,"Tom")));//false
        //判断的是地址，说明还是原来的equals()方法，Person类没有重写

        Collection coll2 = new ArrayList();
        coll2.add(123);

        //containsAll(collection coll2):判断coll2集合所存储的数据在coll中是否都有
        System.out.println(coll.containsAll(coll2));//true

        //remove(Object obj):移除某个元素
        //coll.remove(123);

        //removeAll(Collection c):移除coll2集合记录的元素
        coll.removeAll(coll2);//移除交集：有就移除，没有就跳过
        System.out.println(coll);

        //retainAll():返回两个集合的交集,并修改当前集合

        //equals(Object obj):对比两个集合
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);//自动装箱

        //hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());//2761725

        //toArray() : 把集合 变为 数组
        Object[] arr = coll.toArray();

        //拓展：数组-->集合(调用Arrays类的静态方法aslist())
        List<String> list =Arrays.asList(new String[]{"AA","BB","CC"});
        List arr1= Arrays.asList(new int[] {123,456});
        System.out.println(arr1.size());//1,这个结构会被认为时一个整体
        System.out.println(arr1);//[[I@725bef66],数组的地址

        //直接这么写
        List arr2 = Arrays.asList(123,456);
        List arr3 = Arrays.asList(new Integer[] {123,456});
        System.out.println(arr2);//[123, 456]
        System.out.println(arr3);//[123, 456]

        //iterator():返回Iterator接口的实例，用于遍历集合元素
    }

    //iterator():返回Iterator接口的实例，用于遍历集合元素
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(new String("Tom"));
        coll.add(false);//自动装箱

        Iterator iterator = coll.iterator();
        //方式一：开发中，不推荐
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(iterator.next());
        }

        //方式二：开发中，推荐使用
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //错误方式
        //集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
        while(coll.iterator().hasNext()){//陷入死循环
            System.out.println(coll.iterator().next());
        }

        //remove():删除集合中的某个数据
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("Tom".equals(obj)){//细节：防止空指针，反着写
                iterator.remove();
            }
        }
    }


}
class Person implements Comparable{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person) o;
            int compare =  this.name.compareTo(person.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age, person.age);
            }
        }else{
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}