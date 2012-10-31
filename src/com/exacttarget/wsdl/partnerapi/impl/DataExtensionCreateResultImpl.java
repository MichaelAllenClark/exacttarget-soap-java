/*
 * XML Type:  DataExtensionCreateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DataExtensionCreateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DataExtensionCreateResultImpl extends com.exacttarget.wsdl.partnerapi.impl.CreateResultImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult
{
    
    public DataExtensionCreateResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORMESSAGE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ErrorMessage");
    private static final javax.xml.namespace.QName KEYERRORS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "KeyErrors");
    private static final javax.xml.namespace.QName VALUEERRORS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValueErrors");
    
    
    /**
     * Gets the "ErrorMessage" element
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorMessage" element
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorMessage" element
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$0);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorMessage" element
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$0);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Unsets the "ErrorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "KeyErrors" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors getKeyErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors)get_store().find_element_user(KEYERRORS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "KeyErrors" element
     */
    public boolean isSetKeyErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYERRORS$2) != 0;
        }
    }
    
    /**
     * Sets the "KeyErrors" element
     */
    public void setKeyErrors(com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors keyErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors)get_store().find_element_user(KEYERRORS$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors)get_store().add_element_user(KEYERRORS$2);
            }
            target.set(keyErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyErrors" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors addNewKeyErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors)get_store().add_element_user(KEYERRORS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "KeyErrors" element
     */
    public void unsetKeyErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYERRORS$2, 0);
        }
    }
    
    /**
     * Gets the "ValueErrors" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors getValueErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors)get_store().find_element_user(VALUEERRORS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValueErrors" element
     */
    public boolean isSetValueErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEERRORS$4) != 0;
        }
    }
    
    /**
     * Sets the "ValueErrors" element
     */
    public void setValueErrors(com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors valueErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors)get_store().find_element_user(VALUEERRORS$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors)get_store().add_element_user(VALUEERRORS$4);
            }
            target.set(valueErrors);
        }
    }
    
    /**
     * Appends and returns a new empty "ValueErrors" element
     */
    public com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors addNewValueErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors)get_store().add_element_user(VALUEERRORS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ValueErrors" element
     */
    public void unsetValueErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEERRORS$4, 0);
        }
    }
    /**
     * An XML KeyErrors(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class KeyErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.KeyErrors
    {
        
        public KeyErrorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYERROR$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "KeyError");
        
        
        /**
         * Gets array of all "KeyError" elements
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError[] getKeyErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYERROR$0, targetList);
                com.exacttarget.wsdl.partnerapi.DataExtensionError[] result = new com.exacttarget.wsdl.partnerapi.DataExtensionError[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "KeyError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError getKeyErrorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().find_element_user(KEYERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "KeyError" element
         */
        public int sizeOfKeyErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYERROR$0);
            }
        }
        
        /**
         * Sets array of all "KeyError" element
         */
        public void setKeyErrorArray(com.exacttarget.wsdl.partnerapi.DataExtensionError[] keyErrorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keyErrorArray, KEYERROR$0);
            }
        }
        
        /**
         * Sets ith "KeyError" element
         */
        public void setKeyErrorArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionError keyError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().find_element_user(KEYERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keyError);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "KeyError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError insertNewKeyError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().insert_element_user(KEYERROR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "KeyError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError addNewKeyError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().add_element_user(KEYERROR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "KeyError" element
         */
        public void removeKeyError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYERROR$0, i);
            }
        }
    }
    /**
     * An XML ValueErrors(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValueErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DataExtensionCreateResult.ValueErrors
    {
        
        public ValueErrorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEERROR$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValueError");
        
        
        /**
         * Gets array of all "ValueError" elements
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError[] getValueErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUEERROR$0, targetList);
                com.exacttarget.wsdl.partnerapi.DataExtensionError[] result = new com.exacttarget.wsdl.partnerapi.DataExtensionError[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ValueError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError getValueErrorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().find_element_user(VALUEERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ValueError" element
         */
        public int sizeOfValueErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUEERROR$0);
            }
        }
        
        /**
         * Sets array of all "ValueError" element
         */
        public void setValueErrorArray(com.exacttarget.wsdl.partnerapi.DataExtensionError[] valueErrorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(valueErrorArray, VALUEERROR$0);
            }
        }
        
        /**
         * Sets ith "ValueError" element
         */
        public void setValueErrorArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionError valueError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().find_element_user(VALUEERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(valueError);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValueError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError insertNewValueError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().insert_element_user(VALUEERROR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValueError" element
         */
        public com.exacttarget.wsdl.partnerapi.DataExtensionError addNewValueError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionError target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionError)get_store().add_element_user(VALUEERROR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ValueError" element
         */
        public void removeValueError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUEERROR$0, i);
            }
        }
    }
}
