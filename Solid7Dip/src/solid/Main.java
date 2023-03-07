package solid;

import solid.dip.DisplayReport;
import solid.dip.Output;
import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        Output printReport = new PrintReport();
        Output displayReport = new DisplayReport();
        report.calculate();
        report.output(new PrintReport());
        report.output(new DisplayReport());
        report.output(printReport);
        report.output(displayReport);
    }
}
