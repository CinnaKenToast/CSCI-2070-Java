//Kenneth Shipley
//CSCI 2070-08
//April 17, 2018
//This program creates a fleet of space crafts consisting of space stations and space shuttles.
package kennethshipley2070assignment14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SpaceCraft> crafts = new ArrayList<>();
        int decision = 0;
        String stationName;
        int stationSeats;
        int stationPorts;
        String shuttleName;
        int shuttleSeats;
        int shuttleEngines;

        System.out.println("Welome to Kenneth's Space Craft Creator");

        while (decision != 6) {
            System.out.println("1. Create a new space station");
            System.out.println("2. Create a new space shuttle");
            System.out.println("3. Display the number of space crafts in your fleet");
            System.out.println("4. Display the total number of seats in all space crafts");
            System.out.println("5. Display all space crafts");
            System.out.println("6. Exit program");
            System.out.print("Choose an option (1-6): ");
            decision = scan.nextInt();

            System.out.println();

            if (decision == 1) {
                System.out.print("Name of Space Station: ");
                scan.nextLine();
                stationName = scan.nextLine();

                System.out.printf("Number of seats in %s: ", stationName);
                stationSeats = scan.nextInt();
                System.out.printf("Number of ports in %s: ", stationName);
                stationPorts = scan.nextInt();

                SpaceStation station = new SpaceStation(stationName, stationSeats, stationPorts);
                crafts.add(station);
                System.out.println();
            }

            if (decision == 2) {
                System.out.print("Name of Space Shuttle: ");
                scan.nextLine();
                shuttleName = scan.nextLine();

                System.out.printf("Number of seats in %s: ", shuttleName);
                shuttleSeats = scan.nextInt();

                System.out.printf("Number of engines in %s: ", shuttleName);
                shuttleEngines = scan.nextInt();

                SpaceShuttle shuttle = new SpaceShuttle(shuttleName, shuttleSeats, shuttleEngines);
                crafts.add(shuttle);
                System.out.println();
            }

            if (decision == 3) {
                System.out.println("Number of space crafts in fleet: " + crafts.size());
                System.out.println();
            }

            if (decision == 4) {
                int seats = 0;
                for (int i = 0; i < crafts.size(); i++) {
                    seats += crafts.get(i).getSeats();
                }

                System.out.println("Numbers of seats in all fleets: " + seats);
                System.out.println();
            }

            if (decision == 5) {
                for (int i = 0; i < crafts.size(); i++) {
                    System.out.print(crafts.get(i));
                }
                System.out.println();
            }

            if (decision == 6) {
                break;
            }

        }

    }

}
