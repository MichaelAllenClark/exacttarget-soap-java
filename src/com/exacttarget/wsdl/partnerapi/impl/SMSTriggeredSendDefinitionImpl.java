/*
 * XML Type:  SMSTriggeredSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSTriggeredSendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSTriggeredSendDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.SendDefinitionImpl implements com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition
{
    
    public SMSTriggeredSendDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLICATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Publication");
    private static final javax.xml.namespace.QName DATAEXTENSION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataExtension");
    private static final javax.xml.namespace.QName CONTENT$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Content");
    private static final javax.xml.namespace.QName SENDTOLIST$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendToList");
    
    
    /**
     * Gets the "Publication" element
     */
    public com.exacttarget.wsdl.partnerapi.List getPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(PUBLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Publication" element
     */
    public boolean isSetPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Publication" element
     */
    public void setPublication(com.exacttarget.wsdl.partnerapi.List publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(PUBLICATION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(PUBLICATION$0);
            }
            target.set(publication);
        }
    }
    
    /**
     * Appends and returns a new empty "Publication" element
     */
    public com.exacttarget.wsdl.partnerapi.List addNewPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(PUBLICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Publication" element
     */
    public void unsetPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATION$0, 0);
        }
    }
    
    /**
     * Gets the "DataExtension" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension getDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(DATAEXTENSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataExtension" element
     */
    public boolean isSetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAEXTENSION$2) != 0;
        }
    }
    
    /**
     * Sets the "DataExtension" element
     */
    public void setDataExtension(com.exacttarget.wsdl.partnerapi.DataExtension dataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(DATAEXTENSION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(DATAEXTENSION$2);
            }
            target.set(dataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "DataExtension" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtension addNewDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(DATAEXTENSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataExtension" element
     */
    public void unsetDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAEXTENSION$2, 0);
        }
    }
    
    /**
     * Gets the "Content" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Content" element
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$4) != 0;
        }
    }
    
    /**
     * Sets the "Content" element
     */
    public void setContent(com.exacttarget.wsdl.partnerapi.ContentArea content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(CONTENT$4);
            }
            target.set(content);
        }
    }
    
    /**
     * Appends and returns a new empty "Content" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentArea addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(CONTENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Content" element
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$4, 0);
        }
    }
    
    /**
     * Gets the "SendToList" element
     */
    public boolean getSendToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOLIST$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendToList" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDTOLIST$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendToList" element
     */
    public boolean isSetSendToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDTOLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "SendToList" element
     */
    public void setSendToList(boolean sendToList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDTOLIST$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDTOLIST$6);
            }
            target.setBooleanValue(sendToList);
        }
    }
    
    /**
     * Sets (as xml) the "SendToList" element
     */
    public void xsetSendToList(org.apache.xmlbeans.XmlBoolean sendToList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDTOLIST$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDTOLIST$6);
            }
            target.set(sendToList);
        }
    }
    
    /**
     * Unsets the "SendToList" element
     */
    public void unsetSendToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDTOLIST$6, 0);
        }
    }
}
