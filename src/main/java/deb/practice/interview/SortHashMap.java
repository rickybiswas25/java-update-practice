package deb.practice.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
    private static final SortHashMap sortHashMap = new SortHashMap();

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 5);

        LinkedHashMap<String, Integer> sorted = sortHashMap.sort(map);
        System.out.println(sorted);
    }

    private LinkedHashMap<String, Integer> sort(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
