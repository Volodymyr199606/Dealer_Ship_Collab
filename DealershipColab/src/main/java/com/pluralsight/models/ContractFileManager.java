package com.pluralsight.models;

import java.io.File;
import java.util.Scanner;

public class ContractFileManager
{
    private final String LOG_DIRECTORY_PATH = "files";
    private String filePath;

    public ContractFileManager(String fileName)
    {
        // this makes sure that the logs folder is created
        File directory = new File(LOG_DIRECTORY_PATH);
        if(!directory.exists())
        {
            directory.mkdir();
        }

        // create a variable with the correct file path
//        this.fileName = fileName;
        this.filePath = LOG_DIRECTORY_PATH + "/" + fileName;
        if(!this.filePath.toLowerCase().endsWith(".csv"))
        {
            this.filePath += ".csv";
        }
    }

    public void saveContract(Dealership contract)
    {
        File logFile = new File(filePath);


    }

    public Dealership LoadContract()
    {
       Dealership contract  = null;
        File file = new File("files/inventory.csv");
        try(Scanner fileScanner = new Scanner(file)){


            while(fileScanner.hasNextLine())

            {
                String line = fileScanner.nextLine();
                String[] contractDetails = line.split("\\|");
                String type = contractDetails[0];
                switch (type.toLowerCase()){
                    case "lease":
                    int contractDate = Integer.parseInt(contractDetails[1]);
                    String name = contractDetails[2];
                    String adress =  contractDetails[3];
                    int carId = Integer.parseInt(contractDetails[4]);
                    int carYear = Integer.parseInt( contractDetails[5]);
                    String makeCar = contractDetails[6];
                    String carModel = contractDetails[7];
                    String vehicleType = contractDetails[8];
                    String vehicleColor = contractDetails[9];
                    int odometer =  Integer.parseInt(contractDetails[10]);
                    double price = Double.parseDouble(contractDetails[11]);
                    double salesTax =  Double.parseDouble(contractDetails[12]);
                    int recordingFee = Integer.parseInt(contractDetails[13]);
                    int processingFee = Integer.parseInt(contractDetails[14]);
                    double totalCost = Double.parseDouble(contractDetails[15]);
                    boolean finance = Boolean.parseBoolean (contractDetails[16]);
                    double monthlyPayment = Double.parseDouble(contractDetails[17]);

                        break;
                }
            }
        }

    }



}
