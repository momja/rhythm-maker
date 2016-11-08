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
public class WholeRest extends rRest{
    WholeRest() {
        super();
        double duration = JMC.WHOLE_NOTE;
        setRhythmValue(duration);
    }
}
