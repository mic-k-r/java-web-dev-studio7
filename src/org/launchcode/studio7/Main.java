package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<String> dvdTrackList = new ArrayList<>();
        dvdTrackList.add("hi");
        dvdTrackList.add("hello");
        dvdTrackList.add("blah");

        List<String> cdTrackList = new ArrayList<>();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        DVD myDvd = new DVD(dvdTrackList, 4700, "The Best DVD Ever", 1, 3);

        myDvd.load();
        myDvd.printTrackList();
    }
}
