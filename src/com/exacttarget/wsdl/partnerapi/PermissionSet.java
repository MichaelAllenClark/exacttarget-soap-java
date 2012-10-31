/*
 * XML Type:  PermissionSet
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PermissionSet
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML PermissionSet(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface PermissionSet extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PermissionSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("permissionset1515type");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "IsAllowed" element
     */
    boolean getIsAllowed();
    
    /**
     * Gets (as xml) the "IsAllowed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsAllowed();
    
    /**
     * True if has "IsAllowed" element
     */
    boolean isSetIsAllowed();
    
    /**
     * Sets the "IsAllowed" element
     */
    void setIsAllowed(boolean isAllowed);
    
    /**
     * Sets (as xml) the "IsAllowed" element
     */
    void xsetIsAllowed(org.apache.xmlbeans.XmlBoolean isAllowed);
    
    /**
     * Unsets the "IsAllowed" element
     */
    void unsetIsAllowed();
    
    /**
     * Gets the "IsDenied" element
     */
    boolean getIsDenied();
    
    /**
     * Gets (as xml) the "IsDenied" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDenied();
    
    /**
     * True if has "IsDenied" element
     */
    boolean isSetIsDenied();
    
    /**
     * Sets the "IsDenied" element
     */
    void setIsDenied(boolean isDenied);
    
    /**
     * Sets (as xml) the "IsDenied" element
     */
    void xsetIsDenied(org.apache.xmlbeans.XmlBoolean isDenied);
    
    /**
     * Unsets the "IsDenied" element
     */
    void unsetIsDenied();
    
    /**
     * Gets the "PermissionSets" element
     */
    com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets getPermissionSets();
    
    /**
     * True if has "PermissionSets" element
     */
    boolean isSetPermissionSets();
    
    /**
     * Sets the "PermissionSets" element
     */
    void setPermissionSets(com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets permissionSets);
    
    /**
     * Appends and returns a new empty "PermissionSets" element
     */
    com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets addNewPermissionSets();
    
    /**
     * Unsets the "PermissionSets" element
     */
    void unsetPermissionSets();
    
    /**
     * Gets the "Permissions" element
     */
    com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions getPermissions();
    
    /**
     * True if has "Permissions" element
     */
    boolean isSetPermissions();
    
    /**
     * Sets the "Permissions" element
     */
    void setPermissions(com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions permissions);
    
    /**
     * Appends and returns a new empty "Permissions" element
     */
    com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions addNewPermissions();
    
    /**
     * Unsets the "Permissions" element
     */
    void unsetPermissions();
    
    /**
     * An XML PermissionSets(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface PermissionSets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PermissionSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("permissionsets2419elemtype");
        
        /**
         * Gets array of all "PermissionSet" elements
         */
        com.exacttarget.wsdl.partnerapi.PermissionSet[] getPermissionSetArray();
        
        /**
         * Gets ith "PermissionSet" element
         */
        com.exacttarget.wsdl.partnerapi.PermissionSet getPermissionSetArray(int i);
        
        /**
         * Returns number of "PermissionSet" element
         */
        int sizeOfPermissionSetArray();
        
        /**
         * Sets array of all "PermissionSet" element
         */
        void setPermissionSetArray(com.exacttarget.wsdl.partnerapi.PermissionSet[] permissionSetArray);
        
        /**
         * Sets ith "PermissionSet" element
         */
        void setPermissionSetArray(int i, com.exacttarget.wsdl.partnerapi.PermissionSet permissionSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PermissionSet" element
         */
        com.exacttarget.wsdl.partnerapi.PermissionSet insertNewPermissionSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PermissionSet" element
         */
        com.exacttarget.wsdl.partnerapi.PermissionSet addNewPermissionSet();
        
        /**
         * Removes the ith "PermissionSet" element
         */
        void removePermissionSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets newInstance() {
              return (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.PermissionSet.PermissionSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Permissions(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Permissions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Permissions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("permissions2645elemtype");
        
        /**
         * Gets array of all "Permission" elements
         */
        com.exacttarget.wsdl.partnerapi.Permission[] getPermissionArray();
        
        /**
         * Gets ith "Permission" element
         */
        com.exacttarget.wsdl.partnerapi.Permission getPermissionArray(int i);
        
        /**
         * Returns number of "Permission" element
         */
        int sizeOfPermissionArray();
        
        /**
         * Sets array of all "Permission" element
         */
        void setPermissionArray(com.exacttarget.wsdl.partnerapi.Permission[] permissionArray);
        
        /**
         * Sets ith "Permission" element
         */
        void setPermissionArray(int i, com.exacttarget.wsdl.partnerapi.Permission permission);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Permission" element
         */
        com.exacttarget.wsdl.partnerapi.Permission insertNewPermission(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Permission" element
         */
        com.exacttarget.wsdl.partnerapi.Permission addNewPermission();
        
        /**
         * Removes the ith "Permission" element
         */
        void removePermission(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions newInstance() {
              return (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.PermissionSet.Permissions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.PermissionSet newInstance() {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PermissionSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PermissionSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
