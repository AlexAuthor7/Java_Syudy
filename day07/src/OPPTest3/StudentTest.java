package OPPTest3;

public class StudentTest {
    public static void main(String[] args) {
        //声明一个student类型的数组
        Student[] arr = new Student[20];

        //声明对象
        Student s1 = new Student();

        //调用赋值
        s1.put(arr);

        //调用遍历
        s1.printf(arr);

        //调用排序
        s1.sort(arr);

        System.out.println("***********************************************************************");
        //调用某年级信息
        s1.search(arr,3);

        System.out.println("***********************************************************************");
        //再次调用遍历
        s1.printf(arr);


    }
}
class Student{
    int num;//学号
    int state;//年级
    int score;//成绩
    //学生信息打印
    public String info(){
        return "学号：" + num +",年级：" + state + "，成绩：" + score;
    }

    //赋值
    public void put(Student[] arr){
        for(int i = 0;i < arr.length;i++) {
            arr[i] = new Student();
            //给student对象的属性赋值
            arr[i].num = (i + 1);//学号
            arr[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);//年级
            arr[i].score = (int) (Math.random() * (100 + 1));//成绩
        }
    }
    //遍历
    public void printf(Student[] arr){
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i].info());//调info
        }
    }
    /**
     * 查找Stident数组中指定年级的学生信息
     * s1 要查找的数组
     * state 要查找的年级
     */
    //打印某年级的信息
    public void search(Student[] arr,int state){
        for(int i = 0;i < arr.length;i++){
            if(arr[i].state == state){
                System.out.println(arr[i].info());//调info
            }
        }
    }
    /**
     * 给Student数组排序
     */
    //冒泡排序
    public void sort(Student[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j=0;j < arr.length - 1 - i;j++){
                if(arr[j].score > arr[j + 1].score){//成绩比大小
                    Student temp = arr[j];//声明一个Student类型的数组
                    arr[j] = arr[j + 1];   //对象数组的替换
                    arr[j + 1] = temp;
                }
            }
        }
    }
}



/*        //给数组元素赋值
        for(int i = 0;i < s1.length;i++){
            s1[i] = new Student();
            //给student对象的属性赋值
            s1[i].num = (i + 1);//学号
            s1[i].state = (int)(Math.random()*(6 - 1 + 1) + 1);//年级
            s1[i].score = (int)(Math.random()*(100 + 1));//成绩
        }
        //遍历学生数组
        for(int i = 0;i < s1.length;i++){
            //System.out.println(s1[i].num + "," + s1[i].state +","+s1[i].score);//s1[i]的结果是20个地址值
            System.out.println(s1[i].info());//调info
        }
        System.out.println("*************************************");
        //问题一：打印出3年级(state值为3）的学生信息。
        for(int i = 0;i < s1.length;i++){
            if(s1[i].state == 3){
                System.out.println(s1[i].info());//调info
            }
        }
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0;i < s1.length;i++){
            for(int j=0;j < s1.length - 1 - i;j++){
                if(s1[j].score > s1[j + 1].score){//成绩比大小
                    Student temp = s1[j];//声明一个Student类型的数组
                    s1[j] = s1[j + 1];   //对象数组的替换
                    s1[j + 1] = temp;
                }
            }
        }
        System.out.println("*************************************");
        //遍历学生数组
        for(int i = 0;i < s1.length;i++) {
            //System.out.println(s1[i].num + "," + s1[i].state +","+s1[i].score);//s1[i]的结果是20个地址值
            System.out.println(s1[i].info());//调info
        }*/

