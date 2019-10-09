package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Cemetery extends OntologyDef(
        iri = "http://schema.org/Cemetery",
        iris = Set("http://schema.org/Cemetery"),
        label = "Cemetery",
        comment = """A graveyard.""",
        `@extends` = List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}