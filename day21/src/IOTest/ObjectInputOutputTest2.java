package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/5 - 12 - 05 -18:16
 * @Description: IOTest
 * @Verxion: 1.0
 */
public class ObjectInputOutputTest2{

    //序列化
    @Test
    public void test1(){
        Person p1 = new Person("Tom",15);
        Person p2 = new Person("Amy",20);
        Person p3 = new Person("Lucy",23);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Person.dat"));

            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
            oos.writeObject(p3);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null)
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //反序列化
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Person.dat"));

            Object obj;
            while ((obj = ois.readObject()) != null) {//有问题
                Person person = (Person) obj;
                System.out.println(person.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void tset(){
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile(new File("hello.txt"),"rw");

            raf1.seek(3);//将指针调到角标为3 的位置
            //保存指针3 后面所有的数据到StringBuffer中
            StringBuilder builder = new StringBuilder((int)new File("hello.txt").length());//获取文件的长度
            byte[] byteBuffer = new byte[20];
            int len;
            while((len = raf1.read(byteBuffer)) != -1){
                builder.append(new String(byteBuffer,0,len));
            }
            //调回指针，写入“xyz”
            raf1.seek(3);
            raf1.write("xyz".getBytes());//把字符串——>字节数组

            //将StringBuilder中的数据写入文件中
            raf1.write(builder.toString().getBytes());//因为builder没有getBytes()方法，所以把它变成字符串，用String的getBytes()方法
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(raf1 != null)
                raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test4(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("idea.jpg"), "r");
            raf2 = new RandomAccessFile(new File("idea3.jpg"), "rw");

            byte[] byteBuffer = new byte[1024];
            int len;
            while ((len = raf1.read(byteBuffer)) != -1) {
                raf2.write(byteBuffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Person implements Serializable{
    private static final long serialVersionUID = 6695383790123736493L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}