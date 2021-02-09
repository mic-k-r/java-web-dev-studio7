package org.launchcode.studio7;

import java.util.List;

public abstract class BaseDisc {

    private List trackList;
    private int storageMB;
    private String title;
    private int numTracks;
    private int totalRunTime;

    public BaseDisc(List trackList, int storageMB, String title, int numTracks, int totalRunTime) {
        this.trackList = trackList;
        this.storageMB = storageMB;
        this.title = title;
        this.numTracks = numTracks;
        this.totalRunTime = totalRunTime;
    }

    abstract void readDisk();

    abstract void load();

    abstract void printTrackList();

    public List getTrackList() {
        return trackList;
    }

    public int getStorageMB() {
        return storageMB;
    }

    public String getTitle() {
        return title;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public int getTotalRunTime() {
        return totalRunTime;
    }
}
