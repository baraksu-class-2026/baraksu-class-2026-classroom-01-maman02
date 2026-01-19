public class HotelRoom {
    private int _roomNum;
    private int _numBeds;
    private boolean _occupied;
    private String _guest;
    
    private static final String DEF_GUEST = "";
    private static final int DEF_ROOM_NUM = 999;
    private static final int DEF_NUM_BEDS = 2;
    
    private static final int MIN_ROOM_NUM = 99;
    private static final int MAX_ROOM_NUM = 1000;
    
    private static final int MIN_NUM_BEDS = 2;
    private static final int MAX_NUM_BEDS = 4;
    
    private static final int INVALID_VALUE = -1;
    
    public HotelRoom() {
        setRoomNum(INVALID_VALUE);
        setNumBeds(INVALID_VALUE);
    }

    public HotelRoom(int roomNum, int numBeds) {
        setRoomNum(roomNum);
        setNumBeds(numBeds);
        _occupied = false;
        _guest = DEF_GUEST;
    }

    public int getRoomNum() {
        return _roomNum;
    }
    
    public int getNumBeds() {
        return _numBeds;
    }
    
    public boolean isOccupied() {
        return _occupied;
    }
    
    public String getGuest() {
        return _guest;
    }
    
    public void setRoomNum(int roomNum) {
        if (roomNumOk(roomNum)) {
            _roomNum = roomNum;
        } else {
            _roomNum = DEF_ROOM_NUM;
        }
    }
    
    public void setNumBeds(int numBeds) {
        if (numBedsOk(numBeds)) {
            _numBeds = numBeds;
        } else {
            _numBeds = DEF_NUM_BEDS;
        }
    }
    
    private boolean roomNumOk(int roomNum) {
        return roomNum > MIN_ROOM_NUM && roomNum < MAX_ROOM_NUM;
    }
    
    private boolean numBedsOk(int numbed) {
        return numbed >= MIN_NUM_BEDS && numbed <= MAX_NUM_BEDS;
    }
    
    public String toString() {
        if (_occupied) {
            return "Room " + _roomNum + ", "  + _numBeds + " Beds: Occupied by " + _guest;
        } else {
            return "Room " + _roomNum + ", "  + _numBeds + " Beds: Available";
        }
    }
    
    public boolean equals(HotelRoom other) {
        return _roomNum == other._roomNum && _numBeds == other._numBeds;
    }
    
    public boolean before(HotelRoom other) {
        return _roomNum < other._roomNum;
    }
    
    public boolean after(HotelRoom other) {
        return other.before(this);
    }
    
    public boolean checkIn(String guest) {
        if (_occupied) { 
            return false;
        } else {
            _occupied = true;
            _guest = guest;
            return true;
        }
    }
    
    public void checkOut() {
        _occupied = false;
        _guest = DEF_GUEST;
    }
}