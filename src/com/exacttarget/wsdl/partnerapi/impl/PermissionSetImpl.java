/*
 * XML Type:  PermissionSet
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PermissionSet
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PermissionSet(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PermissionSetImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.PermissionSet
{
    
    public PermissionSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName ISALLOWED$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAllowed");
    private static final javax.xml.namespace.QName ISDENIED$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsDenied");
    private static final javax.xml.namespace.QName PERMISSIONSETS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PermissionSets");
    private static final javax.xml.namespace.QName PERMISSIONS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Permissions");
    
    
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
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "IsAllowed" element
     */
    public boolean getIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALLOWED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAllowed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALLOWED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAllowed" element
     */
    public boolean isSetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISALLOWED$4) != 0;
        }
    }
    
    /**
     * Sets the "IsAllowed" element
     */
    public void setIsAllowed(boolean isAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALLOWED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISALLOWED$4);
            }
            target.setBooleanValue(isAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "IsAllowed" element
     */
    public void xsetIsAllowed(org.apache.xmlbeans.XmlBoolean isAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALLOWED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISALLOWED$4);
            }
            target.set(isAllowed);
        }
    }
    
    /**
     * Unsets the "IsAllowed" element
     */
    public void unsetIsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISALLOWED$4, 0);
        }
    }
    
    /**
     * Gets the "IsDenied" element
     */
    public boolean getIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDENIED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsDenied" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDENIED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsDenied" element
     */
    public boolean isSetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDENIED$6) != 0;
        }
    }
    
    /**
     * Sets the "IsDenied" element
     */
    public void setIsDenied(boolean isDenied)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISDENIED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISDENIED$6);
            }
            target.setBooleanValue(isDenied);
        }
    }
    
    /**
     * Sets (as xml) the "IsDenied" element
     */
    public void xsetIsDenied(org.apache.xmlbeans.XmlBoolean isDenied)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISDENIED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISDENIED$6);
            }
            target.set(isDenied);
        }
    }
    
    /**
     * Unsets the "IsDenied" element
     */
    public void unsetIsDenied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDENIED$6, 0);
        }
    }
    
    /**
     * Gets the "PermissionSets" element
     */
    public com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets getPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets)get_store().find_element_user(PERMISSIONSETS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PermissionSets" element
     */
    public boolean isSetPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMISSIONSETS$8) != 0;
        }
    }
    
    /**
     * Sets the "PermissionSets" element
     */
    public void setPermissionSets(com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets permissionSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets)get_store().find_element_user(PERMISSIONSETS$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets)get_store().add_element_user(PERMISSIONSETS$8);
            }
            target.set(permissionSets);
        }
    }
    
    /**
     * Appends and returns a new empty "PermissionSets" element
     */
    public com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets addNewPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets)get_store().add_element_user(PERMISSIONSETS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PermissionSets" element
     */
    public void unsetPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMISSIONSETS$8, 0);
        }
    }
    
    /**
     * Gets the "Permissions" element
     */
    public com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions getPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions)get_store().find_element_user(PERMISSIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Permissions" element
     */
    public boolean isSetPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMISSIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "Permissions" element
     */
    public void setPermissions(com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions permissions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions)get_store().find_element_user(PERMISSIONS$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions)get_store().add_element_user(PERMISSIONS$10);
            }
            target.set(permissions);
        }
    }
    
    /**
     * Appends and returns a new empty "Permissions" element
     */
    public com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions addNewPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions)get_store().add_element_user(PERMISSIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Permissions" element
     */
    public void unsetPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMISSIONS$10, 0);
        }
    }
    /**
     * An XML PermissionSets(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PermissionSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets
    {
        
        public PermissionSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMISSIONSET$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PermissionSet");
        
        
        /**
         * Gets array of all "PermissionSet" elements
         */
        public com.exacttarget.wsdl.partnerapi.PermissionSet[] getPermissionSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERMISSIONSET$0, targetList);
                com.exacttarget.wsdl.partnerapi.PermissionSet[] result = new com.exacttarget.wsdl.partnerapi.PermissionSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PermissionSet" element
         */
        public com.exacttarget.wsdl.partnerapi.PermissionSet getPermissionSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PermissionSet target = null;
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet)get_store().find_element_user(PERMISSIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PermissionSet" element
         */
        public int sizeOfPermissionSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERMISSIONSET$0);
            }
        }
        
        /**
         * Sets array of all "PermissionSet" element
         */
        public void setPermissionSetArray(com.exacttarget.wsdl.partnerapi.PermissionSet[] permissionSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(permissionSetArray, PERMISSIONSET$0);
            }
        }
        
        /**
         * Sets ith "PermissionSet" element
         */
        public void setPermissionSetArray(int i, com.exacttarget.wsdl.partnerapi.PermissionSet permissionSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PermissionSet target = null;
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet)get_store().find_element_user(PERMISSIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(permissionSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PermissionSet" element
         */
        public com.exacttarget.wsdl.partnerapi.PermissionSet insertNewPermissionSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PermissionSet target = null;
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet)get_store().insert_element_user(PERMISSIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PermissionSet" element
         */
        public com.exacttarget.wsdl.partnerapi.PermissionSet addNewPermissionSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PermissionSet target = null;
                target = (com.exacttarget.wsdl.partnerapi.PermissionSet)get_store().add_element_user(PERMISSIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PermissionSet" element
         */
        public void removePermissionSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERMISSIONSET$0, i);
            }
        }
    }
    /**
     * An XML Permissions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PermissionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions
    {
        
        public PermissionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMISSION$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Permission");
        
        
        /**
         * Gets array of all "Permission" elements
         */
        public com.exacttarget.wsdl.partnerapi.Permission[] getPermissionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERMISSION$0, targetList);
                com.exacttarget.wsdl.partnerapi.Permission[] result = new com.exacttarget.wsdl.partnerapi.Permission[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Permission" element
         */
        public com.exacttarget.wsdl.partnerapi.Permission getPermissionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Permission target = null;
                target = (com.exacttarget.wsdl.partnerapi.Permission)get_store().find_element_user(PERMISSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Permission" element
         */
        public int sizeOfPermissionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERMISSION$0);
            }
        }
        
        /**
         * Sets array of all "Permission" element
         */
        public void setPermissionArray(com.exacttarget.wsdl.partnerapi.Permission[] permissionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(permissionArray, PERMISSION$0);
            }
        }
        
        /**
         * Sets ith "Permission" element
         */
        public void setPermissionArray(int i, com.exacttarget.wsdl.partnerapi.Permission permission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Permission target = null;
                target = (com.exacttarget.wsdl.partnerapi.Permission)get_store().find_element_user(PERMISSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(permission);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Permission" element
         */
        public com.exacttarget.wsdl.partnerapi.Permission insertNewPermission(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Permission target = null;
                target = (com.exacttarget.wsdl.partnerapi.Permission)get_store().insert_element_user(PERMISSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Permission" element
         */
        public com.exacttarget.wsdl.partnerapi.Permission addNewPermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Permission target = null;
                target = (com.exacttarget.wsdl.partnerapi.Permission)get_store().add_element_user(PERMISSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Permission" element
         */
        public void removePermission(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERMISSION$0, i);
            }
        }
    }
}
