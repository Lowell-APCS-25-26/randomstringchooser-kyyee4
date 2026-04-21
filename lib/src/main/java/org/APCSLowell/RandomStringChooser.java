package org.APCSLowell;

import java.util.ArrayList;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private ArrayList<String> ArrL;
    public RandomStringChooser(String[] arr){
        ArrL = new ArrayList<String>();
        for(int i = 0; i<arr.length;i++){
            ArrL.add(arr[i]);
        }
    }
    public String getNext(){
        if (ArrL.size() > 0){
            return ArrL.remove((int)(Math.random() * ArrL.size()));
        }
        return "None";
    }
}
