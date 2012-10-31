/*
 * XML Type:  AttributeMap
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AttributeMap
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML AttributeMap(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface AttributeMap extends com.exacttarget.wsdl.partnerapi.APIProperty
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("attributemapbe36type");
    
    /**
     * Gets the "EntityName" element
     */
    java.lang.String getEntityName();
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    org.apache.xmlbeans.XmlString xgetEntityName();
    
    /**
     * True if has "EntityName" element
     */
    boolean isSetEntityName();
    
    /**
     * Sets the "EntityName" element
     */
    void setEntityName(java.lang.String entityName);
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
    
    /**
     * Unsets the "EntityName" element
     */
    void unsetEntityName();
    
    /**
     * Gets the "ColumnName" element
     */
    java.lang.String getColumnName();
    
    /**
     * Gets (as xml) the "ColumnName" element
     */
    org.apache.xmlbeans.XmlString xgetColumnName();
    
    /**
     * True if has "ColumnName" element
     */
    boolean isSetColumnName();
    
    /**
     * Sets the "ColumnName" element
     */
    void setColumnName(java.lang.String columnName);
    
    /**
     * Sets (as xml) the "ColumnName" element
     */
    void xsetColumnName(org.apache.xmlbeans.XmlString columnName);
    
    /**
     * Unsets the "ColumnName" element
     */
    void unsetColumnName();
    
    /**
     * Gets the "ColumnNameMappedTo" element
     */
    java.lang.String getColumnNameMappedTo();
    
    /**
     * Gets (as xml) the "ColumnNameMappedTo" element
     */
    org.apache.xmlbeans.XmlString xgetColumnNameMappedTo();
    
    /**
     * True if has "ColumnNameMappedTo" element
     */
    boolean isSetColumnNameMappedTo();
    
    /**
     * Sets the "ColumnNameMappedTo" element
     */
    void setColumnNameMappedTo(java.lang.String columnNameMappedTo);
    
    /**
     * Sets (as xml) the "ColumnNameMappedTo" element
     */
    void xsetColumnNameMappedTo(org.apache.xmlbeans.XmlString columnNameMappedTo);
    
    /**
     * Unsets the "ColumnNameMappedTo" element
     */
    void unsetColumnNameMappedTo();
    
    /**
     * Gets the "EntityNameMappedTo" element
     */
    java.lang.String getEntityNameMappedTo();
    
    /**
     * Gets (as xml) the "EntityNameMappedTo" element
     */
    org.apache.xmlbeans.XmlString xgetEntityNameMappedTo();
    
    /**
     * True if has "EntityNameMappedTo" element
     */
    boolean isSetEntityNameMappedTo();
    
    /**
     * Sets the "EntityNameMappedTo" element
     */
    void setEntityNameMappedTo(java.lang.String entityNameMappedTo);
    
    /**
     * Sets (as xml) the "EntityNameMappedTo" element
     */
    void xsetEntityNameMappedTo(org.apache.xmlbeans.XmlString entityNameMappedTo);
    
    /**
     * Unsets the "EntityNameMappedTo" element
     */
    void unsetEntityNameMappedTo();
    
    /**
     * Gets array of all "AdditionalData" elements
     */
    com.exacttarget.wsdl.partnerapi.APIProperty[] getAdditionalDataArray();
    
    /**
     * Gets ith "AdditionalData" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty getAdditionalDataArray(int i);
    
    /**
     * Returns number of "AdditionalData" element
     */
    int sizeOfAdditionalDataArray();
    
    /**
     * Sets array of all "AdditionalData" element
     */
    void setAdditionalDataArray(com.exacttarget.wsdl.partnerapi.APIProperty[] additionalDataArray);
    
    /**
     * Sets ith "AdditionalData" element
     */
    void setAdditionalDataArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty additionalData);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AdditionalData" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty insertNewAdditionalData(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AdditionalData" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty addNewAdditionalData();
    
    /**
     * Removes the ith "AdditionalData" element
     */
    void removeAdditionalData(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.AttributeMap newInstance() {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AttributeMap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AttributeMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
