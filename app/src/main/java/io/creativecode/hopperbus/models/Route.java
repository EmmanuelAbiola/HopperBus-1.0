package io.creativecode.hopperbus.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by whdinata on 1/3/17.
 */

public class Route {
    private String routeNumber;
    private Schedule schedule;

    public Route(String routeNumber, JSONObject obj){
        this.routeNumber = routeNumber;

        try{
            JSONArray stopTimes = obj.getJSONArray("stop_times");
            List<Stop> stops = new ArrayList<>();

            for(int i = 0; i < stopTimes.length(); i++){
                stops.add(new Stop(stopTimes.getJSONObject(i)));
            }

            schedule = new Schedule(stops);
        } catch(JSONException e){
            e.printStackTrace();
        }
    }
}
