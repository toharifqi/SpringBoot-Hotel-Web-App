package com.toharifqi.roomwebapp.services;

import com.toharifqi.roomwebapp.models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
        }
    }

    public static List<Room> getRooms() {
        return rooms;
    }
}
