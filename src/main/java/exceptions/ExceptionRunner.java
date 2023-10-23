package exceptions;

public class ExceptionRunner {

    public static void main(String[] args) {

        ExceptionPractice exceptionPractice = new ExceptionPractice();

        try {
            exceptionPractice.checkEven(6);
            System.out.println("number is even!");
        } catch (Exception exception){
            System.out.println("Something went wrong");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            System.out.println("hopefully that was useful!");
        }

        exceptionPractice.addNumberToList(1);

    }

}
