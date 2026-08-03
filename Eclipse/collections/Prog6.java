package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Prog6 {

	public static void main(String[] args) {
		
		Queue<String> printJobs = new LinkedList<>();

		printJobs.add("Invoice.pdf");
		printJobs.add("My novel.docx");
		printJobs.add("Report.docx");
		
		while(!printJobs.isEmpty()) {
			String job = printJobs.poll();
			System.out.println("Printing: " + job);
		}
		System.out.println("Q empty? " + printJobs.isEmpty());
	}

}
