package com.zero.goOut;

import java.util.List;

public class BusResultBean {
	private List<String> stateList;
	private List<String> stationList;
	private List<String> busList;
	private List<Integer> busNum;
	private String currentPosition;
	private boolean direction;
	
	public BusResultBean(List<String> busList,
			List<String> stationList, List<String> stateList,
			List<Integer> busNum, String currentPosition, boolean direction) {
		this.busList=busList;
		this.busNum=busNum;
		this.currentPosition=currentPosition;
		this.direction=direction;
		this.stateList=stateList;
		this.stationList=stationList;
	}

	public List<String> getStateList() {
		return stateList;
	}

	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}

	public List<String> getStationList() {
		return stationList;
	}

	public void setStationList(List<String> stationList) {
		this.stationList = stationList;
	}

	public List<String> getBusList() {
		return busList;
	}

	public void setBusList(List<String> busList) {
		this.busList = busList;
	}

	public List<Integer> getBusNum() {
		return busNum;
	}

	public void setBusNum(List<Integer> busNum) {
		this.busNum = busNum;
	}

	public String getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}

	public boolean isDirection() {
		return direction;
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}
}
