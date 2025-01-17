/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcOptionInstrTradeCostField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrTradeCostField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_reserve1_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setFixedMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_FixedMargin_set(swigCPtr, this, value);
  }

  public double getFixedMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_FixedMargin_get(swigCPtr, this);
  }

  public void setMiniMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_MiniMargin_set(swigCPtr, this, value);
  }

  public double getMiniMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_MiniMargin_get(swigCPtr, this);
  }

  public void setRoyalty(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_Royalty_set(swigCPtr, this, value);
  }

  public double getRoyalty() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_Royalty_get(swigCPtr, this);
  }

  public void setExchFixedMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchFixedMargin_set(swigCPtr, this, value);
  }

  public double getExchFixedMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchFixedMargin_get(swigCPtr, this);
  }

  public void setExchMiniMargin(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchMiniMargin_set(swigCPtr, this, value);
  }

  public double getExchMiniMargin() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchMiniMargin_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrTradeCostField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcOptionInstrTradeCostField(), true);
  }

}
