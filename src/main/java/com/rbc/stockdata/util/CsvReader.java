package com.rbc.stockdata.util;

import com.rbc.stockdata.StockData;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Parts taken from https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
@Component
public class CsvReader {

    public List<StockData> getStockDataFromCSV() {

        String csvFile = "dow_jones_index.csv";
        InputStream inputStream = getClass().getResourceAsStream("/dow_jones_index.csv");
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<StockData> stockDataList = new ArrayList<>();

        try {

            br = new BufferedReader(new InputStreamReader(inputStream));
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                StockData stockdata = new StockData();
                stockdata.setQuarter(Integer.parseInt(data[0]));
                stockdata.setStock(data[1]);
                stockdata.setDate(data[2]);
                stockdata.setOpen(data[3]);
                stockdata.setHigh(data[4]);
                stockdata.setLow(data[5]);
                stockdata.setClose(data[6]);
                if (isNotEmpty(data[7])) {
                  stockdata.setVolume(Integer.parseInt(data[7]));
                }
                if (isNotEmpty(data[8])) {
                  stockdata.setPercentChangePrice(Float.parseFloat(data[8]));
                }
                if (isNotEmpty(data[9])) {
                  stockdata.setPercentChangeVolumeOverLastWeek(Float.parseFloat(data[9]));
                }
                if (isNotEmpty(data[10])) {
                  stockdata.setPreviousWeeksVolume(Integer.parseInt(data[10]));
                }
                stockdata.setNextWeeksOpen(data[11]);
                stockdata.setNextWeeksClose(data[12]);
                if (isNotEmpty(data[13])) {
                  stockdata.setPercentChangeNextWeeksPrice(Float.parseFloat(data[13]));
                }
                if (isNotEmpty(data[14])) {
                  stockdata.setDaysToNextDividend(Integer.parseInt(data[14]));
                }
                if (isNotEmpty(data[15])) {
                  stockdata.setPercentReturnNextDividend(Float.parseFloat(data[15]));
                }
                stockDataList.add(stockdata);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stockDataList;
    }

    boolean isNotEmpty(String str) {
      return str != null & !"".equals(str);
    }
}
