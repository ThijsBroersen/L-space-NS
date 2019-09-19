package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LinkRole extends OntologyDef(
        iri = "http://schema.org/LinkRole",
        iris = Set("http://schema.org/LinkRole"),
        label = "LinkRole",
        comment = """A Role that represents a Web link e.g. as expressed via the 'url' property. Its linkRelationship property can indicate URL-based and plain textual link types e.g. those in IANA link registry or others such as 'amphtml'. This structure provides a placeholder where details from HTML's link element can be represented outside of HTML, e.g. in JSON-LD feeds.""",
        `@extends` = () => List(Role.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Role.Properties{
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val linkRelationship = lspace.ns.vocab.schema.linkRelationship.property
}
override lazy val properties: List[LProperty] = List(inLanguage, linkRelationship)
trait Properties extends lspace.ns.vocab.schema.Role.Properties{
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
lazy val linkRelationship = lspace.ns.vocab.schema.linkRelationship.property
}
}