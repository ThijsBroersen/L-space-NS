package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object actionApplication extends PropertyDef(
        iri = "http://schema.org/actionApplication",
        iris = Set("http://schema.org/actionApplication"),
        label = "actionApplication",
        comment = """An application that can complete the request.""",
        `@extends` = () => List(),
        `@range` = () => List(SoftwareApplication.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}