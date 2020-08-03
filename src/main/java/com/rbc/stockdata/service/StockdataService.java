package com.rbc.stockdata.service;

import com.rbc.stockdata.StockData;
import com.rbc.stockdata.repository.StockdataRepository;
import com.rbc.stockdata.util.CsvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class StockdataService {

  @Autowired
  StockdataRepository repository;

  @Autowired
  CsvReader csvReader;

  public void uploadBulk(final List<StockData> stockDataList) {
    repository.saveAll(stockDataList);
  }

  public List<StockData> queryByTicker(final String ticker) {
    return repository.findByStock(ticker);
  }

  public void addStock(final StockData stockData) {
    repository.save(stockData);
  }

  @PostConstruct
  void initDatabase() {
    repository.saveAll(csvReader.getStockDataFromCSV());
  }
}
