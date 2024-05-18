package com.pluralsight.models;

import java.io.File;

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

    public void saveContract(Contract contract)
    {
        File logFile = new File(filePath);


    }

    public Contract loadContract()
    {
       Contract contract  = null;

    }


}
