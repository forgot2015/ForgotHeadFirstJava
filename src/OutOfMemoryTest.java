import java.util.ArrayList;
import java.util.List;

/**
 * Created by forgot on 2017/6/27.
 */
public class OutOfMemoryTest {
    static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
