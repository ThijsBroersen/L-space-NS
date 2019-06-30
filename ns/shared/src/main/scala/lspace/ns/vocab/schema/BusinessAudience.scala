package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusinessAudience extends OntologyDef(
        iri = "http://schema.org/BusinessAudience",
        iris = Set("http://schema.org/BusinessAudience"),
        label = "BusinessAudience",
        comment = """A set of characteristics belonging to businesses, e.g. who compose an item's target audience.""",
        `@extends` = () => List(Audience.ontology)
       ){
}