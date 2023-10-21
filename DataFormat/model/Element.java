package DataFormat.model;

import java.util.Calendar;
import java.util.Date;

public class Element {
    
  private String phone;
    private String email;
    private Date date;

    public Element() {
    }

    public Element(String phone, String email, Date date) {
        this.phone = phone;
        this.email = email;
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String displayDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String dayStr = cal.get(Calendar.DAY_OF_MONTH) + "";
        dayStr = (dayStr.length() == 1) ? "0" + dayStr : dayStr;
        String monthStr = cal.get(Calendar.MONTH) + 1 + "";
        monthStr = (monthStr.length() == 1) ? "0" + monthStr : monthStr;

        return dayStr + "/" + monthStr + "/" + cal.get(Calendar.YEAR);
    }
}