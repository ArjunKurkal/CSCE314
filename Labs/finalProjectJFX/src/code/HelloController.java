package code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {
    @FXML
    public void onLaunch(){
        //load data from file
        DataFile myData = new DataFile("./Directory/directory1.txt", "./Input/input.txt");

        //initialize Vending machine with loaded data
        ArrayList<String> myVending = myData.loadDirectory();

        theMac = new Vending(myVending);
        ready = true;

        Slot1.setText(theMac.itemInSlot(0));
        Slot2.setText(theMac.itemInSlot(1));
        Slot3.setText(theMac.itemInSlot(2));
        Slot4.setText(theMac.itemInSlot(3));
        Slot5.setText(theMac.itemInSlot(4));
        Slot6.setText(theMac.itemInSlot(5));
        Slot7.setText(theMac.itemInSlot(6));
        Slot8.setText(theMac.itemInSlot(7));
        this.updateTags();
    }
    @FXML
    private Button Slot1;
    @FXML
    private Button Slot2;
    @FXML
    private Button Slot3;
    @FXML
    private Button Slot4;
    @FXML
    private Button Slot5;
    @FXML
    private Button Slot6;
    @FXML
    private Button Slot7;
    @FXML
    private Button Slot8;
    @FXML
    private Button initiate;
    @FXML
    private Label tag1;
    @FXML
    private Label tag2;
    @FXML
    private Label tag3;
    @FXML
    private Label tag4;
    @FXML
    private Label tag5;
    @FXML
    private Label tag6;
    @FXML
    private Label tag7;
    @FXML
    private Label tag8;

    private Vending theMac;
    private boolean ready  = false;

    public void updateTags(){
        Integer[] temp = this.theMac.quantity();
        this.tag1.setText(temp[0].toString());
        this.tag2.setText(temp[1].toString());
        this.tag3.setText(temp[2].toString());
        this.tag4.setText(temp[3].toString());
        this.tag5.setText(temp[4].toString());
        this.tag6.setText(temp[5].toString());
        this.tag7.setText(temp[6].toString());
        this.tag8.setText(temp[7].toString());
    }
    @FXML
    public void onButton1Press(){
        if(!ready) return;
        this.theMac.unloadedItem(0);
        this.updateTags();
    }
    @FXML
    public void onButton2Press(){
        if(!ready) return;
        this.theMac.unloadedItem(1);
        this.updateTags();
    }
    @FXML
    public void onButton3Press(){
        if(!ready) return;
        this.theMac.unloadedItem(2);
        this.updateTags();
    }
    @FXML
    public void onButton4Press(){
        if(!ready) return;
        this.theMac.unloadedItem(3);
        this.updateTags();
    }
    @FXML
    public void onButton5Press(){
        if(!ready) return;
        this.theMac.unloadedItem(4);
        this.updateTags();
    }
    @FXML
    public void onButton6Press(){
        if(!ready) return;
        this.theMac.unloadedItem(5);
        this.updateTags();
    }
    @FXML
    public void onButton7Press(){
        if(!ready) return;
        this.theMac.unloadedItem(6);
        this.updateTags();
    }
    @FXML
    public void onButton8Press(){
        if(!ready) return;
        this.theMac.unloadedItem(7);
        this.updateTags();
    }
}