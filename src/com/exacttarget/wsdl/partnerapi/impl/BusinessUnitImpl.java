/*
 * XML Type:  BusinessUnit
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.BusinessUnit
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML BusinessUnit(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class BusinessUnitImpl extends com.exacttarget.wsdl.partnerapi.impl.AccountImpl implements com.exacttarget.wsdl.partnerapi.BusinessUnit
{
    
    public BusinessUnitImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName DEFAULTSENDCLASSIFICATION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultSendClassification");
    private static final javax.xml.namespace.QName DEFAULTHOMEPAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DefaultHomePage");
    private static final javax.xml.namespace.QName SUBSCRIBERFILTER$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberFilter");
    private static final javax.xml.namespace.QName MASTERUNSUBSCRIBEBEHAVIOR$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MasterUnsubscribeBehavior");
    
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
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
            return get_store().count_elements(DESCRIPTION$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
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
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "DefaultSendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification getDefaultSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(DEFAULTSENDCLASSIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefaultSendClassification" element
     */
    public boolean isSetDefaultSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTSENDCLASSIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "DefaultSendClassification" element
     */
    public void setDefaultSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification defaultSendClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(DEFAULTSENDCLASSIFICATION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(DEFAULTSENDCLASSIFICATION$2);
            }
            target.set(defaultSendClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "DefaultSendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification addNewDefaultSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(DEFAULTSENDCLASSIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DefaultSendClassification" element
     */
    public void unsetDefaultSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTSENDCLASSIFICATION$2, 0);
        }
    }
    
    /**
     * Gets the "DefaultHomePage" element
     */
    public com.exacttarget.wsdl.partnerapi.LandingPage getDefaultHomePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LandingPage target = null;
            target = (com.exacttarget.wsdl.partnerapi.LandingPage)get_store().find_element_user(DEFAULTHOMEPAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefaultHomePage" element
     */
    public boolean isSetDefaultHomePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTHOMEPAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "DefaultHomePage" element
     */
    public void setDefaultHomePage(com.exacttarget.wsdl.partnerapi.LandingPage defaultHomePage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LandingPage target = null;
            target = (com.exacttarget.wsdl.partnerapi.LandingPage)get_store().find_element_user(DEFAULTHOMEPAGE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.LandingPage)get_store().add_element_user(DEFAULTHOMEPAGE$4);
            }
            target.set(defaultHomePage);
        }
    }
    
    /**
     * Appends and returns a new empty "DefaultHomePage" element
     */
    public com.exacttarget.wsdl.partnerapi.LandingPage addNewDefaultHomePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LandingPage target = null;
            target = (com.exacttarget.wsdl.partnerapi.LandingPage)get_store().add_element_user(DEFAULTHOMEPAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DefaultHomePage" element
     */
    public void unsetDefaultHomePage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTHOMEPAGE$4, 0);
        }
    }
    
    /**
     * Gets the "SubscriberFilter" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterPart getSubscriberFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(SUBSCRIBERFILTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubscriberFilter" element
     */
    public boolean isSetSubscriberFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERFILTER$6) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberFilter" element
     */
    public void setSubscriberFilter(com.exacttarget.wsdl.partnerapi.FilterPart subscriberFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(SUBSCRIBERFILTER$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(SUBSCRIBERFILTER$6);
            }
            target.set(subscriberFilter);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriberFilter" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterPart addNewSubscriberFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(SUBSCRIBERFILTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SubscriberFilter" element
     */
    public void unsetSubscriberFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERFILTER$6, 0);
        }
    }
    
    /**
     * Gets the "MasterUnsubscribeBehavior" element
     */
    public com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum.Enum getMasterUnsubscribeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MasterUnsubscribeBehavior" element
     */
    public com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum xgetMasterUnsubscribeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum)get_store().find_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MasterUnsubscribeBehavior" element
     */
    public boolean isSetMasterUnsubscribeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MASTERUNSUBSCRIBEBEHAVIOR$8) != 0;
        }
    }
    
    /**
     * Sets the "MasterUnsubscribeBehavior" element
     */
    public void setMasterUnsubscribeBehavior(com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum.Enum masterUnsubscribeBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8);
            }
            target.setEnumValue(masterUnsubscribeBehavior);
        }
    }
    
    /**
     * Sets (as xml) the "MasterUnsubscribeBehavior" element
     */
    public void xsetMasterUnsubscribeBehavior(com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum masterUnsubscribeBehavior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum)get_store().find_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.UnsubscribeBehaviorEnum)get_store().add_element_user(MASTERUNSUBSCRIBEBEHAVIOR$8);
            }
            target.set(masterUnsubscribeBehavior);
        }
    }
    
    /**
     * Unsets the "MasterUnsubscribeBehavior" element
     */
    public void unsetMasterUnsubscribeBehavior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MASTERUNSUBSCRIBEBEHAVIOR$8, 0);
        }
    }
}
