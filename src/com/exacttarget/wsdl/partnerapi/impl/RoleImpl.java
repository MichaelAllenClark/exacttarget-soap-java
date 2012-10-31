/*
 * XML Type:  Role
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Role
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Role(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class RoleImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Role
{
    
    public RoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName ISPRIVATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsPrivate");
    private static final javax.xml.namespace.QName ISSYSTEMDEFINED$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSystemDefined");
    private static final javax.xml.namespace.QName FORCEINHERITANCE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ForceInheritance");
    private static final javax.xml.namespace.QName PERMISSIONSETS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PermissionSets");
    private static final javax.xml.namespace.QName PERMISSIONS$12 = 
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
     * Gets the "IsPrivate" element
     */
    public boolean getIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIVATE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsPrivate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsPrivate" element
     */
    public boolean isSetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIVATE$4) != 0;
        }
    }
    
    /**
     * Sets the "IsPrivate" element
     */
    public void setIsPrivate(boolean isPrivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPRIVATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPRIVATE$4);
            }
            target.setBooleanValue(isPrivate);
        }
    }
    
    /**
     * Sets (as xml) the "IsPrivate" element
     */
    public void xsetIsPrivate(org.apache.xmlbeans.XmlBoolean isPrivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISPRIVATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISPRIVATE$4);
            }
            target.set(isPrivate);
        }
    }
    
    /**
     * Unsets the "IsPrivate" element
     */
    public void unsetIsPrivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIVATE$4, 0);
        }
    }
    
    /**
     * Gets the "IsSystemDefined" element
     */
    public boolean getIsSystemDefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSYSTEMDEFINED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSystemDefined" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSystemDefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSYSTEMDEFINED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSystemDefined" element
     */
    public boolean isSetIsSystemDefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSYSTEMDEFINED$6) != 0;
        }
    }
    
    /**
     * Sets the "IsSystemDefined" element
     */
    public void setIsSystemDefined(boolean isSystemDefined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSYSTEMDEFINED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSYSTEMDEFINED$6);
            }
            target.setBooleanValue(isSystemDefined);
        }
    }
    
    /**
     * Sets (as xml) the "IsSystemDefined" element
     */
    public void xsetIsSystemDefined(org.apache.xmlbeans.XmlBoolean isSystemDefined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSYSTEMDEFINED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSYSTEMDEFINED$6);
            }
            target.set(isSystemDefined);
        }
    }
    
    /**
     * Unsets the "IsSystemDefined" element
     */
    public void unsetIsSystemDefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSYSTEMDEFINED$6, 0);
        }
    }
    
    /**
     * Gets the "ForceInheritance" element
     */
    public boolean getForceInheritance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORCEINHERITANCE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForceInheritance" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetForceInheritance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FORCEINHERITANCE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ForceInheritance" element
     */
    public boolean isSetForceInheritance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORCEINHERITANCE$8) != 0;
        }
    }
    
    /**
     * Sets the "ForceInheritance" element
     */
    public void setForceInheritance(boolean forceInheritance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORCEINHERITANCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORCEINHERITANCE$8);
            }
            target.setBooleanValue(forceInheritance);
        }
    }
    
    /**
     * Sets (as xml) the "ForceInheritance" element
     */
    public void xsetForceInheritance(org.apache.xmlbeans.XmlBoolean forceInheritance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FORCEINHERITANCE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FORCEINHERITANCE$8);
            }
            target.set(forceInheritance);
        }
    }
    
    /**
     * Unsets the "ForceInheritance" element
     */
    public void unsetForceInheritance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORCEINHERITANCE$8, 0);
        }
    }
    
    /**
     * Gets the "PermissionSets" element
     */
    public com.exacttarget.wsdl.partnerapi.Role.PermissionSets getPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.PermissionSets)get_store().find_element_user(PERMISSIONSETS$10, 0);
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
            return get_store().count_elements(PERMISSIONSETS$10) != 0;
        }
    }
    
    /**
     * Sets the "PermissionSets" element
     */
    public void setPermissionSets(com.exacttarget.wsdl.partnerapi.Role.PermissionSets permissionSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.PermissionSets)get_store().find_element_user(PERMISSIONSETS$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Role.PermissionSets)get_store().add_element_user(PERMISSIONSETS$10);
            }
            target.set(permissionSets);
        }
    }
    
    /**
     * Appends and returns a new empty "PermissionSets" element
     */
    public com.exacttarget.wsdl.partnerapi.Role.PermissionSets addNewPermissionSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.PermissionSets target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.PermissionSets)get_store().add_element_user(PERMISSIONSETS$10);
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
            get_store().remove_element(PERMISSIONSETS$10, 0);
        }
    }
    
    /**
     * Gets the "Permissions" element
     */
    public com.exacttarget.wsdl.partnerapi.Role.Permissions getPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.Permissions)get_store().find_element_user(PERMISSIONS$12, 0);
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
            return get_store().count_elements(PERMISSIONS$12) != 0;
        }
    }
    
    /**
     * Sets the "Permissions" element
     */
    public void setPermissions(com.exacttarget.wsdl.partnerapi.Role.Permissions permissions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.Permissions)get_store().find_element_user(PERMISSIONS$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Role.Permissions)get_store().add_element_user(PERMISSIONS$12);
            }
            target.set(permissions);
        }
    }
    
    /**
     * Appends and returns a new empty "Permissions" element
     */
    public com.exacttarget.wsdl.partnerapi.Role.Permissions addNewPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Role.Permissions target = null;
            target = (com.exacttarget.wsdl.partnerapi.Role.Permissions)get_store().add_element_user(PERMISSIONS$12);
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
            get_store().remove_element(PERMISSIONS$12, 0);
        }
    }
    /**
     * An XML PermissionSets(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PermissionSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Role.PermissionSets
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
    public static class PermissionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Role.Permissions
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
