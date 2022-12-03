package com.lms.entity;

public class LocationRack {
    private int locationRackId;
    private String locationRackName;
    private String locationRackStatus;
    private String locationRackCreatedOn;
    private String locarionRackUpdatedOn;

    public LocationRack() {
    }

    public LocationRack(int locationRackId, String locationRackName, String locationRackStatus, String locationRackCreatedOn, String locarionRackUpdatedOn) {
        this.locationRackId = locationRackId;
        this.locationRackName = locationRackName;
        this.locationRackStatus = locationRackStatus;
        this.locationRackCreatedOn = locationRackCreatedOn;
        this.locarionRackUpdatedOn = locarionRackUpdatedOn;
    }

    public int getLocationRackId() {
        return locationRackId;
    }

    public void setLocationRackId(int locationRackId) {
        this.locationRackId = locationRackId;
    }

    public String getLocationRackName() {
        return locationRackName;
    }

    public void setLocationRackName(String locationRackName) {
        this.locationRackName = locationRackName;
    }

    public String getLocationRackStatus() {
        return locationRackStatus;
    }

    public void setLocationRackStatus(String locationRackStatus) {
        this.locationRackStatus = locationRackStatus;
    }

    public String getLocationRackCreatedOn() {
        return locationRackCreatedOn;
    }

    public void setLocationRackCreatedOn(String locationRackCreatedOn) {
        this.locationRackCreatedOn = locationRackCreatedOn;
    }

    public String getLocarionRackUpdatedOn() {
        return locarionRackUpdatedOn;
    }

    public void setLocarionRackUpdatedOn(String locarionRackUpdatedOn) {
        this.locarionRackUpdatedOn = locarionRackUpdatedOn;
    }
}
