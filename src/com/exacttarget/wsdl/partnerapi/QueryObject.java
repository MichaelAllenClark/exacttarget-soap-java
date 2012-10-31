/*
 * XML Type:  QueryObject
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryObject
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML QueryObject(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface QueryObject extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("queryobject9ac1type");
    
    /**
     * Gets the "ObjectType" element
     */
    java.lang.String getObjectType();
    
    /**
     * Gets (as xml) the "ObjectType" element
     */
    org.apache.xmlbeans.XmlString xgetObjectType();
    
    /**
     * Sets the "ObjectType" element
     */
    void setObjectType(java.lang.String objectType);
    
    /**
     * Sets (as xml) the "ObjectType" element
     */
    void xsetObjectType(org.apache.xmlbeans.XmlString objectType);
    
    /**
     * Gets array of all "Properties" elements
     */
    java.lang.String[] getPropertiesArray();
    
    /**
     * Gets ith "Properties" element
     */
    java.lang.String getPropertiesArray(int i);
    
    /**
     * Gets (as xml) array of all "Properties" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPropertiesArray();
    
    /**
     * Gets (as xml) ith "Properties" element
     */
    org.apache.xmlbeans.XmlString xgetPropertiesArray(int i);
    
    /**
     * Returns number of "Properties" element
     */
    int sizeOfPropertiesArray();
    
    /**
     * Sets array of all "Properties" element
     */
    void setPropertiesArray(java.lang.String[] propertiesArray);
    
    /**
     * Sets ith "Properties" element
     */
    void setPropertiesArray(int i, java.lang.String properties);
    
    /**
     * Sets (as xml) array of all "Properties" element
     */
    void xsetPropertiesArray(org.apache.xmlbeans.XmlString[] propertiesArray);
    
    /**
     * Sets (as xml) ith "Properties" element
     */
    void xsetPropertiesArray(int i, org.apache.xmlbeans.XmlString properties);
    
    /**
     * Inserts the value as the ith "Properties" element
     */
    void insertProperties(int i, java.lang.String properties);
    
    /**
     * Appends the value as the last "Properties" element
     */
    void addProperties(java.lang.String properties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Properties" element
     */
    org.apache.xmlbeans.XmlString insertNewProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Properties" element
     */
    org.apache.xmlbeans.XmlString addNewProperties();
    
    /**
     * Removes the ith "Properties" element
     */
    void removeProperties(int i);
    
    /**
     * Gets array of all "Objects" elements
     */
    com.exacttarget.wsdl.partnerapi.QueryObject[] getObjectsArray();
    
    /**
     * Gets ith "Objects" element
     */
    com.exacttarget.wsdl.partnerapi.QueryObject getObjectsArray(int i);
    
    /**
     * Returns number of "Objects" element
     */
    int sizeOfObjectsArray();
    
    /**
     * Sets array of all "Objects" element
     */
    void setObjectsArray(com.exacttarget.wsdl.partnerapi.QueryObject[] objectsArray);
    
    /**
     * Sets ith "Objects" element
     */
    void setObjectsArray(int i, com.exacttarget.wsdl.partnerapi.QueryObject objects);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Objects" element
     */
    com.exacttarget.wsdl.partnerapi.QueryObject insertNewObjects(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Objects" element
     */
    com.exacttarget.wsdl.partnerapi.QueryObject addNewObjects();
    
    /**
     * Removes the ith "Objects" element
     */
    void removeObjects(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.QueryObject newInstance() {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.QueryObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.QueryObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
