package com.goeuro.task.reader;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for LocationApiReader
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public class LocationApiReaderTest {
    ApiReader apiReader = new LocationApiReader();

    @Test
    public void testSetGetEndPoint() throws Exception {
        apiReader.setEndPoint("testUri");
        assertEquals("API endpoint not set correctly", "testUri", apiReader.getApiEndPoint());
    }

}
