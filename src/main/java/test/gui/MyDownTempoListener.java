package main.java.test.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDownTempoListener implements ActionListener {
    private final BeatBox beatBox;

    public MyDownTempoListener(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public void actionPerformed(ActionEvent a) {
        float tempoFactor = beatBox.sequencer.getTempoFactor();
        beatBox.sequencer.setTempoFactor((float) (tempoFactor * .97));
    }
} // close inner class
