package Lesson2_Open_Closed_Principle.Example2.BetterCode;

public class PDFReportGenerator implements ReportGenerator
{
    @Override
    public String generate()
    {
        return"PDF report generating";
    }

}
