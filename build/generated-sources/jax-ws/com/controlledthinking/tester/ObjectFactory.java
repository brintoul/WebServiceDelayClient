
package com.controlledthinking.tester;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.controlledthinking.tester package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DelayFifteenResponse_QNAME = new QName("http://tester.controlledthinking.com/", "delayFifteenResponse");
    private final static QName _DelayFiveResponse_QNAME = new QName("http://tester.controlledthinking.com/", "delayFiveResponse");
    private final static QName _DelayTenResponse_QNAME = new QName("http://tester.controlledthinking.com/", "delayTenResponse");
    private final static QName _DelayTen_QNAME = new QName("http://tester.controlledthinking.com/", "delayTen");
    private final static QName _DelayFifteen_QNAME = new QName("http://tester.controlledthinking.com/", "delayFifteen");
    private final static QName _DelayFive_QNAME = new QName("http://tester.controlledthinking.com/", "delayFive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.controlledthinking.tester
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DelayFifteen }
     * 
     */
    public DelayFifteen createDelayFifteen() {
        return new DelayFifteen();
    }

    /**
     * Create an instance of {@link DelayFive }
     * 
     */
    public DelayFive createDelayFive() {
        return new DelayFive();
    }

    /**
     * Create an instance of {@link DelayFifteenResponse }
     * 
     */
    public DelayFifteenResponse createDelayFifteenResponse() {
        return new DelayFifteenResponse();
    }

    /**
     * Create an instance of {@link DelayFiveResponse }
     * 
     */
    public DelayFiveResponse createDelayFiveResponse() {
        return new DelayFiveResponse();
    }

    /**
     * Create an instance of {@link DelayTenResponse }
     * 
     */
    public DelayTenResponse createDelayTenResponse() {
        return new DelayTenResponse();
    }

    /**
     * Create an instance of {@link DelayTen }
     * 
     */
    public DelayTen createDelayTen() {
        return new DelayTen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayFifteenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayFifteenResponse")
    public JAXBElement<DelayFifteenResponse> createDelayFifteenResponse(DelayFifteenResponse value) {
        return new JAXBElement<DelayFifteenResponse>(_DelayFifteenResponse_QNAME, DelayFifteenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayFiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayFiveResponse")
    public JAXBElement<DelayFiveResponse> createDelayFiveResponse(DelayFiveResponse value) {
        return new JAXBElement<DelayFiveResponse>(_DelayFiveResponse_QNAME, DelayFiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayTenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayTenResponse")
    public JAXBElement<DelayTenResponse> createDelayTenResponse(DelayTenResponse value) {
        return new JAXBElement<DelayTenResponse>(_DelayTenResponse_QNAME, DelayTenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayTen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayTen")
    public JAXBElement<DelayTen> createDelayTen(DelayTen value) {
        return new JAXBElement<DelayTen>(_DelayTen_QNAME, DelayTen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayFifteen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayFifteen")
    public JAXBElement<DelayFifteen> createDelayFifteen(DelayFifteen value) {
        return new JAXBElement<DelayFifteen>(_DelayFifteen_QNAME, DelayFifteen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayFive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tester.controlledthinking.com/", name = "delayFive")
    public JAXBElement<DelayFive> createDelayFive(DelayFive value) {
        return new JAXBElement<DelayFive>(_DelayFive_QNAME, DelayFive.class, null, value);
    }

}
