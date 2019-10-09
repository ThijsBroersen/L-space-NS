package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Enumeration extends OntologyDef(
        iri = "http://schema.org/Enumeration",
        iris = Set("http://schema.org/Enumeration"),
        label = "Enumeration",
        comment = """Lists or enumerations—for example, a list of cuisines or music genres, etc.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val supersededBy = lspace.ns.vocab.schema.supersededBy.property
}
override lazy val properties: List[LProperty] = List(supersededBy)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val supersededBy = lspace.ns.vocab.schema.supersededBy.property
}
}