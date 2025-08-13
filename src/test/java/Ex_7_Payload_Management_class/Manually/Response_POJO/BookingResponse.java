package Ex_7_Payload_Management_class.Manually.Response_POJO;

import Ex_7_Payload_Management_class.Manually.Request_POJO.Booking;

public class BookingResponse {
    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Integer bookingid;
    private Booking booking;
}
