package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import static controller.Data.*;

public class MainController {
    private Accident accident = new Accident();
    private String str;
    @FXML private ComboBox cb2;
    @FXML private ComboBox cb3;
    @FXML private ComboBox cb4;
    @FXML private ComboBox cb5;
    @FXML private ComboBox cb6;
    @FXML private ComboBox cb7;
    @FXML private ComboBox cb8;
    @FXML private ComboBox cb9;
    @FXML private ComboBox cb10;
    @FXML private ComboBox cb11;
    @FXML private ComboBox cb12;
    @FXML private ComboBox cb13;
    @FXML private ComboBox cb14;
    @FXML private ComboBox cb15;
    @FXML private ComboBox cb16;
    @FXML private ComboBox cb17;
    @FXML private ComboBox cb18;
    @FXML private ComboBox cb19;
    @FXML private void submit(){
        accident.setAccident_Index(1);
        accident.setAccident_Severity(1);
        str =(String)cb2.getSelectionModel().getSelectedItem();
        if(map2.containsKey(str)) accident.setNumber_of_Vehicles(map2.get(str));
        str =(String)cb3.getSelectionModel().getSelectedItem();
        if(map3.containsKey(str)) accident.setNumber_of_Casualties(map3.get(str));
        str =(String)cb4.getSelectionModel().getSelectedItem();
        if(map4.containsKey(str)) accident.setDay_of_Week(map4.get(str));
        str =(String)cb5.getSelectionModel().getSelectedItem();
        if(map5.containsKey(str)) accident.setRoad_Type(map5.get(str));
        str =(String)cb6.getSelectionModel().getSelectedItem();
        if(map6.containsKey(str)) accident.setSpeed_limit(map6.get(str));
        str =(String)cb7.getSelectionModel().getSelectedItem();
        if(map7.containsKey(str)) accident.setPedestrian_Crossing(map7.get(str));
        str =(String)cb8.getSelectionModel().getSelectedItem();
        if(map8.containsKey(str)) accident.setLight_Conditions(map8.get(str));
        str =(String)cb9.getSelectionModel().getSelectedItem();
        if(map9.containsKey(str)) accident.setWeather_Conditions(map9.get(str));
        str =(String)cb10.getSelectionModel().getSelectedItem();
        if(map10.containsKey(str)) accident.setRoad_Surface_Conditions(map10.get(str));
        str =(String)cb11.getSelectionModel().getSelectedItem();
        if(map11.containsKey(str)) accident.setUrban_or_Rural_Area(map11.get(str));
        str =(String)cb12.getSelectionModel().getSelectedItem();
        if(map12.containsKey(str)) accident.setDid_Police_Officer_Attend_Scene_of_Accident(map12.get(str));
        str =(String)cb13.getSelectionModel().getSelectedItem();
        if(map13.containsKey(str)) accident.setHour(map13.get(str));
        str =(String)cb14.getSelectionModel().getSelectedItem();
        if(map14.containsKey(str)) accident.setMonth(map14.get(str));
        str =(String)cb15.getSelectionModel().getSelectedItem();
        if(map15.containsKey(str)) accident.setWeekly_day_of_rest(map15.get(str));
        str =(String)cb16.getSelectionModel().getSelectedItem();
        if(map16.containsKey(str)) accident.setVehicle_Type(map16.get(str));
        str =(String)cb17.getSelectionModel().getSelectedItem();
        if(map17.containsKey(str)) accident.setJunction_Location(map17.get(str));
        str =(String)cb18.getSelectionModel().getSelectedItem();
        if(map18.containsKey(str)) accident.setSex_of_Driver(map18.get(str));
        str =(String)cb19.getSelectionModel().getSelectedItem();
        if(map19.containsKey(str)) accident.setAge_Band_of_Driver(map19.get(str));
        Util.writeCSV(accident,"t.csv");
        beginPY();
    }

