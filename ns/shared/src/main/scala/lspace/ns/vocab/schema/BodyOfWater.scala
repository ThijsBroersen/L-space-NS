package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BodyOfWater extends OntologyDef(
        iri = "http://schema.org/BodyOfWater",
        iris = Set("http://schema.org/BodyOfWater"),
        label = "BodyOfWater",
        comment = """A body of water, such as a sea, ocean, or lake.""",
        `@extends` = () => List(Landform.ontology)
       ){
}