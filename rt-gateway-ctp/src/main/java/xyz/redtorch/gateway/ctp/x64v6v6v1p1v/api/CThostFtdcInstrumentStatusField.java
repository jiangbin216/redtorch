/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcInstrumentStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentStatusField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_reserve1_get(swigCPtr, this);
  }

  public void setSettlementGroupID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_set(swigCPtr, this, value);
  }

  public String getSettlementGroupID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_SettlementGroupID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_reserve2_get(swigCPtr, this);
  }

  public void setInstrumentStatus(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_set(swigCPtr, this, value);
  }

  public char getInstrumentStatus() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_InstrumentStatus_get(swigCPtr, this);
  }

  public void setTradingSegmentSN(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_set(swigCPtr, this, value);
  }

  public int getTradingSegmentSN() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_TradingSegmentSN_get(swigCPtr, this);
  }

  public void setEnterTime(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_EnterTime_set(swigCPtr, this, value);
  }

  public String getEnterTime() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_EnterTime_get(swigCPtr, this);
  }

  public void setEnterReason(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_EnterReason_set(swigCPtr, this, value);
  }

  public char getEnterReason() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_EnterReason_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcInstrumentStatusField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentStatusField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcInstrumentStatusField(), true);
  }

}
