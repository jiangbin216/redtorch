/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcCombPromotionParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombPromotionParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombPromotionParamField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcCombPromotionParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setXparameter(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_Xparameter_set(swigCPtr, this, value);
  }

  public double getXparameter() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcCombPromotionParamField_Xparameter_get(swigCPtr, this);
  }

  public CThostFtdcCombPromotionParamField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcCombPromotionParamField(), true);
  }

}
