package controller;

import java.util.HashMap;
import java.util.Map;

public class Data {
    static final Map<String,Integer> map2 = new HashMap<>();
    static final Map<String,Integer> map3 = new HashMap<>();
    static final Map<String,Integer> map4 = new HashMap<>();
    static final Map<String,Integer> map5 = new HashMap<>();
    static final Map<String,Integer> map6= new HashMap<>();
    static final Map<String,Integer> map7 = new HashMap<>();
    static final Map<String,Integer> map8 = new HashMap<>();
    static final Map<String,Integer> map9 = new HashMap<>();
    static final Map<String,Integer> map10= new HashMap<>();
    static final Map<String,Integer> map11= new HashMap<>();
    static final Map<String,Integer> map12= new HashMap<>();
    static final Map<String,Integer> map13= new HashMap<>();
    static final Map<String,Integer> map14= new HashMap<>();
    static final Map<String,Integer> map15= new HashMap<>();
    static final Map<String,Integer> map16= new HashMap<>();
    static final Map<String,Integer> map17= new HashMap<>();
    static final Map<String,Integer> map18= new HashMap<>();
    static final Map<String,Integer> map19= new HashMap<>();
    static {
        for(int i=1;i<51;i++)  { map2.put(i+"",i); }

        for(int i=1;i<51;i++)  { map3.put(i+"",i); }

        map4.put("Sunday",1);map4.put("Monday",2);map4.put("Tuesday",3);
        map4.put("Wednesday",4);map4.put("Thursday",5);map4.put("Friday",6);
        map4.put("Saturday",7);

        map5.put("Roundabout",1);map5.put("One way street",2);map5.put("Dual carriageway",3);
        map5.put("Single carriageway",6); map5.put("Slip road",7);map5.put("Unknown",9);

        for(int i=1;i<9;i++)  { map6.put(i+"0",i*10); }

        map7.put("No physical crossing facilities within 50 metres",0);
        map7.put("Zebra",1);map7.put("Pelican, puffin, toucan or similar non-junction pedestrian light crossing",4);
        map7.put("Pedestrian phase at traffic signal junction",5);
        map7.put("Footbridge or subway",7);map7.put("Central refuge",8);

        map8.put("Daylight",1);
        map8.put("Darkness - lights lit",4);map8.put("Darkness - lights unlit",5);
        map8.put("Darkness - no lighting",6);
        map8.put("Darkness - lighting unknown",7);

        map9.put("Fine without high winds",1);
        map9.put("Raining without high winds",2);
        map9.put("Snowing without high winds",3);
        map9.put("Fine with high winds",4);
        map9.put("Raining with high winds",5);
        map9.put("Snowing with high winds",6);
        map9.put("Fog or mist if hazard",7);
        map9.put("Other",8);
        map9.put("Unknown",9);

        map10.put("Dry",1);map10.put("Wet/Damp",2);
        map10.put("Snow",3);map10.put("Frost/Ice",4);
        map10.put("Flood",5);

        map11.put("Urban",1);map11.put("Rural",2);
        map11.put("Unallocated",3);

        map12.put("Yes",1);map12.put("No",2);

        for(int i=0;i<24;i++){map13.put(i+"",i);}

        for(int i=1;i<13;i++){map14.put(i+"",i);}

        map15.put("0",0);map15.put("1",1);

        map16.put("Pedal cycle",1);
        map16.put("Motorcycle 50cc and under",2);
        map16.put("Motorcycle 125cc and under",3);
        map16.put("Motorcycle over 125cc and up to 500cc",4);
        map16.put("Motorcycle over 500cc",5);
        map16.put("Taxi/Private hire car",8);
        map16.put("Car",9);
        map16.put("Minibus (8 - 16 passenger seats)",10);
        map16.put("Bus or coach (17 or more pass seats)",11);
        map16.put("Ridden horse",16);
        map16.put("Agricultural vehicle",17);
        map16.put("Tram",18);
        map16.put("Van / Goods 3.5 tonnes mgw or under",19);
        map16.put("Goods over 3.5t. and under 7.5t",20);
        map16.put("Goods 7.5 tonnes mgw and over",21);
        map16.put("Mobility scooter",22);
        map16.put("Electric motorcycle",23);
        map16.put("Other vehicle",90);
        map16.put("Motorcycle - unknown cc",97);
        map16.put("Goods vehicle - unknown weight",98);

        map17.put("Not at or within 20 metres of junction",0);
        map17.put("Approaching junction or waiting/parked at junction approach",1);
        map17.put("Cleared junction or waiting/parked at junction exit",2);
        map17.put("Leaving roundabout",3);
        map17.put("Entering roundabout",4);
        map17.put("Leaving main road",5);
        map17.put("Entering main road",6);
        map17.put("Entering from slip road",7);
        map17.put("Mid Junction - on roundabout or on main road",8);

        map18.put("Male",1);
        map18.put("Female",2);
        map18.put("Not known",3);

        map19.put("0-5",1);
        map19.put("6-10",2);
        map19.put("11-15",3);
        map19.put("16-20",4);
        map19.put("21-25",5);
        map19.put("26-35",6);
        map19.put("36-45",7);
        map19.put("46-55",8);
        map19.put("56-65",9);
        map19.put("66-75",10);
        map19.put("Over 75",11);

    }

}
