package eci.edu.dosw.parcial;

public class Graphics extends Feature{
    @Override
    public void addFeature(Report report) {
        report.addFeature(this);
    }
}
