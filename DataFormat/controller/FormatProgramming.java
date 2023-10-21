package DataFormat.controller;

import DataFormat.repository.FormatRepository;
import DataFormat.view.Menu;

public class FormatProgramming extends Menu<String>{
    private FormatRepository inforRepo;

    public FormatProgramming() {
        super("Validate Program", new String[]{"Input Information.","Exit."});
        inforRepo = new FormatRepository();
    }


    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> inforRepo.getInformation();
        }
    }
    

    
}
