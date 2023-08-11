public class Patos {

    public static void main(String[] args) {
  //      Duck malardo = new MallardDuck();
  //      malardo.performFly();
  //      malardo.performQuack();
        
        Duck modelo = new ModelDuck();
        modelo.performFly();
        modelo.setFlyBehavior(new FlyRocketPowered());
        modelo.performFly();
    }
}
