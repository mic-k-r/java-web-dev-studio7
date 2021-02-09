package org.launchcode.studio7;

import java.util.List;

public class DVD extends BaseDisc implements IOpticalDisc {
    public DVD(List trackList, int storageMB, String title, int numTracks, int totalRunTime) {
        super(trackList, storageMB, title, numTracks, totalRunTime);
    }

    @Override
    void readDisk() {

    }

    @Override
    public void load() {
        System.out.println("Title: " + this.getTitle() + "\nstorageMB: " + this.getStorageMB() + "\neverything else: blah blah.");
    }

    @Override
    void printTrackList() {
        for (Object track : this.getTrackList()) {
            System.out.println(track);
        }
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning at ");
    }

    @Override
    public void storeData(int data) {

    }

    @Override
    public void writeDisk(int data) {

    }

    public void playVideo() {
        System.out.println("We played the video!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
