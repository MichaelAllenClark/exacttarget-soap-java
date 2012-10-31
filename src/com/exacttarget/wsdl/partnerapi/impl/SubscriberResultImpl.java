/*
 * XML Type:  SubscriberResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SubscriberResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SubscriberResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriberResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SubscriberResult
{
    
    public SubscriberResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorDescription");
    private static final javax.xml.namespace.QName ORDINAL$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Ordinal");
    
    
    /**
     * Gets the "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscriber" element
     */
    public void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            }
            target.set(subscriber);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
            return target;
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$2);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Gets the "ErrorDescription" element
     */
    public java.lang.String getErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorDescription" element
     */
    public boolean isSetErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "ErrorDescription" element
     */
    public void setErrorDescription(java.lang.String errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESCRIPTION$4);
            }
            target.setStringValue(errorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorDescription" element
     */
    public void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESCRIPTION$4);
            }
            target.set(errorDescription);
        }
    }
    
    /**
     * Unsets the "ErrorDescription" element
     */
    public void unsetErrorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "Ordinal" element
     */
    public int getOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ordinal" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Ordinal" element
     */
    public boolean isSetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDINAL$6) != 0;
        }
    }
    
    /**
     * Sets the "Ordinal" element
     */
    public void setOrdinal(int ordinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDINAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDINAL$6);
            }
            target.setIntValue(ordinal);
        }
    }
    
    /**
     * Sets (as xml) the "Ordinal" element
     */
    public void xsetOrdinal(org.apache.xmlbeans.XmlInt ordinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDINAL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDINAL$6);
            }
            target.set(ordinal);
        }
    }
    
    /**
     * Unsets the "Ordinal" element
     */
    public void unsetOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDINAL$6, 0);
        }
    }
}
