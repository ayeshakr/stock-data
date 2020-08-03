package com.rbc.stockdata.repository;

import com.rbc.stockdata.StockData;
import com.rbc.stockdata.StockDataKey;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockdataRepository extends CrudRepository<StockData, StockDataKey> {
  List<StockData> findByStock(String stock);
}
