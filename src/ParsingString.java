import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by McLoy on 20.04.2016.
 */
public class ParsingString {

    public ArrayList StringToArrayList(String ss, char separator){
        ArrayList mass = new ArrayList();
//        separator = ';';
        String val;
        int k = 0;
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == separator) {
                val = ss.substring(k,i);
                if (val.length() != 0) {
                    mass.add(val);
                }
                k = i+1;
            }

        }
        val = ss.substring(k,ss.length());
        if (val.length() != 0) {
            mass.add(val);
        }
        return mass;
    }
}
