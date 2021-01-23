package ThreadTest1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Auther: Alex
 * @Date: 2020/12/3 - 12 - 03 -10:26
 * @Description: ThreadTest1
 * @Verxion: 1.0
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();

        FutureTask futureTask = new FutureTask(newThread);

        new Thread(futureTask).start();
        try {
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call(）的返回值
            Object sum = futureTask.get();//获取返回值
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class NewThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}