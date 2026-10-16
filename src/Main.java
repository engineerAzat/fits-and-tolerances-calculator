//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hole hole1 = new Hole(40.0, 0.025, 0.000);
        Shaft shaft1 = new Shaft(40.0, -0.009, -0.025);
        FitCalculator.calculateFit(hole1, shaft1);

        Hole hole2 = new Hole(40.0, 0.025, 0.000);
        Shaft shaft2 = new Shaft(40.0, 0.042, 0.026);
        FitCalculator.calculateFit(hole2, shaft2);

        Hole hole3 = new Hole(40.0, 0.025, 0.000);
        Shaft shaft3 = new Shaft(40.0, 0.033, 0.017);
        FitCalculator.calculateFit(hole3, shaft3);

        Hole hole4 = new Hole(40.0, 0.000, 0.000);
        Shaft shaft4 = new Shaft(40.0, 0.000, 0.000);
        FitCalculator.calculateFit(hole4, shaft4);
    }
}