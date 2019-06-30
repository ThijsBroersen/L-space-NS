package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Substance extends OntologyDef(
        iri = "http://schema.org/Substance",
        iris = Set("http://schema.org/Substance"),
        label = "Substance",
        comment = """Any matter of defined composition that has discrete existence, whose origin may be biological, mineral or chemical.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}