package com.pluralsight;

import com.pluralsight.models.Dealership;
import com.pluralsight.ui.UserInterface;

public class Main
{
    static Dealership dealership;


    public static void main(String[] args)
    {

        UserInterface userInterface = new UserInterface();
        userInterface.run();


    }
}