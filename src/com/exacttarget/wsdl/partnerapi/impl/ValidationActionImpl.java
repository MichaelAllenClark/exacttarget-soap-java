/*
 * XML Type:  ValidationAction
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ValidationAction
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ValidationAction(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ValidationActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ValidationAction
{
    
    public ValidationActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationType");
    private static final javax.xml.namespace.QName VALIDATIONOPTIONS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationOptions");
    
    
    /**
     * Gets the "ValidationType" element
     */
    public java.lang.String getValidationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidationType" element
     */
    public org.apache.xmlbeans.XmlString xgetValidationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDATIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidationType" element
     */
    public boolean isSetValidationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "ValidationType" element
     */
    public void setValidationType(java.lang.String validationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATIONTYPE$0);
            }
            target.setStringValue(validationType);
        }
    }
    
    /**
     * Sets (as xml) the "ValidationType" element
     */
    public void xsetValidationType(org.apache.xmlbeans.XmlString validationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALIDATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALIDATIONTYPE$0);
            }
            target.set(validationType);
        }
    }
    
    /**
     * Unsets the "ValidationType" element
     */
    public void unsetValidationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "ValidationOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions getValidationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions)get_store().find_element_user(VALIDATIONOPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidationOptions" element
     */
    public boolean isSetValidationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONOPTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "ValidationOptions" element
     */
    public void setValidationOptions(com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions validationOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions)get_store().find_element_user(VALIDATIONOPTIONS$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions)get_store().add_element_user(VALIDATIONOPTIONS$2);
            }
            target.set(validationOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions addNewValidationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions)get_store().add_element_user(VALIDATIONOPTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidationOptions" element
     */
    public void unsetValidationOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONOPTIONS$2, 0);
        }
    }
    /**
     * An XML ValidationOptions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValidationOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ValidationAction.ValidationOptions
    {
        
        public ValidationOptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDATIONOPTION$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationOption");
        
        
        /**
         * Gets array of all "ValidationOption" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getValidationOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATIONOPTION$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ValidationOption" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getValidationOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(VALIDATIONOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ValidationOption" element
         */
        public int sizeOfValidationOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATIONOPTION$0);
            }
        }
        
        /**
         * Sets array of all "ValidationOption" element
         */
        public void setValidationOptionArray(com.exacttarget.wsdl.partnerapi.APIProperty[] validationOptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validationOptionArray, VALIDATIONOPTION$0);
            }
        }
        
        /**
         * Sets ith "ValidationOption" element
         */
        public void setValidationOptionArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty validationOption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(VALIDATIONOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validationOption);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValidationOption" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewValidationOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(VALIDATIONOPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValidationOption" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewValidationOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(VALIDATIONOPTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ValidationOption" element
         */
        public void removeValidationOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATIONOPTION$0, i);
            }
        }
    }
}
