package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object differentialDiagnosis extends PropertyDef(
        iri = "http://schema.org/differentialDiagnosis",
        iris = Set("http://schema.org/differentialDiagnosis"),
        label = "differentialDiagnosis",
        comment = """One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.""",
        `@extends` = () => List(),
        `@range` = () => List(DDxElement.ontology)
       ){
}