/*
 * XML Type:  SenderProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SenderProfile
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SenderProfile(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SenderProfileImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SenderProfile
{
    
    public SenderProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName FROMNAME$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName FROMADDRESS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName USEDEFAULTRMMRULES$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UseDefaultRMMRules");
    private static final javax.xml.namespace.QName AUTOFORWARDTOEMAILADDRESS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoForwardToEmailAddress");
    private static final javax.xml.namespace.QName AUTOFORWARDTONAME$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoForwardToName");
    private static final javax.xml.namespace.QName DIRECTFORWARD$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DirectForward");
    private static final javax.xml.namespace.QName AUTOFORWARDTRIGGEREDSEND$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoForwardTriggeredSend");
    private static final javax.xml.namespace.QName AUTOREPLY$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoReply");
    private static final javax.xml.namespace.QName AUTOREPLYTRIGGEREDSEND$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoReplyTriggeredSend");
    private static final javax.xml.namespace.QName SENDERHEADEREMAILADDRESS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SenderHeaderEmailAddress");
    private static final javax.xml.namespace.QName SENDERHEADERNAME$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SenderHeaderName");
    private static final javax.xml.namespace.QName DATARETENTIONPERIODLENGTH$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataRetentionPeriodLength");
    private static final javax.xml.namespace.QName DATARETENTIONPERIODUNITOFMEASURE$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataRetentionPeriodUnitOfMeasure");
    private static final javax.xml.namespace.QName REPLYMANAGEMENTRULESET$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ReplyManagementRuleSet");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$4, 0);
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
            return get_store().count_elements(FROMNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$4);
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
            get_store().remove_element(FROMNAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$6, 0);
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
            return get_store().count_elements(FROMADDRESS$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMADDRESS$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMADDRESS$6);
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
            get_store().remove_element(FROMADDRESS$6, 0);
        }
    }
    
    /**
     * Gets the "UseDefaultRMMRules" element
     */
    public boolean getUseDefaultRMMRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDEFAULTRMMRULES$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "UseDefaultRMMRules" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseDefaultRMMRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEDEFAULTRMMRULES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "UseDefaultRMMRules" element
     */
    public boolean isSetUseDefaultRMMRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEDEFAULTRMMRULES$8) != 0;
        }
    }
    
    /**
     * Sets the "UseDefaultRMMRules" element
     */
    public void setUseDefaultRMMRules(boolean useDefaultRMMRules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEDEFAULTRMMRULES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEDEFAULTRMMRULES$8);
            }
            target.setBooleanValue(useDefaultRMMRules);
        }
    }
    
    /**
     * Sets (as xml) the "UseDefaultRMMRules" element
     */
    public void xsetUseDefaultRMMRules(org.apache.xmlbeans.XmlBoolean useDefaultRMMRules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEDEFAULTRMMRULES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(USEDEFAULTRMMRULES$8);
            }
            target.set(useDefaultRMMRules);
        }
    }
    
    /**
     * Unsets the "UseDefaultRMMRules" element
     */
    public void unsetUseDefaultRMMRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEDEFAULTRMMRULES$8, 0);
        }
    }
    
    /**
     * Gets the "AutoForwardToEmailAddress" element
     */
    public java.lang.String getAutoForwardToEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOFORWARDTOEMAILADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoForwardToEmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetAutoForwardToEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOFORWARDTOEMAILADDRESS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoForwardToEmailAddress" element
     */
    public boolean isSetAutoForwardToEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFORWARDTOEMAILADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "AutoForwardToEmailAddress" element
     */
    public void setAutoForwardToEmailAddress(java.lang.String autoForwardToEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOFORWARDTOEMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOFORWARDTOEMAILADDRESS$10);
            }
            target.setStringValue(autoForwardToEmailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "AutoForwardToEmailAddress" element
     */
    public void xsetAutoForwardToEmailAddress(org.apache.xmlbeans.XmlString autoForwardToEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOFORWARDTOEMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOFORWARDTOEMAILADDRESS$10);
            }
            target.set(autoForwardToEmailAddress);
        }
    }
    
    /**
     * Unsets the "AutoForwardToEmailAddress" element
     */
    public void unsetAutoForwardToEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFORWARDTOEMAILADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "AutoForwardToName" element
     */
    public java.lang.String getAutoForwardToName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOFORWARDTONAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoForwardToName" element
     */
    public org.apache.xmlbeans.XmlString xgetAutoForwardToName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOFORWARDTONAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoForwardToName" element
     */
    public boolean isSetAutoForwardToName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFORWARDTONAME$12) != 0;
        }
    }
    
    /**
     * Sets the "AutoForwardToName" element
     */
    public void setAutoForwardToName(java.lang.String autoForwardToName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOFORWARDTONAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOFORWARDTONAME$12);
            }
            target.setStringValue(autoForwardToName);
        }
    }
    
    /**
     * Sets (as xml) the "AutoForwardToName" element
     */
    public void xsetAutoForwardToName(org.apache.xmlbeans.XmlString autoForwardToName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOFORWARDTONAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOFORWARDTONAME$12);
            }
            target.set(autoForwardToName);
        }
    }
    
    /**
     * Unsets the "AutoForwardToName" element
     */
    public void unsetAutoForwardToName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFORWARDTONAME$12, 0);
        }
    }
    
    /**
     * Gets the "DirectForward" element
     */
    public boolean getDirectForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTFORWARD$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DirectForward" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDirectForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIRECTFORWARD$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DirectForward" element
     */
    public boolean isSetDirectForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTFORWARD$14) != 0;
        }
    }
    
    /**
     * Sets the "DirectForward" element
     */
    public void setDirectForward(boolean directForward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTFORWARD$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTFORWARD$14);
            }
            target.setBooleanValue(directForward);
        }
    }
    
    /**
     * Sets (as xml) the "DirectForward" element
     */
    public void xsetDirectForward(org.apache.xmlbeans.XmlBoolean directForward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIRECTFORWARD$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DIRECTFORWARD$14);
            }
            target.set(directForward);
        }
    }
    
    /**
     * Unsets the "DirectForward" element
     */
    public void unsetDirectForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTFORWARD$14, 0);
        }
    }
    
    /**
     * Gets the "AutoForwardTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getAutoForwardTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(AUTOFORWARDTRIGGEREDSEND$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AutoForwardTriggeredSend" element
     */
    public boolean isSetAutoForwardTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOFORWARDTRIGGEREDSEND$16) != 0;
        }
    }
    
    /**
     * Sets the "AutoForwardTriggeredSend" element
     */
    public void setAutoForwardTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition autoForwardTriggeredSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(AUTOFORWARDTRIGGEREDSEND$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(AUTOFORWARDTRIGGEREDSEND$16);
            }
            target.set(autoForwardTriggeredSend);
        }
    }
    
    /**
     * Appends and returns a new empty "AutoForwardTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewAutoForwardTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(AUTOFORWARDTRIGGEREDSEND$16);
            return target;
        }
    }
    
    /**
     * Unsets the "AutoForwardTriggeredSend" element
     */
    public void unsetAutoForwardTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOFORWARDTRIGGEREDSEND$16, 0);
        }
    }
    
    /**
     * Gets the "AutoReply" element
     */
    public boolean getAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLY$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoReply" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOREPLY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoReply" element
     */
    public boolean isSetAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOREPLY$18) != 0;
        }
    }
    
    /**
     * Sets the "AutoReply" element
     */
    public void setAutoReply(boolean autoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOREPLY$18);
            }
            target.setBooleanValue(autoReply);
        }
    }
    
    /**
     * Sets (as xml) the "AutoReply" element
     */
    public void xsetAutoReply(org.apache.xmlbeans.XmlBoolean autoReply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOREPLY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOREPLY$18);
            }
            target.set(autoReply);
        }
    }
    
    /**
     * Unsets the "AutoReply" element
     */
    public void unsetAutoReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOREPLY$18, 0);
        }
    }
    
    /**
     * Gets the "AutoReplyTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getAutoReplyTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(AUTOREPLYTRIGGEREDSEND$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AutoReplyTriggeredSend" element
     */
    public boolean isSetAutoReplyTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOREPLYTRIGGEREDSEND$20) != 0;
        }
    }
    
    /**
     * Sets the "AutoReplyTriggeredSend" element
     */
    public void setAutoReplyTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition autoReplyTriggeredSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(AUTOREPLYTRIGGEREDSEND$20, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(AUTOREPLYTRIGGEREDSEND$20);
            }
            target.set(autoReplyTriggeredSend);
        }
    }
    
    /**
     * Appends and returns a new empty "AutoReplyTriggeredSend" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewAutoReplyTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(AUTOREPLYTRIGGEREDSEND$20);
            return target;
        }
    }
    
    /**
     * Unsets the "AutoReplyTriggeredSend" element
     */
    public void unsetAutoReplyTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOREPLYTRIGGEREDSEND$20, 0);
        }
    }
    
    /**
     * Gets the "SenderHeaderEmailAddress" element
     */
    public java.lang.String getSenderHeaderEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHEADEREMAILADDRESS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SenderHeaderEmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetSenderHeaderEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHEADEREMAILADDRESS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "SenderHeaderEmailAddress" element
     */
    public boolean isSetSenderHeaderEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDERHEADEREMAILADDRESS$22) != 0;
        }
    }
    
    /**
     * Sets the "SenderHeaderEmailAddress" element
     */
    public void setSenderHeaderEmailAddress(java.lang.String senderHeaderEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHEADEREMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERHEADEREMAILADDRESS$22);
            }
            target.setStringValue(senderHeaderEmailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "SenderHeaderEmailAddress" element
     */
    public void xsetSenderHeaderEmailAddress(org.apache.xmlbeans.XmlString senderHeaderEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHEADEREMAILADDRESS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDERHEADEREMAILADDRESS$22);
            }
            target.set(senderHeaderEmailAddress);
        }
    }
    
    /**
     * Unsets the "SenderHeaderEmailAddress" element
     */
    public void unsetSenderHeaderEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDERHEADEREMAILADDRESS$22, 0);
        }
    }
    
    /**
     * Gets the "SenderHeaderName" element
     */
    public java.lang.String getSenderHeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHEADERNAME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SenderHeaderName" element
     */
    public org.apache.xmlbeans.XmlString xgetSenderHeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHEADERNAME$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "SenderHeaderName" element
     */
    public boolean isSetSenderHeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDERHEADERNAME$24) != 0;
        }
    }
    
    /**
     * Sets the "SenderHeaderName" element
     */
    public void setSenderHeaderName(java.lang.String senderHeaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERHEADERNAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERHEADERNAME$24);
            }
            target.setStringValue(senderHeaderName);
        }
    }
    
    /**
     * Sets (as xml) the "SenderHeaderName" element
     */
    public void xsetSenderHeaderName(org.apache.xmlbeans.XmlString senderHeaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERHEADERNAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDERHEADERNAME$24);
            }
            target.set(senderHeaderName);
        }
    }
    
    /**
     * Unsets the "SenderHeaderName" element
     */
    public void unsetSenderHeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDERHEADERNAME$24, 0);
        }
    }
    
    /**
     * Gets the "DataRetentionPeriodLength" element
     */
    public short getDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODLENGTH$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRetentionPeriodLength" element
     */
    public org.apache.xmlbeans.XmlShort xgetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DATARETENTIONPERIODLENGTH$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRetentionPeriodLength" element
     */
    public boolean isSetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARETENTIONPERIODLENGTH$26) != 0;
        }
    }
    
    /**
     * Sets the "DataRetentionPeriodLength" element
     */
    public void setDataRetentionPeriodLength(short dataRetentionPeriodLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODLENGTH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARETENTIONPERIODLENGTH$26);
            }
            target.setShortValue(dataRetentionPeriodLength);
        }
    }
    
    /**
     * Sets (as xml) the "DataRetentionPeriodLength" element
     */
    public void xsetDataRetentionPeriodLength(org.apache.xmlbeans.XmlShort dataRetentionPeriodLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DATARETENTIONPERIODLENGTH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(DATARETENTIONPERIODLENGTH$26);
            }
            target.set(dataRetentionPeriodLength);
        }
    }
    
    /**
     * Unsets the "DataRetentionPeriodLength" element
     */
    public void unsetDataRetentionPeriodLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARETENTIONPERIODLENGTH$26, 0);
        }
    }
    
    /**
     * Gets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum getDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$28, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    public com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum xgetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRetentionPeriodUnitOfMeasure" element
     */
    public boolean isSetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARETENTIONPERIODUNITOFMEASURE$28) != 0;
        }
    }
    
    /**
     * Sets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void setDataRetentionPeriodUnitOfMeasure(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum.Enum dataRetentionPeriodUnitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARETENTIONPERIODUNITOFMEASURE$28);
            }
            target.setEnumValue(dataRetentionPeriodUnitOfMeasure);
        }
    }
    
    /**
     * Sets (as xml) the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void xsetDataRetentionPeriodUnitOfMeasure(com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum dataRetentionPeriodUnitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().find_element_user(DATARETENTIONPERIODUNITOFMEASURE$28, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RecurrenceTypeEnum)get_store().add_element_user(DATARETENTIONPERIODUNITOFMEASURE$28);
            }
            target.set(dataRetentionPeriodUnitOfMeasure);
        }
    }
    
    /**
     * Unsets the "DataRetentionPeriodUnitOfMeasure" element
     */
    public void unsetDataRetentionPeriodUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARETENTIONPERIODUNITOFMEASURE$28, 0);
        }
    }
    
    /**
     * Gets the "ReplyManagementRuleSet" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getReplyManagementRuleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REPLYMANAGEMENTRULESET$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReplyManagementRuleSet" element
     */
    public boolean isSetReplyManagementRuleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLYMANAGEMENTRULESET$30) != 0;
        }
    }
    
    /**
     * Sets the "ReplyManagementRuleSet" element
     */
    public void setReplyManagementRuleSet(com.exacttarget.wsdl.partnerapi.APIObject replyManagementRuleSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(REPLYMANAGEMENTRULESET$30, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(REPLYMANAGEMENTRULESET$30);
            }
            target.set(replyManagementRuleSet);
        }
    }
    
    /**
     * Appends and returns a new empty "ReplyManagementRuleSet" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject addNewReplyManagementRuleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(REPLYMANAGEMENTRULESET$30);
            return target;
        }
    }
    
    /**
     * Unsets the "ReplyManagementRuleSet" element
     */
    public void unsetReplyManagementRuleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLYMANAGEMENTRULESET$30, 0);
        }
    }
}
