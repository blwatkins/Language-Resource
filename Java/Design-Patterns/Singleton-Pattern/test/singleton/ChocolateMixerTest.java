package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateMixerTest {

    @Test
    void testGetInstance() {
        ChocolateMixer mixer = ChocolateMixer.getInstance();
        ChocolateMixer mixer2 = ChocolateMixer.getInstance();
        assertSame(mixer, mixer2);
    }
}