package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ShareAction extends OntologyDef(
        iri = "http://schema.org/ShareAction",
        iris = Set("http://schema.org/ShareAction"),
        label = "ShareAction",
        comment = """The act of distributing content to people for their amusement or edification.""",
        `@extends` = () => List(CommunicateAction.ontology)
       ){
}