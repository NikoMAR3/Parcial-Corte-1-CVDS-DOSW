package eci.edu.dosw.parcial;

public class Table extends Feature{
    @Override
    public void addFeature(Report report) {
        report.addFeature(this);
    }

}
