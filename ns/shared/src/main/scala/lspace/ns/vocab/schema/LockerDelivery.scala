package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LockerDelivery extends OntologyDef(
        iri = "http://schema.org/LockerDelivery",
        iris = Set("http://schema.org/LockerDelivery"),
        label = "LockerDelivery",
        comment = """A DeliveryMethod in which an item is made available via locker.""",
        `@extends` = List(DeliveryMethod.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DeliveryMethod.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.DeliveryMethod.Properties{

}
}