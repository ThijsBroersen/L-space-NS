package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object countryOfOrigin extends PropertyDef(
        iri = "http://schema.org/countryOfOrigin",
        iris = Set("http://schema.org/countryOfOrigin"),
        label = "countryOfOrigin",
        comment = """The country of the principal offices of the production company or individual responsible for the movie or program.""",
        `@extends` = () => List(),
        `@range` = () => List(Country.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}