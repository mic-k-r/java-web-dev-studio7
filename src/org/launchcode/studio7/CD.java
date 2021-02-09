package org.launchcode.studio7;

import java.util.List;

public class CD extends BaseDisc implements IOpticalDisc {
    public CD(List trackList, int storageMB, String title, int numTracks, int totalRunTime) {
        super(trackList, storageMB, title, numTracks, totalRunTime);
    }

    @Override
    void readDisk() {

    }

    @Override
    public void load() {

    }

    @Override
    void printTrackList() {

    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(int data) {

    }

    @Override
    public void writeDisk(int data) {

    }

    public void playAudio() {
        System.out.println("We played all the songs");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
