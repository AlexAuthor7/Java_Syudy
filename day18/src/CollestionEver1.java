import org.junit.Test;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/11/29 - 11 - 29 -11:37
 * @Description: PACKAGE_NAME
 * @Verxion: 1.0
 */
public class CollestionEver1 {
    @Test
    public void test(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student)o1;
                    Student s2 = (Student)o2;
                    return s1.getScore()-s2.getScore();
                }
                throw new RuntimeException("输入的数据不一致");
            }
        };
        Student s1 = new Student("A",9,1);
        Student s2 = new Student("B",3,2);
        Student s3 = new Student("C",7,3);
        Student s4 = new Student("D",2,4);
        Student s5 = new Student("F",5,5);
        Map map = new TreeMap(com);
        map.put(s1.getName(),s1.getScore());
        map.put(s5.getName(),s5.getScore());
        map.put(s2.getName(),s2.getScore());
        map.put(s4.getName(),s4.getScore());
        map.put(s3.getName(),s3.getScore());

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        for(int i = 0;i < 3 && iterator.hasNext();i++){
            System.out.println(iterator.next());
        }

    }

}
class Student implements Comparable{
    private String name;
    private int score;
    private int id;

    //构造器
    public Student() {
    }

    public Student(String name, int score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    //getter\setter

    public void setName(String name) {
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }



    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s = (Student)o;
            return this.score-s.score;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }
}