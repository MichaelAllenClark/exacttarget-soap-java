/*
 * XML Type:  SuppressionListData
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListData
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SuppressionListData(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SuppressionListDataImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListData
{
    
    public SuppressionListDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Properties");
    
    
    /**
     * Gets the "Properties" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$0) != 0;
        }
    }
    
    /**
     * Sets the "Properties" element
     */
    public void setProperties(com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties)get_store().add_element_user(PROPERTIES$0);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "Properties" element
     */
    public com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties)get_store().add_element_user(PROPERTIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$0, 0);
        }
    }
    /**
     * An XML Properties(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListData.Properties
    {
        
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Property");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(com.exacttarget.wsdl.partnerapi.APIProperty[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
    }
}
