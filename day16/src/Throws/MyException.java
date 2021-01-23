package Throws;

public class MyException extends RuntimeException{

    private static final long serialVersionUID = 1687848994976808490L;

    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
