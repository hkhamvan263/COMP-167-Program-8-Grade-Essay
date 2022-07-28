# COMP 167-03A Program 8: Grade Essay
My eight programming assignment where I design the GradeEssay class that extends the GradedActivity class and determines student's essay grade.

The maximum essay score is a 100, and the minimum essay score is a 0.

Criteria for Grading a Student's Essay:
* Grammar is 30 points max
	* No Grammatical Errors: 30 points
	* A Few Grammatical errors: 25 points
	* Moderate Grammatical Errors: 15 points
	* Too Many Grammatical Errors: 0 points
* Spelling is 20 points max
* Correct length is 20 points max
* Content is 30 points

		System.out.println("  - Enter 30 if the essay has no spelling errors");
		System.out.println("  - Enter 15 if the essay had a few spelling errors");
		System.out.println("  - Enter 5 if the essay has moderate spelling errors");
		System.out.println("  - Enter 0 if the essay has too many spelling errors");

		System.out.println("  - Enter 20 if the student wrote between 4-6 pages");
		System.out.println("  - Enter 15 if the student either wrote 3 pages or over 6 pages");
		System.out.println("  - Enter 10 if the student wrote between 2.5 pages");
		System.out.println("  - Enter 5 if the student wrote 2 pages");
		System.out.println("  - Enter 1 if the student wrote a page");
		System.out.println("  - Enter 0 if the student did not write any pages");

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

## ⚠️Warning⚠️
Using code from these files as an assignment is a violation of Honor Code.
