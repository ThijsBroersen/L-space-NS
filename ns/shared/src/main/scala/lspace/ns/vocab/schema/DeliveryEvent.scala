package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeliveryEvent extends OntologyDef(
        iri = "http://schema.org/DeliveryEvent",
        iris = Set("http://schema.org/DeliveryEvent"),
        label = "DeliveryEvent",
        comment = """An event involving the delivery of an item.""",
        `@extends` = () => List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{
lazy val accessCode = lspace.ns.vocab.schema.accessCode.property
lazy val availableFrom = lspace.ns.vocab.schema.availableFrom.property
lazy val availableThrough = lspace.ns.vocab.schema.availableThrough.property
lazy val hasDeliveryMethod = lspace.ns.vocab.schema.hasDeliveryMethod.property
}
override lazy val properties: List[LProperty] = List(accessCode, availableFrom, availableThrough, hasDeliveryMethod)
trait Properties extends lspace.ns.vocab.schema.Event.Properties{
lazy val accessCode = lspace.ns.vocab.schema.accessCode.property
lazy val availableFrom = lspace.ns.vocab.schema.availableFrom.property
lazy val availableThrough = lspace.ns.vocab.schema.availableThrough.property
lazy val hasDeliveryMethod = lspace.ns.vocab.schema.hasDeliveryMethod.property
}
}