package com.projectUnitCalculate;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MassCalculate {
    /*Context context;
    public MassCalculate(Context context){
        this.context=context;
    }
    TextView result=(TextView)((Activity)context).findViewById(R.id.resultTextView);*/

    private double mg=0,g=0, kg=0, oz=0, lb=0, ywaylay=0, ywaygyi=0,petha=0,mutha=0,mattha=0,
            ngamutha=0, kyattha=0,awettha=0,aseittha=0,ngasetha=0, peittha=0,acheintaya=0;

    private void massImperialUnit(double oz) {
        this.oz = oz;
        lb = oz / 16;
    }

    private void massMetricUnit(double g) {
        mg=g*1000;
        this.g = g;
        kg = g / 1000;
    }

    private void massMyanmarUnit(double kyattha)
    {
        this.kyattha = kyattha;
        ywaylay = kyattha * 120;
        ywaygyi = kyattha * 60;
        petha = kyattha * 16;
        mutha = kyattha * 8;
        ngamutha = kyattha * 4;
        mattha = kyattha * 2;
        awettha = kyattha / 12.5;
        aseittha = kyattha / 25;
        ngasetha = kyattha / 50;
        peittha = kyattha / 100;
    }

    private void massMyanConvert() {
        massImperialUnit(peittha * 57.6);
        massMetricUnit(kyattha * 16.3293);
    }

    private void metriceConvert() {
        massImperialUnit(g / 28.3495);
        massMyanmarUnit(g / 16.3293);
    }

    private void ImperialConvert() {
        massMetricUnit(oz * 28.3495);
        massMyanmarUnit(oz * 1.7361);
    }
    public String getMg() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mg);

    }

    public void setMg(double mg) {
       massMetricUnit(mg /1000);
       massMyanConvert();
    }

    public void setG(double g) {
        massMetricUnit(g);
        metriceConvert();

    }
    public String getG() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(g);
    }
    public void setKg(double kg) {
        massMetricUnit(kg * 1000);
        metriceConvert();

    }
    public String getKg() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(kg);
    }
    public void setOz(double oz) {
        massImperialUnit(oz);
        ImperialConvert();
    }
    public String getOz() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(oz);
    }
    public void setLb(double lb) {
        massImperialUnit(lb * 16);
        ImperialConvert();
    }
    public String getLb() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(lb);
    }

    public void setYwaylay(double ywaylay) {
        massMyanmarUnit(ywaylay / 120);
        massMyanConvert();
    }
    public String getYwaylay() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(ywaylay);
    }

    public void setYwaygyi(double ywaygyi) {
        massMyanmarUnit(ywaygyi / 60);
        massMyanConvert();
    }public String getYwaygyi() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(ywaygyi);
    }
    // calculte(String sk, String dk){
    // switch
    //  // sync with array
    // }

    public void setPetha(double petha) {
        massMyanmarUnit(petha /16);
        massMyanConvert();
    } public String getPetha() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(petha);
    }
    public void setMutha(double mutha) {
        massMyanmarUnit(mutha / 8);
        this.mutha = mutha;
    }
    public String getMutha() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mutha);
    }
    public void setNgamutha(double ngamutha) {
        massMyanmarUnit(ngamutha / 4);
        massMyanConvert();
    }
    public String getNgamutha() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(ngamutha);
    }
    public void setMattha(double mattha) {
        massMyanmarUnit(mattha / 2 );
        massMyanConvert();
    }
    public String getMattha() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mattha);
    }
    public void setKyattha(double kyattha) {
        massMyanmarUnit(kyattha);
        massMyanConvert();
    }
    public String getKyattha() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(kyattha);
    }
    public void setAwettha(double awettha) {
        massMyanmarUnit( awettha * 12.5);
    }
    public String getAwettha() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(awettha);
    }
    public void setAseittha(double aseittha) {
        massMyanmarUnit( aseittha * 25);
    }
    public String getAseittha() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(aseittha);
    }
    public void setNgasetha(double ngasetha) {
        massMyanmarUnit(ngasetha * 50);
    }
    public String getNgasetha() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(ngasetha);
    }
    public void setPeittha(double peittha) {
        massMyanmarUnit(peittha * 100);
        massMyanConvert();
    }
    public String getPeittha() {
        DecimalFormat df = new DecimalFormat("#,###,##0.0000000");
        return df.format(peittha);
    }
    public void setAcheintaya(double acheintaya) {
        massMyanmarUnit( acheintaya * 10000);
    }
    public String getAcheintaya() {
        DecimalFormat decimalFormat=new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(acheintaya);
    }




}

