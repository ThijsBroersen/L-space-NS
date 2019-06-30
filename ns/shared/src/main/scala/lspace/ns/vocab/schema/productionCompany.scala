package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object productionCompany extends PropertyDef(
        iri = "http://schema.org/productionCompany",
        iris = Set("http://schema.org/productionCompany"),
        label = "productionCompany",
        comment = """The production company or studio responsible for the item e.g. series, video game, episode etc.""",
        `@extends` = () => List(),
        `@range` = () => List(Organization.ontology)
       ){
}