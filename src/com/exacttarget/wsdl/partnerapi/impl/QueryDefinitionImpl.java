/*
 * XML Type:  QueryDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML QueryDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class QueryDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.InteractionDefinitionImpl implements com.exacttarget.wsdl.partnerapi.QueryDefinition
{
    
    public QueryDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTEXT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueryText");
    private static final javax.xml.namespace.QName TARGETTYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TargetType");
    private static final javax.xml.namespace.QName DATAEXTENSIONTARGET$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DataExtensionTarget");
    private static final javax.xml.namespace.QName TARGETUPDATETYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TargetUpdateType");
    private static final javax.xml.namespace.QName FILESPEC$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileSpec");
    private static final javax.xml.namespace.QName FILETYPE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FileType");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName CATEGORYID$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    
    
    /**
     * Gets the "QueryText" element
     */
    public java.lang.String getQueryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryText" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueryText" element
     */
    public boolean isSetQueryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "QueryText" element
     */
    public void setQueryText(java.lang.String queryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYTEXT$0);
            }
            target.setStringValue(queryText);
        }
    }
    
    /**
     * Sets (as xml) the "QueryText" element
     */
    public void xsetQueryText(org.apache.xmlbeans.XmlString queryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYTEXT$0);
            }
            target.set(queryText);
        }
    }
    
    /**
     * Unsets the "QueryText" element
     */
    public void unsetQueryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYTEXT$0, 0);
        }
    }
    
    /**
     * Gets the "TargetType" element
     */
    public java.lang.String getTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetType" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetType" element
     */
    public boolean isSetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "TargetType" element
     */
    public void setTargetType(java.lang.String targetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTYPE$2);
            }
            target.setStringValue(targetType);
        }
    }
    
    /**
     * Sets (as xml) the "TargetType" element
     */
    public void xsetTargetType(org.apache.xmlbeans.XmlString targetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETTYPE$2);
            }
            target.set(targetType);
        }
    }
    
    /**
     * Unsets the "TargetType" element
     */
    public void unsetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "DataExtensionTarget" element
     */
    public com.exacttarget.wsdl.partnerapi.InteractionBaseObject getDataExtensionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.InteractionBaseObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.InteractionBaseObject)get_store().find_element_user(DATAEXTENSIONTARGET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataExtensionTarget" element
     */
    public boolean isSetDataExtensionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAEXTENSIONTARGET$4) != 0;
        }
    }
    
    /**
     * Sets the "DataExtensionTarget" element
     */
    public void setDataExtensionTarget(com.exacttarget.wsdl.partnerapi.InteractionBaseObject dataExtensionTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.InteractionBaseObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.InteractionBaseObject)get_store().find_element_user(DATAEXTENSIONTARGET$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.InteractionBaseObject)get_store().add_element_user(DATAEXTENSIONTARGET$4);
            }
            target.set(dataExtensionTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "DataExtensionTarget" element
     */
    public com.exacttarget.wsdl.partnerapi.InteractionBaseObject addNewDataExtensionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.InteractionBaseObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.InteractionBaseObject)get_store().add_element_user(DATAEXTENSIONTARGET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataExtensionTarget" element
     */
    public void unsetDataExtensionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAEXTENSIONTARGET$4, 0);
        }
    }
    
    /**
     * Gets the "TargetUpdateType" element
     */
    public java.lang.String getTargetUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETUPDATETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetUpdateType" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETUPDATETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetUpdateType" element
     */
    public boolean isSetTargetUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETUPDATETYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "TargetUpdateType" element
     */
    public void setTargetUpdateType(java.lang.String targetUpdateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETUPDATETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETUPDATETYPE$6);
            }
            target.setStringValue(targetUpdateType);
        }
    }
    
    /**
     * Sets (as xml) the "TargetUpdateType" element
     */
    public void xsetTargetUpdateType(org.apache.xmlbeans.XmlString targetUpdateType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETUPDATETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETUPDATETYPE$6);
            }
            target.set(targetUpdateType);
        }
    }
    
    /**
     * Unsets the "TargetUpdateType" element
     */
    public void unsetTargetUpdateType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETUPDATETYPE$6, 0);
        }
    }
    
    /**
     * Gets the "FileSpec" element
     */
    public java.lang.String getFileSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESPEC$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileSpec" element
     */
    public org.apache.xmlbeans.XmlString xgetFileSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILESPEC$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileSpec" element
     */
    public boolean isSetFileSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESPEC$8) != 0;
        }
    }
    
    /**
     * Sets the "FileSpec" element
     */
    public void setFileSpec(java.lang.String fileSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESPEC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESPEC$8);
            }
            target.setStringValue(fileSpec);
        }
    }
    
    /**
     * Sets (as xml) the "FileSpec" element
     */
    public void xsetFileSpec(org.apache.xmlbeans.XmlString fileSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILESPEC$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILESPEC$8);
            }
            target.set(fileSpec);
        }
    }
    
    /**
     * Unsets the "FileSpec" element
     */
    public void unsetFileSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESPEC$8, 0);
        }
    }
    
    /**
     * Gets the "FileType" element
     */
    public java.lang.String getFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FileType" element
     */
    public org.apache.xmlbeans.XmlString xgetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILETYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "FileType" element
     */
    public boolean isSetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "FileType" element
     */
    public void setFileType(java.lang.String fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILETYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILETYPE$10);
            }
            target.setStringValue(fileType);
        }
    }
    
    /**
     * Sets (as xml) the "FileType" element
     */
    public void xsetFileType(org.apache.xmlbeans.XmlString fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILETYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILETYPE$10);
            }
            target.set(fileType);
        }
    }
    
    /**
     * Unsets the "FileType" element
     */
    public void unsetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETYPE$10, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$12);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$12);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$14, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$14, 0);
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
            return get_store().count_elements(CATEGORYID$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$14);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORYID$14);
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
            get_store().remove_element(CATEGORYID$14, 0);
        }
    }
}
