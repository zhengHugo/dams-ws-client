
package service.admin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the client package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _ListLocalAppointmentAvailability_QNAME = new QName(
      "http://endpoint.me/", "listLocalAppointmentAvailability");
  private final static QName _ListAppointmentAvailability_QNAME = new QName("http://endpoint.me/",
      "listAppointmentAvailability");
  private final static QName _AddAppointment_QNAME = new QName("http://endpoint.me/",
      "addAppointment");
  private final static QName _ListAppointmentAvailabilityResponse_QNAME = new QName(
      "http://endpoint.me/", "listAppointmentAvailabilityResponse");
  private final static QName _ListLocalAppointmentAvailabilityResponse_QNAME = new QName(
      "http://endpoint.me/", "listLocalAppointmentAvailabilityResponse");
  private final static QName _RemoveAppointment_QNAME = new QName("http://endpoint.me/",
      "removeAppointment");
  private final static QName _RemoveAppointmentResponse_QNAME = new QName("http://endpoint.me/",
      "removeAppointmentResponse");
  private final static QName _AddAppointmentResponse_QNAME = new QName("http://endpoint.me/",
      "addAppointmentResponse");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: client
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link ListLocalAppointmentAvailability }
   */
  public ListLocalAppointmentAvailability createListLocalAppointmentAvailability() {
    return new ListLocalAppointmentAvailability();
  }

  /**
   * Create an instance of {@link AddAppointment }
   */
  public AddAppointment createAddAppointment() {
    return new AddAppointment();
  }

  /**
   * Create an instance of {@link ListAppointmentAvailability }
   */
  public ListAppointmentAvailability createListAppointmentAvailability() {
    return new ListAppointmentAvailability();
  }

  /**
   * Create an instance of {@link ListAppointmentAvailabilityResponse }
   */
  public ListAppointmentAvailabilityResponse createListAppointmentAvailabilityResponse() {
    return new ListAppointmentAvailabilityResponse();
  }

  /**
   * Create an instance of {@link ListLocalAppointmentAvailabilityResponse }
   */
  public ListLocalAppointmentAvailabilityResponse createListLocalAppointmentAvailabilityResponse() {
    return new ListLocalAppointmentAvailabilityResponse();
  }

  /**
   * Create an instance of {@link RemoveAppointment }
   */
  public RemoveAppointment createRemoveAppointment() {
    return new RemoveAppointment();
  }

  /**
   * Create an instance of {@link RemoveAppointmentResponse }
   */
  public RemoveAppointmentResponse createRemoveAppointmentResponse() {
    return new RemoveAppointmentResponse();
  }

  /**
   * Create an instance of {@link AddAppointmentResponse }
   */
  public AddAppointmentResponse createAddAppointmentResponse() {
    return new AddAppointmentResponse();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ListLocalAppointmentAvailability
   * }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "listLocalAppointmentAvailability")
  public JAXBElement<ListLocalAppointmentAvailability> createListLocalAppointmentAvailability(
      ListLocalAppointmentAvailability value) {
    return new JAXBElement<ListLocalAppointmentAvailability>(
        _ListLocalAppointmentAvailability_QNAME, ListLocalAppointmentAvailability.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ListAppointmentAvailability }{@code
   * >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "listAppointmentAvailability")
  public JAXBElement<ListAppointmentAvailability> createListAppointmentAvailability(
      ListAppointmentAvailability value) {
    return new JAXBElement<ListAppointmentAvailability>(_ListAppointmentAvailability_QNAME,
        ListAppointmentAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "addAppointment")
  public JAXBElement<AddAppointment> createAddAppointment(AddAppointment value) {
    return new JAXBElement<AddAppointment>(_AddAppointment_QNAME, AddAppointment.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ListAppointmentAvailabilityResponse
   * }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "listAppointmentAvailabilityResponse")
  public JAXBElement<ListAppointmentAvailabilityResponse> createListAppointmentAvailabilityResponse(
      ListAppointmentAvailabilityResponse value) {
    return new JAXBElement<ListAppointmentAvailabilityResponse>(
        _ListAppointmentAvailabilityResponse_QNAME, ListAppointmentAvailabilityResponse.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ListLocalAppointmentAvailabilityResponse
   * }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "listLocalAppointmentAvailabilityResponse")
  public JAXBElement<ListLocalAppointmentAvailabilityResponse> createListLocalAppointmentAvailabilityResponse(
      ListLocalAppointmentAvailabilityResponse value) {
    return new JAXBElement<ListLocalAppointmentAvailabilityResponse>(
        _ListLocalAppointmentAvailabilityResponse_QNAME,
        ListLocalAppointmentAvailabilityResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAppointment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "removeAppointment")
  public JAXBElement<RemoveAppointment> createRemoveAppointment(RemoveAppointment value) {
    return new JAXBElement<RemoveAppointment>(_RemoveAppointment_QNAME, RemoveAppointment.class,
        null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAppointmentResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "removeAppointmentResponse")
  public JAXBElement<RemoveAppointmentResponse> createRemoveAppointmentResponse(
      RemoveAppointmentResponse value) {
    return new JAXBElement<RemoveAppointmentResponse>(_RemoveAppointmentResponse_QNAME,
        RemoveAppointmentResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://endpoint.me/", name = "addAppointmentResponse")
  public JAXBElement<AddAppointmentResponse> createAddAppointmentResponse(
      AddAppointmentResponse value) {
    return new JAXBElement<AddAppointmentResponse>(_AddAppointmentResponse_QNAME,
        AddAppointmentResponse.class, null, value);
  }

}
