package com.goeuro.task.exporter;

import com.goeuro.task.model.Location;
import org.junit.Test;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.Unique;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testing LocationCsvExporter
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public class LocationCsvExporterTest {
    CsvExporter<Location> exporter = new LocationCsvExporter<>();

    @Test
    public void testGetFieldMapping() throws Exception {
        assertEquals("Field mapping not returning connect number of fields", 17, exporter.getFieldMapping().length);

        assertEquals("Field mapping does not return id as first field", "id", exporter.getFieldMapping()[0]);
    }

    @Test
    public void testGetProcessors() throws Exception {
        assertEquals("cell processor does not return connect number of processor", 17, exporter.getProcessors().length);

        assertTrue("cell processor does not return correct first processor", Unique.class.isInstance(exporter.getProcessors()[0]));

        assertTrue("cell processor does not return correct second processor", Optional.class.isInstance(exporter.getProcessors()[1]));
    }

    @Test
    public void testGetHeaders() throws Exception {
        assertEquals("Wrong number of headers", 17, exporter.getHeaders().length);

        assertEquals("First header is not Id", "Id", exporter.getHeaders()[0]);
    }
}
