/*
 * XML Type:  LinkSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.LinkSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML LinkSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class LinkSendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.LinkSend
{
    
    public LinkSendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendID");
    private static final javax.xml.namespace.QName LINK$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Link");
    
    
    /**
     * Gets the "SendID" element
     */
    public int getSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendID" element
     */
    public org.apache.xmlbeans.XmlInt xgetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendID" element
     */
    public boolean isSetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDID$0) != 0;
        }
    }
    
    /**
     * Sets the "SendID" element
     */
    public void setSendID(int sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDID$0);
            }
            target.setIntValue(sendID);
        }
    }
    
    /**
     * Sets (as xml) the "SendID" element
     */
    public void xsetSendID(org.apache.xmlbeans.XmlInt sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDID$0);
            }
            target.set(sendID);
        }
    }
    
    /**
     * Unsets the "SendID" element
     */
    public void unsetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDID$0, 0);
        }
    }
    
    /**
     * Gets the "Link" element
     */
    public com.exacttarget.wsdl.partnerapi.Link getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Link" element
     */
    public boolean isSetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$2) != 0;
        }
    }
    
    /**
     * Sets the "Link" element
     */
    public void setLink(com.exacttarget.wsdl.partnerapi.Link link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINK$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Link)get_store().add_element_user(LINK$2);
            }
            target.set(link);
        }
    }
    
    /**
     * Appends and returns a new empty "Link" element
     */
    public com.exacttarget.wsdl.partnerapi.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().add_element_user(LINK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Link" element
     */
    public void unsetLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$2, 0);
        }
    }
}
