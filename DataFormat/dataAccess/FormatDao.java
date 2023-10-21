package DataFormat.dataAccess;

import java.util.Date;
import java.util.Scanner;

import DataFormat.common.Validation;

public class FormatDao {
    private static FormatDao instance;
    private Scanner sc = new Scanner(System.in);

    public static FormatDao getInstance() {
        if (instance == null) {
            synchronized (FormatDao.class) {
                if (instance == null) {
                    instance = new FormatDao();
                }
            }
        }
        return instance;
    }

    public String getPhone() {
        while (true) {
            try {
                System.out.print("Phone number: ");
                String phone = sc.nextLine();
                new Validation().checkPhone(phone);
                return phone;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getEmail() {
        while (true) {
            try {
                System.out.print("Email: ");
                String email = sc.nextLine();
                new Validation().checkEmail(email);
                return email;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Date getDate() {
        while (true) {
            try {
                System.out.print("Date: ");
                String dateStr = sc.nextLine();
                Date date = new Validation().checkDate(dateStr);
                return date;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

