package acp;

public class PowerOf implements HandleMath {
    
    public void execute(Integer num1, Integer num2) {
        double sum = Math.pow(num1, num2);
        System.out.println(sum);
    }
    
}
