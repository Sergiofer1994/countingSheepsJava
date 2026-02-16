package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            boolean[] rebano1 = {true,  true,  true,  false, true,  true,  true,
                true , true,  false, true,  false, true,
                false, false, true , true,  true,  true,
                true , false, false, true,  true};
        int sheepsNumber = 0;
        int wolvesNumber = 0;
        boolean[] rebano2 = {false, false, false};
        for (int i = 0; i <= rebano1.length; i++) {
            if (rebano1[i]==true) sheepsNumber ++;
            if (rebano1[i]==false) wolvesNumber ++;
            }


        System.out.println("There are "+sheepsNumber+" sheep in total");
        System.out.println("UPS!!! Wolfs eaten Sheeps");
    }
    }
