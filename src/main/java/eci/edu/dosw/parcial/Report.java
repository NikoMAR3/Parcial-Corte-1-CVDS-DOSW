package eci.edu.dosw.parcial;

import java.util.ArrayList;

public abstract  class Report {
    private ArrayList<Feature> featuresOfReport = new ArrayList<>();
    private String formatType;

    public void setFormatType(String format){
        this.formatType = format;
    }

    public String getFormatType() {
        return formatType;
    }

    public void addFeature(Feature feature){
        featuresOfReport.add(feature);
    }
    public abstract Report getReport();

}
