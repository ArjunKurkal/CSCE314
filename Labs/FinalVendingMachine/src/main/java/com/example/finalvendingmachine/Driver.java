package com.example.finalvendingmachine;


import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //load data from file
        DataFile myData = new DataFile("./Directory/directory1.txt", "./Input/input.txt");

        //initialize Vending machine with loaded data
        ArrayList <String> myVending = myData.loadDirectory();
        ArrayList <Integer> mySelections = myData.loadSampleInput();

        Vending myMachine = new Vending(myVending);
        // Test line to show items before removing initially
        // System.out.println("Items originally there:");
        // myMachine.DisplayItems(); //debug helper function, REALLY NEEDS toString()
        // System.out.println("______________________________");
        //remove items
        // System.out.println("Items removed final count: ");
        myMachine.unloadItems(mySelections);

        //Final output to display after removing
        myMachine.displayItems(); //debug helper function, REALLY NEEDS toString()

        /*****************/
        // Above DisplayItems() call is fine, but the Vending machine's deconstructor
        // should call that function since it's the LAST operation. Notice it could be
        // done with a helper function that USES the toString()
        // We will NOT call DisplayItems() in testing
        /*****************/



        //TESTER CODE
        /*
         * create 4 new data files, with various tester data, and compile them into an ArrayList
         * */
        DataFile testAllSameDrink = new DataFile("./Directory/sampleDir1.txt", "./Input/sampleInput1.txt");
        DataFile testAllDifferentDrinks = new DataFile("./Directory/sampleDir2.txt", "./Input/sampleInput2.txt");
        DataFile testAllSnacks = new DataFile("./Directory/sampleDir3.txt", "./Input/sampleInput3.txt");
        DataFile testEmptyMachine = new DataFile("./Directory/sampleDir4.txt", "./Input/sampleInput4.txt");

        ArrayList<DataFile> l = new ArrayList<>();
        l.add(testAllSameDrink);
        l.add(testAllDifferentDrinks);
        l.add(testAllSnacks);
        l.add(testEmptyMachine);

        /*
         * For each of the files, load the vending machine with their contents and remove their contents subsequently,
         * display the vending machine's contents before and after the unloading of items
         * */
        for(DataFile D : l){
            ArrayList <String> V1 = D.loadDirectory();
            ArrayList <Integer> S1 = D.loadSampleInput();

            myMachine = new Vending(V1);
            myMachine.displayItems();
            myMachine.unloadItems(S1);
            myMachine.displayItems();

        }
    }
}