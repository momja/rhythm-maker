/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import jm.JMC;

/**
 *
 * @author maxomdal
 */
public class EighthNote extends rNote {
    EighthNote() {
        super();
        double duration = JMC.EIGHTH_NOTE;
        setRhythmValue(duration, true);
    }
}