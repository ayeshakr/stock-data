package com.rbc.stockdata;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(StockDataKey.class)
public class StockData implements Serializable {
  public StockData() {
  }

  @Id
  private Integer quarter;
  @Id
  private String stock;
  @Id
  private String date;
  private String open;
  private String high;
  private String low;
  private String close;
  private int volume;
  private float percentChangePrice;
  private float percentChangeVolumeOverLastWeek;
  private int previousWeeksVolume;
  private String nextWeeksOpen;
  private String nextWeeksClose;
  private float percentChangeNextWeeksPrice;
  private int daysToNextDividend;
  private float percentReturnNextDividend;

  public Integer getQuarter() {
    return quarter;
  }

  public void setQuarter(Integer quarter) {
    this.quarter = quarter;
  }

  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getOpen() {
    return open;
  }

  public void setOpen(String open) {
    this.open = open;
  }

  public String getHigh() {
    return high;
  }

  public void setHigh(String high) {
    this.high = high;
  }

  public String getLow() {
    return low;
  }

  public void setLow(String low) {
    this.low = low;
  }

  public String getClose() {
    return close;
  }

  public void setClose(String close) {
    this.close = close;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public float getPercentChangePrice() {
    return percentChangePrice;
  }

  public void setPercentChangePrice(float percentChangePrice) {
    this.percentChangePrice = percentChangePrice;
  }

  public float getPercentChangeVolumeOverLastWeek() {
    return percentChangeVolumeOverLastWeek;
  }

  public void setPercentChangeVolumeOverLastWeek(float percentChangeVolumeOverLastWeek) {
    this.percentChangeVolumeOverLastWeek = percentChangeVolumeOverLastWeek;
  }

  public int getPreviousWeeksVolume() {
    return previousWeeksVolume;
  }

  public void setPreviousWeeksVolume(int previousWeeksVolume) {
    this.previousWeeksVolume = previousWeeksVolume;
  }

  public String getNextWeeksOpen() {
    return nextWeeksOpen;
  }

  public void setNextWeeksOpen(String nextWeeksOpen) {
    this.nextWeeksOpen = nextWeeksOpen;
  }

  public String getNextWeeksClose() {
    return nextWeeksClose;
  }

  public void setNextWeeksClose(String nextWeeksClose) {
    this.nextWeeksClose = nextWeeksClose;
  }

  public float getPercentChangeNextWeeksPrice() {
    return percentChangeNextWeeksPrice;
  }

  public void setPercentChangeNextWeeksPrice(float percentChangeNextWeeksPrice) {
    this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
  }

  public int getDaysToNextDividend() {
    return daysToNextDividend;
  }

  public void setDaysToNextDividend(int daysToNextDividend) {
    this.daysToNextDividend = daysToNextDividend;
  }

  public float getPercentReturnNextDividend() {
    return percentReturnNextDividend;
  }

  public void setPercentReturnNextDividend(float percentReturnNextDividend) {
    this.percentReturnNextDividend = percentReturnNextDividend;
  }
}
