
package music;

import jm.music.data.*;
import jm.util.*;

/**
 *
 * @author maxomdal
 */
public class Response {
    
    Phrase phrase = new Phrase(0.0);
    
    public void hitNote(Note note) {
        phrase.add(note);
    }
    
    public void hitRest(Rest rest) {
        phrase.add(rest);
    }
    
    
    public void hitPlay() {
        System.out.println("recording note");
        Play.midi(phrase);
    }
}
