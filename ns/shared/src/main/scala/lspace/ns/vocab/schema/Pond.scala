package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Pond extends OntologyDef(
        iri = "http://schema.org/Pond",
        iris = Set("http://schema.org/Pond"),
        label = "Pond",
        comment = """A pond.""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}