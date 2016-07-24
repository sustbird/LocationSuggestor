package com.goeuro.task;

import com.goeuro.task.exporter.CsvExporter;
import com.goeuro.task.exporter.LocationCsvExporter;
import com.goeuro.task.model.Location;
import com.goeuro.task.reader.ApiReader;
import com.goeuro.task.reader.LocationApiReader;

import java.util.List;

/**
 * This class is main invoking point of the task.
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public class App 
{
    static ApiReader apiReader = new LocationApiReader();
    static CsvExporter exporter = new LocationCsvExporter();
    static String csvFileName = "test.csv";

    public static void main( String[] args )
    {
        if (args.length == 0) {
            throw new IllegalArgumentException("You have to provide location name parameter");
        }

        String locationParam = args[0];

        //read response from api call
        List<Location> locationList = apiReader.getResponse(locationParam);

        //export to csv file
        System.out.println("Exporting " + locationList.size() + " records, returned from API to csv file: " + csvFileName);


        exporter.export(locationList, csvFileName, Location.class);
    }
}
