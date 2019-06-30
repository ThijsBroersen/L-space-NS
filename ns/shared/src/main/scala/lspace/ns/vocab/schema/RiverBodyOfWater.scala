package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RiverBodyOfWater extends OntologyDef(
        iri = "http://schema.org/RiverBodyOfWater",
        iris = Set("http://schema.org/RiverBodyOfWater"),
        label = "RiverBodyOfWater",
        comment = """A river (for example, the broad majestic Shannon).""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}