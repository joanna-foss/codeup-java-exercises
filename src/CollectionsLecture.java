import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {
        //ARRAYLISTS
//        //old way: array initializer not as easy to work with
//        String[] nameOfVar = {"thing1", "thing2", "thing3"};
//
//        System.out.println("nameOfVar[2] = " + nameOfVar[2]);
        //new way: array initializer that is perhaps more intuitive
        //no toString method needed to soutv
        System.out.println("ARRAYLISTS");
        ArrayList<String> students = new ArrayList<>();
        students.add("joanna");
        students.add("student that's not joanna");
        System.out.println("students.size() = " + students.size());
        System.out.println("students = " + students);

        ArrayList<Integer> myFavNums = new ArrayList<>();
        myFavNums.add(3);
        myFavNums.add(1, 7);
        myFavNums.add(0, 23);
        myFavNums.add(7);
        myFavNums.add(3);

        //various methods to use with ArrayList
        System.out.println("myFavNums = " + myFavNums);
        System.out.println("myFavNums.indexOf(7) = " + myFavNums.indexOf(7)); //returns index of num
        System.out.println("myFavNums.get(23) = " + myFavNums.get(2)); //returns value at 2nd index
        System.out.println("myFavNums.contains(7) = " + myFavNums.contains(7)); //returns boolean to check for containment of inputted value
        System.out.println("myFavNums.lastIndexOf(7) = " + myFavNums.lastIndexOf(7)); //returns index of last location of element
        System.out.println("myFavNums.isEmpty() = " + myFavNums.isEmpty()); //returns boolean to check for emptiness of array
//        myFavNums.remove((Integer)7); //passed object version of int to remove '21' *bonus*
//        myFavNums.remove(2); //target the index of the object to remove *bonus*
        System.out.println("myFavNums = " + myFavNums);
        ArrayList<Integer> removalList = new ArrayList<>();
        removalList.add(3);
        myFavNums.removeAll(removalList);
        System.out.println("myFavNums = " + myFavNums);

        //HASH MAPS
        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();
        System.out.println("HASHMAPS");
        HashMap<String, String> usernames = new HashMap<>();
        
        usernames.put("Joanna", "jbanana");
        usernames.put("Not Joanna","notjbanana");
        
        System.out.println("usernames.get(\"Joanna\") = " + usernames.get("Joanna")); //provide key, returns value
        System.out.println("usernames.getOrDefault(\"Anybody Else\", \"noUserFound\") = " + usernames.getOrDefault("Anybody Else", "noUserFound")); //searches for matching key, returns defaultValue if no matching key found
        System.out.println("usernames.containsKey(\"Anybody Else\") = " + usernames.containsKey("Anybody Else")); //returns boolean after checking for matching key
        System.out.println("usernames.containsValue(\"jbanana\") = " + usernames.containsValue("jbanana")); //returns boolean after checking for matching value
        System.out.println("usernames = " + usernames);
        
        usernames.putIfAbsent("Joanna", "jbanana");
        usernames.putIfAbsent("Anybody Else", "anybanana");
        System.out.println("usernames = " + usernames);

        usernames.remove("Anybody Else");
        System.out.println("usernames = " + usernames);

        usernames.put("Anybody Else", "anybanana");
        usernames.replace("Anybody Else", "anybodybanana"); //finds key and replaces that key's value;
        System.out.println("usernames = " + usernames);
        usernames.clear(); //deletes everything from the hashmap
        System.out.println("usernames = " + usernames);
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());
    }
}
