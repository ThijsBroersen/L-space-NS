package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GenderType extends OntologyDef(
        iri = "http://schema.org/GenderType",
        iris = Set("http://schema.org/GenderType"),
        label = "GenderType",
        comment = """An enumeration of genders.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}