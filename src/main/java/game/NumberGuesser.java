package game;

import java.util.Random;

public class NumberGuesser implements IPlay {

    private boolean running;
    private int secretNumber;

    public NumberGuesser(){
        this.running = false;
    }

    public boolean isRunning(){
        return this.running;
    }

    public String start(){
        Random random = new Random();
        this.secretNumber = random.nextInt(1, 101);
        this.running = true;
        return "Welcome to the number guessing game!";
    }

    public String promptForGuess(){
        return "Guess a number between 1 and 100:";
    }

    public String processGuess(String string) throws NumberFormatException {

        int parsedGuess = Integer.parseInt(string);

        if (secretNumber > parsedGuess) {
            return "Sorry, your guess was too low.";
        } else if (secretNumber < parsedGuess) {
            return "Sorry, your guess was too high.";
        } else {
            this.running = false;
            return "Congratulations, you guessed correctly!";

        }
    }

}
