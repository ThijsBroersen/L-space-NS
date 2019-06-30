package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EducationalAudience extends OntologyDef(
        iri = "http://schema.org/EducationalAudience",
        iris = Set("http://schema.org/EducationalAudience"),
        label = "EducationalAudience",
        comment = """An EducationalAudience.""",
        `@extends` = () => List(Audience.ontology)
       ){
}