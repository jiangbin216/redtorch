/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncDeltaIndexPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaIndexPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaIndexPriceField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncDeltaIndexPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_InstrumentID_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_ClosePrice_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaIndexPriceField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaIndexPriceField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncDeltaIndexPriceField(), true);
  }

}
