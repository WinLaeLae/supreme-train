package com.projectUnitCalculate;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.DecimalFormat;

public class VolumeCalculate {

/*Context context;
public VolumeCalculate(Context context){
    this.context=context;
}
    TextView result=(TextView)((Activity)context).findViewById(R.id.resultTextView);*/

    private double ml=0,liter=0,floz=0,qt=0,gallons=0, lamyu=0,lamyet=0,lame=0,sale=0,hkwet=0,pyi=0,seit=0,hkwe=0,tin=0;

    //calculate Methods

    private void volumeMyanmarUnit(double pyi){
        this.pyi=pyi;
        lamyu= pyi * 32;
        lamyet= pyi * 16;
        lame= pyi * 8;
        sale= pyi * 4 ;
        hkwet= pyi * 2;
        seit= pyi / 4;
        hkwe= pyi / 8;
        tin= pyi /16;
    }
    private void volumeMetricUnit(double ml){
        this.ml= ml;
        liter= ml / 1000;
    }
    private  void volumeImperialUnit(double floz){
        this.floz=floz;
        qt= floz /40;
        gallons= floz/160;
    }
    // convert Methods
    private void volumMyanConvert(){
        volumeImperialUnit(tin*1440);
       volumeMetricUnit(pyi*2557.18);
    }
    private void volumeMetriceConvert() {
       volumeImperialUnit(pyi*90);
        volumeMyanmarUnit(ml/2557.18);
    }
    private void volumeImperialConvert() {
        volumeMetricUnit( pyi* 2557.18);
        volumeMyanmarUnit(qt / 2.25);
    }
// getMethods and setMethods
    public String getMl() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(ml);
    }
    public void setMl(double ml) {
        volumeMetricUnit(ml);
        volumeMetriceConvert();
    }

    public String getLiter() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(liter);
    }
    public void setLiter(double liter) {
        volumeMetricUnit(ml*1000);
    }

    public String getFloz() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(floz);
    }
    public void setFloz(double floz) {
       volumeImperialUnit(floz);
       volumeImperialConvert();
    }

    public String getQt() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(qt);
    }
    public void setQt(double qt) {
        volumeImperialUnit(qt * 40);
        volumeImperialConvert();
        //floz=gallons*160;
    }

    public String getGallons() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(gallons);
    }

    public void setGallons(double gallons) {
        volumeImperialUnit(gallons * 160);
        volumeImperialConvert();
    }

    public String  getLamyu() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(lamyu);
    }
    public void setLamyu(double lamyu) {
        volumeMyanmarUnit(lamyu / 32);
        volumMyanConvert();
    }
    public String getLamyet() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(lamyet);
    }
    public void setLamyet(double lamyet) {
     volumeMyanmarUnit(lamyet / 16);
     volumMyanConvert();
    }

    public String  getLame() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(lame);
    }
    public void setLame(double lame) {
        volumeMyanmarUnit(lame / 8);
        volumMyanConvert();
    }
    public String getSale() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(sale);
    }
    public void setSale(double sale) {
     volumeMyanmarUnit(sale / 4);
     volumMyanConvert();
    }
    public String getHkwet() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(hkwet);
    }
    public void setHkwet(double hkwet) {
        volumeMyanmarUnit(hkwet /2);
        volumMyanConvert();
    }
    public String getPyi() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(pyi);
    }
    public void setPyi(double pyi) {
        volumeMyanmarUnit(pyi);
        volumMyanConvert();
    }

    public String getSeit() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(seit);
    }
    public void setSeit(double seit) {
        volumeMyanmarUnit(seit * 4);
        volumMyanConvert();
    }

    public String getHkwe() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(hkwe);
    }
    public void setHkwe(double hkwe) {
        volumeMyanmarUnit(hkwe / 8);
        volumMyanConvert();
    }

    public String getTin() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(tin);
    }
    public void setTin(double tin) {
        volumeMyanmarUnit(tin * 16);
        volumMyanConvert();
    }

}
