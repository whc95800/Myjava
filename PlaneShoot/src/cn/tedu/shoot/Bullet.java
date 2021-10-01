package cn.tedu.shoot;

public class Bullet extends FlyingObject{
    int speed;

    Bullet(int x,int y){
        super(8,14,x,y);
        speed=3;
    }
}
