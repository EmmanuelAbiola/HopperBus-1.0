package io.creativecode.hopperbus.models;

import java.util.List;

public class Schedule {

    private List<Stop> mStops;

    public Schedule(List<Stop> stops) {

        this.mStops = stops;
    }

    public List<Stop> getStops() {
        return this.mStops;
    }
}
