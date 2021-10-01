package cn.tedu.shoot;

import java.util.Random;

public class FlyingObject {
    int width;
    int height;
    int x;
    int y;

    FlyingObject(int width,int height,int x,int y){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
    }




    FlyingObject(int width,int height){
        this.width=width;
        this.height=height;
        Random rand = new Random();
        x=rand.nextInt(400-this.width);
        y=-this.height;
    }



    void step(){
        System.out.println("飞行物移动啦！：");
    }
}
