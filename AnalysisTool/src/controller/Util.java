package controller;

import controller.Accident;

import java.io.*;

public class Util {
    public static void writeCSV(Accident accident, String finalPath) {
        FileOutputStream out = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            File finalCSVFile = new File(finalPath);
            out = new FileOutputStream(finalCSVFile);
            osw = new OutputStreamWriter(out, "UTF-8");
            // 手动加上BOM标识
            //osw.write(new String(new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF }));
            bw = new BufferedWriter(osw);
            /**
             * 往CSV中写新数据
             */
            String title = "";
            title = "Accident_Index,Accident_Severity,Number_of_Vehicles,Number_of_Casualties," +
                    "Day_of_Week,Road_Type,Speed_limit,Pedestrian_Crossing-Physical_Facilities," +
                    "Light_Conditions,Weather_Conditions,Road_Surface_Conditions,Urban_or_Rural_Area," +
                    "Did_Police_Officer_Attend_Scene_of_Accident,hour,month,Weekly_day_of_rest," +
                    "Vehicle_Type,Junction_Location,Sex_of_Driver,Age_Band_of_Driver";
            bw.append(title).append("\r");

            if (accident != null ) {
                    bw.append(accident.getAccident_Index() + ",");
                    bw.append(accident.getAccident_Severity() + ",");
                    bw.append(accident.getNumber_of_Vehicles() + ",");
                    bw.append(accident.getNumber_of_Casualties() + ",");
                    bw.append(accident.getDay_of_Week() + ",");
                    bw.append(accident.getRoad_Type()+",");
                    bw.append(accident.getSpeed_limit()+",");
                    bw.append(accident.getPedestrian_Crossing()+",");
                    bw.append(accident.getLight_Conditions()+",");
                    bw.append(accident.getWeather_Conditions()+",");
                    bw.append(accident.getRoad_Surface_Conditions()+",");
                    bw.append(accident.getUrban_or_Rural_Area()+",");
                    bw.append(accident.getDid_Police_Officer_Attend_Scene_of_Accident()+",");
                    bw.append(accident.getHour()+",");
                    bw.append(accident.getMonth()+",");
                    bw.append(accident.getWeekly_day_of_rest()+",");
                    bw.append(accident.getVehicle_Type()+",");
                    bw.append(accident.getJunction_Location()+",");
                    bw.append(accident.getSex_of_Driver()+",");
                    bw.append(accident.getAge_Band_of_Driver()+",");
                    bw.append("\r");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (bw != null) {
                try {
                    bw.close();
                    bw = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                    osw = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                    out = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(finalPath + "数据导出成功");
    }
}
