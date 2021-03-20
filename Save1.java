import java.io.Serializable;

class Save1 implements Serializable {
    String sFrom;
    String sTo;
    String sClass;
    String sBookingDate;
    String sTime;
    String iPrice;
    Integer iAdult;
    Integer iChildren;
    Integer iInfant;

    public Save1(String sFrom, String sTo, String sClass, Integer iAdult, String sBookingDate, String iPrice, String sTime) {
        this.sFrom = sFrom;
        this.sTo = sTo;
        this.sClass = sClass;
        this.iAdult = iAdult;
        this.iChildren = this.iChildren;
        this.iInfant = this.iInfant;
        this.sBookingDate = sBookingDate;
        this.iPrice = iPrice;
        this.sTime = sTime;
    }

    public String toString() {
        return this.sFrom + " " + this.sTo + " " + this.sClass + " " + this.iAdult + " " + this.iChildren + " " + this.iInfant + " " + this.sBookingDate + " " + this.iPrice + " " + this.sTime;
    }
}
