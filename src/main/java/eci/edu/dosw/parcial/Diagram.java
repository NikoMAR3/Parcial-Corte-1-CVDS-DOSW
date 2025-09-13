package eci.edu.dosw.parcial;

public class Diagram extends Feature{
    @Override
    public void addFeature(Report report) {
        report.addFeature(this);
    }
}
