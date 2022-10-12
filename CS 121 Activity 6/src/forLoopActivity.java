import javax.swing.*;
public class forLoopActivity
{
    public static void main(String [] args)
    {
        int floors;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;
        int totalVacantRooms;
        double occupancyRate; // num of rooms occupied / total number of rooms
        floors = Integer.parseInt(JOptionPane.showInputDialog("Enter number of floors"));
        for(int i = 1; i <=floors; i++){
            int rooms = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rooms on floor %d",i));
            int occupiedRooms = Integer.parseInt(JOptionPane.showInputDialog("How many of the floor's rooms are occupied?"));
            totalRooms += rooms;
            totalOccupiedRooms += occupiedRooms;
        }
        totalVacantRooms = totalRooms - totalOccupiedRooms;
        occupancyRate = (double) totalOccupiedRooms/totalRooms;
        System.out.printf("Floors: %d\nRooms: %d\nOccupied Rooms: %d\nVacant Rooms: %d\n" + "Occupancy: %.2f (%d%%)",floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate, (int)(occupancyRate*100));
    }
}