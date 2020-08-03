package com.rbc.stockdata.controller;

import com.rbc.stockdata.StockData;
import com.rbc.stockdata.repository.StockdataRepository;
import com.rbc.stockdata.service.StockdataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockDataController {
  @Autowired
  StockdataService stockdataService;

// - upload a bulk data set
  @RequestMapping(path = "uploadBulk", method = {RequestMethod.POST})
  public String uploadBulk(@RequestBody List<StockData> stockData) {
    stockdataService.uploadBulk(stockData);
    return "upload successful";
  }
// - query for data by stock ticker (e.g. input: AA, would return 12 elements if the only data uploaded were the single data set above)
  @RequestMapping(path = "findByTicker/{ticker}", method = {RequestMethod.GET})
  public List<StockData> queryByTicker(@PathVariable(value = "ticker") String ticker) {
    return stockdataService.queryByTicker(ticker);
  }
// - add a new record
  @RequestMapping(path = "uploadRecord", method = {RequestMethod.POST})
  public String addStock(@RequestBody StockData data) {
    stockdataService.addStock(data);
    return "Upload Successful";
  }


}
