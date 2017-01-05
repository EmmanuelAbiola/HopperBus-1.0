package io.creativecode.hopperbus.models;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Stop {

    private String mID;
    private String mName;
    private String termTime[];
    private String weekends[];
    private String holidays[];

    public Stop(JSONObject obj) {

        try{
            mID = obj.getString("id");
            mName = obj.getString("name");

            if(obj.has("term_time")){
                JSONArray termTimeJson = obj.getJSONArray("term_time");
                termTime = new String[termTimeJson.length()];

                for(int i = 0; i < termTime.length; i++){
                    termTime[i] = termTimeJson.getString(i);
                }
            }

            if(obj.has("weekends")){
                JSONArray weekendsJson = obj.getJSONArray("weekends");


                weekends = new String[weekendsJson.length()];

                for(int i = 0; i < weekends.length; i++){
                    weekends[i] = weekendsJson.getString(i);
                }
            }

            if(obj.has("holidays")){
                JSONArray holidaysJson = obj.getJSONArray("holidays");
                holidays = new String[holidaysJson.length()];

                for(int i = 0; i < holidays.length; i++){
                    holidays[i] = holidaysJson.getString(i);
                }
            }
        } catch(JSONException e){
            e.printStackTrace();
        }
    }

    public String getID() {
        return mID;
    }

    public String getName() {
        return mName;
    }

    public String[] getTermTime(){
        return termTime;
    }

    public String[] getWeekends(){
        return weekends;
    }

    public String[] getHolidays(){
        return holidays;
    }
}
