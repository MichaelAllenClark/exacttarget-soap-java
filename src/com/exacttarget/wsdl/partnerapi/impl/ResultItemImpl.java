/*
 * XML Type:  ResultItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ResultItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ResultItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ResultItemImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ResultItem
{
    
    public ResultItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
    private static final javax.xml.namespace.QName CONVERSATIONID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ConversationID");
    private static final javax.xml.namespace.QName STATUSCODE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusCode");
    private static final javax.xml.namespace.QName STATUSMESSAGE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StatusMessage");
    private static final javax.xml.namespace.QName ORDINALID$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OrdinalID");
    private static final javax.xml.namespace.QName ERRORCODE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorCode");
    private static final javax.xml.namespace.QName REQUESTTYPE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestType");
    private static final javax.xml.namespace.QName REQUESTOBJECTTYPE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestObjectType");
    
    
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
     * Gets the "StatusCode" element
     */
    public java.lang.String getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODE$4);
            }
            target.set(statusCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$6, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSMESSAGE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSMESSAGE$6);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Gets the "OrdinalID" element
     */
    public int getOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINALID$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrdinalID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINALID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrdinalID" element
     */
    public boolean isSetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDINALID$8) != 0;
        }
    }
    
    /**
     * Sets the "OrdinalID" element
     */
    public void setOrdinalID(int ordinalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINALID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDINALID$8);
            }
            target.setIntValue(ordinalID);
        }
    }
    
    /**
     * Sets (as xml) the "OrdinalID" element
     */
    public void xsetOrdinalID(org.apache.xmlbeans.XmlInt ordinalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINALID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDINALID$8);
            }
            target.set(ordinalID);
        }
    }
    
    /**
     * Unsets the "OrdinalID" element
     */
    public void unsetOrdinalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDINALID$8, 0);
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
     * Gets the "RequestObjectType" element
     */
    public java.lang.String getRequestObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTOBJECTTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestObjectType" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTOBJECTTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestObjectType" element
     */
    public boolean isSetRequestObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTOBJECTTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "RequestObjectType" element
     */
    public void setRequestObjectType(java.lang.String requestObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTOBJECTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTOBJECTTYPE$14);
            }
            target.setStringValue(requestObjectType);
        }
    }
    
    /**
     * Sets (as xml) the "RequestObjectType" element
     */
    public void xsetRequestObjectType(org.apache.xmlbeans.XmlString requestObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTOBJECTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTOBJECTTYPE$14);
            }
            target.set(requestObjectType);
        }
    }
    
    /**
     * Unsets the "RequestObjectType" element
     */
    public void unsetRequestObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTOBJECTTYPE$14, 0);
        }
    }
}
