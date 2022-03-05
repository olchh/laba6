package com.company;
import java.util.*;
class wuw {
    int x;
    int y;
    wuw( int x, int y){
        this.x = x;
        this.y = y;
    }
    public void vuv (){
        if( y + 1 == 0) {
            System.out.println("ошибка");
        }
        else {
            int z = (y + x) / (y + 1);
                System.out.println(z);
            }
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите x");
        int x = in.nextInt();
        System.out.println("введите y");
        int y = in.nextInt();
        wuw f = new wuw(x,y);
        f.vuv();
    }
}



