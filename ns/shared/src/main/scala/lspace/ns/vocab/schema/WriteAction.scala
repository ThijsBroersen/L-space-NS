package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WriteAction extends OntologyDef(
        iri = "http://schema.org/WriteAction",
        iris = Set("http://schema.org/WriteAction"),
        label = "WriteAction",
        comment = """The act of authoring written creative content.""",
        `@extends` = List(CreateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreateAction.Properties{
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
}
override lazy val properties: List[LProperty] = List(inLanguage)
trait Properties extends lspace.ns.vocab.schema.CreateAction.Properties{
lazy val inLanguage = lspace.ns.vocab.schema.inLanguage.property
}
}