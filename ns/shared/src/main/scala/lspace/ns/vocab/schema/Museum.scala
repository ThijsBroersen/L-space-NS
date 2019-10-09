package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Museum extends OntologyDef(
        iri = "http://schema.org/Museum",
        iris = Set("http://schema.org/Museum"),
        label = "Museum",
        comment = """A museum.""",
        `@extends` = List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}