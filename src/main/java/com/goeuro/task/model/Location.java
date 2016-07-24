package com.goeuro.task.model;

/**
 * Represent location
 *
 * @author Shafiul Bashar<shafiul-cse@hotmail.com>
 */

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "key",
        "name",
        "fullName",
        "iata_airport_code",
        "type",
        "country",
        "geo_position",
        "locationId",
        "inEurope",
        "countryId",
        "countryCode",
        "coreCountry",
        "distance",
        "names",
        "alternativeNames"
})
public class Location {

    @JsonProperty("_id")
    private Long id;

    @JsonProperty("key")
    private Object key;

    @JsonProperty("name")
    private String name;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("iata_airport_code")
    private Object iataAirportCode;

    @JsonProperty("type")
    private String type;

    @JsonProperty("country")
    private String country;

    @JsonProperty("geo_position")
    private GeoPosition geoPosition;

    @JsonProperty("locationId")
    private Object locationId;

    @JsonProperty("inEurope")
    private Boolean inEurope;

    @JsonProperty("countryId")
    private Long countryId;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("coreCountry")
    private Boolean coreCountry;

    @JsonProperty("distance")
    private Object distance;

    @JsonProperty("names")
    private Map<String, String> names;

    @JsonProperty("alternativeNames")
    private AlternativeNames alternativeNames;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The id
     */
    @JsonProperty("_id")
    public Long getId() {
        return id;
    }

    /**
     * @param id The _id
     */
    @JsonProperty("_id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The key
     */
    @JsonProperty("key")
    public Object getKey() {
        return key;
    }

    /**
     * @param key The key
     */
    @JsonProperty("key")
    public void setKey(Object key) {
        this.key = key;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The fullName
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The fullName
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return The iataAirportCode
     */
    @JsonProperty("iata_airport_code")
    public Object getIataAirportCode() {
        return iataAirportCode;
    }

    /**
     * @param iataAirportCode The iata_airport_code
     */
    @JsonProperty("iata_airport_code")
    public void setIataAirportCode(Object iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    /**
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The geoPosition
     */
    @JsonProperty("geo_position")
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    /**
     * @param geoPosition The geo_position
     */
    @JsonProperty("geo_position")
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    /**
     * @return The locationId
     */
    @JsonProperty("locationId")
    public Object getLocationId() {
        return locationId;
    }

    /**
     * @param locationId The locationId
     */
    @JsonProperty("locationId")
    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    /**
     * @return The inEurope
     */
    @JsonProperty("inEurope")
    public Boolean getInEurope() {
        return inEurope;
    }

    /**
     * @param inEurope The inEurope
     */
    @JsonProperty("inEurope")
    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    /**
     * @return The countryId
     */
    @JsonProperty("countryId")
    public Long getCountryId() {
        return countryId;
    }

    /**
     * @param countryId The countryId
     */
    @JsonProperty("countryId")
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * @return The countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode The countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return The coreCountry
     */
    @JsonProperty("coreCountry")
    public Boolean getCoreCountry() {
        return coreCountry;
    }

    /**
     * @param coreCountry The coreCountry
     */
    @JsonProperty("coreCountry")
    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    /**
     * @return The distance
     */
    @JsonProperty("distance")
    public Object getDistance() {
        return distance;
    }

    /**
     * @param distance The distance
     */
    @JsonProperty("distance")
    public void setDistance(Object distance) {
        this.distance = distance;
    }

    /**
     * @return The names
     */
    @JsonProperty("names")
    public Map<String, String> getNames() {
        return names;
    }

    /**
     * @param names The names
     */
    @JsonProperty("names")
    public void setNames(Map<String, String> names) {
        this.names = names;
    }

    /**
     * @return The alternativeNames
     */
    @JsonProperty("alternativeNames")
    public AlternativeNames getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * @param alternativeNames The alternativeNames
     */
    @JsonProperty("alternativeNames")
    public void setAlternativeNames(AlternativeNames alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    @Override
    public String toString() {
        return "Location{" +
                "alternativeNames=" + alternativeNames +
                ", id=" + id +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", iataAirportCode=" + iataAirportCode +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", geoPosition=" + geoPosition +
                ", locationId=" + locationId +
                ", inEurope=" + inEurope +
                ", countryId=" + countryId +
                ", countryCode='" + countryCode + '\'' +
                ", coreCountry=" + coreCountry +
                ", distance=" + distance +
                ", names=" + names +
                '}';
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}