package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugClass extends OntologyDef(
        iri = "http://schema.org/DrugClass",
        iris = Set("http://schema.org/DrugClass"),
        label = "DrugClass",
        comment = """A class of medical drugs, e.g., statins. Classes can represent general pharmacological class, common mechanisms of action, common physiological effects, etc.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
}