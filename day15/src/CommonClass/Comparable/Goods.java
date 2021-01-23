package CommonClass.Comparable;




public class Goods implements Comparable{
    String name;
    double price;
    int salas;

    public Goods() {
        super();
    }

    public Goods(String name, double price, int salas) {

        this.name = name;
        this.price = price;
        this.salas = salas;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", salas=" + salas +
                '}';
    }

    //按照价格从低到高排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            //方法一：

            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
                return -this.name.compareTo(goods.name);
            }

            //方法二：
            /*
            return Double.compare(this.price,goods.price);
            */
        }

        return 0;
    }
}
