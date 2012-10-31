/*
 * XML Type:  RetrieveOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML RetrieveOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class RetrieveOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.OptionsImpl implements com.exacttarget.wsdl.partnerapi.RetrieveOptions
{
    
    public RetrieveOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BATCHSIZE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BatchSize");
    private static final javax.xml.namespace.QName INCLUDEOBJECTS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IncludeObjects");
    private static final javax.xml.namespace.QName ONLYINCLUDEBASE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OnlyIncludeBase");
    
    
    /**
     * Gets the "BatchSize" element
     */
    public int getBatchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHSIZE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BatchSize" element
     */
    public org.apache.xmlbeans.XmlInt xgetBatchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "BatchSize" element
     */
    public boolean isSetBatchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BATCHSIZE$0) != 0;
        }
    }
    
    /**
     * Sets the "BatchSize" element
     */
    public void setBatchSize(int batchSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHSIZE$0);
            }
            target.setIntValue(batchSize);
        }
    }
    
    /**
     * Sets (as xml) the "BatchSize" element
     */
    public void xsetBatchSize(org.apache.xmlbeans.XmlInt batchSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BATCHSIZE$0);
            }
            target.set(batchSize);
        }
    }
    
    /**
     * Unsets the "BatchSize" element
     */
    public void unsetBatchSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BATCHSIZE$0, 0);
        }
    }
    
    /**
     * Gets the "IncludeObjects" element
     */
    public boolean getIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEOBJECTS$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncludeObjects" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEOBJECTS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncludeObjects" element
     */
    public boolean isSetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDEOBJECTS$2) != 0;
        }
    }
    
    /**
     * Sets the "IncludeObjects" element
     */
    public void setIncludeObjects(boolean includeObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEOBJECTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEOBJECTS$2);
            }
            target.setBooleanValue(includeObjects);
        }
    }
    
    /**
     * Sets (as xml) the "IncludeObjects" element
     */
    public void xsetIncludeObjects(org.apache.xmlbeans.XmlBoolean includeObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEOBJECTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEOBJECTS$2);
            }
            target.set(includeObjects);
        }
    }
    
    /**
     * Unsets the "IncludeObjects" element
     */
    public void unsetIncludeObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDEOBJECTS$2, 0);
        }
    }
    
    /**
     * Gets the "OnlyIncludeBase" element
     */
    public boolean getOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYINCLUDEBASE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OnlyIncludeBase" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYINCLUDEBASE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OnlyIncludeBase" element
     */
    public boolean isSetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONLYINCLUDEBASE$4) != 0;
        }
    }
    
    /**
     * Sets the "OnlyIncludeBase" element
     */
    public void setOnlyIncludeBase(boolean onlyIncludeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLYINCLUDEBASE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONLYINCLUDEBASE$4);
            }
            target.setBooleanValue(onlyIncludeBase);
        }
    }
    
    /**
     * Sets (as xml) the "OnlyIncludeBase" element
     */
    public void xsetOnlyIncludeBase(org.apache.xmlbeans.XmlBoolean onlyIncludeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONLYINCLUDEBASE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ONLYINCLUDEBASE$4);
            }
            target.set(onlyIncludeBase);
        }
    }
    
    /**
     * Unsets the "OnlyIncludeBase" element
     */
    public void unsetOnlyIncludeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONLYINCLUDEBASE$4, 0);
        }
    }
}
