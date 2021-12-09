package com._101net;

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	private final int locationID; // final: can't be changed once the constructor has been called
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
	}
	
	public void addExit(String direction, int location) {
		exits.put(direction, location);
	}
	
	public int getLocationID() {
		return locationID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Map<String, Integer> getExits() {
		return exits;
	}
}