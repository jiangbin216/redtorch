/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQuoteField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve1_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_UserID_get(swigCPtr, this);
  }

  public void setAskPrice(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve2_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_NotifySequence_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SettlementID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_CancelTime_get(swigCPtr, this);
  }

  public void setQuoteStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteStatus_set(swigCPtr, this, value);
  }

  public char getQuoteStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_QuoteStatus_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SequenceNo_get(swigCPtr, this);
  }

  public void setAskOrderSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOrderSysID_set(swigCPtr, this, value);
  }

  public String getAskOrderSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOrderSysID_get(swigCPtr, this);
  }

  public void setBidOrderSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOrderSysID_set(swigCPtr, this, value);
  }

  public String getBidOrderSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOrderSysID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerQuoteSeq(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BrokerQuoteSeq_set(swigCPtr, this, value);
  }

  public int getBrokerQuoteSeq() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BrokerQuoteSeq_get(swigCPtr, this);
  }

  public void setAskOrderRef(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOrderRef_set(swigCPtr, this, value);
  }

  public String getAskOrderRef() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AskOrderRef_get(swigCPtr, this);
  }

  public void setBidOrderRef(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOrderRef_set(swigCPtr, this, value);
  }

  public String getBidOrderRef() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BidOrderRef_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_CurrencyID_get(swigCPtr, this);
  }

  public void setReserve3(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve3_set(swigCPtr, this, value);
  }

  public String getReserve3() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_reserve3_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setReplaceSysID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ReplaceSysID_set(swigCPtr, this, value);
  }

  public String getReplaceSysID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcQuoteField_ReplaceSysID_get(swigCPtr, this);
  }

  public CThostFtdcQuoteField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcQuoteField(), true);
  }

}
