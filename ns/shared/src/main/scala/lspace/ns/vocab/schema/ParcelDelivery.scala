package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ParcelDelivery extends OntologyDef(
        iri = "http://schema.org/ParcelDelivery",
        iris = Set("http://schema.org/ParcelDelivery"),
        label = "ParcelDelivery",
        comment = """The delivery of a parcel either via the postal service or a commercial service.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{

}
}