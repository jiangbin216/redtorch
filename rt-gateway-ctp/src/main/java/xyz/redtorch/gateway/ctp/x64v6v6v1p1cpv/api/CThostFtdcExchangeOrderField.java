/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcExchangeOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrderPriceType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_reserve1_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_BranchID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcExchangeOrderField(), true);
  }

}
