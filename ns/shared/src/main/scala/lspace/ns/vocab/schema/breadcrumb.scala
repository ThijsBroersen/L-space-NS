package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object breadcrumb extends PropertyDef(
        iri = "http://schema.org/breadcrumb",
        iris = Set("http://schema.org/breadcrumb"),
        label = "breadcrumb",
        comment = """A set of links that can help a user understand and navigate a website hierarchy.""",
        `@extends` = List(),
        `@range` = List(BreadcrumbList.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}