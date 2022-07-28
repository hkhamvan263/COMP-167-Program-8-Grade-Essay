import java.util.Scanner;

/**
 * The GradeEssay class extends the GradedActivity
 * class and determines the student's essay
 * grade.
 * 
 * @author Hannah Khamvanthong
 *
 */
public class GradeEssay extends GradedActivity {
	private int grammarPoints; // points for grammar
	private int spellingPoints; // points for spelling
	private int correctLengthPoints; // points for essay length
	private int contentPoints; // points for essay content
	
	/**
	 * The setGrammarPoints method sets the 
	 * amount of grammar points the student earned.
	 * 
	 * @param grammarPts The value to store in grammar points.
	 */
	public void setGrammarPoints(int grammarPts) {
		grammarPoints = grammarPts;
	}
	
	/**
	 * The getGrammarPoints method returns the 
	 * amount of points earned for grammar.
	 * 
	 * @return The amount of points a student earned for grammar.
	 */
	public int getGrammarPoints() {
		// if grammar points is greater than 30, initialize grammar
		// points to 30 and let the user know
		if (grammarPoints > 30) {
			grammarPoints = 30; // automatically set to 30
			System.out.printf("Since the amount of grammar points is greater than 30,"
					+ "\nthe amount of points for grammar is %d.\n", grammarPoints); // output grammarPoints if above 30
			System.out.println();
		}
		
		// else if grammar points is less than 0, initialize grammar
		// points to 0 and let the user know
		else if (grammarPoints < 0) {
			grammarPoints = 0; // automatically set to 0
			System.out.printf("Since the amount of grammar points is less than 0,"
					+ "\nthe amount of points for grammar is %d.\n", grammarPoints); // output grammarPoints if below 30
			System.out.println();
		}
		
		return grammarPoints;
	}
	
	/**
	 * The setSpellingPoints method sets the amount
	 * of points the student earned for spelling.
	 * 
	 * @param spellingPts The amount of points a student earned for spelling.
	 */
	public void setSpellingPoints(int spellingPts) {
		spellingPoints = spellingPts;
	}
	
	/**
	 * The getSpellingPoints method returns the 
	 * amount of points a student earned for spelling.
	 * 
	 * @return The amount of points a student earned for spelling.
	 */
	public int getSpellingPoints() {
		// if spelling points is greater than 20, initialize 
		// spelling points to 20 and let the user know
		if (spellingPoints > 20) {
			spellingPoints = 20; // automatically initialized to 20
			System.out.printf("Since the amount of points in spelling is over %d, "
					+ "it is set to %d.\n", 20, spellingPoints); // output spelling points if over 20
			System.out.println();
		}
				
		// else if spelling points is less than 0, initialize spelling
		// points to 0 and a statement is outputted
		else if (spellingPoints < 0) {
			spellingPoints = 0; // automatically initialized to 0
			System.out.printf("Since the amount of points in spelling is below %d, "
					+ "the amount of points for spelling is %d.\n", 20, spellingPoints); // output spelling points if below 0
			System.out.println();
		}
		
		return spellingPoints;
	}
	
	/**
	 * The setCorrectLengthPoints method sets the 
	 * amount of points the student earned for having 
	 * the correct length.
	 * 
	 * @param correctLenPts The amount of points a student earned for having
	 * the correct length
	 */
	public void setCorrectLengthPoints(int correctLenPts) {
		correctLengthPoints = correctLenPts;
	}
	
	/**
	 * The getCorrectLengthPoints method returns the amount of
	 * points the student earned for having the correct length.
	 * 
	 * @return The amount of points
	 */
	public int getCorrectLengthPoints() {
		// if points for length is greater than 20, the points for
		// correct length is initialized to 20
		if (correctLengthPoints > 20) {
			correctLengthPoints = 20; // automatically initialized to 20
			System.out.printf("Since the amount of points in essay length is below %d, "
					+ "the amount of points for spelling is %d.\n", 20, correctLengthPoints); // output length points if over 20
			System.out.println();
		}
		
		// else if points for length is less than 0, the points
		// for correct length is initialized to 0
		else if (correctLengthPoints < 0) {
			correctLengthPoints = 0; // automatically initialized to 0
			System.out.printf("Since the amount of points in essay length is below %d, "
					+ "the amount of points for spelling is %d.\n", 0, correctLengthPoints); // output spelling points if below 0
			System.out.println();
		}
		
		return correctLengthPoints;
	}
	
