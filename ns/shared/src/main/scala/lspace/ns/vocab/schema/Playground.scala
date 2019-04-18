package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Playground extends OntologyDef(
        iri = "http://schema.org/Playground",
        iris = Set("http://schema.org/Playground"),
        label = "Playground",
        comment = """A playground.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}