package com.goeuro.task.reader;

import com.goeuro.task.model.Location;

import java.util.List;

/**
 * Represent the contract for Location API Reader
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public interface ApiReader {
    /**
     * Setting api end point
     * @param apiEndPoint
     */
    void setEndPoint(String apiEndPoint);

    /**
     * Getting api endpoint
     * @return
     */
    String getApiEndPoint();

    /**
     * Get api response
     * @param path api path
     * @return
     */
    List<Location> getResponse(String path);
}
