package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebAPI extends OntologyDef(
        iri = "http://schema.org/WebAPI",
        iris = Set("http://schema.org/WebAPI"),
        label = "WebAPI",
        comment = """An application programming interface accessible over Web/Internet technologies.""",
        `@extends` = List(Service.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Service.Properties{
lazy val documentation = lspace.ns.vocab.schema.documentation.property
}
override lazy val properties: List[LProperty] = List(documentation)
trait Properties extends lspace.ns.vocab.schema.Service.Properties{
lazy val documentation = lspace.ns.vocab.schema.documentation.property
}
}