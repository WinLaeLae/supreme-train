package com.projectUnitCalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Spinner unitspinner;

Spinner categoryspinner;
Spinner unit;
EditText num;
TextView result;
Button calculate;
  //  int cat,us;
   static String [] massCat;
   static String [] lengthCat;
   static   String [] volumeCat;

    static String [] massUnit;
    static   String [] lengthUnit;
   static   String [] volumeUnit;
LengthCalculate Lc=new LengthCalculate();
MassCalculate MC=new MassCalculate();
VolumeCalculate Vc=new VolumeCalculate();
String  convetUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unitspinner=(Spinner)findViewById(R.id.unitsSpinner);//length,mass,volume
        categoryspinner=(Spinner)findViewById(R.id.CategorySpinner);
        unit=(Spinner)findViewById(R.id.convertUnitSpinner);

        calculate=(Button)findViewById(R.id.converbtn);
        num=(EditText)findViewById(R.id.numEditText);
        result=(TextView)findViewById(R.id.resultTextView);


        massCat=getResources().getStringArray(R.array.massCategory);
        lengthCat=getResources().getStringArray(R.array.lengthCategory);
        volumeCat=getResources().getStringArray(R.array.volumeCategory);
        massUnit=getResources().getStringArray(R.array.massUnit);
        lengthUnit=getResources().getStringArray(R.array.lengthUnit);
        volumeUnit=getResources().getStringArray(R.array.volumeUnit);



        unitspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

              //  cat=position;
               // us=position;
                switch (position){
                    case 0:{
                       ArrayAdapter<String> lenAD= new ArrayAdapter(getApplicationContext(),R.layout.spinner_item_layout,lengthCat);
                       // lenAD.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        categoryspinner.setAdapter(lenAD);

                        ArrayAdapter<String> unitAd= new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item_layout,lengthUnit);
                        //unitAd.setDropDownViewResource(android.R.layout.simple_spinner_item); //create your own layout with textview
                        unit.setAdapter(unitAd);


                    }break;
                    case 1:{
                        ArrayAdapter<String> massAD=new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item_layout,massCat);
                       // massAD.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        categoryspinner.setAdapter(massAD);

                        ArrayAdapter<String> unitAd2= new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item_layout,massUnit);
                       // unitAd2.setDropDownViewResource(android.R.layout.simple_spinner_item);
                       unit.setAdapter(unitAd2);

                    }break;
                    case 2:{
                        ArrayAdapter<String> volAD=new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item_layout,volumeCat);
                        //volAD.setDropDownViewResource(android.R.layout.simple_spinner_item);
                categoryspinner.setAdapter(volAD);
                ArrayAdapter<String> unitAd3= new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner_item_layout,volumeUnit);
                //unitAd3.setDropDownViewResource(android.R.layout.simple_spinner_item);
                unit.setAdapter(unitAd3);

            }break;
                                                  default:

                                              }
                                          convetUnit=unit.getSelectedItem().toString();

                result.setText("");

                //0 => Length. 1=>Mass
               //databye
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });


        calculate.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (unitspinner.getSelectedItemPosition()){
                    case 0:if(num.getText().length()>0){
                        calculateLength(Double.parseDouble(num.getText().toString()),categoryspinner.getSelectedItemPosition(),unit.getSelectedItemPosition());
                    }break;
                    case 1:if(num.getText().length()>0){
                        calculateMass(Double.parseDouble(num.getText().toString()),categoryspinner.getSelectedItemPosition(),unit.getSelectedItemPosition());
                    }break;
                    case 2:if(num.getText().length()>0){
                        calculateVolume(Double.parseDouble(num.getText().toString()),categoryspinner.getSelectedItemPosition(),unit.getSelectedItemPosition());
                    }break;
                    default:
                }


            }
        });


    }
    public void calculateLength(double num,int spinner1,int spinner2){

        switch (spinner1) {
            case 0:
                Lc.setSanchi(num);
                break;
            case 1:
                Lc.setHnan(num);
                break;
            case 2:
                Lc.setMayaw(num);
                break;
            case 3:
                Lc.setLetthit(num);
                break;
            case 4:
                Lc.setMaik(num);
                break;
            case 5:
                Lc.setHtwa(num);
                break;
            case 6:
                Lc.setTaung(num);
                break;
            case 7:
                Lc.setLan(num);
                break;
            case 8:
                Lc.setTa(num);
                break;
            case 9:
                Lc.setOuthaba(num);
                break;
            case 10:
                Lc.setKawtha(num);
                break;
            case 11:
                Lc.setGawout(num);
                break;
            case 12:
                Lc.setYuzana(num);
                break;
            case 13:
                Lc.setUm(num);
                break;
            case 14:
                Lc.setMm(num);
                break;
            case 15:
                Lc.setCm(num);
                break;
            case 16:
                Lc.setM(num);
                break;
            case 17:
                Lc.setKm(num);
                break;
            case 18:
                Lc.setIn(num);
                break;
            case 19:
                Lc.setFt(num);
                break;
            case 20:
                Lc.setMile(num);
                break;
            case 21:
                Lc.setYard(num);
                break;
            default:
                ;
        }
                switch (spinner2){
                    case 0:result.setText(Lc.getUm()+ " "+convetUnit);break;
                    case 1:result.setText(Lc.getMm()+ " "+ convetUnit);break;
                    case 2:result.setText(Lc.getCm()+ " " +convetUnit);break;
                    case 3:result.setText(Lc.getM()+" "+convetUnit);break;
                    case 4:result.setText(Lc.getKm()+ " "+convetUnit);break;
                    case 5:result.setText(Lc.getIn()+" "+ convetUnit);break;
                    case 6:result.setText(Lc.getFt()+ " "+convetUnit);break;
                    case 7:result.setText(Lc.getMile()+" "+convetUnit);break;
                    case 8:result.setText(Lc.getYard()+" "+convetUnit);break;
                    case 9:result.setText(Lc.getSanchi()+" "+convetUnit);break;
                    case 10:result.setText(Lc.getHnan()+" "+convetUnit);break;
                    case 11:result.setText(Lc.getMayaw()+ " "+convetUnit);break;
                    case 12:result.setText(Lc.getLetthit()+" " +convetUnit);break;
                    case 13:result.setText(Lc.getMaik()+ " "+convetUnit);break;
                    case 14:result.setText(Lc.getHtwa()+ " " +convetUnit);break;
                    case 15:result.setText(Lc.getTaung()+ " "+convetUnit);break;
                    case 16:result.setText(Lc.getLan()+ " " +convetUnit);break;
                    case 17:result.setText(Lc.getTa()+ " " +convetUnit);break;
                    case 18:result.setText(Lc.getOuthaba()+" "+convetUnit);break;
                    case 19:result.setText(Lc.getKawtha()+" "+convetUnit);break;
                    case 20:result.setText(Lc.getGawout()+" "+convetUnit);break;
                    case 21:result.setText(Lc.getYuzana()+" "+convetUnit);break;
                    default:
                }



    }

    public void calculateMass(double num,int spinner1,int spinner2){

        switch (spinner1){
            case 0:MC.setYwaylay(num); break;
            case 1:MC. setYwaygyi(num);break;
            case 2: MC.setPetha(num);break;
            case 3: MC.setMutha(num);break;
            case 4: MC.setMattha(num);break;
            case 5: MC.setNgamutha(num); ;break;
            case 6: MC.setKyattha(num);break;
            case 7: MC.setAwettha(num);break;
            case 8: MC.setAseittha(num);break;
            case 9: MC.setNgasetha(num);break;
            case 10:MC.setPeittha(num); ;break;
            case 11:MC.setAcheintaya(num); ;break;
            case 12: MC.setMg(num);break;
            case 13: MC.setG(num);break;
            case 14: MC.setKg(num); ;break;
            case 15: MC.setOz(num);break;
            case 16: MC.setLb(num);break;
            default:;

        }

        switch (spinner2){

            case 0:result.setText( MC.getMg()+" "+convetUnit);break;
            case 1: result.setText(MC.getG()+""+convetUnit);break;
            case 2: result.setText(MC.getKg()+" "+convetUnit); break;
            case 3: result.setText(MC.getOz()+" "+convetUnit);break;
            case 4: result.setText(MC.getLb()+" "+convetUnit);break;
            case 5: result.setText(MC.getYwaylay()+" "+convetUnit); break;
            case 6: result.setText(MC.getYwaygyi()+" "+convetUnit);break;
            case 7: result.setText(MC.getPetha()+" "+convetUnit);break;
            case 8: result.setText(MC.getMutha()+" "+convetUnit);break;
            case 9: result.setText(MC.getMattha()+" "+convetUnit);break;
            case 10: result.setText(MC.getNgamutha()+" "+convetUnit);break;
            case 11: result.setText(MC.getKyattha()+" "+convetUnit);break;
            case 12:  result.setText(MC.getAwettha()+" "+convetUnit);break;
            case 13:  result.setText(MC.getAseittha()+" "+convetUnit);break;
            case 14:  result.setText(MC.getNgasetha()+" "+convetUnit);break;
            case 15:  result.setText(MC.getPeittha()+" "+convetUnit);break;
            case 16:  result.setText(MC.getAcheintaya()+" "+convetUnit);break;
            default:
        }
    }

    public void calculateVolume(double num,int spinner1,int spinner2){
        switch (spinner1){
            case 0: Vc.setLamyu(num);break;
            case 1: Vc.setLamyet(num);break;
            case 2: Vc.setLame(num);break;
            case 3: Vc.setSale(num);break;
            case 4: Vc.setHkwet(num);break;
            case 5: Vc.setPyi(num);break;
            case 6: Vc.setSeit(num);break;
            case 7: Vc.setHkwe(num);break;
            case 8: Vc.setTin(num);break;
            case 9: Vc.setMl(num);break;
            case 10: Vc.setLiter(num);break;
            case 11: Vc.setFloz(num);break;
            case 12: Vc.setQt(num);break;
            case 13: Vc.setGallons(num);break;
            default:;

        }
        switch (spinner2){

            case 0: result.setText(Vc.getMl()+" "+convetUnit);break;
            case 1: result.setText( Vc.getLiter()+" "+convetUnit);break;
            case 2: result.setText(Vc.getFloz()+" "+convetUnit);break;
            case 3: result.setText(Vc.getQt()+" "+convetUnit);break;
            case 4: result.setText(Vc.getGallons()+" "+convetUnit);break;
            case 5: result.setText( Vc.getLamyu()+" "+convetUnit);break;
            case 6: result.setText(Vc.getLamyet()+" "+convetUnit);break;
            case 7: result.setText(Vc.getLame()+" "+convetUnit);break;
            case 8:result.setText(Vc.getSale()+" "+convetUnit);break;
            case 9: result.setText(Vc.getHkwet()+" "+convetUnit);break;
            case 10 : result.setText(Vc.getPyi()+" "+convetUnit);break;
            case 11:result.setText(Vc. getSeit()+" "+convetUnit);break;
            case 12: result.setText(Vc.getHkwe()+" "+convetUnit);break;
            case 13: result.setText(Vc.getTin()+" "+convetUnit);break;
            default:;
        }



    }

}
