import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[][] book_time) {
        Hotel hotel = new Hotel();
        Arrays.sort(book_time, (a, b) -> 
                    Integer.parseInt(a[0].replace(":","")) - Integer.parseInt(b[0].replace(":",""))
                   );
        
        for (String[] bookTime : book_time){
            hotel.reservation(bookTime);
        }
        
        return hotel.getRoomCount();
    }
}
class Hotel {
    List<Room> roomList = new ArrayList<>();
    public void reservation(String[] bookTimeArray){
        Time startTime = new Time(bookTimeArray[0]);
        Time endTime = new Time(bookTimeArray[1]);
        BookTime bookTime = new BookTime(startTime, endTime);
        Room room = findRoom(bookTime);
        if( room != null ){
            room.reserve(bookTime);
        }else{
            Room newRoom = new Room();
            newRoom.reserve(bookTime);
            roomList.add(newRoom);
        }
    }

    public int getRoomCount(){
        return roomList.size();
    }

    private Room findRoom(BookTime bookTime){
        for (Room room : roomList){
            if( room.canReserve(bookTime) ){
                return room;
            }
        }
        return null;
    }

    class Room{
        List<BookTime> bookTimes = new ArrayList<>();

        public boolean canReserve(BookTime targetTime){
            for (BookTime bookTime : bookTimes){
                if( bookTime.contain(targetTime.createTenMinutesAgeBookTime()) ){
                    return false;
                }
            }

            return true;
        }

        public void reserve(BookTime reserveTime){
            bookTimes.add(reserveTime);
        }
    }
    class BookTime {
        private final Time startTime;
        private final Time endTime;

        public BookTime(Time startTime, Time endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public boolean contain(BookTime reserveTime){
            if( this.startTime.compare(reserveTime.startTime) >= 0 ){
                if( reserveTime.endTime.compare(this.startTime) >= 0 ){
                    return true;
                }
            }

            if ( reserveTime.startTime.compare(this.startTime) >= 0 ){
                if( reserveTime.startTime.compare(this.endTime) < 0 ){
                    return true;
                }
            }
            return false;
        }

        public BookTime createTenMinutesAgeBookTime(){
            return new BookTime(startTime.createTenMinuteAge(), endTime);
        }
    }

    class Time{
        private final int timeStamp;
        private int hour;
        private int minute;
        public Time(String time){
            timeStamp = convertTimeStamp(time);
        }

        private int convertTimeStamp(String time){
            String[] timeArray =  time.split(":");
            hour = Integer.parseInt(timeArray[0]);
            minute = Integer.parseInt(timeArray[1]);
            return (hour*100) + minute;
        }

        public int compare(Time time){
            return Integer.compare(this.timeStamp, time.timeStamp);
        }

        public Time createTenMinuteAge(){
            int tenMinuteAge = minute - 10;
            if( tenMinuteAge > 9 ){
                return new Time(hour+":"+tenMinuteAge);
            }

            if( tenMinuteAge >= 0){
                return new Time(hour+":0"+tenMinuteAge);
            }

            int tenMinuteAgoHour = hour - 1;
            if( tenMinuteAgoHour < 0 ){
                tenMinuteAgoHour = 0;
            }

            return new Time(tenMinuteAgoHour + ":" + (60 + tenMinuteAge));
        }
    }
}