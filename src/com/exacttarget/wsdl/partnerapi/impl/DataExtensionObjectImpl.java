/*
 * XML Type:  DataExtensionObject
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtensionObject
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DataExtensionObject(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DataExtensionObjectImpl extends com.exacttarget.wsdl.partnerapi.impl.ObjectExtensionImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionObject
{
    
    public DataExtensionObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName KEYS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Keys");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Keys" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys getKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys)get_store().find_element_user(KEYS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Keys" element
     */
    public boolean isSetKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYS$2) != 0;
        }
    }
    
    /**
     * Sets the "Keys" element
     */
    public void setKeys(com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys keys)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys)get_store().find_element_user(KEYS$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys)get_store().add_element_user(KEYS$2);
            }
            target.set(keys);
        }
    }
    
    /**
     * Appends and returns a new empty "Keys" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys addNewKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys)get_store().add_element_user(KEYS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Keys" element
     */
    public void unsetKeys()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYS$2, 0);
        }
    }
    /**
     * An XML Keys(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class KeysImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionObject.Keys
    {
        
        public KeysImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Key");
        
        
        /**
         * Gets array of all "Key" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEY$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Key" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getKeyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(KEY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Key" element
         */
        public int sizeOfKeyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEY$0);
            }
        }
        
        /**
         * Sets array of all "Key" element
         */
        public void setKeyArray(com.exacttarget.wsdl.partnerapi.APIProperty[] keyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keyArray, KEY$0);
            }
        }
        
        /**
         * Sets ith "Key" element
         */
        public void setKeyArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(KEY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(key);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Key" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewKey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(KEY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Key" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(KEY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Key" element
         */
        public void removeKey(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEY$0, i);
            }
        }
    }
}
