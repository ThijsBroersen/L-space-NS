package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legislationPassedBy extends PropertyDef(
        iri = "http://schema.org/legislationPassedBy",
        iris = Set("http://schema.org/legislationPassedBy"),
        label = "legislationPassedBy",
        comment = """The person or organization that originally passed or made the law : typically parliament (for primary legislation) or government (for secondary legislation). This indicates the "legal author" of the law, as opposed to its physical author.""",
        `@extends` = () => List(creator.property),
        `@range` = () => List(Organization.ontology, Person.ontology)
       ){
}