/*
 * XML Type:  ContentValidationTaskResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ContentValidationTaskResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ContentValidationTaskResultImpl extends com.exacttarget.wsdl.partnerapi.impl.TaskResultImpl implements com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult
{
    
    public ContentValidationTaskResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONRESULTS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationResults");
    
    
    /**
     * Gets the "ValidationResults" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults getValidationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults)get_store().find_element_user(VALIDATIONRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidationResults" element
     */
    public boolean isSetValidationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONRESULTS$0) != 0;
        }
    }
    
    /**
     * Sets the "ValidationResults" element
     */
    public void setValidationResults(com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults validationResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults)get_store().find_element_user(VALIDATIONRESULTS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults)get_store().add_element_user(VALIDATIONRESULTS$0);
            }
            target.set(validationResults);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationResults" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults addNewValidationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults)get_store().add_element_user(VALIDATIONRESULTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidationResults" element
     */
    public void unsetValidationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONRESULTS$0, 0);
        }
    }
    /**
     * An XML ValidationResults(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValidationResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ContentValidationTaskResult.ValidationResults
    {
        
        public ValidationResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDATIONRESULT$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationResult");
        
        
        /**
         * Gets array of all "ValidationResult" elements
         */
        public com.exacttarget.wsdl.partnerapi.ValidationResult[] getValidationResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATIONRESULT$0, targetList);
                com.exacttarget.wsdl.partnerapi.ValidationResult[] result = new com.exacttarget.wsdl.partnerapi.ValidationResult[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ValidationResult" element
         */
        public com.exacttarget.wsdl.partnerapi.ValidationResult getValidationResultArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ValidationResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ValidationResult" element
         */
        public int sizeOfValidationResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATIONRESULT$0);
            }
        }
        
        /**
         * Sets array of all "ValidationResult" element
         */
        public void setValidationResultArray(com.exacttarget.wsdl.partnerapi.ValidationResult[] validationResultArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(validationResultArray, VALIDATIONRESULT$0);
            }
        }
        
        /**
         * Sets ith "ValidationResult" element
         */
        public void setValidationResultArray(int i, com.exacttarget.wsdl.partnerapi.ValidationResult validationResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ValidationResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(validationResult);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValidationResult" element
         */
        public com.exacttarget.wsdl.partnerapi.ValidationResult insertNewValidationResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ValidationResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ValidationResult)get_store().insert_element_user(VALIDATIONRESULT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValidationResult" element
         */
        public com.exacttarget.wsdl.partnerapi.ValidationResult addNewValidationResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ValidationResult target = null;
                target = (com.exacttarget.wsdl.partnerapi.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ValidationResult" element
         */
        public void removeValidationResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATIONRESULT$0, i);
            }
        }
    }
}
