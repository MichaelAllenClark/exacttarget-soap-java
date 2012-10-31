/*
 * XML Type:  ListSubscriber
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListSubscriber
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ListSubscriber(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ListSubscriberImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ListSubscriber
{
    
    public ListSubscriberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName LISTID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ListID");
    private static final javax.xml.namespace.QName SUBSCRIBERKEY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberKey");
    
    
    /**
     * Gets the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$0, 0);
        }
    }
    
    /**
     * Gets the "ListID" element
     */
    public int getListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ListID" element
     */
    public org.apache.xmlbeans.XmlInt xgetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LISTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ListID" element
     */
    public boolean isSetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTID$2) != 0;
        }
    }
    
    /**
     * Sets the "ListID" element
     */
    public void setListID(int listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTID$2);
            }
            target.setIntValue(listID);
        }
    }
    
    /**
     * Sets (as xml) the "ListID" element
     */
    public void xsetListID(org.apache.xmlbeans.XmlInt listID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LISTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LISTID$2);
            }
            target.set(listID);
        }
    }
    
    /**
     * Unsets the "ListID" element
     */
    public void unsetListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTID$2, 0);
        }
    }
    
    /**
     * Gets the "SubscriberKey" element
     */
    public java.lang.String getSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberKey" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberKey" element
     */
    public boolean isSetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERKEY$4) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberKey" element
     */
    public void setSubscriberKey(java.lang.String subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERKEY$4);
            }
            target.setStringValue(subscriberKey);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberKey" element
     */
    public void xsetSubscriberKey(org.apache.xmlbeans.XmlString subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERKEY$4);
            }
            target.set(subscriberKey);
        }
    }
    
    /**
     * Unsets the "SubscriberKey" element
     */
    public void unsetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERKEY$4, 0);
        }
    }
}
