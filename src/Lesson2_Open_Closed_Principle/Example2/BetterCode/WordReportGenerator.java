package Lesson2_Open_Closed_Principle.Example2.BetterCode;

public class WordReportGenerator implements ReportGenerator
{
    @Override
    public String generate()
    {
        return "Word report generating....";
    }

}
