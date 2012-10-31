/*
 * XML Type:  BounceEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.BounceEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML BounceEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class BounceEventImpl extends com.exacttarget.wsdl.partnerapi.impl.TrackingEventImpl implements com.exacttarget.wsdl.partnerapi.BounceEvent
{
    
    public BounceEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMTPCODE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SMTPCode");
    private static final javax.xml.namespace.QName BOUNCECATEGORY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BounceCategory");
    private static final javax.xml.namespace.QName SMTPREASON$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SMTPReason");
    private static final javax.xml.namespace.QName BOUNCETYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BounceType");
    
    
    /**
     * Gets the "SMTPCode" element
     */
    public java.lang.String getSMTPCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMTPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SMTPCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSMTPCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMTPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SMTPCode" element
     */
    public boolean isSetSMTPCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMTPCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "SMTPCode" element
     */
    public void setSMTPCode(java.lang.String smtpCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMTPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMTPCODE$0);
            }
            target.setStringValue(smtpCode);
        }
    }
    
    /**
     * Sets (as xml) the "SMTPCode" element
     */
    public void xsetSMTPCode(org.apache.xmlbeans.XmlString smtpCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMTPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMTPCODE$0);
            }
            target.set(smtpCode);
        }
    }
    
    /**
     * Unsets the "SMTPCode" element
     */
    public void unsetSMTPCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMTPCODE$0, 0);
        }
    }
    
    /**
     * Gets the "BounceCategory" element
     */
    public java.lang.String getBounceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCECATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BounceCategory" element
     */
    public org.apache.xmlbeans.XmlString xgetBounceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOUNCECATEGORY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "BounceCategory" element
     */
    public boolean isSetBounceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNCECATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "BounceCategory" element
     */
    public void setBounceCategory(java.lang.String bounceCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCECATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOUNCECATEGORY$2);
            }
            target.setStringValue(bounceCategory);
        }
    }
    
    /**
     * Sets (as xml) the "BounceCategory" element
     */
    public void xsetBounceCategory(org.apache.xmlbeans.XmlString bounceCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOUNCECATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOUNCECATEGORY$2);
            }
            target.set(bounceCategory);
        }
    }
    
    /**
     * Unsets the "BounceCategory" element
     */
    public void unsetBounceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNCECATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "SMTPReason" element
     */
    public java.lang.String getSMTPReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMTPREASON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SMTPReason" element
     */
    public org.apache.xmlbeans.XmlString xgetSMTPReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMTPREASON$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SMTPReason" element
     */
    public boolean isSetSMTPReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMTPREASON$4) != 0;
        }
    }
    
    /**
     * Sets the "SMTPReason" element
     */
    public void setSMTPReason(java.lang.String smtpReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMTPREASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMTPREASON$4);
            }
            target.setStringValue(smtpReason);
        }
    }
    
    /**
     * Sets (as xml) the "SMTPReason" element
     */
    public void xsetSMTPReason(org.apache.xmlbeans.XmlString smtpReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMTPREASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMTPREASON$4);
            }
            target.set(smtpReason);
        }
    }
    
    /**
     * Unsets the "SMTPReason" element
     */
    public void unsetSMTPReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMTPREASON$4, 0);
        }
    }
    
    /**
     * Gets the "BounceType" element
     */
    public java.lang.String getBounceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BounceType" element
     */
    public org.apache.xmlbeans.XmlString xgetBounceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOUNCETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "BounceType" element
     */
    public boolean isSetBounceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNCETYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "BounceType" element
     */
    public void setBounceType(java.lang.String bounceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOUNCETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOUNCETYPE$6);
            }
            target.setStringValue(bounceType);
        }
    }
    
    /**
     * Sets (as xml) the "BounceType" element
     */
    public void xsetBounceType(org.apache.xmlbeans.XmlString bounceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOUNCETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOUNCETYPE$6);
            }
            target.set(bounceType);
        }
    }
    
    /**
     * Unsets the "BounceType" element
     */
    public void unsetBounceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNCETYPE$6, 0);
        }
    }
}
