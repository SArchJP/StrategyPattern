
public class Context {
    private GreetStrategy strategy;

    public Context() {
    }

    public void setStrategy(GreetStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String firsName, String lastName){
        return strategy.greet(firsName, lastName);
    }

}
