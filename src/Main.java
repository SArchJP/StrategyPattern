
public class Main {
    public static void main(String[] args){
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyEnglishGreet());
        String outputEng = context.executeStrategy("Jonas","Jonaitis");

        context.setStrategy(new ConcreteStrategyLithuanianGreet());
        String outputLt = context.executeStrategy("Mike","Tyson");

        System.out.println(outputEng);
        System.out.println(outputLt);
    }
}
