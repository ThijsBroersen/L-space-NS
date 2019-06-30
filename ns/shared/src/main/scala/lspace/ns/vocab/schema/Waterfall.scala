package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Waterfall extends OntologyDef(
        iri = "http://schema.org/Waterfall",
        iris = Set("http://schema.org/Waterfall"),
        label = "Waterfall",
        comment = """A waterfall, like Niagara.""",
        `@extends` = () => List(BodyOfWater.ontology)
       ){
}