/*
 * XML Type:  BusinessRule
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.BusinessRule
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML BusinessRule(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class BusinessRuleImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.BusinessRule
{
    
    public BusinessRuleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERBUSINESSRULEID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MemberBusinessRuleID");
    private static final javax.xml.namespace.QName BUSINESSRULEID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BusinessRuleID");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Data");
    private static final javax.xml.namespace.QName QUALITY$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Quality");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    private static final javax.xml.namespace.QName DESCRIPTION$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName ISVIEWABLE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsViewable");
    private static final javax.xml.namespace.QName ISINHERITEDFROMPARENT$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsInheritedFromParent");
    private static final javax.xml.namespace.QName DISPLAYNAME$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DisplayName");
    private static final javax.xml.namespace.QName PRODUCTCODE$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ProductCode");
    
    
    /**
     * Gets the "MemberBusinessRuleID" element
     */
    public int getMemberBusinessRuleID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERBUSINESSRULEID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MemberBusinessRuleID" element
     */
    public org.apache.xmlbeans.XmlInt xgetMemberBusinessRuleID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MEMBERBUSINESSRULEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MemberBusinessRuleID" element
     */
    public void setMemberBusinessRuleID(int memberBusinessRuleID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERBUSINESSRULEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERBUSINESSRULEID$0);
            }
            target.setIntValue(memberBusinessRuleID);
        }
    }
    
    /**
     * Sets (as xml) the "MemberBusinessRuleID" element
     */
    public void xsetMemberBusinessRuleID(org.apache.xmlbeans.XmlInt memberBusinessRuleID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MEMBERBUSINESSRULEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MEMBERBUSINESSRULEID$0);
            }
            target.set(memberBusinessRuleID);
        }
    }
    
    /**
     * Gets the "BusinessRuleID" element
     */
    public int getBusinessRuleID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSRULEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessRuleID" element
     */
    public org.apache.xmlbeans.XmlInt xgetBusinessRuleID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSRULEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BusinessRuleID" element
     */
    public void setBusinessRuleID(int businessRuleID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSRULEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSRULEID$2);
            }
            target.setIntValue(businessRuleID);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessRuleID" element
     */
    public void xsetBusinessRuleID(org.apache.xmlbeans.XmlInt businessRuleID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSRULEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BUSINESSRULEID$2);
            }
            target.set(businessRuleID);
        }
    }
    
    /**
     * Gets the "Data" element
     */
    public int getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlInt xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(int data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$4);
            }
            target.setIntValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlInt data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATA$4);
            }
            target.set(data);
        }
    }
    
    /**
     * Gets the "Quality" element
     */
    public java.lang.String getQuality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quality" element
     */
    public org.apache.xmlbeans.XmlString xgetQuality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALITY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Quality" element
     */
    public void setQuality(java.lang.String quality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALITY$6);
            }
            target.setStringValue(quality);
        }
    }
    
    /**
     * Sets (as xml) the "Quality" element
     */
    public void xsetQuality(org.apache.xmlbeans.XmlString quality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALITY$6);
            }
            target.set(quality);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
            }
            target.set(name);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
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
            return get_store().count_elements(TYPE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$10);
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
            get_store().remove_element(TYPE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
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
            return get_store().count_elements(DESCRIPTION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$12);
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
            get_store().remove_element(DESCRIPTION$12, 0);
        }
    }
    
    /**
     * Gets the "IsViewable" element
     */
    public boolean getIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVIEWABLE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsViewable" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVIEWABLE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsViewable" element
     */
    public boolean isSetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVIEWABLE$14) != 0;
        }
    }
    
    /**
     * Sets the "IsViewable" element
     */
    public void setIsViewable(boolean isViewable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVIEWABLE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVIEWABLE$14);
            }
            target.setBooleanValue(isViewable);
        }
    }
    
    /**
     * Sets (as xml) the "IsViewable" element
     */
    public void xsetIsViewable(org.apache.xmlbeans.XmlBoolean isViewable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVIEWABLE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVIEWABLE$14);
            }
            target.set(isViewable);
        }
    }
    
    /**
     * Unsets the "IsViewable" element
     */
    public void unsetIsViewable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVIEWABLE$14, 0);
        }
    }
    
    /**
     * Gets the "IsInheritedFromParent" element
     */
    public boolean getIsInheritedFromParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINHERITEDFROMPARENT$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsInheritedFromParent" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInheritedFromParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINHERITEDFROMPARENT$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsInheritedFromParent" element
     */
    public boolean isSetIsInheritedFromParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISINHERITEDFROMPARENT$16) != 0;
        }
    }
    
    /**
     * Sets the "IsInheritedFromParent" element
     */
    public void setIsInheritedFromParent(boolean isInheritedFromParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINHERITEDFROMPARENT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISINHERITEDFROMPARENT$16);
            }
            target.setBooleanValue(isInheritedFromParent);
        }
    }
    
    /**
     * Sets (as xml) the "IsInheritedFromParent" element
     */
    public void xsetIsInheritedFromParent(org.apache.xmlbeans.XmlBoolean isInheritedFromParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINHERITEDFROMPARENT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISINHERITEDFROMPARENT$16);
            }
            target.set(isInheritedFromParent);
        }
    }
    
    /**
     * Unsets the "IsInheritedFromParent" element
     */
    public void unsetIsInheritedFromParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISINHERITEDFROMPARENT$16, 0);
        }
    }
    
    /**
     * Gets the "DisplayName" element
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayName" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DisplayName" element
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$18);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayName" element
     */
    public void xsetDisplayName(org.apache.xmlbeans.XmlString displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$18);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Gets the "ProductCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductCode" element
     */
    public void setProductCode(java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$20);
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProductCode" element
     */
    public void xsetProductCode(org.apache.xmlbeans.XmlString productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$20);
            }
            target.set(productCode);
        }
    }
}
