/*
 * XML Type:  CampaignPerformOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CampaignPerformOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML CampaignPerformOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class CampaignPerformOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.PerformOptionsImpl implements com.exacttarget.wsdl.partnerapi.CampaignPerformOptions
{
    
    public CampaignPerformOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OCCURRENCEIDS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OccurrenceIDs");
    private static final javax.xml.namespace.QName OCCURRENCEIDSINDEX$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OccurrenceIDsIndex");
    
    
    /**
     * Gets array of all "OccurrenceIDs" elements
     */
    public java.lang.String[] getOccurrenceIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OCCURRENCEIDS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OccurrenceIDs" element
     */
    public java.lang.String getOccurrenceIDsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OccurrenceIDs" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOccurrenceIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OCCURRENCEIDS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OccurrenceIDs" element
     */
    public org.apache.xmlbeans.XmlString xgetOccurrenceIDsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "OccurrenceIDs" element
     */
    public int sizeOfOccurrenceIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OCCURRENCEIDS$0);
        }
    }
    
    /**
     * Sets array of all "OccurrenceIDs" element
     */
    public void setOccurrenceIDsArray(java.lang.String[] occurrenceIDsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(occurrenceIDsArray, OCCURRENCEIDS$0);
        }
    }
    
    /**
     * Sets ith "OccurrenceIDs" element
     */
    public void setOccurrenceIDsArray(int i, java.lang.String occurrenceIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(occurrenceIDs);
        }
    }
    
    /**
     * Sets (as xml) array of all "OccurrenceIDs" element
     */
    public void xsetOccurrenceIDsArray(org.apache.xmlbeans.XmlString[]occurrenceIDsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(occurrenceIDsArray, OCCURRENCEIDS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "OccurrenceIDs" element
     */
    public void xsetOccurrenceIDsArray(int i, org.apache.xmlbeans.XmlString occurrenceIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(occurrenceIDs);
        }
    }
    
    /**
     * Inserts the value as the ith "OccurrenceIDs" element
     */
    public void insertOccurrenceIDs(int i, java.lang.String occurrenceIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OCCURRENCEIDS$0, i);
            target.setStringValue(occurrenceIDs);
        }
    }
    
    /**
     * Appends the value as the last "OccurrenceIDs" element
     */
    public void addOccurrenceIDs(java.lang.String occurrenceIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEIDS$0);
            target.setStringValue(occurrenceIDs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OccurrenceIDs" element
     */
    public org.apache.xmlbeans.XmlString insertNewOccurrenceIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OCCURRENCEIDS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OccurrenceIDs" element
     */
    public org.apache.xmlbeans.XmlString addNewOccurrenceIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEIDS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OccurrenceIDs" element
     */
    public void removeOccurrenceIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OCCURRENCEIDS$0, i);
        }
    }
    
    /**
     * Gets the "OccurrenceIDsIndex" element
     */
    public int getOccurrenceIDsIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEIDSINDEX$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OccurrenceIDsIndex" element
     */
    public org.apache.xmlbeans.XmlInt xgetOccurrenceIDsIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OCCURRENCEIDSINDEX$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OccurrenceIDsIndex" element
     */
    public boolean isSetOccurrenceIDsIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OCCURRENCEIDSINDEX$2) != 0;
        }
    }
    
    /**
     * Sets the "OccurrenceIDsIndex" element
     */
    public void setOccurrenceIDsIndex(int occurrenceIDsIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEIDSINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEIDSINDEX$2);
            }
            target.setIntValue(occurrenceIDsIndex);
        }
    }
    
    /**
     * Sets (as xml) the "OccurrenceIDsIndex" element
     */
    public void xsetOccurrenceIDsIndex(org.apache.xmlbeans.XmlInt occurrenceIDsIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OCCURRENCEIDSINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OCCURRENCEIDSINDEX$2);
            }
            target.set(occurrenceIDsIndex);
        }
    }
    
    /**
     * Unsets the "OccurrenceIDsIndex" element
     */
    public void unsetOccurrenceIDsIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OCCURRENCEIDSINDEX$2, 0);
        }
    }
}
