package exceptions;

import java.util.ArrayList;

public class ExceptionPractice {

    private ArrayList<Integer> numbers;

    public ExceptionPractice(){
        this.numbers = new ArrayList<>();
    }

    public boolean checkEven(int number) throws Exception{
        if (number % 2 == 0){
            return true;
        }
        throw new Exception("Provided number is not even");
    }

    public void addNumberToList(int number){
        this.numbers.add(number);
    }

}
