import com.generics.Box;
import com.generics.OrderedPair;
import com.generics.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BoxesTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testMarketValue() {
        List<Box<String>> boxes = new ArrayList<>();
        Box<String> box1 = new Box<>();
        box1.setObj("b1");
        Box<String> box2 = new Box<>();
        box2.setObj("b2");
        Box<String> box3 = new Box<>();
        box3.setObj("0");
        boxes.add(box1);
        boxes.add(box2);

        box1.inspect(1);

        assertEquals(box1.getObj(), "b1");
        assertEquals(box2.getObj(), "b2");
    }

    @Test
    public void usingPairs() {
        Pair<String, String> p1 = new OrderedPair<>("key1", "value1");
        Pair<Integer, String> p2 = new OrderedPair<>(1, "value1");
    }
}
