package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Code extends OntologyDef(
        iri = "http://schema.org/Code",
        iris = Set("http://schema.org/Code"),
        label = "Code",
        comment = """Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
}