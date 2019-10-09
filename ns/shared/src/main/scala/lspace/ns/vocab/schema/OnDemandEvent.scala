package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OnDemandEvent extends OntologyDef(
        iri = "http://schema.org/OnDemandEvent",
        iris = Set("http://schema.org/OnDemandEvent"),
        label = "OnDemandEvent",
        comment = """A publication event e.g. catch-up TV or radio podcast, during which a program is available on-demand.""",
        `@extends` = List(PublicationEvent.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PublicationEvent.Properties{

override lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.PublicationEvent.Properties{

override lazy val isAccessibleForFree = lspace.ns.vocab.schema.isAccessibleForFree.property}
}