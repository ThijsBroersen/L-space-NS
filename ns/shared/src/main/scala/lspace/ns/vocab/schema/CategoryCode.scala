package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CategoryCode extends OntologyDef(
        iri = "http://schema.org/CategoryCode",
        iris = Set("http://schema.org/CategoryCode"),
        label = "CategoryCode",
        comment = """A Category Code.""",
        `@extends` = () => List(DefinedTerm.ontology)
       ){
object keys extends lspace.ns.vocab.schema.DefinedTerm.Properties{
lazy val codeValue = lspace.ns.vocab.schema.codeValue.property
lazy val inCodeSet = lspace.ns.vocab.schema.inCodeSet.property
}
override lazy val properties: List[LProperty] = List(codeValue, inCodeSet)
trait Properties extends lspace.ns.vocab.schema.DefinedTerm.Properties{
lazy val codeValue = lspace.ns.vocab.schema.codeValue.property
lazy val inCodeSet = lspace.ns.vocab.schema.inCodeSet.property
}
}