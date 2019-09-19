package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Park extends OntologyDef(
        iri = "http://schema.org/Park",
        iris = Set("http://schema.org/Park"),
        label = "Park",
        comment = """A park.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}