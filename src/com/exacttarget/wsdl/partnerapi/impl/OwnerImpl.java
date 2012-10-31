/*
 * XML Type:  Owner
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Owner
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Owner(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class OwnerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Owner
{
    
    public OwnerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Client");
    private static final javax.xml.namespace.QName FROMNAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName FROMADDRESS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName USER$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "User");
    
    
    /**
     * Gets the "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID getClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Client" element
     */
    public boolean isSetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Client" element
     */
    public void setClient(com.exacttarget.wsdl.partnerapi.ClientID client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            }
            target.set(client);
        }
    }
    
    /**
     * Appends and returns a new empty "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID addNewClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Client" element
     */
    public void unsetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENT$0, 0);
        }
    }
    
    /**
     * Gets the "FromName" element
     */
    public java.lang.String getFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromName" element
     */
    public org.apache.xmlbeans.XmlString xgetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromName" element
     */
    public boolean isSetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "FromName" element
     */
    public void setFromName(java.lang.String fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$2);
            }
            target.setStringValue(fromName);
        }
    }
    
    /**
     * Sets (as xml) the "FromName" element
     */
    public void xsetFromName(org.apache.xmlbeans.XmlString fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$2);
            }
            target.set(fromName);
        }
    }
    
    /**
     * Unsets the "FromName" element
     */
    public void unsetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMNAME$2, 0);
        }
    }
    
    /**
     * Gets the "FromAddress" element
     */
    public java.lang.String getFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromAddress" element
     */
    public boolean isSetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "FromAddress" element
     */
    public void setFromAddress(java.lang.String fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMADDRESS$4);
            }
            target.setStringValue(fromAddress);
        }
    }
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    public void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMADDRESS$4);
            }
            target.set(fromAddress);
        }
    }
    
    /**
     * Unsets the "FromAddress" element
     */
    public void unsetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "User" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(USER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "User" element
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$6) != 0;
        }
    }
    
    /**
     * Sets the "User" element
     */
    public void setUser(com.exacttarget.wsdl.partnerapi.AccountUser user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(USER$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().add_element_user(USER$6);
            }
            target.set(user);
        }
    }
    
    /**
     * Appends and returns a new empty "User" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().add_element_user(USER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "User" element
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$6, 0);
        }
    }
}
