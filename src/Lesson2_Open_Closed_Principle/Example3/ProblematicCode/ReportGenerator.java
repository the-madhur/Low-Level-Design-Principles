package Lesson2_Open_Closed_Principle.Example3.ProblematicCode;

public class ReportGenerator 
{
    public String generateReportType(String reportType)
    {
        if(reportType.equals("PDF"))
        {
            return "Genertaing PDF Report";
        }
        else if(reportType.equals("WORD"))
        {
            return "Generating Word Report";
        }
        
        return "Report type not supported";
    }

}
