package eci.edu.dosw.parcial;

import java.awt.*;

public abstract class Feature extends ReportFeatureDecorator{
    private String featureType;
    public String getFeatureType(){
        return  featureType;
    }
    public void setFeatureType(String type){
        featureType = type;
    }

}
