package main.java.test.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyStartListener implements ActionListener {
    private final BeatBox beatBox;

    public MyStartListener(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public void actionPerformed(ActionEvent a) {
        beatBox.buildTrackAndStart();
    }
} // close inner class
