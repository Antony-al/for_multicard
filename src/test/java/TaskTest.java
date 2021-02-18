import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TaskTest {
    @Test
    public void shouldExecuteMainMethod() {
        String string = "T1001,, T1002, T1003";
        String[] array = {"T1001, ,T1005,", " ,T1001 ,T1003, ,T1007, ,T1002,", "T1009, ,T1005,", ",T1001,  T1002,, T1003, T2001"};
        List<String> expected = Arrays.asList(" ,T1001 ,T1003, ,T1007, ,T1002,", ",T1001,  T1002,, T1003, T2001");
        List<String> actual = Task.mainMethod(string, array);
        Assertions.assertEquals(expected, actual);
    }
}
