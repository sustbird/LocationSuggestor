# LocationSuggestor

## Code Structure
<pre>
├── main
│   ├── java
│   │   └── com
│   │       └── goeuro
│   │           └── task
│   │               ├── App.java                          -> Main Executable
│   │               ├── exporter
│   │               │   ├── CsvExporter.java              -> Interface for csv exporter
│   │               │   └── LocationCsvExporter.java      -> Implementation of location csv exporter
│   │               ├── model     -> Models for entity
│   │               │   ├── AlternativeNames.java
│   │               │   ├── GeoPosition.java
│   │               │   └── Location.java
│   │               └── reader
│   │                   ├── ApiReader.java                -> Interface for reading from Api
│   │                   └── LocationApiReader.java        -> Implementation for location api reader
│   └── resources
│       └── simplelogger.properties
└── test                                                  -> Unit test files
    └── java
        └── com
            └── goeuro
                └── task
                    ├── exporter
                    │   └── LocationCsvExporterTest.java
                    └── reader
                        └── LocationApiReaderTest.java

</pre>
## Commands

### To package the project, please run:
  ```bash
  mvn package
  ```
### To test:
  ```bash
  mvn test
  ```
### To execute:
```bash
java -jar GoEUtoTest.jar "Berlin"
```
