package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EducationalOccupationalCredential extends OntologyDef(
        iri = "http://schema.org/EducationalOccupationalCredential",
        iris = Set("http://schema.org/EducationalOccupationalCredential"),
        label = "EducationalOccupationalCredential",
        comment = """An educational or occupational credential. A diploma, academic degree, certification, qualification, badge, etc., that may be awarded to a person or other entity that meets the requirements defined by the credentialer.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}