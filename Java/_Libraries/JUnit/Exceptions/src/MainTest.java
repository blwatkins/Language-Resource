import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testArrayList() {
        ArrayList<Integer> values = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class,
                ()->{
                   Integer value =  values.get(0);
                });
    }

}