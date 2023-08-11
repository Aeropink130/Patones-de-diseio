public class MallardDuck extends Duck{

    public MallardDuck() {
        quakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }

    @Override
    public void display() {
        System.out.println("Soy un pato malardo :v");
    }
    
}
