package io.creativecode.hopperbus.presenters;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.creativecode.hopperbus.models.Route;

public class RouteViewModel {

    private Route routes[];

    public RouteViewModel(JSONObject data) {
        try{
            JSONArray routeCodes = data.getJSONObject("api_codes").getJSONArray("routeCodes");
            routes = new Route[routeCodes.length()];

            for(int i = 0; i < routes.length; i++){
                String routeCode = routeCodes.getString(i);
                routes[i] = new Route(routeCode, data.getJSONObject("route" + routeCode));
            }

        } catch(JSONException e){
            e.printStackTrace();
        }
    }
}
