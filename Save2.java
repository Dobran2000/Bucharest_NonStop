import java.io.Serializable;

class Save2 implements Serializable {
    String sFrom;
    String sTo;
    String sClass;
    String sBookingDate;
    String sTime;
    Integer iPrice;
    Integer iAdult;

    public Save2(String sFrom, String sTo, String sClass, Integer iAdult, String sBookingDate, Integer iPrice, String sTime) {
        this.sFrom = sFrom;
        this.sTo = sTo;
        this.sClass = sClass;
        this.iAdult = iAdult;
        this.sBookingDate = sBookingDate;
        this.iPrice = iPrice;
        this.sTime = sTime;
    }

    public String toString() {
        return this.sFrom + " " + this.sTo + " " + this.sClass + " " + this.iAdult + " " + this.sBookingDate + " " + this.iPrice + " " + this.sTime;
    }
}
