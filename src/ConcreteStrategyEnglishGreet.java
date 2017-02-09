
public class ConcreteStrategyEnglishGreet implements GreetStrategy {

    @Override
    public String greet(String firstName, String lastName) {
        return "Welcome " + firstName + " " + lastName;
    }
}
