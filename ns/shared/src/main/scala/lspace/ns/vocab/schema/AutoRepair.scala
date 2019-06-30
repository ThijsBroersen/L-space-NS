package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AutoRepair extends OntologyDef(
        iri = "http://schema.org/AutoRepair",
        iris = Set("http://schema.org/AutoRepair"),
        label = "AutoRepair",
        comment = """Car repair business.""",
        `@extends` = () => List(AutomotiveBusiness.ontology)
       ){
}