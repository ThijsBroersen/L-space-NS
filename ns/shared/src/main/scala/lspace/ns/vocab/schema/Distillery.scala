package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Distillery extends OntologyDef(
        iri = "http://schema.org/Distillery",
        iris = Set("http://schema.org/Distillery"),
        label = "Distillery",
        comment = """A distillery.""",
        `@extends` = () => List(FoodEstablishment.ontology)
       ){
}