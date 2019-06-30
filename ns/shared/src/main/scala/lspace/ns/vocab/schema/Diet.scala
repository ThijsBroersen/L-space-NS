package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Diet extends OntologyDef(
        iri = "http://schema.org/Diet",
        iris = Set("http://schema.org/Diet"),
        label = "Diet",
        comment = """A strategy of regulating the intake of food to achieve or maintain a specific health-related goal.""",
        `@extends` = () => List(LifestyleModification.ontology, CreativeWork.ontology)
       ){
}