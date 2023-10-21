package DataFormat.repository;

import DataFormat.dataAccess.FormatDao;
import DataFormat.model.Element;

public class FormatRepository implements IFormatRepository {

    private Element infor;

    public FormatRepository() {
        infor = new Element();
    }

    @Override
    public void inputPhone() {
        infor.setPhone(FormatDao.getInstance().getPhone());
    }

    @Override
    public void inputEmail() {
        infor.setEmail(FormatDao.getInstance().getEmail());
    }

    @Override
    public void inputDate() {
        infor.setDate(FormatDao.getInstance().getDate());
    }

    public void getInformation() {
        inputPhone();
        inputEmail();
        inputDate();
        display();
    }

    @Override
    public void display() {
        System.out.println("\n----DISPLAY----");
        System.out.println("Phone :" + infor.getPhone());
        System.out.println("Email :" + infor.getEmail());
        System.out.println("Date :" + infor.displayDate());
    }

}
