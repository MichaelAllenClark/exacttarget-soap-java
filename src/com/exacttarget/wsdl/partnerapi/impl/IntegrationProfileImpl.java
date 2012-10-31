/*
 * XML Type:  IntegrationProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.IntegrationProfile
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML IntegrationProfile(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class IntegrationProfileImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.IntegrationProfile
{
    
    public IntegrationProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFILEID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ProfileID");
    private static final javax.xml.namespace.QName SUBSCRIBERKEY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberKey");
    private static final javax.xml.namespace.QName EXTERNALID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExternalID");
    private static final javax.xml.namespace.QName EXTERNALTYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExternalType");
    
    
    /**
     * Gets the "ProfileID" element
     */
    public java.lang.String getProfileID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFILEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProfileID" element
     */
    public org.apache.xmlbeans.XmlString xgetProfileID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFILEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProfileID" element
     */
    public void setProfileID(java.lang.String profileID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROFILEID$0);
            }
            target.setStringValue(profileID);
        }
    }
    
    /**
     * Sets (as xml) the "ProfileID" element
     */
    public void xsetProfileID(org.apache.xmlbeans.XmlString profileID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROFILEID$0);
            }
            target.set(profileID);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERKEY$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERKEY$2);
            }
            target.set(subscriberKey);
        }
    }
    
    /**
     * Gets the "ExternalID" element
     */
    public java.lang.String getExternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalID" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExternalID" element
     */
    public void setExternalID(java.lang.String externalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALID$4);
            }
            target.setStringValue(externalID);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalID" element
     */
    public void xsetExternalID(org.apache.xmlbeans.XmlString externalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALID$4);
            }
            target.set(externalID);
        }
    }
    
    /**
     * Gets the "ExternalType" element
     */
    public java.lang.String getExternalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalType" element
     */
    public org.apache.xmlbeans.XmlString xgetExternalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExternalType" element
     */
    public void setExternalType(java.lang.String externalType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALTYPE$6);
            }
            target.setStringValue(externalType);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalType" element
     */
    public void xsetExternalType(org.apache.xmlbeans.XmlString externalType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALTYPE$6);
            }
            target.set(externalType);
        }
    }
}
