/*
 * XML Type:  SimpleFilterPart
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SimpleFilterPart
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SimpleFilterPart(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SimpleFilterPart extends com.exacttarget.wsdl.partnerapi.FilterPart
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleFilterPart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("simplefilterpart1e59type");
    
    /**
     * Gets the "Property" element
     */
    java.lang.String getProperty();
    
    /**
     * Gets (as xml) the "Property" element
     */
    org.apache.xmlbeans.XmlString xgetProperty();
    
    /**
     * Sets the "Property" element
     */
    void setProperty(java.lang.String property);
    
    /**
     * Sets (as xml) the "Property" element
     */
    void xsetProperty(org.apache.xmlbeans.XmlString property);
    
    /**
     * Gets the "SimpleOperator" element
     */
    com.exacttarget.wsdl.partnerapi.SimpleOperators.Enum getSimpleOperator();
    
    /**
     * Gets (as xml) the "SimpleOperator" element
     */
    com.exacttarget.wsdl.partnerapi.SimpleOperators xgetSimpleOperator();
    
    /**
     * Sets the "SimpleOperator" element
     */
    void setSimpleOperator(com.exacttarget.wsdl.partnerapi.SimpleOperators.Enum simpleOperator);
    
    /**
     * Sets (as xml) the "SimpleOperator" element
     */
    void xsetSimpleOperator(com.exacttarget.wsdl.partnerapi.SimpleOperators simpleOperator);
    
    /**
     * Gets array of all "Value" elements
     */
    java.lang.String[] getValueArray();
    
    /**
     * Gets ith "Value" element
     */
    java.lang.String getValueArray(int i);
    
    /**
     * Gets (as xml) array of all "Value" elements
     */
    org.apache.xmlbeans.XmlString[] xgetValueArray();
    
    /**
     * Gets (as xml) ith "Value" element
     */
    org.apache.xmlbeans.XmlString xgetValueArray(int i);
    
    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "Value" element
     */
    void setValueArray(java.lang.String[] valueArray);
    
    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, java.lang.String value);
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    void xsetValueArray(org.apache.xmlbeans.XmlString[] valueArray);
    
    /**
     * Sets (as xml) ith "Value" element
     */
    void xsetValueArray(int i, org.apache.xmlbeans.XmlString value);
    
    /**
     * Inserts the value as the ith "Value" element
     */
    void insertValue(int i, java.lang.String value);
    
    /**
     * Appends the value as the last "Value" element
     */
    void addValue(java.lang.String value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.apache.xmlbeans.XmlString insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.apache.xmlbeans.XmlString addNewValue();
    
    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
    
    /**
     * Gets array of all "DateValue" elements
     */
    java.util.Calendar[] getDateValue1Array();
    
    /**
     * Gets ith "DateValue" element
     */
    java.util.Calendar getDateValue1Array(int i);
    
    /**
     * Gets (as xml) array of all "DateValue" elements
     */
    org.apache.xmlbeans.XmlDateTime[] xgetDateValue1Array();
    
    /**
     * Gets (as xml) ith "DateValue" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateValue1Array(int i);
    
    /**
     * Returns number of "DateValue" element
     */
    int sizeOfDateValue1Array();
    
    /**
     * Sets array of all "DateValue" element
     */
    void setDateValue1Array(java.util.Calendar[] dateValue1Array);
    
    /**
     * Sets ith "DateValue" element
     */
    void setDateValue1Array(int i, java.util.Calendar dateValue1);
    
    /**
     * Sets (as xml) array of all "DateValue" element
     */
    void xsetDateValue1Array(org.apache.xmlbeans.XmlDateTime[] dateValue1Array);
    
    /**
     * Sets (as xml) ith "DateValue" element
     */
    void xsetDateValue1Array(int i, org.apache.xmlbeans.XmlDateTime dateValue1);
    
    /**
     * Inserts the value as the ith "DateValue" element
     */
    void insertDateValue1(int i, java.util.Calendar dateValue1);
    
    /**
     * Appends the value as the last "DateValue" element
     */
    void addDateValue1(java.util.Calendar dateValue1);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DateValue" element
     */
    org.apache.xmlbeans.XmlDateTime insertNewDateValue1(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DateValue" element
     */
    org.apache.xmlbeans.XmlDateTime addNewDateValue1();
    
    /**
     * Removes the ith "DateValue" element
     */
    void removeDateValue1(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SimpleFilterPart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SimpleFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
