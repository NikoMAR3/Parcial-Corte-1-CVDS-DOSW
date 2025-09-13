package eci.edu.dosw.parcial;

public interface ReportBuilder {
    public abstract void reset();
    public abstract void setReportFormat(String format);
    public abstract void addFeaturesToReport(Feature feature);
    public abstract Report getReport();
}
