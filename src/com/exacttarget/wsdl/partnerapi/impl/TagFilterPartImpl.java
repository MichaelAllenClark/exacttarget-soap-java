/*
 * XML Type:  TagFilterPart
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TagFilterPart
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TagFilterPart(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TagFilterPartImpl extends com.exacttarget.wsdl.partnerapi.impl.FilterPartImpl implements com.exacttarget.wsdl.partnerapi.TagFilterPart
{
    
    public TagFilterPartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Tags");
    
    
    /**
     * Gets the "Tags" element
     */
    public com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags getTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags target = null;
            target = (com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags)get_store().find_element_user(TAGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Tags" element
     */
    public boolean isSetTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAGS$0) != 0;
        }
    }
    
    /**
     * Sets the "Tags" element
     */
    public void setTags(com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags tags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags target = null;
            target = (com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags)get_store().find_element_user(TAGS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags)get_store().add_element_user(TAGS$0);
            }
            target.set(tags);
        }
    }
    
    /**
     * Appends and returns a new empty "Tags" element
     */
    public com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags addNewTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags target = null;
            target = (com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags)get_store().add_element_user(TAGS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Tags" element
     */
    public void unsetTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAGS$0, 0);
        }
    }
    /**
     * An XML Tags(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class TagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.TagFilterPart.Tags
    {
        
        public TagsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TAG$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Tag");
        
        
        /**
         * Gets array of all "Tag" elements
         */
        public java.lang.String[] getTagArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAG$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "Tag" element
         */
        public java.lang.String getTagArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAG$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "Tag" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetTagArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TAG$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "Tag" element
         */
        public org.apache.xmlbeans.XmlString xgetTagArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAG$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "Tag" element
         */
        public int sizeOfTagArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TAG$0);
            }
        }
        
        /**
         * Sets array of all "Tag" element
         */
        public void setTagArray(java.lang.String[] tagArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tagArray, TAG$0);
            }
        }
        
        /**
         * Sets ith "Tag" element
         */
        public void setTagArray(int i, java.lang.String tag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAG$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(tag);
            }
        }
        
        /**
         * Sets (as xml) array of all "Tag" element
         */
        public void xsetTagArray(org.apache.xmlbeans.XmlString[]tagArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tagArray, TAG$0);
            }
        }
        
        /**
         * Sets (as xml) ith "Tag" element
         */
        public void xsetTagArray(int i, org.apache.xmlbeans.XmlString tag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAG$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tag);
            }
        }
        
        /**
         * Inserts the value as the ith "Tag" element
         */
        public void insertTag(int i, java.lang.String tag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TAG$0, i);
                target.setStringValue(tag);
            }
        }
        
        /**
         * Appends the value as the last "Tag" element
         */
        public void addTag(java.lang.String tag)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAG$0);
                target.setStringValue(tag);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Tag" element
         */
        public org.apache.xmlbeans.XmlString insertNewTag(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TAG$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Tag" element
         */
        public org.apache.xmlbeans.XmlString addNewTag()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAG$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Tag" element
         */
        public void removeTag(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TAG$0, i);
            }
        }
    }
}
