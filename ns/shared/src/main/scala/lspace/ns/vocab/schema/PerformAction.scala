package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PerformAction extends OntologyDef(
        iri = "http://schema.org/PerformAction",
        iris = Set("http://schema.org/PerformAction"),
        label = "PerformAction",
        comment = """The act of participating in performance arts.""",
        `@extends` = List(PlayAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PlayAction.Properties{
lazy val entertainmentBusiness = lspace.ns.vocab.schema.entertainmentBusiness.property
}
override lazy val properties: List[LProperty] = List(entertainmentBusiness)
trait Properties extends lspace.ns.vocab.schema.PlayAction.Properties{
lazy val entertainmentBusiness = lspace.ns.vocab.schema.entertainmentBusiness.property
}
}