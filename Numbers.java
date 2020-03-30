import javax.swing.JOptionPane;

/*
 * Lesson 5.1, Display Min and Max when user inputs cancel.
 * Thoughts and ideas: 
 * Tried making the entire project using INT (for some reason), but that just wouldn't work.
 * 
 */

public class Numbers {
	public static void main(String[] arg) {
		double nMin = Double.MAX_VALUE;
		double nMax = Double.MIN_VALUE;
		/*
		 * Don't understand exactly why this above part works Thinking that nMin should
		 * have Double.MIN_Value, but that isn't the case for some reason.
		*/
		while (true) {
			String input = JOptionPane.showInputDialog(null, "Input number");
			if (input == null)
				break;
			double nNum = Double.parseDouble(input);
			nMax = Math.max(nMax, nNum);
			nMin = Math.min(nMin, nNum);
		}
		JOptionPane.showMessageDialog(null, "Tiniest number: " + nMin + " , Biggest number: " + nMax);
	}

	
}