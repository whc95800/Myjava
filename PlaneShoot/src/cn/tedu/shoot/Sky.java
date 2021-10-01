package cn.tedu.shoot;
/** 天空*/
public class Sky extends FlyingObject{
    int speed;
    int y1; //第二张图片的y坐标

    Sky(){
        super(400,700,0,0);
        speed =1;
        y1 = -700;
    }

}
