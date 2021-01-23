package GenericEver;

import java.util.*;

/**
 * @Auther: Alex
 * @Date: 2020/12/4 - 12 - 04 -16:02
 * @Description: GenericEver
 * @Verxion: 1.0
 */
public class DAO<T> {
    //map没有实例化，会出现空指针异常
    private Map<String,T> map = new HashMap<>();

    //保存T类的对象到Map成员变量中
    public void save(String id,T entity){
         map.put(id,entity);
    }
    //从 map 中获取 id 对应的对象
    public T get(String id){
        return map.get(id);
    }
    //替换 map 中 key 为 id 的内容,改为 entity 对象
    public void update(String id,T entity){
        map.put(id,entity);
    }
    //返回 map 中存放的所有 T 对象
    public List<T> list(){//注意
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for(T t : values){
            list.add(t);
        }
        return list;
    }
    //删除指定 id 对象
    public void delete(String id){
        map.remove(id);
    }
}
