package qiantaosunhuan;
/*
九九乘法表
 */
public class NineNineTable {
    public static void main(String[] args) {
        /*
        *
        * *
        * * * 型
         */
        for(int i = 1;i <= 9;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j + "  ");
            }
            System.out.println();
        }

        System.out.println();
        /*
        * * *
        * *
        * 型
         */
        for(int i = 9;i >= 1;i--){
            for(int j = 1; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j + "  ");
            }
            System.out.println();
        }

        System.out.println();
        /*
            *
          * *
        * * *型
        */
        for(int i = 1;i <= 9;i++){
            for(int j = 8; j >= i;j--) {                  //打空格
                System.out.print("        ");
            }
            for(int j = 1; j <= i;j++){                  //打表
                System.out.print(i + "*" + j + "=" + i*j + "  ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        * * *
          * *
            *  型
         */
        for(int i = 9;i >= 1;i--){
            for(int j = 1; j <= 9 - i;j++) {                  //打空格
                System.out.print("        ");
            }
            for(int j = 1; j <= i;j++){                      //打表
                System.out.print(i + "*" + j + "=" + i*j + "  ");
            }
            System.out.println();
        }

    }
}
