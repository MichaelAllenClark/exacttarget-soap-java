/*
 * XML Type:  FileTriggerTypeLastPull
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.FileTriggerTypeLastPull
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML FileTriggerTypeLastPull(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class FileTriggerTypeLastPullImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.FileTriggerTypeLastPull
{
    
    public FileTriggerTypeLastPullImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALREFERENCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExternalReference");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    private static final javax.xml.namespace.QName LASTPULLDATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LastPullDate");
    
    
    /**
     * Gets the "ExternalReference" element
     */
    public java.lang.String getExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalReference" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExternalReference" element
     */
    public boolean isSetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALREFERENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "ExternalReference" element
     */
    public void setExternalReference(java.lang.String externalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALREFERENCE$0);
            }
            target.setStringValue(externalReference);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalReference" element
     */
    public void xsetExternalReference(org.apache.xmlbeans.XmlString externalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALREFERENCE$0);
            }
            target.set(externalReference);
        }
    }
    
    /**
     * Unsets the "ExternalReference" element
     */
    public void unsetExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALREFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "LastPullDate" element
     */
    public java.util.Calendar getLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPULLDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastPullDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPULLDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastPullDate" element
     */
    public boolean isSetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTPULLDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "LastPullDate" element
     */
    public void setLastPullDate(java.util.Calendar lastPullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPULLDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTPULLDATE$4);
            }
            target.setCalendarValue(lastPullDate);
        }
    }
    
    /**
     * Sets (as xml) the "LastPullDate" element
     */
    public void xsetLastPullDate(org.apache.xmlbeans.XmlDateTime lastPullDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPULLDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTPULLDATE$4);
            }
            target.set(lastPullDate);
        }
    }
    
    /**
     * Unsets the "LastPullDate" element
     */
    public void unsetLastPullDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTPULLDATE$4, 0);
        }
    }
}
