package cn.tedu.shoot;
/** 整个游戏世界 */
public class World {
    Sky sky = new Sky();
    Hero hero =new Hero();
    FlyingObject[] enemies ={};
    Bullet[] bullets ={};

    void action(){ //测试代码
        enemies = new FlyingObject[5];
        enemies[0] = new Airplane();
        enemies[1] = new Airplane();
        enemies[2] = new BigAirplane();
        enemies[3] = new BigAirplane();
        enemies[4] = new Bee();
        for(int i=0;i<enemies.length;i++){
            System.out.println(enemies[i].x+","+enemies[i].y);
            enemies[i].step();
        }


    }

    public static void main(String[] args) {
        World world = new World();
        world.action();

    }
}
