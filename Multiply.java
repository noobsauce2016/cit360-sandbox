package acp;

public class Multiply implements HandleMath {
    
    public void execute(Integer num1, Integer num2) {
        Integer sum = num1 * num2;
        System.out.println(sum);
    }
    
}
