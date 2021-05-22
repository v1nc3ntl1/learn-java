package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        //locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        //locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        //locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
        //locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
        //locations.get(5).addExit("Q", 0);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            int before = loc;
            loc = goToDirection(scanner.nextLine().toUpperCase(), exits);
            if (loc == -1) {
                System.out.println("You cannot go in that direction");
                loc = before;
            }
        }
    }

    private static int goToDirection(String direction, Map<String, Integer> exits) {
        if (exits.containsKey(direction.toUpperCase())) {
            return exits.get(direction);
        }

        String[] tokens = direction.split(" ");

        for (String token : tokens) {
            if (token.toLowerCase().contains("west")) {
                return exits.containsKey("W") ? exits.get("W") : -1;
            } else if (token.toLowerCase().contains("east")) {
                return exits.containsKey("E") ? exits.get("E") : -1;
            } else if (token.toLowerCase().contains("north")) {
                return exits.containsKey("N") ? exits.get("N") : -1;
            } else if (token.toLowerCase().contains("south")) {
                return exits.containsKey("S") ? exits.get("S") : -1;
            }
        }
        return -1;
    }
}
