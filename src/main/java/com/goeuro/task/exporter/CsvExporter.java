package com.goeuro.task.exporter;

import org.supercsv.cellprocessor.ift.CellProcessor;

import java.util.List;

/**
 * This interface provide contract for exporting to csv file
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public interface CsvExporter<T> {

    /**
     * Get field mapping
     * @return
     */
    String[] getFieldMapping();

    /**
     * Get cell processor for csv
     * @return
     */
    CellProcessor[] getProcessors();

    /**
     * Get Csv headers
     * @return
     */
    String[] getHeaders();

    /**
     * Export the list to csv
     * @param objectsList list of export
     * @param fileName csv file name
     * @param clazz class name of list
     */
    public void export(List<T> objectsList, String fileName, Class<T> clazz);
}
