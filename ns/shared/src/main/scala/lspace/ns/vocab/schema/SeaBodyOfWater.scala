package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SeaBodyOfWater extends OntologyDef(
        iri = "http://schema.org/SeaBodyOfWater",
        iris = Set("http://schema.org/SeaBodyOfWater"),
        label = "SeaBodyOfWater",
        comment = """A sea (for example, the Caspian sea).""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}