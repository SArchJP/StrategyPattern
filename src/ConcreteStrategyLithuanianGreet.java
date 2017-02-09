
public class ConcreteStrategyLithuanianGreet implements GreetStrategy {

    @Override
    public String greet(String firstName, String lastName) {
        return "Tėbūna pasveikintas " + firstName +" "+lastName;
    }
}
