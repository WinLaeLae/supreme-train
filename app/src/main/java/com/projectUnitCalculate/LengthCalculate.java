package com.projectUnitCalculate;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import java.text.DecimalFormat;


public class LengthCalculate {
   /*Context context;
    public LengthCalculate(Context context){
        this.context=context;
    }*/
  //  TextView result=(TextView)((Activity)context).findViewById(R.id.resultTextView);
    private double in = 0, ft = 0, yard = 0, mile = 0, um=0,mm=0,cm = 0, m = 0, km = 0,
            sanchi = 0, hnan = 0, mayaw = 0, letthit = 0, maik = 0, htwa = 0, taung = 0, lan = 0, ta = 0,
            outhaba = 0, kawtha = 0, gawout = 0, yuzana = 0;
//geter and seter Methods


    public void setIn(double in) {
        unitImperial(in);
        ImperialConvert();
    }
    public String getIn() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(in);
    }


    public void setFt(double ft) {
        unitImperial(ft * 12);
        ImperialConvert();
    }
    public String getFt() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(ft);
    }

    public void setYard(double yard) {
        unitImperial(yard * 3 * 12);
        ImperialConvert();
    }
    public String getYard() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(yard);
    }


    public void setMile(double mile) {
       unitImperial(mile * 63360);
        ImperialConvert();
    }
    public String getMile() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mile);
    }

    public void setUm(double um) {
        unitMetric(um/10000);
        MetricConvert();
    }
    public String getUm() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(um);
    }

    public void setMm(double mm) {
        unitMetric(mm/10);
        myanmarUnitConvert();
    }public String getMm() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mm);
    }

    public void setCm(double cm) {
        unitMetric(cm);
        MetricConvert();
    }
    public String getCm() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(cm);
    }

    public void setM(double m) {
       unitMetric(m * 100);
        MetricConvert();
    }
    public String getM() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(m);
    }

    public void setKm(double km) {
        unitMetric(km * 100000);
        MetricConvert();
    }
    public String getKm() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(km);
    }



    public void setSanchi(double sanchi) {
        unitMyanmar(sanchi / 2880);
        myanmarUnitConvert();
    }
    public String getSanchi() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(sanchi);

    }

    public void setHnan(double hnan) {
        unitMyanmar(hnan / 288);
        myanmarUnitConvert();
    }
    public String getHnan() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(hnan);
    }

    public void setMayaw(double mayaw)
    {
        unitMyanmar(mayaw/48);
        myanmarUnitConvert();
    }
    public String getMayaw() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(mayaw);

    }

    public void setLetthit(double letthit) {
        unitMyanmar(letthit/12);
        myanmarUnitConvert();
    }
    public String getLetthit() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(letthit);

    }

    public void setMaik(double maik) {
        unitMyanmar(maik/1.5);
        myanmarUnitConvert();
    }
    public String getMaik() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(maik);

    }

    public void setHtwa(double htwa) {
        unitMyanmar(htwa);
        myanmarUnitConvert();
    }
    public String getHtwa() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(htwa);
    }


    public void setTaung(double taung) {
        unitMyanmar(taung*2);
        myanmarUnitConvert();
    }
    public String getTaung() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(taung);
    }

    public void setLan(double lan) {
        unitMyanmar(htwa*8);
        myanmarUnitConvert();
    }
    public String getLan() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(lan);

    }

    public void setTa(double ta) {
        unitMyanmar(ta*14);
       myanmarUnitConvert();
    }
    public String  getTa() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(ta);

    }

    public void setOuthaba(double outhaba)
    {
        unitMyanmar(outhaba*280);
        myanmarUnitConvert();
    }
    public String getOuthaba() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(outhaba);

    }

    public void setKawtha(double kawtha) {
        unitMyanmar(kawtha*5600);
        myanmarUnitConvert();
    }
    public String getKawtha() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(kawtha);
    }

    public void setGawout(double gawout)
    {
        unitMyanmar(gawout*22400);
        myanmarUnitConvert();
    }
    public String getGawout() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(gawout);
    }
    public void setYuzana(double yuzana) {
        unitMyanmar(yuzana*89600);
        myanmarUnitConvert();
    }
    public String getYuzana() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0000000");
        return decimalFormat.format(yuzana);
    }


    // calculate Methods
    private void unitImperial(double in) {

        this.in = in;
        ft = this.in / 12;
        yard = ft / 3;
        mile = yard / 1760;
    }
    private void unitMetric(double cm) {

        this.cm = cm;
        um=this.cm*10000;
        mm=cm *10;
        m = this.cm / 100;
        km = m / 1000;
    }

    private void unitMyanmar(double htwa) {

        this.htwa = htwa;
        maik = this.htwa * 1.5;
        letthit = maik * 8;
        mayaw = letthit * 4;
        hnan = mayaw * 6;
        sanchi = hnan * 10;
        taung = this.htwa / 2;
        lan = taung / 4;
        ta = lan / 1.75;
        outhaba = ta / 20;
        kawtha = outhaba / 20;
        gawout = kawtha / 4;
        yuzana = gawout / 4;
    }
    // convert Unit Methods
    private void myanmarUnitConvert() {
        unitImperial(htwa * 9);
        unitMetric(htwa * 22.86);
    }

    private void MetricConvert() {
       unitImperial(.0254 * m);
        unitMyanmar(cm / 22.86);
    }

    private void ImperialConvert() {
        unitMetric(ft * 30.48);
       unitMyanmar(in / 9);
    }



}
