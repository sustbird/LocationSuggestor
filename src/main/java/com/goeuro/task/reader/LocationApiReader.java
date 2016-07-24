package com.goeuro.task.reader;

import com.goeuro.task.model.Location;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Location API Reader Implementation
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */
public class LocationApiReader implements ApiReader {

    //default endpoint
    private String apiEndPoint = "http://api.goeuro.com/api/v2/position/suggest/en/";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Location> getResponse(String path) {
        ClientConfig config = new ClientConfig().register(new JacksonFeature());
        Response response = null;

        try
        {
            WebTarget target = ClientBuilder
                    .newClient(config)
                    .target(this.apiEndPoint);

            response = target.path(path)
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .get();

            //read response from api call
            List<Location> locationList = response.readEntity(new GenericType<List<Location>>(){});

            return locationList;

        } catch (Exception e) {
            System.err.println("Could not read from location api. Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            response.close();
        }

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setEndPoint(String apiEndPoint) {
        this.apiEndPoint = apiEndPoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getApiEndPoint() {
        return apiEndPoint;
    }
}
