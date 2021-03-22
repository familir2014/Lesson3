import java.util.HashMap;
import java.util.Map;

public class Main extends Directory {

    public static void main(String[] args) {


        Map<String, Integer> map =  new HashMap<>();
//        new HashMap<>() = map;
        String[] words = {"Dog", "Mars", "Omega",
                "Dog", "Lama", "Luna",
                "Luna", "Mars", "Omega",
                "Alpha", "Cool", "Lama",
                "Bal", "Mars", "Cool",
                "Alpha", "Cat",};

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        System.out.println(map);
    }


    public static void callcentre() {
        Directory directory = new Directory() {
//            @Override
//            public List<String> get(String surname) {
//                return null;
//            }
        };

        Directory.add("Ivanov", "54625424624");
        Directory.add("Sidorov", "114141414");
        Directory.add("Perov", "6894884848");
        Directory.add("Sidorov", "83873856858");


        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Petrov"));

    }





    }

