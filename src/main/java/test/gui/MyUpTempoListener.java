package main.java.test.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyUpTempoListener implements ActionListener {
    private final BeatBox beatBox;

    public MyUpTempoListener(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    public void actionPerformed(ActionEvent a) {
        float tempoFactor = beatBox.sequencer.getTempoFactor();
        beatBox.sequencer.setTempoFactor((float) (tempoFactor * 1.03));
    }
} // close inner class
