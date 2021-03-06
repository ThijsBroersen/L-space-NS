package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PerformingArtsTheater extends OntologyDef(
        iri = "http://schema.org/PerformingArtsTheater",
        iris = Set("http://schema.org/PerformingArtsTheater"),
        label = "PerformingArtsTheater",
        comment = """A theater or other performing art center.""",
        `@extends` = List(CivicStructure.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties{

}
}