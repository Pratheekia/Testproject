import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class checkfrequency1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Map<Character, Integer> frequencyMap = checkFrequency(input);
        
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }
        
        scanner.close();
    }
    
    public static Map<Character, Integer> checkFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        
        return frequencyMap;
    }
}


}
