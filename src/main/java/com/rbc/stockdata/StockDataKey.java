package com.rbc.stockdata;

import java.io.Serializable;
import java.util.Date;

public class StockDataKey implements Serializable {

  private Integer quarter;
  private String stock;
  private String date;

  public StockDataKey(Integer quarter, String stock, String date) {
    this.quarter = quarter;
    this.stock = stock;
    this.date = date;
  }

  //JPA needs the default constructor
  public StockDataKey() {
  }
}
