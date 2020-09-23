package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lasUpdated;

    public Menu() {
        this.listOfDishes = new ArrayList<>();
        this.lasUpdated = new Date(); //right now
    }
}
