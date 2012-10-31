/*
 * XML Type:  APIObject
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.APIObject
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML APIObject(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface APIObject extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APIObject.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("apiobjectb8eftype");
    
    /**
     * Gets the "Client" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID getClient();
    
    /**
     * True if has "Client" element
     */
    boolean isSetClient();
    
    /**
     * Sets the "Client" element
     */
    void setClient(com.exacttarget.wsdl.partnerapi.ClientID client);
    
    /**
     * Appends and returns a new empty "Client" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID addNewClient();
    
    /**
     * Unsets the "Client" element
     */
    void unsetClient();
    
    /**
     * Gets the "PartnerKey" element
     */
    java.lang.String getPartnerKey();
    
    /**
     * Gets (as xml) the "PartnerKey" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerKey();
    
    /**
     * Tests for nil "PartnerKey" element
     */
    boolean isNilPartnerKey();
    
    /**
     * True if has "PartnerKey" element
     */
    boolean isSetPartnerKey();
    
    /**
     * Sets the "PartnerKey" element
     */
    void setPartnerKey(java.lang.String partnerKey);
    
    /**
     * Sets (as xml) the "PartnerKey" element
     */
    void xsetPartnerKey(org.apache.xmlbeans.XmlString partnerKey);
    
    /**
     * Nils the "PartnerKey" element
     */
    void setNilPartnerKey();
    
    /**
     * Unsets the "PartnerKey" element
     */
    void unsetPartnerKey();
    
    /**
     * Gets array of all "PartnerProperties" elements
     */
    com.exacttarget.wsdl.partnerapi.APIProperty[] getPartnerPropertiesArray();
    
    /**
     * Gets ith "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty getPartnerPropertiesArray(int i);
    
    /**
     * Returns number of "PartnerProperties" element
     */
    int sizeOfPartnerPropertiesArray();
    
    /**
     * Sets array of all "PartnerProperties" element
     */
    void setPartnerPropertiesArray(com.exacttarget.wsdl.partnerapi.APIProperty[] partnerPropertiesArray);
    
    /**
     * Sets ith "PartnerProperties" element
     */
    void setPartnerPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty partnerProperties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty insertNewPartnerProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty addNewPartnerProperties();
    
    /**
     * Removes the ith "PartnerProperties" element
     */
    void removePartnerProperties(int i);
    
    /**
     * Gets the "CreatedDate" element
     */
    java.util.Calendar getCreatedDate();
    
    /**
     * Gets (as xml) the "CreatedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreatedDate();
    
    /**
     * True if has "CreatedDate" element
     */
    boolean isSetCreatedDate();
    
    /**
     * Sets the "CreatedDate" element
     */
    void setCreatedDate(java.util.Calendar createdDate);
    
    /**
     * Sets (as xml) the "CreatedDate" element
     */
    void xsetCreatedDate(org.apache.xmlbeans.XmlDateTime createdDate);
    
    /**
     * Unsets the "CreatedDate" element
     */
    void unsetCreatedDate();
    
    /**
     * Gets the "ModifiedDate" element
     */
    java.util.Calendar getModifiedDate();
    
    /**
     * Gets (as xml) the "ModifiedDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetModifiedDate();
    
    /**
     * Tests for nil "ModifiedDate" element
     */
    boolean isNilModifiedDate();
    
    /**
     * True if has "ModifiedDate" element
     */
    boolean isSetModifiedDate();
    
    /**
     * Sets the "ModifiedDate" element
     */
    void setModifiedDate(java.util.Calendar modifiedDate);
    
    /**
     * Sets (as xml) the "ModifiedDate" element
     */
    void xsetModifiedDate(org.apache.xmlbeans.XmlDateTime modifiedDate);
    
    /**
     * Nils the "ModifiedDate" element
     */
    void setNilModifiedDate();
    
    /**
     * Unsets the "ModifiedDate" element
     */
    void unsetModifiedDate();
    
    /**
     * Gets the "ID" element
     */
    int getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlInt xgetID();
    
    /**
     * True if has "ID" element
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(int id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlInt id);
    
    /**
     * Unsets the "ID" element
     */
    void unsetID();
    
    /**
     * Gets the "ObjectID" element
     */
    java.lang.String getObjectID();
    
    /**
     * Gets (as xml) the "ObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetObjectID();
    
    /**
     * Tests for nil "ObjectID" element
     */
    boolean isNilObjectID();
    
    /**
     * True if has "ObjectID" element
     */
    boolean isSetObjectID();
    
    /**
     * Sets the "ObjectID" element
     */
    void setObjectID(java.lang.String objectID);
    
    /**
     * Sets (as xml) the "ObjectID" element
     */
    void xsetObjectID(org.apache.xmlbeans.XmlString objectID);
    
    /**
     * Nils the "ObjectID" element
     */
    void setNilObjectID();
    
    /**
     * Unsets the "ObjectID" element
     */
    void unsetObjectID();
    
    /**
     * Gets the "CustomerKey" element
     */
    java.lang.String getCustomerKey();
    
    /**
     * Gets (as xml) the "CustomerKey" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerKey();
    
    /**
     * True if has "CustomerKey" element
     */
    boolean isSetCustomerKey();
    
    /**
     * Sets the "CustomerKey" element
     */
    void setCustomerKey(java.lang.String customerKey);
    
    /**
     * Sets (as xml) the "CustomerKey" element
     */
    void xsetCustomerKey(org.apache.xmlbeans.XmlString customerKey);
    
    /**
     * Unsets the "CustomerKey" element
     */
    void unsetCustomerKey();
    
    /**
     * Gets the "Owner" element
     */
    com.exacttarget.wsdl.partnerapi.Owner getOwner();
    
    /**
     * True if has "Owner" element
     */
    boolean isSetOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(com.exacttarget.wsdl.partnerapi.Owner owner);
    
    /**
     * Appends and returns a new empty "Owner" element
     */
    com.exacttarget.wsdl.partnerapi.Owner addNewOwner();
    
    /**
     * Unsets the "Owner" element
     */
    void unsetOwner();
    
    /**
     * Gets the "CorrelationID" element
     */
    java.lang.String getCorrelationID();
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    org.apache.xmlbeans.XmlString xgetCorrelationID();
    
    /**
     * True if has "CorrelationID" element
     */
    boolean isSetCorrelationID();
    
    /**
     * Sets the "CorrelationID" element
     */
    void setCorrelationID(java.lang.String correlationID);
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID);
    
    /**
     * Unsets the "CorrelationID" element
     */
    void unsetCorrelationID();
    
    /**
     * Gets the "ObjectState" element
     */
    java.lang.String getObjectState();
    
    /**
     * Gets (as xml) the "ObjectState" element
     */
    org.apache.xmlbeans.XmlString xgetObjectState();
    
    /**
     * True if has "ObjectState" element
     */
    boolean isSetObjectState();
    
    /**
     * Sets the "ObjectState" element
     */
    void setObjectState(java.lang.String objectState);
    
    /**
     * Sets (as xml) the "ObjectState" element
     */
    void xsetObjectState(org.apache.xmlbeans.XmlString objectState);
    
    /**
     * Unsets the "ObjectState" element
     */
    void unsetObjectState();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.APIObject newInstance() {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.APIObject parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.APIObject) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
