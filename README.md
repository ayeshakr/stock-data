# Running the application
You may need to manually create the DB locally - run `mysql` and then `CREATE DATABASE stockdata`

You may also need to do this if you run into permissions issues `GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'pass' WITH GRANT OPTION;`

Build the project using `mvn clean install` and run using your IDE or `./mvnw spring-boot:run` from the command line.


Here's a sample POST request for the addRecord operation:
```
{
	"quarter": "1",
	"stock": "AB",
	"date": "01/14/2011",
	"open": "$16.71",
	"high": "$16.71",
    "low": "$15.64",
    "close": "$15.97",
    "volume": "1231321",
    "percentChangePrice": "-4.42849",
    "percentChangeVolumeOverLastWeek": "1.380223028",
    "previousWeeksVolume": "2434",
    "nextWeeksOpen": "$123.23",
    "nextWeeksClose": "$12312.23",
    "percentChangeNextWeeksPrice": "1231.12313",
    "daysToNextDividend": "243",
    "percentReturnNextDividend": "1.2323"
}
```

I ommitted testing as the solution took be the allotted ~3 hours.

