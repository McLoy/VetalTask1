import java.util.*;

/**
 * Created by McLoy on 20.04.2016.
 */

//. Разбить строку на массив подстрок которые содержат только буквы
//        String s = "asdf as;dfas df as f  g dfh r j     jf gj f  ff;fg;j;;df  gfghjrt";


public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
//        String s = "asdf as;dfas df as f  g dfh r j     jf gj f  ff;fg;j;;df  gfghjrt";
        String s = "Google;Yandex;MSN;Google;Косяк;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex;Yandex;MSN;Google;Yandex";
        ParsingString str  = new ParsingString();
        arr = str.StringToArrayList(s,';');
        Set<String> set = new HashSet<String>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
