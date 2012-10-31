/*
 * XML Type:  Brand
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Brand
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Brand(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class BrandImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Brand
{
    
    public BrandImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BrandID");
    private static final javax.xml.namespace.QName LABEL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Label");
    private static final javax.xml.namespace.QName COMMENT$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Comment");
    private static final javax.xml.namespace.QName BRANDTAGS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BrandTags");
    
    
    /**
     * Gets the "BrandID" element
     */
    public int getBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$0, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$0, 0);
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
            return get_store().count_elements(BRANDID$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDID$0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BRANDID$0);
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
            get_store().remove_element(BRANDID$0, 0);
        }
    }
    
    /**
     * Gets the "Label" element
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Label" element
     */
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Label" element
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$2) != 0;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABEL$2);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "Label" element
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABEL$2);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "Label" element
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$2, 0);
        }
    }
    
    /**
     * Gets the "Comment" element
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comment" element
     */
    public org.apache.xmlbeans.XmlString xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "Comment" element
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$4);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "Comment" element
     */
    public void xsetComment(org.apache.xmlbeans.XmlString comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$4);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "Comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$4, 0);
        }
    }
    
    /**
     * Gets array of all "BrandTags" elements
     */
    public com.exacttarget.wsdl.partnerapi.BrandTag[] getBrandTagsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRANDTAGS$6, targetList);
            com.exacttarget.wsdl.partnerapi.BrandTag[] result = new com.exacttarget.wsdl.partnerapi.BrandTag[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BrandTags" element
     */
    public com.exacttarget.wsdl.partnerapi.BrandTag getBrandTagsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().find_element_user(BRANDTAGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BrandTags" element
     */
    public boolean isNilBrandTagsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().find_element_user(BRANDTAGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BrandTags" element
     */
    public int sizeOfBrandTagsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDTAGS$6);
        }
    }
    
    /**
     * Sets array of all "BrandTags" element
     */
    public void setBrandTagsArray(com.exacttarget.wsdl.partnerapi.BrandTag[] brandTagsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brandTagsArray, BRANDTAGS$6);
        }
    }
    
    /**
     * Sets ith "BrandTags" element
     */
    public void setBrandTagsArray(int i, com.exacttarget.wsdl.partnerapi.BrandTag brandTags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().find_element_user(BRANDTAGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(brandTags);
        }
    }
    
    /**
     * Nils the ith "BrandTags" element
     */
    public void setNilBrandTagsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().find_element_user(BRANDTAGS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BrandTags" element
     */
    public com.exacttarget.wsdl.partnerapi.BrandTag insertNewBrandTags(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().insert_element_user(BRANDTAGS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BrandTags" element
     */
    public com.exacttarget.wsdl.partnerapi.BrandTag addNewBrandTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BrandTag target = null;
            target = (com.exacttarget.wsdl.partnerapi.BrandTag)get_store().add_element_user(BRANDTAGS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "BrandTags" element
     */
    public void removeBrandTags(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDTAGS$6, i);
        }
    }
}
