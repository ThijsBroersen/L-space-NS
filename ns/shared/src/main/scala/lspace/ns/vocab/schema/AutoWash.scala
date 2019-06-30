package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoWash extends OntologyDef(
        iri = "http://schema.org/AutoWash",
        iris = Set("http://schema.org/AutoWash"),
        label = "AutoWash",
        comment = """A car wash business.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}