    private void beginPY() {
        Runtime rt = Runtime.getRuntime();
        System.out.println("start");
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec("python Predict_2016_UK.py");
            proc.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void initialize(){
        for(int i=1;i<51;i++){ cb2.getItems().add(i+""); }
        for(int i=1;i<51;i++){ cb3.getItems().add(i+""); }
        cb4.getItems().addAll("Sunday","Monday","Tuesday","Wednesday",
               "Thursday","Friday","Saturday");
        cb5.getItems().addAll("Roundabout","One way street","Dual carriageway","Single carriageway",
               "Slip road","Unknown");
        cb6.getItems().addAll("10","20","30","40","50","60","70","80");
        cb7.getItems().addAll("No physical crossing facilities within 50 metres",
                "Zebra","Pelican, puffin, toucan or similar non-junction pedestrian light crossing",
                "Pedestrian phase at traffic signal junction","Footbridge or subway","Central refuge");
        cb8.getItems().addAll("Daylight","Darkness - lights lit","Darkness - lights unlit",
                "Darkness - no lighting","Darkness - lighting unknown");
        cb9.getItems().addAll("Fine without high winds","Raining without high winds",
                "Snowing without high winds","Fine with high winds","Raining with high winds",
                "Snowing with high winds","Fog or mist if hazard","Other","Unknown");
        cb10.getItems().addAll("Dry","Wet/Damp","Snow","Frost/Ice","Flood");
        cb11.getItems().addAll("Urban","Rural","Unallocated");
        cb12.getItems().addAll("Yes","No");
        cb13.getItems().addAll("0","1","2","3","4","5","6","7","8","9","10","11","12",
                "13","14","15","16","17","18","19","20","21","22","23");
        cb14.getItems().addAll("1","2","3","4","5","6","7","8","9","10","11","12");
        cb15.getItems().addAll("0","1");
        cb16.getItems().addAll("Pedal cycle","Motorcycle 50cc and under","Motorcycle 125cc and under",
                "Motorcycle over 125cc and up to 500cc","Motorcycle over 500cc","Taxi/Private hire car",
                "Car","Minibus (8 - 16 passenger seats)","Bus or coach (17 or more pass seats)","Ridden horse",
                "Agricultural vehicle","Tram","Van / Goods 3.5 tonnes mgw or under","Goods over 3.5t. and under 7.5t",
                "Goods 7.5 tonnes mgw and over","Mobility scooter","Electric motorcycle","Other vehicle",
                "Motorcycle - unknown cc","Goods vehicle - unknown weight");
        cb17.getItems().addAll("Not at or within 20 metres of junction","Approaching junction or waiting/parked at junction approach",
                "Cleared junction or waiting/parked at junction exit","Leaving roundabout","Entering roundabout",
                "Leaving main road","Entering main road","Entering from slip road","Mid Junction - on roundabout or on main road");
        cb18.getItems().addAll("Male","Female","Not known");
        cb19.getItems().addAll("0-5","6-10","11-15","16-20","21-25","26-35","36-45",
                "46-55","56-65","66-75","Over 75");
        cb2.getSelectionModel().selectFirst();
        cb3.getSelectionModel().selectFirst();
        cb4.getSelectionModel().selectFirst();
        cb5.getSelectionModel().selectFirst();
        cb6.getSelectionModel().selectFirst();
        cb7.getSelectionModel().selectFirst();
        cb8.getSelectionModel().selectFirst();
        cb9.getSelectionModel().selectFirst();
        cb10.getSelectionModel().selectFirst();
        cb11.getSelectionModel().selectFirst();
        cb12.getSelectionModel().selectFirst();
        cb13.getSelectionModel().selectFirst();
        cb14.getSelectionModel().selectFirst();
        cb15.getSelectionModel().selectFirst();
        cb16.getSelectionModel().selectFirst();
        cb17.getSelectionModel().selectFirst();
        cb18.getSelectionModel().selectFirst();
        cb19.getSelectionModel().selectFirst();
    }
}
