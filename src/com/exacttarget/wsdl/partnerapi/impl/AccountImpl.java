/*
 * XML Type:  Account
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Account
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Account(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AccountImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Account
{
    
    public AccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountType");
    private static final javax.xml.namespace.QName PARENTID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentID");
    private static final javax.xml.namespace.QName BRANDID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BrandID");
    private static final javax.xml.namespace.QName PRIVATELABELID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateLabelID");
    private static final javax.xml.namespace.QName REPORTINGPARENTID$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ReportingParentID");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName EMAIL$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName FROMNAME$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName BUSINESSNAME$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BusinessName");
    private static final javax.xml.namespace.QName PHONE$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Phone");
    private static final javax.xml.namespace.QName ADDRESS$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Address");
    private static final javax.xml.namespace.QName FAX$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Fax");
    private static final javax.xml.namespace.QName CITY$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "City");
    private static final javax.xml.namespace.QName STATE$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "State");
    private static final javax.xml.namespace.QName ZIP$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Zip");
    private static final javax.xml.namespace.QName COUNTRY$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Country");
    private static final javax.xml.namespace.QName ISACTIVE$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName ISTESTACCOUNT$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsTestAccount");
    private static final javax.xml.namespace.QName ORGID$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OrgID");
    private static final javax.xml.namespace.QName DBID$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DBID");
    private static final javax.xml.namespace.QName PARENTNAME$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentName");
    private static final javax.xml.namespace.QName CUSTOMERID$42 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CustomerID");
    private static final javax.xml.namespace.QName DELETEDDATE$44 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeletedDate");
    private static final javax.xml.namespace.QName EDITIONID$46 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EditionID");
    private static final javax.xml.namespace.QName CHILDREN$48 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Children");
    private static final javax.xml.namespace.QName SUBSCRIPTION$50 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscription");
    private static final javax.xml.namespace.QName PRIVATELABELS$52 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateLabels");
    private static final javax.xml.namespace.QName BUSINESSRULES$54 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BusinessRules");
    private static final javax.xml.namespace.QName ACCOUNTUSERS$56 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountUsers");
    private static final javax.xml.namespace.QName INHERITADDRESS$58 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InheritAddress");
    private static final javax.xml.namespace.QName ISTRIALACCOUNT$60 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsTrialAccount");
    private static final javax.xml.namespace.QName LOCALE$62 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Locale");
    private static final javax.xml.namespace.QName PARENTACCOUNT$64 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentAccount");
    private static final javax.xml.namespace.QName TIMEZONE$66 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TimeZone");
    private static final javax.xml.namespace.QName ROLES$68 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Roles");
    private static final javax.xml.namespace.QName LANGUAGELOCALE$70 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LanguageLocale");
    
    
    /**
     * Gets the "AccountType" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountTypeEnum.Enum getAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.AccountTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountType" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountTypeEnum xgetAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountTypeEnum)get_store().find_element_user(ACCOUNTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccountType" element
     */
    public void setAccountType(com.exacttarget.wsdl.partnerapi.AccountTypeEnum.Enum accountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTTYPE$0);
            }
            target.setEnumValue(accountType);
        }
    }
    
    /**
     * Sets (as xml) the "AccountType" element
     */
    public void xsetAccountType(com.exacttarget.wsdl.partnerapi.AccountTypeEnum accountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountTypeEnum)get_store().find_element_user(ACCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountTypeEnum)get_store().add_element_user(ACCOUNTTYPE$0);
            }
            target.set(accountType);
        }
    }
    
    /**
     * Gets the "ParentID" element
     */
    public int getParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentID" element
     */
    public org.apache.xmlbeans.XmlInt xgetParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParentID" element
     */
    public boolean isSetParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTID$2) != 0;
        }
    }
    
    /**
     * Sets the "ParentID" element
     */
    public void setParentID(int parentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTID$2);
            }
            target.setIntValue(parentID);
        }
    }
    
    /**
     * Sets (as xml) the "ParentID" element
     */
    public void xsetParentID(org.apache.xmlbeans.XmlInt parentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PARENTID$2);
            }
            target.set(parentID);
        }
    }
    
    /**
     * Unsets the "ParentID" element
     */
    public void unsetParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTID$2, 0);
        }
    }
    
    /**
     * Gets the "BrandID" element
     */
    public int getBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BrandID" element
     */
    public org.apache.xmlbeans.XmlInt xgetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BrandID" element
     */
    public boolean isSetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDID$4) != 0;
        }
    }
    
    /**
     * Sets the "BrandID" element
     */
    public void setBrandID(int brandID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDID$4);
            }
            target.setIntValue(brandID);
        }
    }
    
    /**
     * Sets (as xml) the "BrandID" element
     */
    public void xsetBrandID(org.apache.xmlbeans.XmlInt brandID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BRANDID$4);
            }
            target.set(brandID);
        }
    }
    
    /**
     * Unsets the "BrandID" element
     */
    public void unsetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDID$4, 0);
        }
    }
    
    /**
     * Gets the "PrivateLabelID" element
     */
    public int getPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVATELABELID$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivateLabelID" element
     */
    public org.apache.xmlbeans.XmlInt xgetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrivateLabelID" element
     */
    public boolean isSetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATELABELID$6) != 0;
        }
    }
    
    /**
     * Sets the "PrivateLabelID" element
     */
    public void setPrivateLabelID(int privateLabelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVATELABELID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVATELABELID$6);
            }
            target.setIntValue(privateLabelID);
        }
    }
    
    /**
     * Sets (as xml) the "PrivateLabelID" element
     */
    public void xsetPrivateLabelID(org.apache.xmlbeans.XmlInt privateLabelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIVATELABELID$6);
            }
            target.set(privateLabelID);
        }
    }
    
    /**
     * Unsets the "PrivateLabelID" element
     */
    public void unsetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATELABELID$6, 0);
        }
    }
    
    /**
     * Gets the "ReportingParentID" element
     */
    public int getReportingParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPARENTID$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingParentID" element
     */
    public org.apache.xmlbeans.XmlInt xgetReportingParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REPORTINGPARENTID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingParentID" element
     */
    public boolean isSetReportingParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPARENTID$8) != 0;
        }
    }
    
    /**
     * Sets the "ReportingParentID" element
     */
    public void setReportingParentID(int reportingParentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPARENTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGPARENTID$8);
            }
            target.setIntValue(reportingParentID);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingParentID" element
     */
    public void xsetReportingParentID(org.apache.xmlbeans.XmlInt reportingParentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REPORTINGPARENTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REPORTINGPARENTID$8);
            }
            target.set(reportingParentID);
        }
    }
    
    /**
     * Unsets the "ReportingParentID" element
     */
    public void unsetReportingParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPARENTID$8, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
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
            return get_store().count_elements(NAME$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$10);
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
            get_store().remove_element(NAME$10, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$12) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$12);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$12);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$14, 0);
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
            return get_store().count_elements(FROMNAME$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$14);
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
            get_store().remove_element(FROMNAME$14, 0);
        }
    }
    
    /**
     * Gets the "BusinessName" element
     */
    public java.lang.String getBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessName" element
     */
    public org.apache.xmlbeans.XmlString xgetBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUSINESSNAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "BusinessName" element
     */
    public boolean isSetBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "BusinessName" element
     */
    public void setBusinessName(java.lang.String businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSNAME$16);
            }
            target.setStringValue(businessName);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessName" element
     */
    public void xsetBusinessName(org.apache.xmlbeans.XmlString businessName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUSINESSNAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUSINESSNAME$16);
            }
            target.set(businessName);
        }
    }
    
    /**
     * Unsets the "BusinessName" element
     */
    public void unsetBusinessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSNAME$16, 0);
        }
    }
    
    /**
     * Gets the "Phone" element
     */
    public java.lang.String getPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Phone" element
     */
    public org.apache.xmlbeans.XmlString xgetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Phone" element
     */
    public boolean isSetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONE$18) != 0;
        }
    }
    
    /**
     * Sets the "Phone" element
     */
    public void setPhone(java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$18);
            }
            target.setStringValue(phone);
        }
    }
    
    /**
     * Sets (as xml) the "Phone" element
     */
    public void xsetPhone(org.apache.xmlbeans.XmlString phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$18);
            }
            target.set(phone);
        }
    }
    
    /**
     * Unsets the "Phone" element
     */
    public void unsetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONE$18, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$20) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$20);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "Address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$20);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$20, 0);
        }
    }
    
    /**
     * Gets the "Fax" element
     */
    public java.lang.String getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fax" element
     */
    public org.apache.xmlbeans.XmlString xgetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "Fax" element
     */
    public boolean isSetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAX$22) != 0;
        }
    }
    
    /**
     * Sets the "Fax" element
     */
    public void setFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$22);
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) the "Fax" element
     */
    public void xsetFax(org.apache.xmlbeans.XmlString fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$22);
            }
            target.set(fax);
        }
    }
    
    /**
     * Unsets the "Fax" element
     */
    public void unsetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAX$22, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$24) != 0;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$24);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$24);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$24, 0);
        }
    }
    
    /**
     * Gets the "State" element
     */
    public java.lang.String getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public org.apache.xmlbeans.XmlString xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "State" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$26) != 0;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(java.lang.String state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$26);
            }
            target.setStringValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(org.apache.xmlbeans.XmlString state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$26);
            }
            target.set(state);
        }
    }
    
    /**
     * Unsets the "State" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$26, 0);
        }
    }
    
    /**
     * Gets the "Zip" element
     */
    public java.lang.String getZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIP$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Zip" element
     */
    public org.apache.xmlbeans.XmlString xgetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIP$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Zip" element
     */
    public boolean isSetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIP$28) != 0;
        }
    }
    
    /**
     * Sets the "Zip" element
     */
    public void setZip(java.lang.String zip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIP$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIP$28);
            }
            target.setStringValue(zip);
        }
    }
    
    /**
     * Sets (as xml) the "Zip" element
     */
    public void xsetZip(org.apache.xmlbeans.XmlString zip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIP$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIP$28);
            }
            target.set(zip);
        }
    }
    
    /**
     * Unsets the "Zip" element
     */
    public void unsetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIP$28, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$30) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$30);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$30);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$30, 0);
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public int getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlInt xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ISACTIVE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActive" element
     */
    public boolean isSetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVE$32) != 0;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(int isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$32);
            }
            target.setIntValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlInt isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ISACTIVE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ISACTIVE$32);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Unsets the "IsActive" element
     */
    public void unsetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVE$32, 0);
        }
    }
    
    /**
     * Gets the "IsTestAccount" element
     */
    public boolean getIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTACCOUNT$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTestAccount" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTACCOUNT$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTestAccount" element
     */
    public boolean isSetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTESTACCOUNT$34) != 0;
        }
    }
    
    /**
     * Sets the "IsTestAccount" element
     */
    public void setIsTestAccount(boolean isTestAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTACCOUNT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTESTACCOUNT$34);
            }
            target.setBooleanValue(isTestAccount);
        }
    }
    
    /**
     * Sets (as xml) the "IsTestAccount" element
     */
    public void xsetIsTestAccount(org.apache.xmlbeans.XmlBoolean isTestAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTACCOUNT$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTESTACCOUNT$34);
            }
            target.set(isTestAccount);
        }
    }
    
    /**
     * Unsets the "IsTestAccount" element
     */
    public void unsetIsTestAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTESTACCOUNT$34, 0);
        }
    }
    
    /**
     * Gets the "OrgID" element
     */
    public int getOrgID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$36, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrgID" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrgID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORGID$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrgID" element
     */
    public boolean isSetOrgID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGID$36) != 0;
        }
    }
    
    /**
     * Sets the "OrgID" element
     */
    public void setOrgID(int orgID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGID$36);
            }
            target.setIntValue(orgID);
        }
    }
    
    /**
     * Sets (as xml) the "OrgID" element
     */
    public void xsetOrgID(org.apache.xmlbeans.XmlInt orgID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORGID$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORGID$36);
            }
            target.set(orgID);
        }
    }
    
    /**
     * Unsets the "OrgID" element
     */
    public void unsetOrgID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGID$36, 0);
        }
    }
    
    /**
     * Gets the "DBID" element
     */
    public int getDBID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBID$38, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DBID" element
     */
    public org.apache.xmlbeans.XmlInt xgetDBID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DBID$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "DBID" element
     */
    public boolean isSetDBID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DBID$38) != 0;
        }
    }
    
    /**
     * Sets the "DBID" element
     */
    public void setDBID(int dbid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBID$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBID$38);
            }
            target.setIntValue(dbid);
        }
    }
    
    /**
     * Sets (as xml) the "DBID" element
     */
    public void xsetDBID(org.apache.xmlbeans.XmlInt dbid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DBID$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DBID$38);
            }
            target.set(dbid);
        }
    }
    
    /**
     * Unsets the "DBID" element
     */
    public void unsetDBID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DBID$38, 0);
        }
    }
    
    /**
     * Gets the "ParentName" element
     */
    public java.lang.String getParentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTNAME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentName" element
     */
    public org.apache.xmlbeans.XmlString xgetParentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTNAME$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParentName" element
     */
    public boolean isSetParentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTNAME$40) != 0;
        }
    }
    
    /**
     * Sets the "ParentName" element
     */
    public void setParentName(java.lang.String parentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTNAME$40);
            }
            target.setStringValue(parentName);
        }
    }
    
    /**
     * Sets (as xml) the "ParentName" element
     */
    public void xsetParentName(org.apache.xmlbeans.XmlString parentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTNAME$40);
            }
            target.set(parentName);
        }
    }
    
    /**
     * Unsets the "ParentName" element
     */
    public void unsetParentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTNAME$40, 0);
        }
    }
    
    /**
     * Gets the "CustomerID" element
     */
    public long getCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$42, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerID" element
     */
    public org.apache.xmlbeans.XmlLong xgetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CUSTOMERID$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomerID" element
     */
    public boolean isSetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$42) != 0;
        }
    }
    
    /**
     * Sets the "CustomerID" element
     */
    public void setCustomerID(long customerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERID$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERID$42);
            }
            target.setLongValue(customerID);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerID" element
     */
    public void xsetCustomerID(org.apache.xmlbeans.XmlLong customerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CUSTOMERID$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CUSTOMERID$42);
            }
            target.set(customerID);
        }
    }
    
    /**
     * Unsets the "CustomerID" element
     */
    public void unsetCustomerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$42, 0);
        }
    }
    
    /**
     * Gets the "DeletedDate" element
     */
    public java.util.Calendar getDeletedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEDDATE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeletedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeletedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELETEDDATE$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeletedDate" element
     */
    public boolean isSetDeletedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEDDATE$44) != 0;
        }
    }
    
    /**
     * Sets the "DeletedDate" element
     */
    public void setDeletedDate(java.util.Calendar deletedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEDDATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEDDATE$44);
            }
            target.setCalendarValue(deletedDate);
        }
    }
    
    /**
     * Sets (as xml) the "DeletedDate" element
     */
    public void xsetDeletedDate(org.apache.xmlbeans.XmlDateTime deletedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELETEDDATE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DELETEDDATE$44);
            }
            target.set(deletedDate);
        }
    }
    
    /**
     * Unsets the "DeletedDate" element
     */
    public void unsetDeletedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEDDATE$44, 0);
        }
    }
    
    /**
     * Gets the "EditionID" element
     */
    public int getEditionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITIONID$46, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "EditionID" element
     */
    public org.apache.xmlbeans.XmlInt xgetEditionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EDITIONID$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "EditionID" element
     */
    public boolean isSetEditionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDITIONID$46) != 0;
        }
    }
    
    /**
     * Sets the "EditionID" element
     */
    public void setEditionID(int editionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITIONID$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITIONID$46);
            }
            target.setIntValue(editionID);
        }
    }
    
    /**
     * Sets (as xml) the "EditionID" element
     */
    public void xsetEditionID(org.apache.xmlbeans.XmlInt editionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EDITIONID$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EDITIONID$46);
            }
            target.set(editionID);
        }
    }
    
    /**
     * Unsets the "EditionID" element
     */
    public void unsetEditionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDITIONID$46, 0);
        }
    }
    
    /**
     * Gets array of all "Children" elements
     */
    public com.exacttarget.wsdl.partnerapi.AccountDataItem[] getChildrenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHILDREN$48, targetList);
            com.exacttarget.wsdl.partnerapi.AccountDataItem[] result = new com.exacttarget.wsdl.partnerapi.AccountDataItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Children" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountDataItem getChildrenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().find_element_user(CHILDREN$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "Children" element
     */
    public boolean isNilChildrenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().find_element_user(CHILDREN$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "Children" element
     */
    public int sizeOfChildrenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDREN$48);
        }
    }
    
    /**
     * Sets array of all "Children" element
     */
    public void setChildrenArray(com.exacttarget.wsdl.partnerapi.AccountDataItem[] childrenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(childrenArray, CHILDREN$48);
        }
    }
    
    /**
     * Sets ith "Children" element
     */
    public void setChildrenArray(int i, com.exacttarget.wsdl.partnerapi.AccountDataItem children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().find_element_user(CHILDREN$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(children);
        }
    }
    
    /**
     * Nils the ith "Children" element
     */
    public void setNilChildrenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().find_element_user(CHILDREN$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Children" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountDataItem insertNewChildren(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().insert_element_user(CHILDREN$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Children" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountDataItem addNewChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountDataItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountDataItem)get_store().add_element_user(CHILDREN$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "Children" element
     */
    public void removeChildren(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDREN$48, i);
        }
    }
    
    /**
     * Gets the "Subscription" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscription getSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscription target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().find_element_user(SUBSCRIPTION$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Subscription" element
     */
    public boolean isNilSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscription target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().find_element_user(SUBSCRIPTION$50, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Subscription" element
     */
    public boolean isSetSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTION$50) != 0;
        }
    }
    
    /**
     * Sets the "Subscription" element
     */
    public void setSubscription(com.exacttarget.wsdl.partnerapi.Subscription subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscription target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().find_element_user(SUBSCRIPTION$50, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().add_element_user(SUBSCRIPTION$50);
            }
            target.set(subscription);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscription addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscription target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().add_element_user(SUBSCRIPTION$50);
            return target;
        }
    }
    
    /**
     * Nils the "Subscription" element
     */
    public void setNilSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscription target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().find_element_user(SUBSCRIPTION$50, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscription)get_store().add_element_user(SUBSCRIPTION$50);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Subscription" element
     */
    public void unsetSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTION$50, 0);
        }
    }
    
    /**
     * Gets array of all "PrivateLabels" elements
     */
    public com.exacttarget.wsdl.partnerapi.PrivateLabel[] getPrivateLabelsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIVATELABELS$52, targetList);
            com.exacttarget.wsdl.partnerapi.PrivateLabel[] result = new com.exacttarget.wsdl.partnerapi.PrivateLabel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PrivateLabels" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateLabel getPrivateLabelsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().find_element_user(PRIVATELABELS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PrivateLabels" element
     */
    public boolean isNilPrivateLabelsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().find_element_user(PRIVATELABELS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PrivateLabels" element
     */
    public int sizeOfPrivateLabelsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATELABELS$52);
        }
    }
    
    /**
     * Sets array of all "PrivateLabels" element
     */
    public void setPrivateLabelsArray(com.exacttarget.wsdl.partnerapi.PrivateLabel[] privateLabelsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(privateLabelsArray, PRIVATELABELS$52);
        }
    }
    
    /**
     * Sets ith "PrivateLabels" element
     */
    public void setPrivateLabelsArray(int i, com.exacttarget.wsdl.partnerapi.PrivateLabel privateLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().find_element_user(PRIVATELABELS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(privateLabels);
        }
    }
    
    /**
     * Nils the ith "PrivateLabels" element
     */
    public void setNilPrivateLabelsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().find_element_user(PRIVATELABELS$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrivateLabels" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateLabel insertNewPrivateLabels(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().insert_element_user(PRIVATELABELS$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrivateLabels" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateLabel addNewPrivateLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateLabel target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateLabel)get_store().add_element_user(PRIVATELABELS$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "PrivateLabels" element
     */
    public void removePrivateLabels(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATELABELS$52, i);
        }
    }
    
    /**
     * Gets array of all "BusinessRules" elements
     */
    public com.exacttarget.wsdl.partnerapi.BusinessRule[] getBusinessRulesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSRULES$54, targetList);
            com.exacttarget.wsdl.partnerapi.BusinessRule[] result = new com.exacttarget.wsdl.partnerapi.BusinessRule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BusinessRules" element
     */
    public com.exacttarget.wsdl.partnerapi.BusinessRule getBusinessRulesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().find_element_user(BUSINESSRULES$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BusinessRules" element
     */
    public boolean isNilBusinessRulesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().find_element_user(BUSINESSRULES$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BusinessRules" element
     */
    public int sizeOfBusinessRulesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSRULES$54);
        }
    }
    
    /**
     * Sets array of all "BusinessRules" element
     */
    public void setBusinessRulesArray(com.exacttarget.wsdl.partnerapi.BusinessRule[] businessRulesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessRulesArray, BUSINESSRULES$54);
        }
    }
    
    /**
     * Sets ith "BusinessRules" element
     */
    public void setBusinessRulesArray(int i, com.exacttarget.wsdl.partnerapi.BusinessRule businessRules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().find_element_user(BUSINESSRULES$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessRules);
        }
    }
    
    /**
     * Nils the ith "BusinessRules" element
     */
    public void setNilBusinessRulesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().find_element_user(BUSINESSRULES$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessRules" element
     */
    public com.exacttarget.wsdl.partnerapi.BusinessRule insertNewBusinessRules(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().insert_element_user(BUSINESSRULES$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessRules" element
     */
    public com.exacttarget.wsdl.partnerapi.BusinessRule addNewBusinessRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BusinessRule target = null;
            target = (com.exacttarget.wsdl.partnerapi.BusinessRule)get_store().add_element_user(BUSINESSRULES$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "BusinessRules" element
     */
    public void removeBusinessRules(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSRULES$54, i);
        }
    }
    
    /**
     * Gets array of all "AccountUsers" elements
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser[] getAccountUsersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCOUNTUSERS$56, targetList);
            com.exacttarget.wsdl.partnerapi.AccountUser[] result = new com.exacttarget.wsdl.partnerapi.AccountUser[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AccountUsers" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser getAccountUsersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ACCOUNTUSERS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AccountUsers" element
     */
    public boolean isNilAccountUsersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ACCOUNTUSERS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AccountUsers" element
     */
    public int sizeOfAccountUsersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTUSERS$56);
        }
    }
    
    /**
     * Sets array of all "AccountUsers" element
     */
    public void setAccountUsersArray(com.exacttarget.wsdl.partnerapi.AccountUser[] accountUsersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accountUsersArray, ACCOUNTUSERS$56);
        }
    }
    
    /**
     * Sets ith "AccountUsers" element
     */
    public void setAccountUsersArray(int i, com.exacttarget.wsdl.partnerapi.AccountUser accountUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ACCOUNTUSERS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accountUsers);
        }
    }
    
    /**
     * Nils the ith "AccountUsers" element
     */
    public void setNilAccountUsersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ACCOUNTUSERS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AccountUsers" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser insertNewAccountUsers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().insert_element_user(ACCOUNTUSERS$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AccountUsers" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser addNewAccountUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().add_element_user(ACCOUNTUSERS$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "AccountUsers" element
     */
    public void removeAccountUsers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTUSERS$56, i);
        }
    }
    
    /**
     * Gets the "InheritAddress" element
     */
    public boolean getInheritAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITADDRESS$58, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "InheritAddress" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInheritAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INHERITADDRESS$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "InheritAddress" element
     */
    public boolean isSetInheritAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INHERITADDRESS$58) != 0;
        }
    }
    
    /**
     * Sets the "InheritAddress" element
     */
    public void setInheritAddress(boolean inheritAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITADDRESS$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITADDRESS$58);
            }
            target.setBooleanValue(inheritAddress);
        }
    }
    
    /**
     * Sets (as xml) the "InheritAddress" element
     */
    public void xsetInheritAddress(org.apache.xmlbeans.XmlBoolean inheritAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INHERITADDRESS$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INHERITADDRESS$58);
            }
            target.set(inheritAddress);
        }
    }
    
    /**
     * Unsets the "InheritAddress" element
     */
    public void unsetInheritAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INHERITADDRESS$58, 0);
        }
    }
    
    /**
     * Gets the "IsTrialAccount" element
     */
    public boolean getIsTrialAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRIALACCOUNT$60, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTrialAccount" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTrialAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTRIALACCOUNT$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTrialAccount" element
     */
    public boolean isSetIsTrialAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTRIALACCOUNT$60) != 0;
        }
    }
    
    /**
     * Sets the "IsTrialAccount" element
     */
    public void setIsTrialAccount(boolean isTrialAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTRIALACCOUNT$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTRIALACCOUNT$60);
            }
            target.setBooleanValue(isTrialAccount);
        }
    }
    
    /**
     * Sets (as xml) the "IsTrialAccount" element
     */
    public void xsetIsTrialAccount(org.apache.xmlbeans.XmlBoolean isTrialAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTRIALACCOUNT$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTRIALACCOUNT$60);
            }
            target.set(isTrialAccount);
        }
    }
    
    /**
     * Unsets the "IsTrialAccount" element
     */
    public void unsetIsTrialAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTRIALACCOUNT$60, 0);
        }
    }
    
    /**
     * Gets the "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Locale" element
     */
    public boolean isSetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALE$62) != 0;
        }
    }
    
    /**
     * Sets the "Locale" element
     */
    public void setLocale(com.exacttarget.wsdl.partnerapi.Locale locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$62, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$62);
            }
            target.set(locale);
        }
    }
    
    /**
     * Appends and returns a new empty "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale addNewLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$62);
            return target;
        }
    }
    
    /**
     * Unsets the "Locale" element
     */
    public void unsetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALE$62, 0);
        }
    }
    
    /**
     * Gets the "ParentAccount" element
     */
    public com.exacttarget.wsdl.partnerapi.Account getParentAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account)get_store().find_element_user(PARENTACCOUNT$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ParentAccount" element
     */
    public boolean isSetParentAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTACCOUNT$64) != 0;
        }
    }
    
    /**
     * Sets the "ParentAccount" element
     */
    public void setParentAccount(com.exacttarget.wsdl.partnerapi.Account parentAccount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account)get_store().find_element_user(PARENTACCOUNT$64, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Account)get_store().add_element_user(PARENTACCOUNT$64);
            }
            target.set(parentAccount);
        }
    }
    
    /**
     * Appends and returns a new empty "ParentAccount" element
     */
    public com.exacttarget.wsdl.partnerapi.Account addNewParentAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account)get_store().add_element_user(PARENTACCOUNT$64);
            return target;
        }
    }
    
    /**
     * Unsets the "ParentAccount" element
     */
    public void unsetParentAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTACCOUNT$64, 0);
        }
    }
    
    /**
     * Gets the "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$66) != 0;
        }
    }
    
    /**
     * Sets the "TimeZone" element
     */
    public void setTimeZone(com.exacttarget.wsdl.partnerapi.TimeZone timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().find_element_user(TIMEZONE$66, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$66);
            }
            target.set(timeZone);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeZone" element
     */
    public com.exacttarget.wsdl.partnerapi.TimeZone addNewTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TimeZone target = null;
            target = (com.exacttarget.wsdl.partnerapi.TimeZone)get_store().add_element_user(TIMEZONE$66);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$66, 0);
        }
    }
    
    /**
     * Gets the "Roles" element
     */
    public com.exacttarget.wsdl.partnerapi.Account.Roles getRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account.Roles)get_store().find_element_user(ROLES$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Roles" element
     */
    public boolean isSetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLES$68) != 0;
        }
    }
    
    /**
     * Sets the "Roles" element
     */
    public void setRoles(com.exacttarget.wsdl.partnerapi.Account.Roles roles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account.Roles)get_store().find_element_user(ROLES$68, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Account.Roles)get_store().add_element_user(ROLES$68);
            }
            target.set(roles);
        }
    }
    
    /**
     * Appends and returns a new empty "Roles" element
     */
    public com.exacttarget.wsdl.partnerapi.Account.Roles addNewRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Account.Roles target = null;
            target = (com.exacttarget.wsdl.partnerapi.Account.Roles)get_store().add_element_user(ROLES$68);
            return target;
        }
    }
    
    /**
     * Unsets the "Roles" element
     */
    public void unsetRoles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLES$68, 0);
        }
    }
    
    /**
     * Gets the "LanguageLocale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale getLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LANGUAGELOCALE$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LanguageLocale" element
     */
    public boolean isSetLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGELOCALE$70) != 0;
        }
    }
    
    /**
     * Sets the "LanguageLocale" element
     */
    public void setLanguageLocale(com.exacttarget.wsdl.partnerapi.Locale languageLocale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LANGUAGELOCALE$70, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LANGUAGELOCALE$70);
            }
            target.set(languageLocale);
        }
    }
    
    /**
     * Appends and returns a new empty "LanguageLocale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale addNewLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LANGUAGELOCALE$70);
            return target;
        }
    }
    
    /**
     * Unsets the "LanguageLocale" element
     */
    public void unsetLanguageLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGELOCALE$70, 0);
        }
    }
    /**
     * An XML Roles(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class RolesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Account.Roles
    {
        
        public RolesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROLE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Role");
        
        
        /**
         * Gets array of all "Role" elements
         */
        public com.exacttarget.wsdl.partnerapi.Role[] getRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ROLE$0, targetList);
                com.exacttarget.wsdl.partnerapi.Role[] result = new com.exacttarget.wsdl.partnerapi.Role[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role getRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Role" element
         */
        public int sizeOfRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLE$0);
            }
        }
        
        /**
         * Sets array of all "Role" element
         */
        public void setRoleArray(com.exacttarget.wsdl.partnerapi.Role[] roleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(roleArray, ROLE$0);
            }
        }
        
        /**
         * Sets ith "Role" element
         */
        public void setRoleArray(int i, com.exacttarget.wsdl.partnerapi.Role role)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().find_element_user(ROLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(role);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role insertNewRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().insert_element_user(ROLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Role" element
         */
        public com.exacttarget.wsdl.partnerapi.Role addNewRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Role target = null;
                target = (com.exacttarget.wsdl.partnerapi.Role)get_store().add_element_user(ROLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Role" element
         */
        public void removeRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLE$0, i);
            }
        }
    }
}
