package eci.edu.dosw.parcial;

public class AcademicReportBuilder implements ReportBuilder{

    private AcademicReport academicReport = new AcademicReport();

    @Override
    public void reset() {
        academicReport = new AcademicReport();
    }

    @Override
    public void setReportFormat(String format) {
        academicReport.setFormatType(format);
    }

    @Override
    public void addFeaturesToReport(Feature feature) {
        academicReport.addFeature(feature);
    }
    @Override
    public Report getReport() {
        return academicReport;
    }

}
