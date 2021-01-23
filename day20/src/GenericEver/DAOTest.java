package GenericEver;

import org.junit.Test;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -16:38
 * @Description: GenericEver
 * @Verxion: 1.0
 */
public class DAOTest {
    @Test
    public void test(){
        //泛型类声明时，要指明泛型类型
        DAO<User> d = new DAO<User>();
        d.save("1",new User(1,99,"A"));
        d.save("2",new User(2,98,"B"));
        d.save("3",new User(3,97,"C"));
        d.save("4",new User(4,96,"D"));

        System.out.println(d.get("1").toString());

        d.update("2",new User(5,200,"B"));

        d.delete("4");

        System.out.println(d.list().toString());
    }
}
