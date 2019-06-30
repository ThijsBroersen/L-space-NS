package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SoftwareSourceCode extends OntologyDef(
        iri = "http://schema.org/SoftwareSourceCode",
        iris = Set("http://schema.org/SoftwareSourceCode"),
        label = "SoftwareSourceCode",
        comment = """Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}