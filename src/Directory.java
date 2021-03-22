import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory
{

    private static Map<String, List<String>> directory_hm = new HashMap<>();
   private static List<String> phonenumber_list;


     public static void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phonenumber_list.add(phone_number);
            directory_hm.put(surname, phonenumber_list);
        } else {
            phonenumber_list.add(phone_number);
            directory_hm.put(surname, phonenumber_list);
        }
    }

     public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
