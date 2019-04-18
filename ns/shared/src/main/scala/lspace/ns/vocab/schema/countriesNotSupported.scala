package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object countriesNotSupported extends PropertyDef(
        iri = "http://schema.org/countriesNotSupported",
        iris = Set("http://schema.org/countriesNotSupported"),
        label = "countriesNotSupported",
        comment = """Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}