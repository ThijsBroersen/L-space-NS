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
}