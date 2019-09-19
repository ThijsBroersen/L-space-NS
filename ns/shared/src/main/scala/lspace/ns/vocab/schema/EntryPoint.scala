package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EntryPoint extends OntologyDef(
        iri = "http://schema.org/EntryPoint",
        iris = Set("http://schema.org/EntryPoint"),
        label = "EntryPoint",
        comment = """An entry point, within some Web-based protocol.""",
        `@extends` = () => List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val actionApplication = lspace.ns.vocab.schema.actionApplication.property
lazy val actionPlatform = lspace.ns.vocab.schema.actionPlatform.property
lazy val contentType = lspace.ns.vocab.schema.contentType.property
lazy val encodingType = lspace.ns.vocab.schema.encodingType.property
lazy val httpMethod = lspace.ns.vocab.schema.httpMethod.property
lazy val urlTemplate = lspace.ns.vocab.schema.urlTemplate.property
}
override lazy val properties: List[LProperty] = List(actionApplication, actionPlatform, contentType, encodingType, httpMethod, urlTemplate)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val actionApplication = lspace.ns.vocab.schema.actionApplication.property
lazy val actionPlatform = lspace.ns.vocab.schema.actionPlatform.property
lazy val contentType = lspace.ns.vocab.schema.contentType.property
lazy val encodingType = lspace.ns.vocab.schema.encodingType.property
lazy val httpMethod = lspace.ns.vocab.schema.httpMethod.property
lazy val urlTemplate = lspace.ns.vocab.schema.urlTemplate.property
}
}