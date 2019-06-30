package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ApprovedIndication extends OntologyDef(
        iri = "http://schema.org/ApprovedIndication",
        iris = Set("http://schema.org/ApprovedIndication"),
        label = "ApprovedIndication",
        comment = """An indication for a medical therapy that has been formally specified or approved by a regulatory body that regulates use of the therapy; for example, the US FDA approves indications for most drugs in the US.""",
        `@extends` = () => List(MedicalIndication.ontology)
       ){
}