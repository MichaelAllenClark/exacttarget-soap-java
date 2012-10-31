/*
 * XML Type:  Portfolio
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Portfolio
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Portfolio(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PortfolioImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Portfolio
{
    
    public PortfolioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Source");
    private static final javax.xml.namespace.QName CATEGORYID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    private static final javax.xml.namespace.QName FILENAME$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileName");
    private static final javax.xml.namespace.QName DISPLAYNAME$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DisplayName");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName TYPEDESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TypeDescription");
    private static final javax.xml.namespace.QName ISUPLOADED$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsUploaded");
    private static final javax.xml.namespace.QName ISACTIVE$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName FILESIZEKB$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileSizeKB");
    private static final javax.xml.namespace.QName THUMBSIZEKB$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ThumbSizeKB");
    private static final javax.xml.namespace.QName FILEWIDTHPX$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileWidthPX");
    private static final javax.xml.namespace.QName FILEHEIGHTPX$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileHeightPX");
    private static final javax.xml.namespace.QName FILEURL$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileURL");
    private static final javax.xml.namespace.QName THUMBURL$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ThumbURL");
    private static final javax.xml.namespace.QName CACHECLEARTIME$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CacheClearTime");
    private static final javax.xml.namespace.QName CATEGORYTYPE$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryType");
    
    
    /**
     * Gets the "Source" element
     */
    public com.exacttarget.wsdl.partnerapi.ResourceSpecification getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(com.exacttarget.wsdl.partnerapi.ResourceSpecification source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public com.exacttarget.wsdl.partnerapi.ResourceSpecification addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ResourceSpecification target = null;
            target = (com.exacttarget.wsdl.partnerapi.ResourceSpecification)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$2, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$2, 0);
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
            return get_store().count_elements(CATEGORYID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$2);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORYID$2);
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
            get_store().remove_element(CATEGORYID$2, 0);
        }
    }
    
    /**
     * Gets the "FileName" element
     */
    public java.lang.String getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileName" element
     */
    public org.apache.xmlbeans.XmlString xgetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "FileName" element
     */
    public void setFileName(java.lang.String fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$4);
            }
            target.setStringValue(fileName);
        }
    }
    
    /**
     * Sets (as xml) the "FileName" element
     */
    public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$4);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Unsets the "FileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayName" element
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYNAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYNAME$6);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "DisplayName" element
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
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
            return get_store().count_elements(DESCRIPTION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "TypeDescription" element
     */
    public java.lang.String getTypeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDESCRIPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetTypeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDESCRIPTION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "TypeDescription" element
     */
    public boolean isSetTypeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEDESCRIPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "TypeDescription" element
     */
    public void setTypeDescription(java.lang.String typeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEDESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEDESCRIPTION$10);
            }
            target.setStringValue(typeDescription);
        }
    }
    
    /**
     * Sets (as xml) the "TypeDescription" element
     */
    public void xsetTypeDescription(org.apache.xmlbeans.XmlString typeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEDESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEDESCRIPTION$10);
            }
            target.set(typeDescription);
        }
    }
    
    /**
     * Unsets the "TypeDescription" element
     */
    public void unsetTypeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEDESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets the "IsUploaded" element
     */
    public boolean getIsUploaded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPLOADED$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsUploaded" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUploaded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPLOADED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsUploaded" element
     */
    public boolean isSetIsUploaded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISUPLOADED$12) != 0;
        }
    }
    
    /**
     * Sets the "IsUploaded" element
     */
    public void setIsUploaded(boolean isUploaded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISUPLOADED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISUPLOADED$12);
            }
            target.setBooleanValue(isUploaded);
        }
    }
    
    /**
     * Sets (as xml) the "IsUploaded" element
     */
    public void xsetIsUploaded(org.apache.xmlbeans.XmlBoolean isUploaded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISUPLOADED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISUPLOADED$12);
            }
            target.set(isUploaded);
        }
    }
    
    /**
     * Unsets the "IsUploaded" element
     */
    public void unsetIsUploaded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISUPLOADED$12, 0);
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$14, 0);
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
            return get_store().count_elements(ISACTIVE$14) != 0;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(boolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$14);
            }
            target.setBooleanValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$14);
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
            get_store().remove_element(ISACTIVE$14, 0);
        }
    }
    
    /**
     * Gets the "FileSizeKB" element
     */
    public int getFileSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZEKB$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileSizeKB" element
     */
    public org.apache.xmlbeans.XmlInt xgetFileSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILESIZEKB$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileSizeKB" element
     */
    public boolean isSetFileSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESIZEKB$16) != 0;
        }
    }
    
    /**
     * Sets the "FileSizeKB" element
     */
    public void setFileSizeKB(int fileSizeKB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZEKB$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESIZEKB$16);
            }
            target.setIntValue(fileSizeKB);
        }
    }
    
    /**
     * Sets (as xml) the "FileSizeKB" element
     */
    public void xsetFileSizeKB(org.apache.xmlbeans.XmlInt fileSizeKB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILESIZEKB$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILESIZEKB$16);
            }
            target.set(fileSizeKB);
        }
    }
    
    /**
     * Unsets the "FileSizeKB" element
     */
    public void unsetFileSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESIZEKB$16, 0);
        }
    }
    
    /**
     * Gets the "ThumbSizeKB" element
     */
    public int getThumbSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THUMBSIZEKB$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThumbSizeKB" element
     */
    public org.apache.xmlbeans.XmlInt xgetThumbSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(THUMBSIZEKB$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ThumbSizeKB" element
     */
    public boolean isSetThumbSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THUMBSIZEKB$18) != 0;
        }
    }
    
    /**
     * Sets the "ThumbSizeKB" element
     */
    public void setThumbSizeKB(int thumbSizeKB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THUMBSIZEKB$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THUMBSIZEKB$18);
            }
            target.setIntValue(thumbSizeKB);
        }
    }
    
    /**
     * Sets (as xml) the "ThumbSizeKB" element
     */
    public void xsetThumbSizeKB(org.apache.xmlbeans.XmlInt thumbSizeKB)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(THUMBSIZEKB$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(THUMBSIZEKB$18);
            }
            target.set(thumbSizeKB);
        }
    }
    
    /**
     * Unsets the "ThumbSizeKB" element
     */
    public void unsetThumbSizeKB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THUMBSIZEKB$18, 0);
        }
    }
    
    /**
     * Gets the "FileWidthPX" element
     */
    public int getFileWidthPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEWIDTHPX$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileWidthPX" element
     */
    public org.apache.xmlbeans.XmlInt xgetFileWidthPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEWIDTHPX$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileWidthPX" element
     */
    public boolean isSetFileWidthPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEWIDTHPX$20) != 0;
        }
    }
    
    /**
     * Sets the "FileWidthPX" element
     */
    public void setFileWidthPX(int fileWidthPX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEWIDTHPX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEWIDTHPX$20);
            }
            target.setIntValue(fileWidthPX);
        }
    }
    
    /**
     * Sets (as xml) the "FileWidthPX" element
     */
    public void xsetFileWidthPX(org.apache.xmlbeans.XmlInt fileWidthPX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEWIDTHPX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILEWIDTHPX$20);
            }
            target.set(fileWidthPX);
        }
    }
    
    /**
     * Unsets the "FileWidthPX" element
     */
    public void unsetFileWidthPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEWIDTHPX$20, 0);
        }
    }
    
    /**
     * Gets the "FileHeightPX" element
     */
    public int getFileHeightPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEHEIGHTPX$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileHeightPX" element
     */
    public org.apache.xmlbeans.XmlInt xgetFileHeightPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEHEIGHTPX$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileHeightPX" element
     */
    public boolean isSetFileHeightPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEHEIGHTPX$22) != 0;
        }
    }
    
    /**
     * Sets the "FileHeightPX" element
     */
    public void setFileHeightPX(int fileHeightPX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEHEIGHTPX$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEHEIGHTPX$22);
            }
            target.setIntValue(fileHeightPX);
        }
    }
    
    /**
     * Sets (as xml) the "FileHeightPX" element
     */
    public void xsetFileHeightPX(org.apache.xmlbeans.XmlInt fileHeightPX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FILEHEIGHTPX$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FILEHEIGHTPX$22);
            }
            target.set(fileHeightPX);
        }
    }
    
    /**
     * Unsets the "FileHeightPX" element
     */
    public void unsetFileHeightPX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEHEIGHTPX$22, 0);
        }
    }
    
    /**
     * Gets the "FileURL" element
     */
    public java.lang.String getFileURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileURL" element
     */
    public org.apache.xmlbeans.XmlString xgetFileURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEURL$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileURL" element
     */
    public boolean isSetFileURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEURL$24) != 0;
        }
    }
    
    /**
     * Sets the "FileURL" element
     */
    public void setFileURL(java.lang.String fileURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEURL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEURL$24);
            }
            target.setStringValue(fileURL);
        }
    }
    
    /**
     * Sets (as xml) the "FileURL" element
     */
    public void xsetFileURL(org.apache.xmlbeans.XmlString fileURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEURL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEURL$24);
            }
            target.set(fileURL);
        }
    }
    
    /**
     * Unsets the "FileURL" element
     */
    public void unsetFileURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEURL$24, 0);
        }
    }
    
    /**
     * Gets the "ThumbURL" element
     */
    public java.lang.String getThumbURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THUMBURL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ThumbURL" element
     */
    public org.apache.xmlbeans.XmlString xgetThumbURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(THUMBURL$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "ThumbURL" element
     */
    public boolean isSetThumbURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THUMBURL$26) != 0;
        }
    }
    
    /**
     * Sets the "ThumbURL" element
     */
    public void setThumbURL(java.lang.String thumbURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THUMBURL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THUMBURL$26);
            }
            target.setStringValue(thumbURL);
        }
    }
    
    /**
     * Sets (as xml) the "ThumbURL" element
     */
    public void xsetThumbURL(org.apache.xmlbeans.XmlString thumbURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(THUMBURL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(THUMBURL$26);
            }
            target.set(thumbURL);
        }
    }
    
    /**
     * Unsets the "ThumbURL" element
     */
    public void unsetThumbURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THUMBURL$26, 0);
        }
    }
    
    /**
     * Gets the "CacheClearTime" element
     */
    public java.util.Calendar getCacheClearTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CACHECLEARTIME$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CacheClearTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCacheClearTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CACHECLEARTIME$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "CacheClearTime" element
     */
    public boolean isSetCacheClearTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CACHECLEARTIME$28) != 0;
        }
    }
    
    /**
     * Sets the "CacheClearTime" element
     */
    public void setCacheClearTime(java.util.Calendar cacheClearTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CACHECLEARTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CACHECLEARTIME$28);
            }
            target.setCalendarValue(cacheClearTime);
        }
    }
    
    /**
     * Sets (as xml) the "CacheClearTime" element
     */
    public void xsetCacheClearTime(org.apache.xmlbeans.XmlDateTime cacheClearTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CACHECLEARTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CACHECLEARTIME$28);
            }
            target.set(cacheClearTime);
        }
    }
    
    /**
     * Unsets the "CacheClearTime" element
     */
    public void unsetCacheClearTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CACHECLEARTIME$28, 0);
        }
    }
    
    /**
     * Gets the "CategoryType" element
     */
    public java.lang.String getCategoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYTYPE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryType" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYTYPE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryType" element
     */
    public boolean isSetCategoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYTYPE$30) != 0;
        }
    }
    
    /**
     * Sets the "CategoryType" element
     */
    public void setCategoryType(java.lang.String categoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYTYPE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYTYPE$30);
            }
            target.setStringValue(categoryType);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryType" element
     */
    public void xsetCategoryType(org.apache.xmlbeans.XmlString categoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYTYPE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYTYPE$30);
            }
            target.set(categoryType);
        }
    }
    
    /**
     * Unsets the "CategoryType" element
     */
    public void unsetCategoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYTYPE$30, 0);
        }
    }
}
