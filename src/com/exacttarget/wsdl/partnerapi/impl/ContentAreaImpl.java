/*
 * XML Type:  ContentArea
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContentArea
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ContentArea(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ContentAreaImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ContentArea
{
    
    public ContentAreaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Key");
    private static final javax.xml.namespace.QName CONTENT$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Content");
    private static final javax.xml.namespace.QName ISBLANK$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsBlank");
    private static final javax.xml.namespace.QName CATEGORYID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName LAYOUT$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Layout");
    private static final javax.xml.namespace.QName ISDYNAMICCONTENT$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsDynamicContent");
    private static final javax.xml.namespace.QName ISSURVEY$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSurvey");
    
    
    /**
     * Gets the "Key" element
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Key" element
     */
    public org.apache.xmlbeans.XmlString xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Key" element
     */
    public boolean isSetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEY$0) != 0;
        }
    }
    
    /**
     * Sets the "Key" element
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "Key" element
     */
    public void xsetKey(org.apache.xmlbeans.XmlString key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Unsets the "Key" element
     */
    public void unsetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEY$0, 0);
        }
    }
    
    /**
     * Gets the "Content" element
     */
    public java.lang.String getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Content" element
     */
    public org.apache.xmlbeans.XmlString xgetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
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
            return get_store().count_elements(CONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "Content" element
     */
    public void setContent(java.lang.String content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$2);
            }
            target.setStringValue(content);
        }
    }
    
    /**
     * Sets (as xml) the "Content" element
     */
    public void xsetContent(org.apache.xmlbeans.XmlString content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENT$2);
            }
            target.set(content);
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
            get_store().remove_element(CONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "IsBlank" element
     */
    public boolean getIsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBLANK$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsBlank" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBLANK$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsBlank" element
     */
    public boolean isSetIsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBLANK$4) != 0;
        }
    }
    
    /**
     * Sets the "IsBlank" element
     */
    public void setIsBlank(boolean isBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBLANK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBLANK$4);
            }
            target.setBooleanValue(isBlank);
        }
    }
    
    /**
     * Sets (as xml) the "IsBlank" element
     */
    public void xsetIsBlank(org.apache.xmlbeans.XmlBoolean isBlank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISBLANK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISBLANK$4);
            }
            target.set(isBlank);
        }
    }
    
    /**
     * Unsets the "IsBlank" element
     */
    public void unsetIsBlank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBLANK$4, 0);
        }
    }
    
    /**
     * Gets the "CategoryID" element
     */
    public int getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    public org.apache.xmlbeans.XmlInt xgetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryID" element
     */
    public boolean isSetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$6) != 0;
        }
    }
    
    /**
     * Sets the "CategoryID" element
     */
    public void setCategoryID(int categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$6);
            }
            target.setIntValue(categoryID);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    public void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORYID$6);
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Unsets the "CategoryID" element
     */
    public void unsetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$6, 0);
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
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$8) != 0;
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
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$8, 0);
        }
    }
    
    /**
     * Gets the "Layout" element
     */
    public com.exacttarget.wsdl.partnerapi.LayoutType.Enum getLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.LayoutType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Layout" element
     */
    public com.exacttarget.wsdl.partnerapi.LayoutType xgetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LayoutType target = null;
            target = (com.exacttarget.wsdl.partnerapi.LayoutType)get_store().find_element_user(LAYOUT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Layout" element
     */
    public boolean isSetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUT$10) != 0;
        }
    }
    
    /**
     * Sets the "Layout" element
     */
    public void setLayout(com.exacttarget.wsdl.partnerapi.LayoutType.Enum layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYOUT$10);
            }
            target.setEnumValue(layout);
        }
    }
    
    /**
     * Sets (as xml) the "Layout" element
     */
    public void xsetLayout(com.exacttarget.wsdl.partnerapi.LayoutType layout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LayoutType target = null;
            target = (com.exacttarget.wsdl.partnerapi.LayoutType)get_store().find_element_user(LAYOUT$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.LayoutType)get_store().add_element_user(LAYOUT$10);
            }
            target.set(layout);
        }
    }
    
    /**
     * Unsets the "Layout" element
     */
    public void unsetLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUT$10, 0);
        }
    }
    
    /**
     * Gets the "IsDynamicContent" element
     */
    public boolean getIsDynamicContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDYNAMICCONTENT$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDynamicContent" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDynamicContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDYNAMICCONTENT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDynamicContent" element
     */
    public boolean isSetIsDynamicContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDYNAMICCONTENT$12) != 0;
        }
    }
    
    /**
     * Sets the "IsDynamicContent" element
     */
    public void setIsDynamicContent(boolean isDynamicContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDYNAMICCONTENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDYNAMICCONTENT$12);
            }
            target.setBooleanValue(isDynamicContent);
        }
    }
    
    /**
     * Sets (as xml) the "IsDynamicContent" element
     */
    public void xsetIsDynamicContent(org.apache.xmlbeans.XmlBoolean isDynamicContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDYNAMICCONTENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDYNAMICCONTENT$12);
            }
            target.set(isDynamicContent);
        }
    }
    
    /**
     * Unsets the "IsDynamicContent" element
     */
    public void unsetIsDynamicContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDYNAMICCONTENT$12, 0);
        }
    }
    
    /**
     * Gets the "IsSurvey" element
     */
    public boolean getIsSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSURVEY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSurvey" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSURVEY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSurvey" element
     */
    public boolean isSetIsSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSURVEY$14) != 0;
        }
    }
    
    /**
     * Sets the "IsSurvey" element
     */
    public void setIsSurvey(boolean isSurvey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSURVEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSURVEY$14);
            }
            target.setBooleanValue(isSurvey);
        }
    }
    
    /**
     * Sets (as xml) the "IsSurvey" element
     */
    public void xsetIsSurvey(org.apache.xmlbeans.XmlBoolean isSurvey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSURVEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSURVEY$14);
            }
            target.set(isSurvey);
        }
    }
    
    /**
     * Unsets the "IsSurvey" element
     */
    public void unsetIsSurvey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSURVEY$14, 0);
        }
    }
}
