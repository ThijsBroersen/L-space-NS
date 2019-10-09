package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Chapter extends OntologyDef(
        iri = "http://schema.org/Chapter",
        iris = Set("http://schema.org/Chapter"),
        label = "Chapter",
        comment = """One of the sections into which a book is divided. A chapter usually has a section number or a name.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
}
override lazy val properties: List[LProperty] = List(pageEnd, pageStart, pagination)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val pageEnd = lspace.ns.vocab.schema.pageEnd.property
lazy val pageStart = lspace.ns.vocab.schema.pageStart.property
lazy val pagination = lspace.ns.vocab.schema.pagination.property
}
}