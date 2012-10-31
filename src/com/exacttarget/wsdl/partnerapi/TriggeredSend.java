/*
 * XML Type:  TriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML TriggeredSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface TriggeredSend extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriggeredSend.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("triggeredsend9729type");
    
    /**
     * Gets the "TriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSendDefinition();
    
    /**
     * Sets the "TriggeredSendDefinition" element
     */
    void setTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSendDefinition);
    
    /**
     * Appends and returns a new empty "TriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSendDefinition();
    
    /**
     * Gets array of all "Subscribers" elements
     */
    com.exacttarget.wsdl.partnerapi.Subscriber[] getSubscribersArray();
    
    /**
     * Gets ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber getSubscribersArray(int i);
    
    /**
     * Returns number of "Subscribers" element
     */
    int sizeOfSubscribersArray();
    
    /**
     * Sets array of all "Subscribers" element
     */
    void setSubscribersArray(com.exacttarget.wsdl.partnerapi.Subscriber[] subscribersArray);
    
    /**
     * Sets ith "Subscribers" element
     */
    void setSubscribersArray(int i, com.exacttarget.wsdl.partnerapi.Subscriber subscribers);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber insertNewSubscribers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscribers" element
     */
    com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscribers();
    
    /**
     * Removes the ith "Subscribers" element
     */
    void removeSubscribers(int i);
    
    /**
     * Gets array of all "Attributes" elements
     */
    com.exacttarget.wsdl.partnerapi.Attribute[] getAttributesArray();
    
    /**
     * Gets ith "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute getAttributesArray(int i);
    
    /**
     * Returns number of "Attributes" element
     */
    int sizeOfAttributesArray();
    
    /**
     * Sets array of all "Attributes" element
     */
    void setAttributesArray(com.exacttarget.wsdl.partnerapi.Attribute[] attributesArray);
    
    /**
     * Sets ith "Attributes" element
     */
    void setAttributesArray(int i, com.exacttarget.wsdl.partnerapi.Attribute attributes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute insertNewAttributes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attributes" element
     */
    com.exacttarget.wsdl.partnerapi.Attribute addNewAttributes();
    
    /**
     * Removes the ith "Attributes" element
     */
    void removeAttributes(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend newInstance() {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSend parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSend) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
