package eci.edu.dosw.parcial;

public class Diagram extends Feature{
    @Override
    public String getFeatureType() {
        return null;
    }
    @Override
    public void addFeature(Report report) {
        report.addFeature(this);
    }
}
