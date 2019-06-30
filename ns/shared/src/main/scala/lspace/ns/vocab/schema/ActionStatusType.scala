package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ActionStatusType extends OntologyDef(
        iri = "http://schema.org/ActionStatusType",
        iris = Set("http://schema.org/ActionStatusType"),
        label = "ActionStatusType",
        comment = """The status of an Action.""",
        `@extends` = () => List(Enumeration.ontology)
       ){
}