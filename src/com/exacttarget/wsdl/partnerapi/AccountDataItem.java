/*
 * XML Type:  AccountDataItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AccountDataItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML AccountDataItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface AccountDataItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccountDataItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("accountdataitem87detype");
    
    /**
     * Gets the "ChildAccountID" element
     */
    int getChildAccountID();
    
    /**
     * Gets (as xml) the "ChildAccountID" element
     */
    org.apache.xmlbeans.XmlInt xgetChildAccountID();
    
    /**
     * True if has "ChildAccountID" element
     */
    boolean isSetChildAccountID();
    
    /**
     * Sets the "ChildAccountID" element
     */
    void setChildAccountID(int childAccountID);
    
    /**
     * Sets (as xml) the "ChildAccountID" element
     */
    void xsetChildAccountID(org.apache.xmlbeans.XmlInt childAccountID);
    
    /**
     * Unsets the "ChildAccountID" element
     */
    void unsetChildAccountID();
    
    /**
     * Gets the "BrandID" element
     */
    int getBrandID();
    
    /**
     * Gets (as xml) the "BrandID" element
     */
    org.apache.xmlbeans.XmlInt xgetBrandID();
    
    /**
     * Tests for nil "BrandID" element
     */
    boolean isNilBrandID();
    
    /**
     * True if has "BrandID" element
     */
    boolean isSetBrandID();
    
    /**
     * Sets the "BrandID" element
     */
    void setBrandID(int brandID);
    
    /**
     * Sets (as xml) the "BrandID" element
     */
    void xsetBrandID(org.apache.xmlbeans.XmlInt brandID);
    
    /**
     * Nils the "BrandID" element
     */
    void setNilBrandID();
    
    /**
     * Unsets the "BrandID" element
     */
    void unsetBrandID();
    
    /**
     * Gets the "PrivateLabelID" element
     */
    int getPrivateLabelID();
    
    /**
     * Gets (as xml) the "PrivateLabelID" element
     */
    org.apache.xmlbeans.XmlInt xgetPrivateLabelID();
    
    /**
     * Tests for nil "PrivateLabelID" element
     */
    boolean isNilPrivateLabelID();
    
    /**
     * True if has "PrivateLabelID" element
     */
    boolean isSetPrivateLabelID();
    
    /**
     * Sets the "PrivateLabelID" element
     */
    void setPrivateLabelID(int privateLabelID);
    
    /**
     * Sets (as xml) the "PrivateLabelID" element
     */
    void xsetPrivateLabelID(org.apache.xmlbeans.XmlInt privateLabelID);
    
    /**
     * Nils the "PrivateLabelID" element
     */
    void setNilPrivateLabelID();
    
    /**
     * Unsets the "PrivateLabelID" element
     */
    void unsetPrivateLabelID();
    
    /**
     * Gets the "AccountType" element
     */
    int getAccountType();
    
    /**
     * Gets (as xml) the "AccountType" element
     */
    org.apache.xmlbeans.XmlInt xgetAccountType();
    
    /**
     * Tests for nil "AccountType" element
     */
    boolean isNilAccountType();
    
    /**
     * True if has "AccountType" element
     */
    boolean isSetAccountType();
    
    /**
     * Sets the "AccountType" element
     */
    void setAccountType(int accountType);
    
    /**
     * Sets (as xml) the "AccountType" element
     */
    void xsetAccountType(org.apache.xmlbeans.XmlInt accountType);
    
    /**
     * Nils the "AccountType" element
     */
    void setNilAccountType();
    
    /**
     * Unsets the "AccountType" element
     */
    void unsetAccountType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem newInstance() {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.AccountDataItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.AccountDataItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
