package cn.tedu.shoot;
/** 英雄级*/
public class Hero extends FlyingObject{
    int life;
    int doubleFire;

    Hero(){
        super(97,124,140,400);
        life =3;
        doubleFire=0;

    }
    void moveTo(int x,int y){
        System.out.println("英雄机随着鼠标移动");
    }
}
