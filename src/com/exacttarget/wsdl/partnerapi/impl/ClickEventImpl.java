/*
 * XML Type:  ClickEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ClickEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ClickEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ClickEventImpl extends com.exacttarget.wsdl.partnerapi.impl.TrackingEventImpl implements com.exacttarget.wsdl.partnerapi.ClickEvent
{
    
    public ClickEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URLID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "URLID");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "URL");
    
    
    /**
     * Gets the "URLID" element
     */
    public int getURLID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "URLID" element
     */
    public org.apache.xmlbeans.XmlInt xgetURLID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(URLID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "URLID" element
     */
    public boolean isSetURLID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLID$0) != 0;
        }
    }
    
    /**
     * Sets the "URLID" element
     */
    public void setURLID(int urlid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLID$0);
            }
            target.setIntValue(urlid);
        }
    }
    
    /**
     * Sets (as xml) the "URLID" element
     */
    public void xsetURLID(org.apache.xmlbeans.XmlInt urlid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(URLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(URLID$0);
            }
            target.set(urlid);
        }
    }
    
    /**
     * Unsets the "URLID" element
     */
    public void unsetURLID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLID$0, 0);
        }
    }
    
    /**
     * Gets the "URL" element
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    public org.apache.xmlbeans.XmlString xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "URL" element
     */
    public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$2) != 0;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$2);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    public void xsetURL(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$2);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" element
     */
    public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$2, 0);
        }
    }
}
