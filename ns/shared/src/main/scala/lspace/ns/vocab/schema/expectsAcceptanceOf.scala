package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object expectsAcceptanceOf extends PropertyDef(
        iri = "http://schema.org/expectsAcceptanceOf",
        iris = Set("http://schema.org/expectsAcceptanceOf"),
        label = "expectsAcceptanceOf",
        comment = """An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.""",
        `@extends` = () => List(),
        `@range` = () => List(Offer.ontology)
       ){
}