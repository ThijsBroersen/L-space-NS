package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PublicSwimmingPool extends OntologyDef(
        iri = "http://schema.org/PublicSwimmingPool",
        iris = Set("http://schema.org/PublicSwimmingPool"),
        label = "PublicSwimmingPool",
        comment = """A public swimming pool.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}