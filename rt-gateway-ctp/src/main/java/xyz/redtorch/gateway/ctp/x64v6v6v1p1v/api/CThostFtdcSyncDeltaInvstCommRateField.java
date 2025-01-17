/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncDeltaInvstCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstCommRateField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncDeltaInvstCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInvstCommRateField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstCommRateField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncDeltaInvstCommRateField(), true);
  }

}
