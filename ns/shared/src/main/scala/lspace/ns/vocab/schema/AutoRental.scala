package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoRental extends OntologyDef(
        iri = "http://schema.org/AutoRental",
        iris = Set("http://schema.org/AutoRental"),
        label = "AutoRental",
        comment = """A car rental business.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}