import java.util.ArrayList;
import java.util.List;

public class Task {

    static List<String> mainMethod(String string, String[] array) {
        List<String> list = new ArrayList<>();
        String[] substr;
        boolean isContain;
        String s = string.replace(",", "").replaceAll("\\s+", " ");
        substr = s.split(" ");
        for (String value : array) {
            isContain = false;
            String ss = value.replace(",", "").replaceAll("\\s+", " ");
            for (String s1 : substr) {
                if (ss.contains(s1)) {
                    isContain = true;
                } else {
                    isContain = false;
                    break;
                }
            }
            if (isContain)
                list.add(value);
        }
        return list;
    }
}
