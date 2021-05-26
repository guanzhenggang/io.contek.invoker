package io.contek.invoker.hbdminverse.api.common;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class _PositionInfo {

  public String symbol;
  public String contract_code;
  public double volume;
  public double available;
  public double frozen;
  public Double cost_open;
  public Double cost_hold;
  public double profit_unreal;
  public double profit_rate;
  public int lever_rate;
  public double position_margin;
  public String direction;
  public double profit;
  public Double last_price;
}
