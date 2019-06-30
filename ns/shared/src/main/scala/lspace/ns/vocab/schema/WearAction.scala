package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WearAction extends OntologyDef(
        iri = "http://schema.org/WearAction",
        iris = Set("http://schema.org/WearAction"),
        label = "WearAction",
        comment = """The act of dressing oneself in clothing.""",
        `@extends` = () => List(UseAction.ontology)
       ){
}