/*
 * XML Type:  PicklistItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PicklistItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML PicklistItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface PicklistItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PicklistItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("picklistitem5324type");
    
    /**
     * Gets the "IsDefaultValue" element
     */
    boolean getIsDefaultValue();
    
    /**
     * Gets (as xml) the "IsDefaultValue" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsDefaultValue();
    
    /**
     * True if has "IsDefaultValue" element
     */
    boolean isSetIsDefaultValue();
    
    /**
     * Sets the "IsDefaultValue" element
     */
    void setIsDefaultValue(boolean isDefaultValue);
    
    /**
     * Sets (as xml) the "IsDefaultValue" element
     */
    void xsetIsDefaultValue(org.apache.xmlbeans.XmlBoolean isDefaultValue);
    
    /**
     * Unsets the "IsDefaultValue" element
     */
    void unsetIsDefaultValue();
    
    /**
     * Gets the "Label" element
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "Label" element
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "Label" element
     */
    boolean isSetLabel();
    
    /**
     * Sets the "Label" element
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "Label" element
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "Label" element
     */
    void unsetLabel();
    
    /**
     * Gets the "Value" element
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "Value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * True if has "Value" element
     */
    boolean isSetValue();
    
    /**
     * Sets the "Value" element
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "Value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Unsets the "Value" element
     */
    void unsetValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.PicklistItem newInstance() {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PicklistItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PicklistItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
