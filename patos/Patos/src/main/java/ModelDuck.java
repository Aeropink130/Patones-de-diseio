public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quakBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato modelo :v");
    }
    
}
