package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Code extends OntologyDef(
        iri = "http://schema.org/Code",
        iris = Set("http://schema.org/Code"),
        label = "Code",
        comment = """Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}