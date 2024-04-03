package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] answerChoices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt, answer, points);
		answerChoices = choices;
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	public String getAnswerChoices(int index) {
		return answerChoices[index];
	}
	public void setAnswerChoices(String choice, int index) {
		answerChoices[index] = choice;
	}
	@Override
	public void displayPrompt() {
		//FIXME
		
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
		super.displayPrompt();
		for (int index = 0; index < answerChoices.length; index++) {
			System.out.println(index+1 + ". " + this.getAnswerChoices(index));
		}		
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
