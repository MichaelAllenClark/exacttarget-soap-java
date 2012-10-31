/*
 * XML Type:  TriggeredSendSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML TriggeredSendSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface TriggeredSendSummary extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriggeredSendSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("triggeredsendsummaryac4ftype");
    
    /**
     * Gets the "TriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSendDefinition();
    
    /**
     * True if has "TriggeredSendDefinition" element
     */
    boolean isSetTriggeredSendDefinition();
    
    /**
     * Sets the "TriggeredSendDefinition" element
     */
    void setTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSendDefinition);
    
    /**
     * Appends and returns a new empty "TriggeredSendDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSendDefinition();
    
    /**
     * Unsets the "TriggeredSendDefinition" element
     */
    void unsetTriggeredSendDefinition();
    
    /**
     * Gets the "Sent" element
     */
    long getSent();
    
    /**
     * Gets (as xml) the "Sent" element
     */
    org.apache.xmlbeans.XmlLong xgetSent();
    
    /**
     * True if has "Sent" element
     */
    boolean isSetSent();
    
    /**
     * Sets the "Sent" element
     */
    void setSent(long sent);
    
    /**
     * Sets (as xml) the "Sent" element
     */
    void xsetSent(org.apache.xmlbeans.XmlLong sent);
    
    /**
     * Unsets the "Sent" element
     */
    void unsetSent();
    
    /**
     * Gets the "NotSentDueToOptOut" element
     */
    long getNotSentDueToOptOut();
    
    /**
     * Gets (as xml) the "NotSentDueToOptOut" element
     */
    org.apache.xmlbeans.XmlLong xgetNotSentDueToOptOut();
    
    /**
     * True if has "NotSentDueToOptOut" element
     */
    boolean isSetNotSentDueToOptOut();
    
    /**
     * Sets the "NotSentDueToOptOut" element
     */
    void setNotSentDueToOptOut(long notSentDueToOptOut);
    
    /**
     * Sets (as xml) the "NotSentDueToOptOut" element
     */
    void xsetNotSentDueToOptOut(org.apache.xmlbeans.XmlLong notSentDueToOptOut);
    
    /**
     * Unsets the "NotSentDueToOptOut" element
     */
    void unsetNotSentDueToOptOut();
    
    /**
     * Gets the "NotSentDueToUndeliverable" element
     */
    long getNotSentDueToUndeliverable();
    
    /**
     * Gets (as xml) the "NotSentDueToUndeliverable" element
     */
    org.apache.xmlbeans.XmlLong xgetNotSentDueToUndeliverable();
    
    /**
     * True if has "NotSentDueToUndeliverable" element
     */
    boolean isSetNotSentDueToUndeliverable();
    
    /**
     * Sets the "NotSentDueToUndeliverable" element
     */
    void setNotSentDueToUndeliverable(long notSentDueToUndeliverable);
    
    /**
     * Sets (as xml) the "NotSentDueToUndeliverable" element
     */
    void xsetNotSentDueToUndeliverable(org.apache.xmlbeans.XmlLong notSentDueToUndeliverable);
    
    /**
     * Unsets the "NotSentDueToUndeliverable" element
     */
    void unsetNotSentDueToUndeliverable();
    
    /**
     * Gets the "Bounces" element
     */
    long getBounces();
    
    /**
     * Gets (as xml) the "Bounces" element
     */
    org.apache.xmlbeans.XmlLong xgetBounces();
    
    /**
     * True if has "Bounces" element
     */
    boolean isSetBounces();
    
    /**
     * Sets the "Bounces" element
     */
    void setBounces(long bounces);
    
    /**
     * Sets (as xml) the "Bounces" element
     */
    void xsetBounces(org.apache.xmlbeans.XmlLong bounces);
    
    /**
     * Unsets the "Bounces" element
     */
    void unsetBounces();
    
    /**
     * Gets the "Opens" element
     */
    long getOpens();
    
    /**
     * Gets (as xml) the "Opens" element
     */
    org.apache.xmlbeans.XmlLong xgetOpens();
    
    /**
     * True if has "Opens" element
     */
    boolean isSetOpens();
    
    /**
     * Sets the "Opens" element
     */
    void setOpens(long opens);
    
    /**
     * Sets (as xml) the "Opens" element
     */
    void xsetOpens(org.apache.xmlbeans.XmlLong opens);
    
    /**
     * Unsets the "Opens" element
     */
    void unsetOpens();
    
    /**
     * Gets the "Clicks" element
     */
    long getClicks();
    
    /**
     * Gets (as xml) the "Clicks" element
     */
    org.apache.xmlbeans.XmlLong xgetClicks();
    
    /**
     * True if has "Clicks" element
     */
    boolean isSetClicks();
    
    /**
     * Sets the "Clicks" element
     */
    void setClicks(long clicks);
    
    /**
     * Sets (as xml) the "Clicks" element
     */
    void xsetClicks(org.apache.xmlbeans.XmlLong clicks);
    
    /**
     * Unsets the "Clicks" element
     */
    void unsetClicks();
    
    /**
     * Gets the "UniqueOpens" element
     */
    long getUniqueOpens();
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    org.apache.xmlbeans.XmlLong xgetUniqueOpens();
    
    /**
     * True if has "UniqueOpens" element
     */
    boolean isSetUniqueOpens();
    
    /**
     * Sets the "UniqueOpens" element
     */
    void setUniqueOpens(long uniqueOpens);
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    void xsetUniqueOpens(org.apache.xmlbeans.XmlLong uniqueOpens);
    
    /**
     * Unsets the "UniqueOpens" element
     */
    void unsetUniqueOpens();
    
    /**
     * Gets the "UniqueClicks" element
     */
    long getUniqueClicks();
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    org.apache.xmlbeans.XmlLong xgetUniqueClicks();
    
    /**
     * True if has "UniqueClicks" element
     */
    boolean isSetUniqueClicks();
    
    /**
     * Sets the "UniqueClicks" element
     */
    void setUniqueClicks(long uniqueClicks);
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    void xsetUniqueClicks(org.apache.xmlbeans.XmlLong uniqueClicks);
    
    /**
     * Unsets the "UniqueClicks" element
     */
    void unsetUniqueClicks();
    
    /**
     * Gets the "OptOuts" element
     */
    long getOptOuts();
    
    /**
     * Gets (as xml) the "OptOuts" element
     */
    org.apache.xmlbeans.XmlLong xgetOptOuts();
    
    /**
     * True if has "OptOuts" element
     */
    boolean isSetOptOuts();
    
    /**
     * Sets the "OptOuts" element
     */
    void setOptOuts(long optOuts);
    
    /**
     * Sets (as xml) the "OptOuts" element
     */
    void xsetOptOuts(org.apache.xmlbeans.XmlLong optOuts);
    
    /**
     * Unsets the "OptOuts" element
     */
    void unsetOptOuts();
    
    /**
     * Gets the "SurveyResponses" element
     */
    long getSurveyResponses();
    
    /**
     * Gets (as xml) the "SurveyResponses" element
     */
    org.apache.xmlbeans.XmlLong xgetSurveyResponses();
    
    /**
     * True if has "SurveyResponses" element
     */
    boolean isSetSurveyResponses();
    
    /**
     * Sets the "SurveyResponses" element
     */
    void setSurveyResponses(long surveyResponses);
    
    /**
     * Sets (as xml) the "SurveyResponses" element
     */
    void xsetSurveyResponses(org.apache.xmlbeans.XmlLong surveyResponses);
    
    /**
     * Unsets the "SurveyResponses" element
     */
    void unsetSurveyResponses();
    
    /**
     * Gets the "FTAFRequests" element
     */
    long getFTAFRequests();
    
    /**
     * Gets (as xml) the "FTAFRequests" element
     */
    org.apache.xmlbeans.XmlLong xgetFTAFRequests();
    
    /**
     * True if has "FTAFRequests" element
     */
    boolean isSetFTAFRequests();
    
    /**
     * Sets the "FTAFRequests" element
     */
    void setFTAFRequests(long ftafRequests);
    
    /**
     * Sets (as xml) the "FTAFRequests" element
     */
    void xsetFTAFRequests(org.apache.xmlbeans.XmlLong ftafRequests);
    
    /**
     * Unsets the "FTAFRequests" element
     */
    void unsetFTAFRequests();
    
    /**
     * Gets the "FTAFEmailsSent" element
     */
    long getFTAFEmailsSent();
    
    /**
     * Gets (as xml) the "FTAFEmailsSent" element
     */
    org.apache.xmlbeans.XmlLong xgetFTAFEmailsSent();
    
    /**
     * True if has "FTAFEmailsSent" element
     */
    boolean isSetFTAFEmailsSent();
    
    /**
     * Sets the "FTAFEmailsSent" element
     */
    void setFTAFEmailsSent(long ftafEmailsSent);
    
    /**
     * Sets (as xml) the "FTAFEmailsSent" element
     */
    void xsetFTAFEmailsSent(org.apache.xmlbeans.XmlLong ftafEmailsSent);
    
    /**
     * Unsets the "FTAFEmailsSent" element
     */
    void unsetFTAFEmailsSent();
    
    /**
     * Gets the "FTAFOptIns" element
     */
    long getFTAFOptIns();
    
    /**
     * Gets (as xml) the "FTAFOptIns" element
     */
    org.apache.xmlbeans.XmlLong xgetFTAFOptIns();
    
    /**
     * True if has "FTAFOptIns" element
     */
    boolean isSetFTAFOptIns();
    
    /**
     * Sets the "FTAFOptIns" element
     */
    void setFTAFOptIns(long ftafOptIns);
    
    /**
     * Sets (as xml) the "FTAFOptIns" element
     */
    void xsetFTAFOptIns(org.apache.xmlbeans.XmlLong ftafOptIns);
    
    /**
     * Unsets the "FTAFOptIns" element
     */
    void unsetFTAFOptIns();
    
    /**
     * Gets the "Conversions" element
     */
    long getConversions();
    
    /**
     * Gets (as xml) the "Conversions" element
     */
    org.apache.xmlbeans.XmlLong xgetConversions();
    
    /**
     * True if has "Conversions" element
     */
    boolean isSetConversions();
    
    /**
     * Sets the "Conversions" element
     */
    void setConversions(long conversions);
    
    /**
     * Sets (as xml) the "Conversions" element
     */
    void xsetConversions(org.apache.xmlbeans.XmlLong conversions);
    
    /**
     * Unsets the "Conversions" element
     */
    void unsetConversions();
    
    /**
     * Gets the "UniqueConversions" element
     */
    long getUniqueConversions();
    
    /**
     * Gets (as xml) the "UniqueConversions" element
     */
    org.apache.xmlbeans.XmlLong xgetUniqueConversions();
    
    /**
     * True if has "UniqueConversions" element
     */
    boolean isSetUniqueConversions();
    
    /**
     * Sets the "UniqueConversions" element
     */
    void setUniqueConversions(long uniqueConversions);
    
    /**
     * Sets (as xml) the "UniqueConversions" element
     */
    void xsetUniqueConversions(org.apache.xmlbeans.XmlLong uniqueConversions);
    
    /**
     * Unsets the "UniqueConversions" element
     */
    void unsetUniqueConversions();
    
    /**
     * Gets the "InProcess" element
     */
    long getInProcess();
    
    /**
     * Gets (as xml) the "InProcess" element
     */
    org.apache.xmlbeans.XmlLong xgetInProcess();
    
    /**
     * True if has "InProcess" element
     */
    boolean isSetInProcess();
    
    /**
     * Sets the "InProcess" element
     */
    void setInProcess(long inProcess);
    
    /**
     * Sets (as xml) the "InProcess" element
     */
    void xsetInProcess(org.apache.xmlbeans.XmlLong inProcess);
    
    /**
     * Unsets the "InProcess" element
     */
    void unsetInProcess();
    
    /**
     * Gets the "NotSentDueToError" element
     */
    long getNotSentDueToError();
    
    /**
     * Gets (as xml) the "NotSentDueToError" element
     */
    org.apache.xmlbeans.XmlLong xgetNotSentDueToError();
    
    /**
     * True if has "NotSentDueToError" element
     */
    boolean isSetNotSentDueToError();
    
    /**
     * Sets the "NotSentDueToError" element
     */
    void setNotSentDueToError(long notSentDueToError);
    
    /**
     * Sets (as xml) the "NotSentDueToError" element
     */
    void xsetNotSentDueToError(org.apache.xmlbeans.XmlLong notSentDueToError);
    
    /**
     * Unsets the "NotSentDueToError" element
     */
    void unsetNotSentDueToError();
    
    /**
     * Gets the "Queued" element
     */
    long getQueued();
    
    /**
     * Gets (as xml) the "Queued" element
     */
    org.apache.xmlbeans.XmlLong xgetQueued();
    
    /**
     * True if has "Queued" element
     */
    boolean isSetQueued();
    
    /**
     * Sets the "Queued" element
     */
    void setQueued(long queued);
    
    /**
     * Sets (as xml) the "Queued" element
     */
    void xsetQueued(org.apache.xmlbeans.XmlLong queued);
    
    /**
     * Unsets the "Queued" element
     */
    void unsetQueued();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary newInstance() {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.TriggeredSendSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.TriggeredSendSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
