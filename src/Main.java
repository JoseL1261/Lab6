import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    HashMap<String, Integer> CreditHour = new HashMap<>();
    CreditHour.put("IT-1025", 3);
    CreditHour.put("IT-1050", 3);
    CreditHour.put("IT-1150", 3);
    CreditHour.put("IT-2310", 3);
    CreditHour.put("IT-2320", 4);
    CreditHour.put("IT-2650", 4);
    CreditHour.put("IT-2660", 4);
    CreditHour.put("IT-2030", 4);

    // checking for specific keys
    String[] check = { "IT-1025", "IT-2110" };
    for (String key : check) {
      if (CreditHour.containsKey(key)) {
        System.out.println("Key: " + key + " exists with value: " + CreditHour.get(key));
      } else {
        System.out.println("Key: " + key + " does not exist.");
      }
    }

    System.out.println();
    System.out.println(" key set: " + CreditHour.keySet());
    System.out.println();

    System.out.println("Removing keys: IT-2030 and IT-1150");
    CreditHour.remove("IT-2030");
    CreditHour.remove("IT-1150");
    System.out.println();

    System.out.println(CreditHour.values());

  }
}