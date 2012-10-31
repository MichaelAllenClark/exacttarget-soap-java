/*
 * XML Type:  Folder
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Folder
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Folder(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class FolderImpl extends com.exacttarget.wsdl.partnerapi.impl.APIPropertyImpl implements com.exacttarget.wsdl.partnerapi.Folder
{
    
    public FolderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ID");
    private static final javax.xml.namespace.QName PARENTID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentID");
    
    
    /**
     * Gets the "ID" element
     */
    public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$0);
            }
            target.set(id);
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
}
