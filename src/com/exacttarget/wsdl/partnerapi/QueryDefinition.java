/*
 * XML Type:  QueryDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML QueryDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface QueryDefinition extends com.exacttarget.wsdl.partnerapi.InteractionDefinition
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("querydefinition81adtype");
    
    /**
     * Gets the "QueryText" element
     */
    java.lang.String getQueryText();
    
    /**
     * Gets (as xml) the "QueryText" element
     */
    org.apache.xmlbeans.XmlString xgetQueryText();
    
    /**
     * True if has "QueryText" element
     */
    boolean isSetQueryText();
    
    /**
     * Sets the "QueryText" element
     */
    void setQueryText(java.lang.String queryText);
    
    /**
     * Sets (as xml) the "QueryText" element
     */
    void xsetQueryText(org.apache.xmlbeans.XmlString queryText);
    
    /**
     * Unsets the "QueryText" element
     */
    void unsetQueryText();
    
    /**
     * Gets the "TargetType" element
     */
    java.lang.String getTargetType();
    
    /**
     * Gets (as xml) the "TargetType" element
     */
    org.apache.xmlbeans.XmlString xgetTargetType();
    
    /**
     * True if has "TargetType" element
     */
    boolean isSetTargetType();
    
    /**
     * Sets the "TargetType" element
     */
    void setTargetType(java.lang.String targetType);
    
    /**
     * Sets (as xml) the "TargetType" element
     */
    void xsetTargetType(org.apache.xmlbeans.XmlString targetType);
    
    /**
     * Unsets the "TargetType" element
     */
    void unsetTargetType();
    
    /**
     * Gets the "DataExtensionTarget" element
     */
    com.exacttarget.wsdl.partnerapi.InteractionBaseObject getDataExtensionTarget();
    
    /**
     * True if has "DataExtensionTarget" element
     */
    boolean isSetDataExtensionTarget();
    
    /**
     * Sets the "DataExtensionTarget" element
     */
    void setDataExtensionTarget(com.exacttarget.wsdl.partnerapi.InteractionBaseObject dataExtensionTarget);
    
    /**
     * Appends and returns a new empty "DataExtensionTarget" element
     */
    com.exacttarget.wsdl.partnerapi.InteractionBaseObject addNewDataExtensionTarget();
    
    /**
     * Unsets the "DataExtensionTarget" element
     */
    void unsetDataExtensionTarget();
    
    /**
     * Gets the "TargetUpdateType" element
     */
    java.lang.String getTargetUpdateType();
    
    /**
     * Gets (as xml) the "TargetUpdateType" element
     */
    org.apache.xmlbeans.XmlString xgetTargetUpdateType();
    
    /**
     * True if has "TargetUpdateType" element
     */
    boolean isSetTargetUpdateType();
    
    /**
     * Sets the "TargetUpdateType" element
     */
    void setTargetUpdateType(java.lang.String targetUpdateType);
    
    /**
     * Sets (as xml) the "TargetUpdateType" element
     */
    void xsetTargetUpdateType(org.apache.xmlbeans.XmlString targetUpdateType);
    
    /**
     * Unsets the "TargetUpdateType" element
     */
    void unsetTargetUpdateType();
    
    /**
     * Gets the "FileSpec" element
     */
    java.lang.String getFileSpec();
    
    /**
     * Gets (as xml) the "FileSpec" element
     */
    org.apache.xmlbeans.XmlString xgetFileSpec();
    
    /**
     * True if has "FileSpec" element
     */
    boolean isSetFileSpec();
    
    /**
     * Sets the "FileSpec" element
     */
    void setFileSpec(java.lang.String fileSpec);
    
    /**
     * Sets (as xml) the "FileSpec" element
     */
    void xsetFileSpec(org.apache.xmlbeans.XmlString fileSpec);
    
    /**
     * Unsets the "FileSpec" element
     */
    void unsetFileSpec();
    
    /**
     * Gets the "FileType" element
     */
    java.lang.String getFileType();
    
    /**
     * Gets (as xml) the "FileType" element
     */
    org.apache.xmlbeans.XmlString xgetFileType();
    
    /**
     * True if has "FileType" element
     */
    boolean isSetFileType();
    
    /**
     * Sets the "FileType" element
     */
    void setFileType(java.lang.String fileType);
    
    /**
     * Sets (as xml) the "FileType" element
     */
    void xsetFileType(org.apache.xmlbeans.XmlString fileType);
    
    /**
     * Unsets the "FileType" element
     */
    void unsetFileType();
    
    /**
     * Gets the "Status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "Status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "Status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "CategoryID" element
     */
    int getCategoryID();
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    org.apache.xmlbeans.XmlInt xgetCategoryID();
    
    /**
     * True if has "CategoryID" element
     */
    boolean isSetCategoryID();
    
    /**
     * Sets the "CategoryID" element
     */
    void setCategoryID(int categoryID);
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID);
    
    /**
     * Unsets the "CategoryID" element
     */
    void unsetCategoryID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.QueryDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.QueryDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
