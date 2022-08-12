

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		int numiter =Integer.parseInt(args[0]);
		for (int i = 0 ; i < numiter ; i++) {
			piEstimation += ((double)(Math.pow(-1, i)))*(1.0)/(1.0+(2.0*i));
		}
		piEstimation = piEstimation * 4.0;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}

}
