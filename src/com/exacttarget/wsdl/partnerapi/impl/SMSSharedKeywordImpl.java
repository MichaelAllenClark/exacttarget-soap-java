/*
 * XML Type:  SMSSharedKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSSharedKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSSharedKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSSharedKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SMSSharedKeyword
{
    
    public SMSSharedKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORTCODE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ShortCode");
    private static final javax.xml.namespace.QName SHAREDKEYWORD$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SharedKeyword");
    private static final javax.xml.namespace.QName REQUESTDATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestDate");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EffectiveDate");
    private static final javax.xml.namespace.QName EXPIREDATE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExpireDate");
    private static final javax.xml.namespace.QName RETURNTOPOOLDATE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ReturnToPoolDate");
    private static final javax.xml.namespace.QName COUNTRYCODE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CountryCode");
    
    
    /**
     * Gets the "ShortCode" element
     */
    public java.lang.String getShortCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShortCode" element
     */
    public org.apache.xmlbeans.XmlString xgetShortCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ShortCode" element
     */
    public void setShortCode(java.lang.String shortCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTCODE$0);
            }
            target.setStringValue(shortCode);
        }
    }
    
    /**
     * Sets (as xml) the "ShortCode" element
     */
    public void xsetShortCode(org.apache.xmlbeans.XmlString shortCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTCODE$0);
            }
            target.set(shortCode);
        }
    }
    
    /**
     * Gets the "SharedKeyword" element
     */
    public java.lang.String getSharedKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDKEYWORD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SharedKeyword" element
     */
    public org.apache.xmlbeans.XmlString xgetSharedKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDKEYWORD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SharedKeyword" element
     */
    public void setSharedKeyword(java.lang.String sharedKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDKEYWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDKEYWORD$2);
            }
            target.setStringValue(sharedKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SharedKeyword" element
     */
    public void xsetSharedKeyword(org.apache.xmlbeans.XmlString sharedKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDKEYWORD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDKEYWORD$2);
            }
            target.set(sharedKeyword);
        }
    }
    
    /**
     * Gets the "RequestDate" element
     */
    public java.util.Calendar getRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "RequestDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RequestDate" element
     */
    public boolean isSetRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "RequestDate" element
     */
    public void setRequestDate(java.util.Calendar requestDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTDATE$4);
            }
            target.setCalendarValue(requestDate);
        }
    }
    
    /**
     * Sets (as xml) the "RequestDate" element
     */
    public void xsetRequestDate(org.apache.xmlbeans.XmlDateTime requestDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUESTDATE$4);
            }
            target.set(requestDate);
        }
    }
    
    /**
     * Unsets the "RequestDate" element
     */
    public void unsetRequestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTDATE$4, 0);
        }
    }
    
    /**
     * Gets the "EffectiveDate" element
     */
    public java.util.Calendar getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EffectiveDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EffectiveDate" element
     */
    public boolean isSetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "EffectiveDate" element
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.setCalendarValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "EffectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlDateTime effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Unsets the "EffectiveDate" element
     */
    public void unsetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEDATE$6, 0);
        }
    }
    
    /**
     * Gets the "ExpireDate" element
     */
    public java.util.Calendar getExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIREDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpireDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIREDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpireDate" element
     */
    public boolean isSetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIREDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "ExpireDate" element
     */
    public void setExpireDate(java.util.Calendar expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIREDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIREDATE$8);
            }
            target.setCalendarValue(expireDate);
        }
    }
    
    /**
     * Sets (as xml) the "ExpireDate" element
     */
    public void xsetExpireDate(org.apache.xmlbeans.XmlDateTime expireDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIREDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIREDATE$8);
            }
            target.set(expireDate);
        }
    }
    
    /**
     * Unsets the "ExpireDate" element
     */
    public void unsetExpireDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIREDATE$8, 0);
        }
    }
    
    /**
     * Gets the "ReturnToPoolDate" element
     */
    public java.util.Calendar getReturnToPoolDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOPOOLDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnToPoolDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetReturnToPoolDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(RETURNTOPOOLDATE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReturnToPoolDate" element
     */
    public boolean isSetReturnToPoolDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNTOPOOLDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "ReturnToPoolDate" element
     */
    public void setReturnToPoolDate(java.util.Calendar returnToPoolDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNTOPOOLDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNTOPOOLDATE$10);
            }
            target.setCalendarValue(returnToPoolDate);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnToPoolDate" element
     */
    public void xsetReturnToPoolDate(org.apache.xmlbeans.XmlDateTime returnToPoolDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(RETURNTOPOOLDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(RETURNTOPOOLDATE$10);
            }
            target.set(returnToPoolDate);
        }
    }
    
    /**
     * Unsets the "ReturnToPoolDate" element
     */
    public void unsetReturnToPoolDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNTOPOOLDATE$10, 0);
        }
    }
    
    /**
     * Gets the "CountryCode" element
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountryCode" element
     */
    public boolean isSetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "CountryCode" element
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$12);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    public void xsetCountryCode(org.apache.xmlbeans.XmlString countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYCODE$12);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Unsets the "CountryCode" element
     */
    public void unsetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYCODE$12, 0);
        }
    }
}
