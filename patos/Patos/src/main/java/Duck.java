
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quakBehavior;

    public Duck() {
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quakBehavior.quack();
    }
    
    public void swim(){
        System.out.println("Todos los patos flotan, hasta los de madera :v");
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quakBehavior = qb;
    }
}
