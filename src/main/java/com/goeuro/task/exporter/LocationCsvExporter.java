package com.goeuro.task.exporter;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.Unique;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.dozer.CsvDozerBeanWriter;
import org.supercsv.io.dozer.ICsvDozerBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.util.List;

/**
 * This class is used to export location list to csv file
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public class LocationCsvExporter<Location> implements CsvExporter<Location> {

    /**
     * @inheritDoc
     */
    @Override
    public String[] getFieldMapping() {
        return new String[] {
                "id",
                "key",
                "name",
                "fullName",
                "iataAirportCode",
                "type",
                "country",
                "geoPosition.latitude",
                "geoPosition.longitude",
                "locationId",
                "inEurope",
                "countryId",
                "countryCode",
                "coreCountry",
                "distance",
                "names",
                "alternativeNames"};
    }

    /**
     * @inheritDoc
     */
    @Override
    public CellProcessor[] getProcessors() {

        return new CellProcessor[] {
                new Unique(),   // id
                new Optional(), // key
                new NotNull(),  // name
                new NotNull(),  // fullname
                new Optional(), // iataAirportCode
                new NotNull(),  // type
                new NotNull(),  // country
                new NotNull(),  // latitude
                new NotNull(),  // longitude
                new Optional(), // locationId
                new NotNull(),  // inEurope
                new NotNull(),  // countryId
                new NotNull(),  // countryCode
                new NotNull(),  // coreCountry
                new Optional(), // distance
                new Optional(), // names
                new Optional()  // alternativeNames
        };
    }

    /**
     * @inheritDoc
     */
    @Override
    public String[] getHeaders() {
        return new String[]{
                "Id",
                "Key",
                "Name",
                "Full Name",
                "IATA Airport Code",
                "Type",
                "Country",
                "Latitude",
                "Longitude",
                "location Id",
                "In Europe",
                "Country Id",
                "Country Code",
                "Core Country",
                "Distance",
                "Names",
                "Alternative Names"};
    }

    /**
     * @inheritDoc
     */
    @Override
    public void export(List<Location> locations, String fileName, Class<Location> locationClass) {
        try (ICsvDozerBeanWriter beanWriter = new CsvDozerBeanWriter(new FileWriter(fileName),
                CsvPreference.STANDARD_PREFERENCE))
        {
            // configure the mapping from the fields to the CSV columns
            beanWriter.configureBeanMapping(com.goeuro.task.model.Location.class, getFieldMapping());

            // write the header
            beanWriter.writeHeader(getHeaders());

            // write the locations
            for (Location location : locations) {
                beanWriter.write(location, getProcessors());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