	/**
	 * The setContentPoints class sets the amount of points
	 * the student earned for essay content.
	 * 
	 * @param contentPts The amount of points a student earned
	 * 					 for essay content.
	 */
	public void setContentPoints(int contentPts) {
		contentPoints = contentPts;
	}
	
	/**
	 * The getContentPoints method returns the amount of points
	 * the student earned for essay content.
	 * 
	 * @return The amount of points the student earned for essay content.
	 */
	public int getContentPoints() {
		// if points for essay content is greater than 30,
		// the points for essay content is initialized to 30 
		if (contentPoints > 30) {
			contentPoints = 30; // automatically initialized to 30
			System.out.printf("Since the amount of points in essay length is below %d, "
					+ "the amount of points for spelling is %d.\n", 30, contentPoints);
			System.out.println();
		}
		
		// else if points for essay content is less than 0,
		// the points for essay content is initialized to 0
		else if (contentPoints < 0) {
			contentPoints = 0; // automatically initialized to 0
			System.out.printf("Since the amount of points in essay content is below %d, "
					+ "the amount of points for essay content is %d.\n", 0, contentPoints);
			System.out.println();
		}
		
		return contentPoints;
	}
	
	/**
	 * The printEssayScoring method outputs how the essay
	 * will be scored.
	 */
	public static void printEssayScoring() {
		System.out.println("How the Essay Will Be Scored");
		System.out.println("The essay is 4-6 pages with an introduction (including a thesis), 3 body"
				+ "\nparagraphs, and a conclusion.");
		System.out.println("If you enter any points below a 0, it will automatically be a 0.");
		System.out.println("If you enter any points above a 20 (spelling & length)"
				+ "\nor 30 (grammar & content), it will automatically be a 20 or 30.");
		System.out.println("Maximum score a student can receive on their essay: a 100");
		System.out.println("Minimum score a student can receive on their essay: a 0");
		System.out.printf("Grammar is %d points max\n", 30);
		System.out.println("  - Enter 30 if the essay has no grammatical errors");
		System.out.println("  - Enter 25 if the essay has a few grammatical errors");
		System.out.println("  - Enter 15 if the essay had moderate grammatical errors");
		System.out.println("  - Enter 0 if the essay has too many grammatical errors");
		System.out.printf("Spelling is %d points max\n", 20);
		System.out.println("  - Enter 30 if the essay has no spelling errors");
		System.out.println("  - Enter 15 if the essay had a few spelling errors");
		System.out.println("  - Enter 5 if the essay has moderate spelling errors");
		System.out.println("  - Enter 0 if the essay has too many spelling errors");
		System.out.printf("Correct Length is %d points max\n", 20);
		System.out.println("  - Enter 20 if the student wrote between 4-6 pages");
		System.out.println("  - Enter 15 if the student either wrote 3 pages or over 6 pages");
		System.out.println("  - Enter 10 if the student wrote between 2.5 pages");
		System.out.println("  - Enter 5 if the student wrote 2 pages");
		System.out.println("  - Enter 1 if the student wrote a page");
		System.out.println("  - Enter 0 if the student did not write any pages");
		System.out.printf("Content is %d points max\n", 30);
		System.out.println("  - Enter 30 if the student's essay meets the following criteria:"
				+ "\n    - contains an introduction (including a thesis)"
				+ "\n    - contains 3 body paragraphs (3 points max for content)"
				+ "\n      - a topic sentence for each body paragraph"
				+ "\n      - evidence that supports the thesis"
				+ "\n      - commentary that explains the evidence"
				+ "\n    - contains a conclusion"
				+ "\n    - writing is relevant to the selected topic");
		System.out.println("  - Enter 24 if the essay meets most of the content criteria");
		System.out.println("  - Enter 12 if the essay meets half of the content criteria");
		System.out.println("  - Enter 6 if the essay meets some of the content criteria");
		System.out.println("  - Enter 1 if the essay meets one of the content criteria");
		System.out.println("  - Enter 0 if the essay meets none of the content criteria\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner object for input
		
		// declare variables
		String studentName;
		int grammarPts;
		int spellingPts;
		int correctLengthPts;
		int contentPts;
		double essayGrade;
		double essayScore;
		char grade;
		
		// declare class objects
		GradedActivity gradedActivity = new GradedActivity();
		GradeEssay essay = new GradeEssay();
		
		// instructions
		System.out.println("Welcome! You will be grading a student's essay.\n");
		System.out.println("First, you will enter a student's name.");
		System.out.println("Note: You might have to scroll down until you see \"enter the student's name\""
				+ "\nand click below that statement to enter a student's name.");
		System.out.println("Second, you will enter how many points the student's received for"
				+ "\nthe following categories: grammar, spelling, correct length, and content.\n");
		System.out.println("There is no extra credit when grading essays.");
		System.out.println("A statement will be outputted if you enter any points between 0 and 30"
				+ "\nfor grammar and content and between 0 and 20 for spelling and length.\n");
		System.out.println("The points for each category will be added up and converted to a floating number.");
		System.out.println("The essay score will be in the score field.");
		System.out.println("The essay score and letter grade will be outputted.\n");
		
		// call printEssayScoring method to output the essay criteria
		printEssayScoring(); // output is long
		
		// enter the student's name
		System.out.println("Enter the student's name.");
		studentName = sc.nextLine(); // input
		
		// enter points for grammar
		System.out.printf("How many points did %s receive for grammar?\n", studentName);
		grammarPts = sc.nextInt(); // input
		essay.setGrammarPoints(grammarPts); // call setGrammarPoints method of essay object; set grammarPts as the argument
		grammarPts = essay.getGrammarPoints(); // call getGrammarPoints method of essay object & store in grammarPts variable
		
		// enter points for spelling
		System.out.printf("Enter the amount of points %s received for spelling.\n", studentName);
		spellingPts = sc.nextInt(); // input
		essay.setSpellingPoints(spellingPts); // call setSpellingPoints method of essay object; set spellingPts as the argument
		spellingPts = essay.getSpellingPoints(); // call getSpellingPoints method of essay object & store in spellingPts variable
		
		// enter points for correct length
		System.out.printf("Enter the amount of points %s received for correct length.\n", studentName);
		correctLengthPts = sc.nextInt(); // input
		essay.setCorrectLengthPoints(correctLengthPts); // call setCorrectLengthPoints method of essay object; set correctLengthPts as the argument
		correctLengthPts = essay.getCorrectLengthPoints(); // call getCorrectLengthPoints method of essay object & store in correctLengthPts variable
		
		// enter points for content
		System.out.printf("Enter the amount of points %s received for content.\n", studentName);
		contentPts = sc.nextInt(); // input
		essay.setContentPoints(contentPts); // call setContentPoints method of essay object; set contentPts as the argument
		contentPts = essay.getContentPoints(); // call getContentPoints method of essay object and store in contentPts variable
		
		// add up all the points & convert to double for an essay grade
		essayGrade = (double) grammarPts + spellingPts + correctLengthPts + contentPts; // store in essayGrade variable
		
		// set essayGrade variable as an argument in the setScore method of gradedActivity object to set the grade to the score field
		gradedActivity.setScore(essayGrade); // essayGrade is set in the score field
		
		essayScore = gradedActivity.getScore(); // initialize getScore method of gradedActivity object to essayScore (double variable)
		
		grade = gradedActivity.getGrade(); // initialize getGrade method of gradedActivity object to grade (char variable)
		
		System.out.println();
		
		System.out.printf("Since %s's essay score is a %.2f, "
				+ "%s's letter grade is a(n) %c.\n", studentName, essayScore, studentName, grade); // output essay score and grade
	}
}