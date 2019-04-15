package templatepattern;

import java.util.Scanner;

/**
 * @author Sui
 * @date 2018/7/9 15:43
 */
public class CoffeeWithCustomCondiments extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected boolean customWantsCondiments() {
        String answer = getCustomerAnswer();
        return answer.toLowerCase().startsWith("y");
    }

    private String getCustomerAnswer(){
        System.out.println("Would you want condiments? y/n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
