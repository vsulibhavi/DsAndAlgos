package arrays;

import java.util.HashSet;
import java.util.LinkedList;

public class FirstNonRepeatingCharacterInStream {

//print the first non repeating character in O(1) time

    public static void main(String[] args) {

        char[] chars = new char[]{'a', 'a', 'b', 'c'};
        HashSet<Character> visited = new HashSet<>();
        LinkedList<Character> nonRepeatingChars = new LinkedList<>();


        for (char c : chars) {

            if (!visited.contains(c)) {

                nonRepeatingChars.offer(new Character(c));
                visited.add(c);
            } else {
                nonRepeatingChars.remove(new Character(c));

            }
        }

        System.out.println(nonRepeatingChars.peek());


    }
}
