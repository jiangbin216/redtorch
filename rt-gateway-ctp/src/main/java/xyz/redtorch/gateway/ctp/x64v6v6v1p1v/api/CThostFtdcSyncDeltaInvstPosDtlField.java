/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncDeltaInvstPosDtlField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstPosDtlField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstPosDtlField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncDeltaInvstPosDtlField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_get(swigCPtr, this);
  }

  public void setTimeFirstVolume(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_set(swigCPtr, this, value);
  }

  public int getTimeFirstVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_get(swigCPtr, this);
  }

  public void setSpecPosiType(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_set(swigCPtr, this, value);
  }

  public char getSpecPosiType() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstPosDtlField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncDeltaInvstPosDtlField(), true);
  }

}
