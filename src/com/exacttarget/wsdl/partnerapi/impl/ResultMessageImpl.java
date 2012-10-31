/*
 * XML Type:  ResultMessage
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ResultMessage
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ResultMessage(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ResultMessageImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ResultMessage
{
    
    public ResultMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
    private static final javax.xml.namespace.QName CONVERSATIONID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ConversationID");
    private static final javax.xml.namespace.QName OVERALLSTATUSCODE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatusCode");
    private static final javax.xml.namespace.QName STATUSCODE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusCode");
    private static final javax.xml.namespace.QName STATUSMESSAGE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusMessage");
    private static final javax.xml.namespace.QName ERRORCODE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorCode");
    private static final javax.xml.namespace.QName REQUESTTYPE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestType");
    private static final javax.xml.namespace.QName RESULTTYPE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResultType");
    private static final javax.xml.namespace.QName RESULTDETAILXML$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ResultDetailXML");
    private static final javax.xml.namespace.QName SEQUENCECODE$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SequenceCode");
    private static final javax.xml.namespace.QName CALLSINCONVERSATION$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CallsInConversation");
    
    
    /**
     * Gets the "RequestID" element
     */
    public java.lang.String getRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestID" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestID" element
     */
    public boolean isSetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTID$0) != 0;
        }
    }
    
    /**
     * Sets the "RequestID" element
     */
    public void setRequestID(java.lang.String requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$0);
            }
            target.setStringValue(requestID);
        }
    }
    
    /**
     * Sets (as xml) the "RequestID" element
     */
    public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$0);
            }
            target.set(requestID);
        }
    }
    
    /**
     * Unsets the "RequestID" element
     */
    public void unsetRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTID$0, 0);
        }
    }
    
    /**
     * Gets the "ConversationID" element
     */
    public java.lang.String getConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSATIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConversationID" element
     */
    public org.apache.xmlbeans.XmlString xgetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERSATIONID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConversationID" element
     */
    public boolean isSetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSATIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "ConversationID" element
     */
    public void setConversationID(java.lang.String conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONVERSATIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONVERSATIONID$2);
            }
            target.setStringValue(conversationID);
        }
    }
    
    /**
     * Sets (as xml) the "ConversationID" element
     */
    public void xsetConversationID(org.apache.xmlbeans.XmlString conversationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONVERSATIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONVERSATIONID$2);
            }
            target.set(conversationID);
        }
    }
    
    /**
     * Unsets the "ConversationID" element
     */
    public void unsetConversationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSATIONID$2, 0);
        }
    }
    
    /**
     * Gets the "OverallStatusCode" element
     */
    public java.lang.String getOverallStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverallStatusCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOverallStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OverallStatusCode" element
     */
    public boolean isSetOverallStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERALLSTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "OverallStatusCode" element
     */
    public void setOverallStatusCode(java.lang.String overallStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUSCODE$4);
            }
            target.setStringValue(overallStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "OverallStatusCode" element
     */
    public void xsetOverallStatusCode(org.apache.xmlbeans.XmlString overallStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUSCODE$4);
            }
            target.set(overallStatusCode);
        }
    }
    
    /**
     * Unsets the "OverallStatusCode" element
     */
    public void unsetOverallStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERALLSTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "StatusCode" element
     */
    public java.lang.String getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusCode" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusCode" element
     */
    public boolean isSetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "StatusCode" element
     */
    public void setStatusCode(java.lang.String statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$6);
            }
            target.setStringValue(statusCode);
        }
    }
    
    /**
     * Sets (as xml) the "StatusCode" element
     */
    public void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODE$6);
            }
            target.set(statusCode);
        }
    }
    
    /**
     * Unsets the "StatusCode" element
     */
    public void unsetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$6, 0);
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public java.lang.String getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatusMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "StatusMessage" element
     */
    public boolean isSetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSMESSAGE$8) != 0;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(java.lang.String statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$8);
            }
            target.setStringValue(statusMessage);
        }
    }
    
    /**
     * Sets (as xml) the "StatusMessage" element
     */
    public void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$8);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Unsets the "StatusMessage" element
     */
    public void unsetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSMESSAGE$8, 0);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public int getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(int errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$10);
            }
            target.setIntValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$10);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$10, 0);
        }
    }
    
    /**
     * Gets the "RequestType" element
     */
    public com.exacttarget.wsdl.partnerapi.RequestType.Enum getRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RequestType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestType" element
     */
    public com.exacttarget.wsdl.partnerapi.RequestType xgetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RequestType target = null;
            target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().find_element_user(REQUESTTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestType" element
     */
    public boolean isSetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "RequestType" element
     */
    public void setRequestType(com.exacttarget.wsdl.partnerapi.RequestType.Enum requestType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTTYPE$12);
            }
            target.setEnumValue(requestType);
        }
    }
    
    /**
     * Sets (as xml) the "RequestType" element
     */
    public void xsetRequestType(com.exacttarget.wsdl.partnerapi.RequestType requestType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RequestType target = null;
            target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().find_element_user(REQUESTTYPE$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RequestType)get_store().add_element_user(REQUESTTYPE$12);
            }
            target.set(requestType);
        }
    }
    
    /**
     * Unsets the "RequestType" element
     */
    public void unsetRequestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "ResultType" element
     */
    public java.lang.String getResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResultType" element
     */
    public org.apache.xmlbeans.XmlString xgetResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULTTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResultType" element
     */
    public boolean isSetResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "ResultType" element
     */
    public void setResultType(java.lang.String resultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTTYPE$14);
            }
            target.setStringValue(resultType);
        }
    }
    
    /**
     * Sets (as xml) the "ResultType" element
     */
    public void xsetResultType(org.apache.xmlbeans.XmlString resultType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESULTTYPE$14);
            }
            target.set(resultType);
        }
    }
    
    /**
     * Unsets the "ResultType" element
     */
    public void unsetResultType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTTYPE$14, 0);
        }
    }
    
    /**
     * Gets the "ResultDetailXML" element
     */
    public java.lang.String getResultDetailXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTDETAILXML$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResultDetailXML" element
     */
    public org.apache.xmlbeans.XmlString xgetResultDetailXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULTDETAILXML$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResultDetailXML" element
     */
    public boolean isSetResultDetailXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTDETAILXML$16) != 0;
        }
    }
    
    /**
     * Sets the "ResultDetailXML" element
     */
    public void setResultDetailXML(java.lang.String resultDetailXML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTDETAILXML$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTDETAILXML$16);
            }
            target.setStringValue(resultDetailXML);
        }
    }
    
    /**
     * Sets (as xml) the "ResultDetailXML" element
     */
    public void xsetResultDetailXML(org.apache.xmlbeans.XmlString resultDetailXML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULTDETAILXML$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESULTDETAILXML$16);
            }
            target.set(resultDetailXML);
        }
    }
    
    /**
     * Unsets the "ResultDetailXML" element
     */
    public void unsetResultDetailXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTDETAILXML$16, 0);
        }
    }
    
    /**
     * Gets the "SequenceCode" element
     */
    public int getSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCECODE$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SequenceCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENCECODE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "SequenceCode" element
     */
    public boolean isSetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "SequenceCode" element
     */
    public void setSequenceCode(int sequenceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCECODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENCECODE$18);
            }
            target.setIntValue(sequenceCode);
        }
    }
    
    /**
     * Sets (as xml) the "SequenceCode" element
     */
    public void xsetSequenceCode(org.apache.xmlbeans.XmlInt sequenceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SEQUENCECODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SEQUENCECODE$18);
            }
            target.set(sequenceCode);
        }
    }
    
    /**
     * Unsets the "SequenceCode" element
     */
    public void unsetSequenceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCECODE$18, 0);
        }
    }
    
    /**
     * Gets the "CallsInConversation" element
     */
    public int getCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSINCONVERSATION$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallsInConversation" element
     */
    public org.apache.xmlbeans.XmlInt xgetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CALLSINCONVERSATION$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallsInConversation" element
     */
    public boolean isSetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLSINCONVERSATION$20) != 0;
        }
    }
    
    /**
     * Sets the "CallsInConversation" element
     */
    public void setCallsInConversation(int callsInConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSINCONVERSATION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLSINCONVERSATION$20);
            }
            target.setIntValue(callsInConversation);
        }
    }
    
    /**
     * Sets (as xml) the "CallsInConversation" element
     */
    public void xsetCallsInConversation(org.apache.xmlbeans.XmlInt callsInConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CALLSINCONVERSATION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CALLSINCONVERSATION$20);
            }
            target.set(callsInConversation);
        }
    }
    
    /**
     * Unsets the "CallsInConversation" element
     */
    public void unsetCallsInConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLSINCONVERSATION$20, 0);
        }
    }
}
